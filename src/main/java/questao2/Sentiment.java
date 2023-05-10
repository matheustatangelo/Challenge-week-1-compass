package questao2;

public class Sentiment {
    private String message;
    private int funCount;
    private int upsetCount;

    public Sentiment(String message) {
        this.message = message;
        this.funCount = 0;
        this.upsetCount = 0;
        calculateSentiment();
    }

    private void calculateSentiment() {
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ':' && i < message.length() - 1) {
                if (message.charAt(i + 1) == '-') {
                    if (i < message.length() - 2 && message.charAt(i + 2) == ')') {
                        funCount++;
                    } else if (i < message.length() - 2 && message.charAt(i + 2) == '(') {
                        upsetCount++;
                    }
                }
            }
        }
    }

    public String getMessage() {
        return message;
    }

    public int getFunCount() {
        return funCount;
    }

    public int getUpsetCount() {
        return upsetCount;
    }

    public String getSentiment() {
        if (funCount == upsetCount) {
            return "neutro";
        } else if (funCount > upsetCount) {
            return "brincalhão";
        } else {
            return "\ntriste";
        }
    }
}
