package client;

import game.*;

public class Main {
    public static void main(String[] args)  {
        testTemplate();
    }

    private static void testTemplate() {

        // instantiate and play chess game
        Game chess = new Chess();
        chess.play();

        // instantiate and play gomoku game
        Game gomoku = new Gomoku();
        gomoku.play();

    }


}
