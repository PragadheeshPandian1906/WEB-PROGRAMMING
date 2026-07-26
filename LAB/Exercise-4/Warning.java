import java.io.*;
import java.util.Scanner;

public class Warning {

    public static void main(String[] args) {

        Scanner scan = null;
        PrintWriter outFile = null;

        try {

            // Open input and output files
            scan = new Scanner(new File("students.dat"));
            outFile = new PrintWriter(new FileWriter("warning.dat"));

            while (scan.hasNext()) {

                // Read data
                String name = scan.next();
                int hours = scan.nextInt();
                double qualityPoints = scan.nextDouble();

                // Compute GPA
                double gpa = qualityPoints / hours;

                // Determine academic warning
                boolean warning = false;

                if (hours < 30 && gpa < 1.5) {
                    warning = true;
                } else if (hours < 60 && gpa < 1.75) {
                    warning = true;
                } else if (hours >= 60 && gpa < 2.0) {
                    warning = true;
                }

                // Write to output file
                if (warning) {
                    outFile.println(name + " " + hours + " " + gpa);
                }
            }

            // Close output file
            outFile.close();
            scan.close();

            System.out.println("Academic warning list has been created.");

        }

        catch (FileNotFoundException e) {
            System.out.println("Error: Input file 'students.dat' was not found.");
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in the input file.");
        }

        catch (IOException e) {
            System.out.println("Error: Problem reading from or writing to the file.");
        }
    }
}