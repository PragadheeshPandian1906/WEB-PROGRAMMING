import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnswerKey2 {

    // Method to modify the answer key
    public static String finalAnswers(String answers) {

        answers = answers.replace('e', 'b');
        answers = answers.replace('E', 'A');
        answers = answers.replace('f', 'c');
        answers = answers.replace('F', 'D');

        answers = answers.toLowerCase();

        return answers;
    }

    public static void main(String[] args) {

        String answers = "";

        try {

            Scanner scan = new Scanner(new File("CodedAnswerKey.txt"));

            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                // Keep only A-F or a-f
                if (line.matches("[A-Fa-f]")) {
                    answers += line;
                }
            }

            scan.close();

            System.out.println("Original Answer Key : " + answers);

            String finalKey = finalAnswers(answers);

            System.out.println("Final Answer Key    : " + finalKey);

        } catch (FileNotFoundException e) {
            System.out.println("Error: CodedAnswerKey.txt file not found.");
        }
    }
}