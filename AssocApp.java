package be.keisse.Associaties;

import be.keisse.Associaties.Menu.Menu;

import java.util.Scanner;

public class AssocApp {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Menu m = new Menu();
        m.go(kb);
        kb.close();
        }

    }
