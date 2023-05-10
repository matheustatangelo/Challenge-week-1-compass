package questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = input.nextLine();

        Sentiment sentiment = new Sentiment(message);

        System.out.println(sentiment.getSentiment());

        input.close();
    }
}

