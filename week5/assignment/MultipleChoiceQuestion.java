import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";

        correctAnswer = answer.toUpperCase();
    }

    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            while (true) {
                answer = answer.toUpperCase();
                boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") ||
                        answer.equals("E"));
                if (valid) return answer;

                JOptionPane.showMessageDialog(null, "invalid answer. Please enter  A, B, C, D, or E.");
                answer = ask();

            }
        }
    }
}
