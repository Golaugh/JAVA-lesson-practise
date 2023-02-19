package dou_jian_wen_lesson_7;

//窦健文 + 课堂练习 + java作业7
public class Task_7 {
    public static void main(String[] args) {

        //practice_1
        System.out.println("X = " + StaticStuff.x);
        System.out.println("X = " + StaticStuff.x);

        //practice_2
        Airplane airplane = new Airplane();
        airplane.crash();

        //practice_3
        SShape sshape = new CCircle();
        sshape.draw();
        sshape = new RRectangle();
        sshape.draw();

        //wonder
        Wonder round = new Round1();
        round.turn();
        round = new Round2();
        round.turn();

        //mission_1
        InterfaceA interfaceA = new ClassA();
        interfaceA.method(10);
        interfaceA = new ClassB();
        interfaceA.method(10);

        //mission_2_Hero
        Hero hb = new Hero("Polaris");
        hb.swim();
        hb.fight("monster");
        hb.fly();

        CanFly cf = hb;
        cf.fly();
        CanSwim cs = hb;
        cs.swim();
        ActionCharacter ac = hb;
        ac.fight("monster");
        ac.speak("Legends never die!");

        //mission_3_simple_computer
        UseCompute useCompute = new UseCompute();

        Compute compute = new Addition();
        useCompute.useCom(compute, 3, 4);

        compute = new Subtraction();
        useCompute.useCom(compute, 3, 4);

        compute = new Multiplication();
        useCompute.useCom(compute, 3, 4);

        compute = new Division();
        useCompute.useCom(compute, 99, 4);

    }
}

//practice_1_StaticStuff
class StaticStuff{
    static int x;
    static {x += 5;}
    static {x /= 3;}
}

//practice_2_flyer
interface flyer {
    void takeoff();
    void land();
    void crash();
}

class Airplane implements flyer{

    public void takeoff()
    {System.out.println("Airplane take off!");}

    public void land()
    {System.out.println("Airplane land!");}

    public void crash()
    {System.out.println("MAYDAY, MAYDAY!");}
}

//practice_3_SShape
interface SShape {
    void draw();
}

class CCircle implements SShape{
    public void draw()
    {System.out.println("call draw!");}
}

class RRectangle implements SShape{
    public void draw()
    {System.out.println("call rec!");}
}

//practice_4_Wonder
interface Wonder{
    void turn();
}

class Round1 implements Wonder{
    //Round1()
    //{Wonder round = new Round2();}
    public void turn()
    {System.out.println("Insane");}
}

class Round2 implements Wonder{
    //Round2()
    //{Wonder round = new Round1();}
    public void turn()
    {System.out.println("Totally insane");}
}

//mission_1_InterfaceA
interface InterfaceA{
    int method(int n);
}

class ClassA implements InterfaceA{
    public int method(int n)
    {return n * (n - 1) / 2;}
}

class ClassB implements InterfaceA{
    public int method(int n){
        int sum = 1;
        for (int i = 1; i < n; i++)
            sum *= i;
        return sum;
    }
}

//mission_2_Hero
abstract class ActionCharacter{
    abstract void fight(String name);

    void speak(String word)
    {System.out.println("He says : " + word);}
}

interface CanFly
{void fly();}

interface CanSwim
{void swim();}

class Hero extends ActionCharacter implements CanFly, CanSwim {
    String name;
    Hero(String name)
    {this.name = name;}

    public void fight(String name)
    {System.out.println(this.name + "is fighting against " + name);}

    public void speak(String word)
    {System.out.println(name + "is speaking: " + word);}

    public void swim()
    {System.out.println(name + "is swimming!");}

    public void fly()
    {System.out.println(name + "is flying!");}
}

//mission_3_simple_computer
interface Compute
{int computer(int n, int m);}

class Addition implements Compute{
    public int computer(int n, int m)
    {return n+m;}
}

class Subtraction implements Compute{
    public int computer(int n, int m)
    {return n-m;}
}

class Multiplication implements Compute{
    public int computer(int n, int m)
    {return n*m;}
}

class Division implements Compute{
    double n, m;
    public int computer(int n, int m){
        this.n = n;
        this.m = m;
        computer(this.n, this.m);
        return 0;
    }
    public void computer(double n, double m)
    {System.out.println("The precise consequence is : " + n/m);}
}

class UseCompute{

    public void useCom(Compute com, int one, int two){
        System.out.println("The consequence is : " + com.computer(one, two));
    }
}