package be.keisse.Associaties.util;

public class Utility {
    private static int credit=300;

    public static boolean checkBounds(int a){
        if(a<1||a>100){
            System.out.println("getal out of bounds! 1-99 aub");
            return false;
        }
        else return true;
    }

    public static void setCredit(int a,boolean x){
        if(x) credit+=a;
        else credit -=a;
    }

    public static int getCredit(){
        return credit;
    }
}
