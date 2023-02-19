package dou_jian_wen_lesson_3;

import java.util.*;

//窦健文 + JAVA作业3
public class Task_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //mission_1
        System.out.println("Yosef Question Here!");
        System.out.println("First, chose the number of people:");
        int num = scan.nextInt();
        int[] line = new int[num];
        System.out.println("Second, chose the out-line number:");
        int out = scan.nextInt();

        int c = 0;
        int coco = 0;
        for (int i = 1; i <= num; i++)
            line[i-1] = i;
        System.out.println(Arrays.toString(line));
        System.out.println("Here we go!");
        for (int cur = 0; cur < num; cur++){
            if (line[cur] != 0){
                c++;
                if (c % out == 0){
                    line[cur] = 0;
                    coco++;
                    System.out.println(Arrays.toString(line));
                }
            }
            if (cur == num - 1)
                cur = -1;
            if (coco == num - 1)
                break;
        }
        for (int i = 0; i < num; i++)
            if (line[i] != 0)
                System.out.println("Finally we got: " + line[i]);

        //mission_2
        scan.nextLine();
        boolean well;
        int count = 0;
        System.out.println("Ashe Filter Here!");
        System.out.println("Give me your range:");
        int min = scan.nextInt();
        int max = scan.nextInt();
        System.out.println("Here are all single numbers:");
        for (int i = min; i <= max; i++){
            well = true;

            for (int j = min; j <= max; j++){
                if (i != j && i % j == 0) {
                    well = false;
                    break;
                }
            }
            if (well) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Totally have " + count + " numbers!");

        //mission_3
        scan.nextLine();
        System.out.println();
        System.out.println("Tell me the level of the Pascal's triangle:");
        int level = scan.nextInt();
        int[][] contain = new int[level][level];
        for (int i = 0; i < level; i++)
            contain[i][0] = contain[i][i] = 1;
        for (int i = 2; i < level; i++)
            for (int j = 1; j < i; j++)
                contain[i][j] = contain[i-1][j-1] + contain[i-1][j];
        for (int i = 0; i < level; i++){

            for (int k = 0; k < (level - i) * 3; k++)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++)
                System.out.format("%6d", contain[i][j]);
            System.out.println();
        }

        //mission_4
        scan.nextLine();
        System.out.println("Let me show you a set of poker:");
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String number : numbers) {
            for(String color : colors) {
                map.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        Collections.shuffle(array);
        System.out.println("Now we're going to take the cards, you wanna it?(Y/S):");
        char in = scan.nextLine().charAt(0);
        if (in == 'Y')
            for (int index_in = 0; index_in < array.toArray().length; index_in++)
                System.out.println(map.get(array.get(index_in)));

        //mission_5
        System.out.println("Well, it seems that the last mission show be the encryption of a sentence.");
        System.out.println("Just input it:");
        try {
            ArrayList<Integer> middles = new ArrayList<>();
            ArrayList<Integer> fin = new ArrayList<>();
            HashMap<Integer, Integer> cor = new HashMap<>();

            while (true){
                char ch;
                ch=(char)System.in.read();
                if (ch == '\n')
                    break;
                middles.add((int) ch);
            }

            for (int index_0 = 0; index_0 < middles.toArray().length; index_0++){
                cor.put(index_0, middles.get(index_0));
                fin.add(index_0);
            }

            Collections.shuffle(fin);
            System.out.println("Now here's the encrypted sentence:");

            for (int i = 0; i < fin.toArray().length; i++)
                System.out.print( (char) ((int) cor.get(fin.get(i))) );

            System.out.println();
            System.out.println("Do you wanna turn it back?(Y/S):");
            char a = scan.next().charAt(0);
            if (a == 'Y')
                for (int j = 0; j < middles.toArray().length; j++)
                    System.out.print((char) (int) cor.get(j));

        }catch(Exception e) {
            System.out.println("Something wrong...I guess.");
        }



    }
}