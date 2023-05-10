package questao3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Questions quiz = new Questions();

        int numQuestions = quiz.getNumQuestions();
        int numCorrect = 0;
        int numWrong = 0;

        for (int i = 0; i < numQuestions; i++) {
            String question = quiz.getQuestion(i);
            String answer = quiz.getAnswer(i);

            System.out.println(question);
            String userAnswer = scanner.nextLine();

            if (isAnswerCorrect(userAnswer, answer)) {
                System.out.println("Correto, boaaaaaaa!\n");
                numCorrect++;
            } else {
                System.out.println("Incorreto. A resposta certa é.....:\n" + answer);
                numWrong++;
            }
        }

        System.out.println("Questionário Completo!\n");
        System.out.println("Corretas: " + numCorrect);
        System.out.println("Incorretas: " + numWrong);
    }

    private static boolean isAnswerCorrect(String userAnswer, String correctAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

}

