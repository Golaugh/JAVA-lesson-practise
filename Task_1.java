package dou_jian_wen_lesson_1;
//窦健文 + JAVA作业1
import java.util.InputMismatchException;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        //mission_1
        System.out.println("Hello, world!");

        //mission_2
        Scanner scan = new Scanner(System.in);
        boolean judge = true;
        while (judge){
            try {
                System.out.println("Enter two numbers, and I'll calculate the product of them:");
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                System.out.println("The consequence is: " + a + " * " + b + " = " + (a * b));
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Data mismatch! Try again!");
                scan.nextLine();
            }
        }

        //mission_3
        scan.nextLine();
        judge = true;
        while (judge){
            try {
                System.out.println("Give me ONE INTEGER and I'll give you the factor of it:");
                int num = scan.nextInt();
                System.out.println("Here they are:");
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Data mismatch! Try again!");
                scan.nextLine();
            }
        }


        //mission_4
        scan.nextLine();
        judge = true;
        while (judge){
            try{
                System.out.println();
                System.out.println("And you know what, I can even calculate the maximum common factor of two integers:");
                int num_1 = scan.nextInt();
                int num_2 = scan.nextInt();
                int factor_1 = 0;
                int max = Math.max(num_1, num_2);
                for (int i = 1; i <= max; i++) {
                    if (num_1 % i == 0 & num_2 % i == 0) {
                        factor_1 = i;
                    }
                }
                System.out.println("The maximum common factor is:"+ factor_1);
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Data mismatch! Try again!");
                scan.nextLine();
            }
        }


        //mission_5
        scan.nextLine();
        judge = true;
        while (judge){
            try{
                System.out.println("Two integers, and you'll know the lease common multiple:");
                int a_1 = scan.nextInt();
                int a_2 = scan.nextInt();
                int max = Math.max(a_1, a_2);
                int factor_2 = 0;
                for (int i = 1; i <= max; i++) {
                    if (a_1 % i == 0 & a_2 % i == 0) {
                        factor_2 = i;
                    }
                }
                System.out.println("The lease common multiple is:"+ (a_1 * a_2) / factor_2);
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Data mismatch! Try again!");
                scan.nextLine();
            }
        }
    }
}