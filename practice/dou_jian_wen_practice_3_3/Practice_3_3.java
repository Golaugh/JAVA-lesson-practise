package dou_jian_wen_practice_3_3;

class Double_cal implements Compute {
    double a, b;

    Double_cal(double a,double b)
    {this.a=a;this.b=b;}

    public void add()
    {System.out.println(a+"+"+b+"="+(a+b));}
    public void subtract()
    {System.out.println(a+"-"+b+"="+(a-b));}
}

class Int_cal implements Compute{
    int a, b;

    Int_cal(int a,int b)
    {this.a=a;this.b=b;}

    public void add()
    {System.out.println(a+"+"+b+"="+(a+b));}
    public void subtract()
    {System.out.println(a+"-"+b+"="+(a-b));}
}

public class Practice_3_3 {
    public static void main(String[] args) {
        Compute compute = new Double_cal(12.9,3.5);
        compute.add();

        compute = new Int_cal(199,28);
        compute.subtract();
    }
}
