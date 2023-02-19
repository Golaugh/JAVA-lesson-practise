package dou_jian_wen_lesson_8;
//窦健文 + java作业8
public class Task_8 {
    public static void main(String[] args) {

        //mission_1
        Father father = new Father();
        Father.Child child = father.new Child();
        child.introFather();

        //mission_2
        int b = 3, c = 0;
        try {
            System.out.println(b / c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        int a[] = {};
        try {
            a[0] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index Error:"+e.getMessage());
        }


    }
}
//mission_1_Father
class Father{
    private String name="Tom";

    public class Child{
        void introFather()
        {System.out.println(Father.this.name);}
    }
}