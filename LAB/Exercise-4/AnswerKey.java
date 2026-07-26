import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnswerKey {

    public static void main(String[] args) {

        String answers = "";

        try {
            Scanner scan = new Scanner(new File("CodedAnswerKey.txt"));

            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                // Check if the line is A-F or a-f
                if (line.matches("[A-Fa-f]")) {
                    answers += line;
                }
            }

            scan.close();

            System.out.println("Answer Key: " + answers);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}