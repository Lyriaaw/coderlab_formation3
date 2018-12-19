package com.coderlab.f3demo;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

    public static void main(String[] args) {

        try {
            AppGameContainer apg = new AppGameContainer(new Jeu("Mon super jeu de ouf"));
            apg.setDisplayMode(800, 600, false);
            apg.start();
        } catch (SlickException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {

        }


    }
}
