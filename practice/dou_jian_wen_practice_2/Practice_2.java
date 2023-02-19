package dou_jian_wen_practice_2;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

//窦健文 + 上机练习2
public class Practice_2 {
    public static void main(String[] args) throws NoSuchElementException {

        Scanner scanner = new Scanner(System.in);

        //target_1
        Person person = new Person();
        System.out.println("It won't take too much time for me to have a birthday, so let's change it:");
        person.change_age(20);
        person.display();

        //target_2
        Number number = new Number(1.2);
        System.out.println("The integer_part is: " + number.integer_part());
        System.out.println("The fractional part is : " + number.fractional_part());
        System.out.println("The absolute num is : " + number.absolute_num());
        System.out.println("The opposite num is : " + number.opposite_num());

        //target_3
        int[] ad = {23, 43, 56, 76, 45, 34, 78, 89, 98, 78};
        Score score = new Score(ad);
        System.out.println("The mean score is : " + score.mean());
        System.out.println("The max score is : " + score.max_score());
        System.out.println("The number of failure is : " + score.fail_number());
        System.out.println("Input ten scores : ");
        Score score1 = new Score();
        System.out.println("The mean score is : " + score1.mean());
        System.out.println("The max score is : " + score1.max_score());
        System.out.println("The number of failure is : " + score1.fail_number());


    }
}

//target_1_person
class Person{

    String name = "Jack";
    int age = 10;
    String gender = "unknown";

    Person(String person_name, int person_age, String person_gender){
        name = person_name;
        age = person_age;
        gender = person_gender;

    }

    public Person() {

    }

    void change_age(int next_age)
    {age = next_age;}

    void display()
    {System.out.println("Name: " + name + "\nAge: " + age + "\ngender: " + gender);}
}

//target_2_number
class Number{

    double number = 0.0;

    Number(double num)
    {number = num;}

    double integer_part()
    {return Math.floor(number);}

    double fractional_part()
    {return (number - Math.floor(number));}

    double absolute_num()
    {return Math.abs(number);}

    double opposite_num()
    {return number < 0 ? -number : number;}

}

//target_3_score
class Score{

    double sum = 0;
    int[] s = new int[10];

    Score(int[] num_score){
        int j;
        for (j = 0; j < s.length; j++)
            s[j] = num_score[j];
    }

    Score(){
        Scanner scanner = new Scanner(System.in);
        for (int p = 0; p < s.length; p++){
            int f = scanner.nextInt();
            s[p] = f;
        }
    }

    double mean(){
        for (int i : s)
            sum += i;
        return sum / s.length;
    }

    int max_score()
    {return Arrays.stream(s).max().getAsInt();}

    int fail_number(){
        int count = 0;
        for (int i : s)
            if (i < 60)
                count++;
        return count;
    }
}