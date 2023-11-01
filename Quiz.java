import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Quiz {
    private HashMap<String, String> questionAnswerMap;
    private ArrayList<String> questions;

    public Quiz() {
        questionAnswerMap = new HashMap<>();
        questions = new ArrayList<>();

        // Add questions and answers
        questionAnswerMap.put("What is the capital of France?", "Paris");
        questionAnswerMap.put("What is the capital of Germany?", "Berlin");
        questionAnswerMap.put("What is the capital of Japan?", "Tokyo");
        questionAnswerMap.put("CPU stands for?", "CentralProcessingUnit");
        questionAnswerMap.put("In 1GB how much MB?", "1024");
        questionAnswerMap.put("What is the capital of USA?", "NewYork");
        questionAnswerMap.put("What is the capital of India?", "Delhi");
        questionAnswerMap.put("Which is the most sensitive organ in our body?", "Skin");
        questionAnswerMap.put("Who is known as Father of Indian Constitution?", "Dr Bimrao Ambedkar");
        questionAnswerMap.put("Who is the Father of our Nation?", "Mohandas Karamchand Gandhi");


        // Add questions to list
        questions.addAll(questionAnswerMap.keySet());
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < 10; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(questions.size());
            String question = questions.get(randomIndex);
            System.out.println(question);

            String userAnswer = scanner.nextLine();
            String correctAnswer = questionAnswerMap.get(question);

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswer);
            }

            // Remove asked question
            questions.remove(randomIndex);
        }

        System.out.println("Your score is: " + score);
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.startQuiz();
    }
}
