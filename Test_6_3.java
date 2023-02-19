package dou_jian_wen_lesson_6;

import dou_jian_wen_lesson_6_3.A;

public class Test_6_3 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        a1.set_a(10);
        a1.set_b(1);
        a2.set_a(5);
        a2.set_b(2);

        a1.display();
        a2.display();
    }
}
