package org.magicminds.one.practice;

/**
 * Created by Ivy on 7/4/2015.
 */
public class Practice {
    public  void yerAWizard(int times) {
        for (int ia = 0; ia < times; ia++) {
            double nd = Math.floor(Math.random() * 17.76);
            int res = nd >= 8 ? 7 : 4;
            if (res == 7) {
                System.out.println("You're a wizard, Harry!");
            } else {
                System.out.println("I'm a what?");
            }
        }
    }

    public  void toSet() {
        byte b = -128;
        short s = 32767;
        int i = 5;
        double d = 4.5;
        float f1 = 5.7f;
        float f2 = (float) 5.7;

        char c = 'q';
        int mixed = 5 + c;
        System.out.println(mixed);

        String s1 = new String("first way");
        String s2 = "second way";
        System.out.println(b + " " +  s + " " + i + " " + d + " " + f1 + " " + f2 + " " + c + " " + s1 + " " + s2);
    }

    public  void freshLemon() {
        String p1 = "Ah, the days of my youth";
        String p2 = "...just like the scent of fresh lemon.";
        String whole = p1 + p2;
        System.out.println(whole);
    }

    public  String getBrainCellsFast(double num) {
        return("I have " + num + " brain cells!");
    }

    public  String leetSpeak() {
        byte a1 = 3;
        byte a2 = 1;
        byte a3 = 0;
        float a4 = 2.0f;
        return "h" + a1 + a2 + a2 + a3 + " w" + a3 + "r" + a2 + "d " + a4;
    }

    public  void badProsecutor() {
        int pr = 314;
        int ra = 313;
        int ac = 312;
        int ct = 311;
        if (pr < ra) {
            System.out.println("Take that!");
        } else if ((pr != ac + 16) || (pr >= ac)) {
            System.out.println("Objection!");
        } else if ((pr == ra + ac) && (ra <= ct)) {
            System.out.println("Hold it!");
        }
    }
}
