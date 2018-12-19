package com.coderlab.f3demo;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Jeu extends BasicGame {

    int squareX;
    int squareY;

    int targetX, targetY, targetWidth, targetHeight;

    List<Joueur> joueurs;


    public Jeu(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
//        squareX = 100;
//        squareY = 60;
//
//        targetX = 250;
//        targetY = 250;
//        targetWidth = 200;
//        targetHeight = 200;

        joueurs = new ArrayList<>();

        joueurs.add(new Joueur(20, 100, Input.KEY_Z, Input.KEY_S));
        joueurs.add(new Joueur(300, 100, Input.KEY_UP, Input.KEY_DOWN));




    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        /* Partie 1*/
//        Input input = gameContainer.getInput();
//
////        if (input.isKeyDown(Input.KEY_SPACE)) {
////            System.out.println("Space pressed !!");
////            squareX++;
////        }
//
//
//        squareX = input.getMouseX();
//        squareY = input.getMouseY();
//
//
//          /* Partie 2*/
//        if (squareX> targetX && squareY > targetY
//                && squareX < targetX + targetWidth && squareY < targetY + targetHeight) {
////            System.out.println("Inside");
//            if (input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
//                System.out.println("Clicked in square !!!!");
//            }
//        }


        for (Joueur currentPlayer : joueurs) {
            currentPlayer.update(gameContainer.getInput());
        }



    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }
}
