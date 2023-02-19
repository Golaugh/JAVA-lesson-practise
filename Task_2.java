package dou_jian_wen_lesson_2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//窦健文 + 课堂练习 + JAVA作业2
public class Task_2 {
    public static void main(String[] args) {

        //practice_1
        System.out.println("Enter a score , and I'll give your score's level:");
        Scanner scan = new Scanner(System.in);
        boolean judge = true;
        while(judge){
            try{
                double score = scan.nextDouble();
                if(score>=80)
                    System.out.println("A!");
                else if(score<60)
                    System.out.println("F!");
                else
                    System.out.println("B!");
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Try again!");
                scan.nextLine();
            }
        }

        //practice_2
        scan.nextLine();
        System.out.println("Judging the number if it can be dived by two or three:");
        judge = true;
        while (judge){
            try{
                int num = scan.nextInt();
                if(num % 2 == 0 && num % 3 == 0)
                    System.out.println("Both!");
                else if(num % 2 == 0)
                    System.out.println("Two!");
                else if(num % 3 == 0)
                    System.out.println("Three!");
                else
                    System.out.println("None!");
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Try again!");
                scan.nextLine();
            }
        }

        //practice_3_complex
        scan.nextLine();
        System.out.println("Encrypting the character:");
        judge = true;
        while (judge){
            try {
                int via;
                char ch = scan.next().charAt(0);

                if ('a' <= ch && ch <= 'z') {
                    if ((int) ch % 'z' == 0)
                        via = 'a';
                    else via = 1;
                    System.out.println("Here it is:" + (char) ((int) ch % 'z' + via + 1));

                } else if ('A' <= ch && ch <= 'Z'){
                    if ((int) ch % 'A' == 0)
                        via = 'Z' + 1;
                    else via = 0;
                    System.out.println("Here it is:" + (char) ((int) ch % 'A' + via - 1));
                } else
                    System.out.println("It's not a character!");
                judge = false;
            } catch(InputMismatchException e){
                    System.out.println("Try again!");
                    scan.nextLine();
                }
            }

        //practice_3_simple
        scan.nextLine();
        System.out.println("Encrypting the character:");
        judge = true;
        while (judge){
            try {
                char ch = scan.next().charAt(0);
                if('a' <= ch && ch <= 'z')
                    System.out.println("Here it is:" + (char)(((int)ch - 'a' + 2) % 26 + 'a'));
                else if('A' <= ch && ch <= 'Z')
                    System.out.println("Here it is:" + (char)(((int)ch - 'A' + 25) % 26 + 'A'));
                else
                    System.out.println("It's not a character!");
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Try again!");
                scan.nextLine();
            }
        }

        //practice_final
        scan.nextLine();
        System.out.println("Setting a recycle limitation, and I'll show you something:");
        judge = true;
        while (judge){
            try {
                int sum_n = 1;
                int sum_total = 0;
                int limit = scan.nextInt();
                for(int i = 1; i <= limit; i++){
                    for(int j = 1; j <= i; j++) sum_n *= j;

                    sum_total += sum_n;
                    sum_n = 1;

                    if (i < limit) System.out.print(i + "! +");
                    else System.out.println(i + "! = " + sum_total);
                }
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Data mismatch! Try again!");
                scan.nextLine();
            }
        }


        //mission_1
        judge = true;
        System.out.println("Give me five numbers and you'll get the sum of them:");
        double sum = 0;
        double[] data = new double[5];
        while(judge){
            try {
                for(int i = 0; i<5; i++){
                    data[i] = scan.nextDouble();
                    sum += data[i];
                }

                System.out.println("Here the sum is: " + sum);
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Numbers! Try again!");
                scan.nextLine();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Five! Try again!");
                scan.nextLine();
            }
        }

        //mission_2
        scan.nextLine();
        System.out.println("Setting a recycle limitation, and I'll show you something:");
        judge = true;
        while (judge){
            try {
                int sum_n = 1;
                int sum_total = 0;
                int limit = scan.nextInt();
                for(int i = 1; i <= limit; i++){
                    for(int j = 1; j <= i; j++) sum_n *= j;

                    sum_total += sum_n;
                    sum_n = 1;

                    if (i < limit) System.out.print(i + "! +");
                    else System.out.println(i + "! = " + sum_total);
                }
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Data mismatch! Try again!");
                scan.nextLine();
            }
        }

        //mission_3
        scan.nextLine();
        System.out.println("Give me an integrate, I'll tell you the month correspond to it:");
        String[] months = {"January", "February", "March", "April", "may", "June", "July", "August",
        "September", "October", "November", "December"};
        judge = true;
        while (judge){
            try {
                int num = scan.nextInt();
                System.out.println("It is " + months[num - 1]);
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Data mismatch! Try again!");
                scan.nextLine();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Surely you've know that the integrate should be one to twelve. Try again!");
                scan.nextLine();
            }
        }

        //mission_4
        System.out.println(10 % 100);
        scan.nextLine();
        System.out.println("Three-digits needed, and I'll tell you whether it's Daffodils-Number or not:");
        judge = true;
        class Out extends Exception{
            Out(String message){
                super(message);
            }
        }

        class Check {
            void check(int a) throws Out{
                if (a < 100 || a > 999)
                    throw new Out("100 - 999, please! Try again!");
            }
        }
        Check ck = new Check();

        while (judge){
            try {
                int total = scan.nextInt();
                ck.check(total);

                int mid_1 = total % 10;
                int mid_2 = (total % 100 - mid_1) / 10;
                int mid_3 = (total - mid_2 * 10 - mid_1) / 100;
                if ((mid_1 ^ 3 + mid_2 ^ 3 + mid_3 ^ 3) == total) System.out.println("It is!");
                else System.out.println("It isn't!");
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("An Integrate! Try again!");
                scan.nextLine();
            }catch (Out e){
                System.out.println(e.getMessage());
                scan.nextLine();
            }
        }

        //mission_5
        scan.nextLine();
        System.out.println("Input three numbers, and I'll sort them from largest to smallest:");
        double[] str = new double[3];
        double temp;
        judge = true;
        while(judge){
            try {
                for (int i = 0; i < str.length; i++)
                    str[i] = scan.nextDouble();

                for (int i = 0; i < str.length - 1; i++){
                    boolean sec = true;

                    for (int j = 0; j < str.length - 1 - i; j++){
                        if (str[j] < str[j+1]){
                            temp = str[j];
                            str[j] = str[j+1];
                            str[j+1] = temp;

                            sec = false; //发生数据交换 继续循环
                        }
                    }
                    if (sec) //不再交换数据 跳出循环
                        break;
                }
                System.out.println(Arrays.toString(str));
                judge = false;
            }catch (InputMismatchException e){
                System.out.println("Numbers! Try again!");
                scan.nextLine();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Three! Try again!");
                scan.nextLine();
            }
        }


        }
    }
