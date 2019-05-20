package be.keisse.Associaties.HighLow;

import java.util.Random;
import java.util.Scanner;
import be.keisse.Associaties.util.Utility;

public class HogerLager {
    private int value,max;
    private Random r;
    private Scanner kb;
    private int reward;

    public HogerLager(int max,int inzet){
        this.max = max;
        r = new Random();
        reset();
        System.out.println("random: " + value);
        reward = inzet;
    }

    public void reset(){
        value =r.nextInt(max)+1;
    }

    public int guess(int guessValue){
        if(!Utility.checkBounds(guessValue)){
            return 5;

        }
        else {
            if (guessValue < value) {
                reward -= 10;
                return -1;
            } else if (guessValue > value) {
                reward -= 10;
                return 1;
            } else {
                reward *= 5;
                return 0;
            }
        }

    }

    public int getReward(){
        return reward;
    }
public void setReward(){
        reward = 0;
}
}
