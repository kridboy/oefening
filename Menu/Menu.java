package be.keisse.Associaties.Menu;

import be.keisse.Associaties.HighLow.HogerLagerMain;
import be.keisse.Associaties.Lottery.LotteryMain;
import be.keisse.Associaties.util.Utility;

import java.util.Scanner;

public class Menu {
    HogerLagerMain hiLo = new HogerLagerMain();
    LotteryMain lotto = new LotteryMain();

    public void go(Scanner kb){
        boolean menu = true;
        while(menu){
            System.out.println("Credits: €" + Utility.getCredit());
            System.out.println("geef nummer van spel");
            System.out.println("1.lottery");
            System.out.println("2, Hoger Lager");
            System.out.println("0. Quit");
            int x = kb.nextInt();

            switch(x){
                case 0:
                    menu=false;
                    break;
                case 1:
                    lotto.go(kb);
                    break;
                case 2:
                    hiLo.go(kb);
                    break;
            }
    }
}
}
