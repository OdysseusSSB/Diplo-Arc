import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Loader {
    public static void main() {
        String path = Ask.query("File Path");

        GameState gameState;
        
        ObjectMapper om = new ObjectMapper();
        try {
            gameState = om.readValue(new File(path), GameState.class);
            System.out.println(gameState.audit());
        } catch (IOException e) {
            System.out.println("Exception reading file");
            e.printStackTrace();
        }
    }
}