package dou_jian_wen_practice_1;

import java.util.*;

//窦健文 + 上机练习1
public class Practice_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean judge = true;

        //target_1
        while (judge) {
            try {
                System.out.println("Enter a limitation, and you'll get the sum of six larger special numbers:");
                int limit = scan.nextInt();
                int j = 0;
                int sum = 0;
                for (int i = limit; j < 6; i--)
                    if ((i % 7) == 0 || (i % 11) == 0) {
                        sum += i;
                        j++;
                    }
                System.out.println("Here it is:" + sum);
                judge = false;
            } catch (InputMismatchException e) {
                System.out.println("Integrate! Try again!");
                scan.nextLine();
            }

        }

        //target_2
        System.out.println("What about the combinations concerning the 100$ for purchasing chickens?");
        Map<Object, Object> map = new HashMap<>();
        map.put("roosters",3);
        map.put("hens", 5);
        map.put("chicks", 1);
        for (Object key:map.keySet())
            System.out.println("We can purchase " + 100 / (int) map.get(key) + " " + key);

        //target_2_complex
        System.out.println("Let's input the total combinations of them, wait a minute.");

        int count_1 = 0;
        for (int i = 0; i <= 100 / 3; i++)
            for (int j = 0; j <= 100 / 5; j++)
                for (int k = 0; k <= 100; k++){
                    if (3 * i + 5 * j + k == 100)
                        count_1++;
                }

        int[][] com = new int[count_1][3];

        int count = 0;
        for (int i = 0; i <= 100 / 3; i++)
            for (int j = 0; j <= 100 / 5; j++)
                for (int k = 0; k <= 100; k++){
                    if (3 * i + 5 * j + k == 100){
                        com[count][0] = i;
                        com[count][1] = j;
                        com[count][2] = k;
                        count++;
                    }
                }
        System.out.println("Now we have " + count + " combinations.");
        System.out.println("Do you wanna check it? (Y/S):");
        char d = scan.next().charAt(0);
        if (d == 'Y')
            for (int m = 0; m < count_1; m++){
                for (int p = 0; p < 3; p++)
                    System.out.print(com[m][p] + " ");
                System.out.println();
            }
        else
            scan.nextLine();

        //target_3
        int mid;
        for (int i = -2; i < 3; i++){
            if (i < 0)
                mid = -i;
            else mid = i;

            for (int j = 0; j < mid; j++)
                System.out.print(" ");
            for (int k = 0; k < (5 - mid * 2); k++)
                System.out.print("*");
            System.out.println();
        }

        //target_4
        System.out.println("Preprocessing the list to ensure that there's no repeated element.");
        int[] arr_1 = {1,1,1,2,2,3,4,4,5,5,5,6,6,6,7,8,8,9,9,10};
        System.out.println("The quantity of the processed list is :" + Preprocess.no_repeat(arr_1));

    }
}

class Preprocess {
    static int no_repeat(int[] arr_in){ //public (
        Arrays.sort(arr_in);
        List<Object> list = new ArrayList<>();
        for (int j : arr_in)
            if (!list.contains(j))
                list.add(j);
        System.out.println(list);
        return list.size();
    }
}