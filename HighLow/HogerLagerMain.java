package be.keisse.Associaties.HighLow;

import be.keisse.Associaties.util.Utility;

import java.util.Scanner;

public class HogerLagerMain {
public void go(Scanner kb){
    System.out.println("geef bounds, en daarna inzet");
    HogerLager game = new HogerLager(kb.nextInt(),kb.nextInt());

    while(game.getReward()>0){
        switch(game.guess(kb.nextInt())){
        case 1:
            System.out.println("nummer ligt lager");
            Utility.setCredit(10,false);
            break;
        case 0:
            System.out.println("juist!");
            System.out.println("gewonnen: €" + game.getReward() + "!");
            Utility.setCredit(game.getReward(),true);
            game.setReward();
            break;
        case -1:
            System.out.println("nummer ligt hoger");
            Utility.setCredit(10,false);
            break;
            case 5:
                System.out.println("nummer out of bounds! opnieuw");
        }
    }

    System.out.println();
}

}
