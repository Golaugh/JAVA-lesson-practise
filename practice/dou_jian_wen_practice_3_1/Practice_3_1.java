package dou_jian_wen_practice_3_1;

import static dou_jian_wen_practice_3_1.Music.tune;

class Instrument{
    public void play()
    {System.out.println("Play!");}
}

class Wind extends Instrument{
    public void play()
    {System.out.println("Play the wind!");}

    public void play2()
    {System.out.println("Use play2 in wind");}
}

class Brass extends Instrument{
    public void play()
    {System.out.println("Play brass!");}

    public void play2()
    {System.out.println("Use play2 in brass");}
}

class Music{
    public static void tune(Instrument i)
    {i.play();}
}

public class Practice_3_1 {
    public static void main(String[] args) {
        tune(new Wind());
        tune(new Brass());
    }
}