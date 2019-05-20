package be.keisse.Associaties.Lottery;

import java.util.Scanner;
import be.keisse.Associaties.util.Utility;

public class LotteryMain {
    Lottery lot = new Lottery();
    public void go(Scanner kb){
    int[] nr = new int[5];
    Utility.setCredit(20,false);
    for(int i=0;i<5;i++){
        System.out.println("geef nr aub");
        int a = kb.nextInt();
        if(Utility.checkBounds(a)){


        if(lot.checkDupe(a)){
            System.out.println("duplicaat nr");
            i--;
        }

        else{
            nr[i]=a;
            lot.fillNR(nr);
        }}
        else{i--;}
        }

    switch(lot.checkWinning()){
            case 0:
                System.out.println("helaas, niets gewonnen");
                break;
            case 1:
                System.out.println("€10 'hoera...' ");
                Utility.setCredit(10,true);
                break;
            case 2:
                System.out.println("€100");
                Utility.setCredit(100,true);
                break;
            case 3:
                System.out.println("€1000");
                Utility.setCredit(1000,true);
                break;
            case 4:
                System.out.println("€10000");
                Utility.setCredit(10000,true);
                break;
            case 5:
                System.out.println("€1000000! grote winnaar!");
                Utility.setCredit(1000000,true);
                break;
        }
    lot.reset();
        }

    }
