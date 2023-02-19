package dou_jian_wen_lesson_6_2;

import dou_jian_wen_lesson_6_1.A;

public class B extends A {
    double b;

    public void display(double b_) {
        b = b_;
        System.out.println(A.a + " and " + b);
    }
}
