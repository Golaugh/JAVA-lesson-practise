package dou_jian_wen_lesson_4;

import java.util.InputMismatchException;
import java.util.Scanner;

//窦健文 + 课堂练习 + JAVA作业4
public class Task_4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //practice_1
        System.out.println("Computing the area of cycle, input x_set,y_set and radius: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        Cycle cycle = new Cycle(a,b,c);
        cycle.compute_area();
        cycle.compute_circumference();

        //practice_2
        scan.nextLine();
        System.out.println("Define A student:");
        Student student = new Student(2020005055, 20, 2002, "Polaris");
        student.meet_teacher();
        student.asked();

        //practice_3
        scan.nextLine();
        System.out.println("Input something in two times:");
        String c1 = scan.nextLine();
        String c2 = scan.nextLine();
        String c3 = c1;
        System.out.println(c2 == c3);
        System.out.println(c2.equals(c3));

        //practice_4
        scan.nextLine();
        System.out.println("Now we gonna create a class to realise the fundamental computation:");
        System.out.println("Input two values:");
        double one = scan.nextDouble();
        double two = scan.nextDouble();
        Fundamental_compute fundamental_compute = new Fundamental_compute(one, two);
        System.out.println("The plus is : " + fundamental_compute.plus());
        System.out.println("The subtract is : " + fundamental_compute.subtract());
        System.out.println("The multiply is : " + fundamental_compute.multiply());
        System.out.println("The divide is : " + fundamental_compute.divide());


        //mission_1
        scan.nextLine();
        try {
            System.out.println("Now we're gonna define a rectangle, two values please:");
            double L = scan.nextDouble();
            double W = scan.nextDouble();
            Rectangle rectangle = new Rectangle(L, W);
            System.out.println("The area of this rectangle is : "+rectangle.area());
            System.out.println("The circumference of this rectangle is : "+rectangle.circumference());
        }catch (InputMismatchException e){
            System.out.println("Data mismatch!");
        }

        //mission_2
        System.out.println("Today is 2022/3/21.");
        Clock clock = new Clock(2022, 3, 21);
        System.out.println("Let's see if it's the leap year:");
        scan.nextLine();
        clock.leap_year_judge();
        System.out.println("Let's see how many days passed till today:");
        scan.nextLine();
        System.out.println("Already " + clock.compared_date(2019, 12, 31) + " days passed!");

        //mission_3
        Number number = new Number(1.2);
        Class numberClass = number.getClass();
        String[] step_list = {"integer_part", "fractional_part", "absolute_num", "opposite_num"};
        for (String methodName: step_list) {
            try {
                System.out.println("The " + methodName + " is :" + numberClass.getMethod(methodName));
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }


    }


}

//practice_1_cycle
class Cycle {

    double x_center;
    double y_center;
    double radius;

    Cycle(double center_x, double center_y, double r) {
        x_center = center_x;
        y_center = center_y;
        radius = r;
    }

    void compute_circumference() {
        System.out.println("The circumference of this cycle is : " + 2 * Math.PI * radius);
    }

    void compute_area() {
        System.out.println("The area of this cycle is : " + Math.PI * Math.pow(radius, 2));
    }
}

//practice_2_student
class Student{

    int code;
    int age;
    int grade_class;
    String name;

    Student(int a, int b, int c, String d){
        code = a;
        age = b;
        grade_class = c;
        name = d;
    }

    void meet_teacher()
    {System.out.println("Hello! Teacher! I'm the " + code + "and I'm in the" + grade_class);}

    void asked()
    {System.out.println("I'm " + age + " years old.");}

}

//practice_4_fundamental_computation
class Fundamental_compute{

    double a1;
    double a2;

    Fundamental_compute(double a, double b){
        a1 = a;
        a2 = b;
    }

    double plus()
    {return a1 + a2;}

    double subtract()
    {return Math.abs(a1 - a2);}

    double multiply()
    {return a1 * a2;}

    double divide()
    {return a1 / a2;}

}

//mission_1_rectangle
class Rectangle{

    double l;
    double w;

    Rectangle(double l_in, double w_in){
        l = l_in;
        w = w_in;
    }

    double area()
    {return l * w;}

    double circumference()
    {return 2 * (l * w);}
}

//mission_2_clock
class Clock{

    int y = 2022;
    int m = 3;
    int d = 21;

    Clock(int year, int month, int day){
        y = year;
        m = month;
        d = day;
    }

    void leap_year_judge(){
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            System.out.println("Yes!");
        else
            System.out.println("No!");
    }

    int compared_date(int year, int month, int day)
    {return Math.abs((year * 365 + month * 30 + day) - (y * 365 + m * 30 + d));}

}

//mission_3_number
class Number{

    static double number = 0.0;

    Number(double num){
        number = num;
    }

    public double integer_part()
    {return Math.floor(number);}

    public double fractional_part()
    {return number - Math.floor(number);}

    public double absolute_num()
    {return Math.abs(number);}

    public double opposite_num()
    {return number < 0 ? -number : number;}
}