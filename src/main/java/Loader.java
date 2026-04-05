import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Loader {
    public static GameState load(File file) {
        GameState gameState;

        ObjectMapper om = new ObjectMapper();
        try {
            gameState = om.readValue(file, GameState.class);
            System.out.println(gameState.audit());
        } catch (IOException e) {
            System.out.println("Exception reading file");
            e.printStackTrace();
            gameState = new GameState();
        }

        return gameState;
    }
}