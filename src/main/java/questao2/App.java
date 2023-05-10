package questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Coloque uma mensagem, pode ser sem ou usando um dos emojis: :-) ou :-( : ");
        String message = input.nextLine();

        Sentiment sentiment = new Sentiment(message);

        System.out.println(sentiment.getSentiment());

        input.close();
    }
}

