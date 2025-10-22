import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadPoems {
    public static void main(String[] args) {
        String inputFile = "poem2.txt";
        List<Poem> poems = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String poemName;
            while ((poemName = br.readLine()) != null) {
                String poetName = br.readLine();
                if (poetName != null) {
                    poems.add(new Poem(poemName, poetName));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Poem poem : poems) {
            System.out.println("Poem: " + poem.getName() + ", Poet: " + poem.getPoet());
        }
    }
}
