import java.io.*;

public class WritePoems {
    public static void main(String[] args) {
        Poem p1 = new Poem("The Road Not Taken", "Robert Frost");
        Poem p2 = new Poem("Still I Rise", "Maya Angelou");
        Poem p3 = new Poem("Ozymandias", "Percy Bysshe Shelley");

        String outputFile = "poems.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write(p1.getName() + "\n");
            bw.write(p1.getPoet() + "\n\n");

            bw.write(p2.getName() + "\n");
            bw.write(p2.getPoet() + "\n\n");

            bw.write(p3.getName() + "\n");
            bw.write(p3.getPoet() + "\n");

            System.out.println("Poems written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
