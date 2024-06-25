import java.util.Scanner;

public class CODSOFT_TASK2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects;
        int[] marks;
        int totalMarks = 0;
        double averagePercentage;
        char grade;

        // Get the number of subjects from the user
        System.out.print("Enter the number of subjects: ");
        numberOfSubjects = scanner.nextInt();

        // Initialize the marks array
        marks = new int[numberOfSubjects];

        // Get the marks for each subject from the user
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate the average percentage
        averagePercentage = (double) totalMarks / numberOfSubjects;

        // Determine the grade based on the average percentage
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
