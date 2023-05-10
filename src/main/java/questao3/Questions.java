package questao3;

public class Questions {
    private final String[] questions = {
            "Qual a capital da frança?",
            "Qual a maior montanha do mundo?",
            "Quem pintou a monalisa?",
            "Quais foram as principais causas e consequências da Guerra do Vietnã?",
            "Qual o menor planeta do sistema solar?",
            "Quem escreveu a novela 1984?"
    };
    private final String[] answers = {
            "Paris",
            "Monte Everest",
            "Leonardo da Vinci",
            "A guerra arrasou campos agrícolas, destruiu casas e provocou prejuízos econômicos gravíssimos no Vietnã.",
            "Mercúrio",
            "George Orwell"
    };

    public int getNumQuestions() {
        return questions.length;
    }

    public String getQuestion(int index) {
        return questions[index];
    }

    public String getAnswer(int index) {
        return answers[index];
    }
}
