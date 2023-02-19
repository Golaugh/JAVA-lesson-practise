package dou_jian_wen_practice_3_2;

abstract class Calculator{
    abstract void add();
    abstract void subtraction();
}

class Double_cal extends Calculator{
    double a, b;

    Double_cal(double a,double b)
    {this.a=a;this.b=b;}

    public void add()
    {System.out.println(a+"+"+b+"="+(a+b));}
    void subtraction()
    {System.out.println(a+"-"+b+"="+(a-b));}
}

class Int_cal extends Calculator{
    int a, b;

    Int_cal(int a,int b)
    {this.a=a;this.b=b;}

    void add()
    {System.out.println(a+"+"+b+"="+(a+b));}
    void subtraction()
    {System.out.println(a+"-"+b+"="+(a-b));}
}

class Test{
    void call_add(Calculator s)
    {s.add();}

    void call_subtraction(Calculator s)
    {s.subtraction();}
}

public class Practice_3_2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.call_add(new Double_cal(12.9,3.5));
        test.call_subtraction(new Int_cal(199,28));
    }
}