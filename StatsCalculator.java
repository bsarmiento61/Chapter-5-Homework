import java.io.*;

public class StatsCalculator {
    public static void main(String[] args) {
        String inputFile = "Book1.csv";
        String outputFile = "stats.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line = br.readLine();
            if (line != null) {
                String[] numbers = line.split(",");
                int sum = 0;
                int lowest = Integer.MAX_VALUE;
                int highest = Integer.MIN_VALUE;

                for (String numStr : numbers) {
                    int num = Integer.parseInt(numStr.trim());
                    sum += num;
                    if (num < lowest) lowest = num;
                    if (num > highest) highest = num;
                }

                double average = (double) sum / numbers.length;

                bw.write("The sum of the numbers is: " + sum + "\n\n");
                bw.write("The lowest number is: " + lowest + "\n\n");
                bw.write("The highest number is: " + highest + "\n\n");
                bw.write("The average of the numbers is: " + average + "\n");

                System.out.println("Results written to " + outputFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
