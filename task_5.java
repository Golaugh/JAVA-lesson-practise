package dou_jian_wen_lesson_5;

import java.util.EmptyStackException;

//窦健文 + 课堂练习 + JAVA作业5
public class task_5 {
    public static void main(String[] args) {

        //practice_1
        Account account = new Account(484298512, 123456, 99999);
        account.query();
        account.save_money(1);
        account.query();
        account.withdraw_money(99999);
        account.query();
        account.withdraw_money(999);
        account.query();

        //practice_2
        Student student = new Student();
        student.set("lily", 18, "computational math", 87, 78);
        student.display();
        student.calculate_average();

        //practice_3
        Circle circle = new Circle(Math.PI);
        circle.area();
        circle.circumference();

        //mission_1
        System.out.println("MISSION_1");
        Synthetic_Storehouse_Stack syntheticStorehouseStack= new Synthetic_Storehouse_Stack();
        syntheticStorehouseStack.push(12);
        syntheticStorehouseStack.pop();
        syntheticStorehouseStack.pop();

        //mission_2
        System.out.println("MISSION_2");
        Synthetic_line syntheticLine = new Synthetic_line();
        syntheticLine.in(10);
        syntheticLine.out();
        syntheticLine.out();

        //mission_3
        System.out.println("MISSION_3");
        NewStudent_ newStudent_ = new NewStudent_("Polaris", 21);
        newStudent_.set(99, 99, 99);
        newStudent_.calculate_average();

        //mission_4
        System.out.println("MISSION_4");
        NewDate newDate = new NewDate();
        newDate.set(8, 4, 55);
        newDate.display();

        //mission_5
        System.out.println();
        System.out.println("MISSION_5");
        NewData newData = new NewData(7);
        System.out.println("The " + newData.n_ + "'s sum_abs is: " + newData.sum_abs());
        System.out.println("The " + newData.n_ +"'s sum_factorial is: " + newData.sum_factorial());

    }
}

//practice_1_Account
class Account{

    int user = 123456;
    int code = 123456;
    double cash = 0;

    Account(int user_num, int code_num, int cash_num){
        user = user_num;
        code = code_num;
        cash = cash_num;
    }

    void query()
    {System.out.println("The rest of your account : " + cash);}

    void save_money(int save_num)
    {cash += save_num;}

    void withdraw_money(int num){
        if (cash - num >= 0)
            cash -= num;
        else
            System.out.println("Your money is not enough!");
    }
}

//practice_2_Person
class Person{
    String name;
    int age;

    void set(String a, int b){
        name = a;
        age = b;
    }

    void display()
    {System.out.println("name:" + name + "age: " + age);}
}

class Student extends Person{
    String classname;
    int math, english;

    void set(String a, int b, String c, int d, int e){
        set(a, b);
        classname = c;
        math = d;
        english = e;
    }

    void display()
    {System.out.println("name: " + name + "\nage: " + age + "\nwhose classname is: " + classname);}

    void calculate_average()
    {System.out.println("The average score is : " + (math + english) / 2.0f);}
}

//practice_3_Shape
class Shape{

    void area()
    {}

    void circumference()
    {}
}

class Circle extends Shape{

    double r;
    Circle(double radius)
    {r = radius;}

    void area()
    {System.out.println("The area is : " + Math.PI * Math.pow(r, 2));}

    void circumference()
    {System.out.println("The circumference is : " + 2 * Math.PI * r);}
}

//mission_1_storehouse
class Synthetic_Storehouse_Stack {
    int[] arr = new int[10];
    int tos;

    Synthetic_Storehouse_Stack()
    {tos = -1;}

    void push(int item) {
        if(tos>=9)
            System.out.println("Stack is full!");
        else
            arr[++tos] = item;
    }

    int pop() throws EmptyStackException {
        if(tos < 0) {
            System.out.println("Stack is empty!");
            return 0;
        }
        else
            return arr[tos--];
    }
}

//mission_2_line
class Synthetic_line{
    int[] arr = new int[10];
    int front;
    int tail;

    Synthetic_line()
    {front = tail = 9;}

    void in(int item){
        if (front < 0)
            System.out.println("Stack is full!");
        else
        {
            arr[front] = item;
            front--;
            System.out.println(item + " has been saved in, current location: " + front);
        }
    }

    void out(){
        if (front >= tail){
            System.out.println("Stack is empty!");
        }
        else
        {
            int i = arr[front + 1];
            front++;
            System.out.println(i + " has been pop out, current location: " + front);
        }
    }
}

//mission_3_Student
class Student_{
    String name_;
    int age_;
    double math_;
    double English_;

    Student_(String name, int age){
        name_ = name;
        age_ = age;
    }

    void set(double math, double English){
        math_ = math;
        English_ = English;
    }

    void display_average_score()
    {System.out.println("The " + name_ + "'s average score is " + (math_ + English_) / 2.0f);}
}

class NewStudent_ extends Student_{
    double Political_;

    NewStudent_(String name, int age){
        super(name, age);
    }

    void set(double math, double English, double political){
        math_ = math;
        English_ = English;
        Political_ = political;
    }

    void calculate_average()
    {System.out.println("The average score is : " + (math_ + English_ + Political_) / 3.0f);}
}

//mission_4_Date
class Date{
    int year_ = 2022;
    int month_ = 3;
    int day_ = 29;

    void set(int year, int month, int day){
        year_ = year;
        month_ = month;
        day_ = day;
    }

    void display()
    {System.out.println("The input date is: " +year_+"/"+month_+"/"+day_);}
}

class NewDate extends Date{
    int hour_;
    int minute_;
    int second_;

    void set(int hour, int minute, int second){
        hour_ = hour;
        minute_ = minute;
        second_ = second;
    }

    void display(){
        new Date().display();
        System.out.print("/"+hour_+":"+minute_+":"+second_);
    }
}

//mission_5_Data
class Data{
    int a;

    int abs_num(int input){
        a = input;
        return Math.abs(a);
    }

    int factorial(int input){
        a = input;
        int sum = 1;
        for (int i = a; i > 1; i--)
            sum *= i;
        return sum;
    }
}

class NewData extends Data {
    int n_;

    NewData(int n)
    {n_ = n;}

    int sum_abs(){
        int sum = 0;
        for (int i = 1; i <= n_; i++)
            sum += abs_num(i);
        return sum;
    }

    int sum_factorial(){
        int sum = 0;
        for (int i = 1; i < n_; i++)
            sum += factorial(i);
        return sum;
    }
}