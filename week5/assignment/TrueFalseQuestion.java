import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question{
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question).toUpperCase();
            answer = answer.toUpperCase();
            if (answer.equals("T") ||
            answer.equals("Y") ||
            answer.equals("YES")) answer = "TRUE";

            if (answer.equals("F") || answer.equals("N") ||
            answer.equals("NO")) answer = "False";

            boolean valid = (answer.equals("FALSE") || answer.equals("TRUE"));
            if (valid) return answer;
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE");
        }
    }

    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE:  " + question;
        answer = answer.toUpperCase();
        if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y")
        || answer.equals("YES")) correctAnswer = "TRUE";
        if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N")
                || answer.equals("NO")) correctAnswer = "FALSE";
    }
}
