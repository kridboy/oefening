package be.keisse.Associaties.Lottery;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public int[] winning = new int[5];
    public int[] numbers = new int[5];

    Random r = new Random();

    public Lottery(){
        for(int i=0;i<5;i++){
            winning[i] = r.nextInt(99)+1;
        }
        System.out.println("winning nr's: "+winning[0] + " " +winning[1] + " " +winning[2] + " " + winning[3] + " " + winning[4] + "...");
    }

    public int checkWinning(){
        int r = 0;
        for(int i=0;i<5;i++){
        for(int t=0;t<5;t++){
            if(winning[i]==numbers[t]){
                r++;
            }
        }
        }
        return r;
    }


    public void fillNR(int... a){
        numbers = a;
    }

    public boolean checkDupe(int a){
        for(int i=0;i<5;i++){
            if(a==numbers[i]){
                return true;
            }
        }
        return false;
    }
    public void reset(){
        Arrays.fill(numbers,0);
        for(int i=0;i<5;i++){
            winning[i] = r.nextInt(99)+1;
        }

    }
}
