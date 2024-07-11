import java.util.Scanner;
public class ExamGrader {
    public static void main(String[] args) {
     // Array containing the correct answers for the exam questions
        char[] correctAnswers = {'A', 'B', 'C', 'D', 'A', 'C', 'B', 'D', 'A', 'C'};
        int numberOfQuestions = correctAnswers.length;
        char[] studentAnswers = new char[numberOfQuestions];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student's answers for the " + numberOfQuestions + " questions:");
       // Loop to collect answers from the student
        for (int i = 0; i < numberOfQuestions; i++) {
            char answer;
            while (true) {
                System.out.print("Question " + (i + 1) + "(A, B, C, D) : ");
                answer = scanner.next().toUpperCase().charAt(0);
                // Validate that the answer is one of the valid options (A, B, C, D)
                if (answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D') {
                    studentAnswers[i] = answer;
                    break;
                } else {
                    System.out.println("Invalid answer. Please enter A, B, C, or D.");
                }
            }

        }
        int score = 0;
        // Loop to compare the student's answers to the correct answers and calculate the score
        for (int i = 0; i <numberOfQuestions; i++) {
            if (studentAnswers[i] == correctAnswers[i]) {
                score++;
            }
        }
        // Print the student's score
        System.out.println("The student's score is: " + score + " out of " + numberOfQuestions);
        // Calculate the percentage of correct answers
        double percentage = (score / (double) numberOfQuestions) * 100;
        // Print the percentage with two decimal places
        System.out.printf("The percentage is: %.2f%%\n", percentage);
        scanner.close();
    }
}