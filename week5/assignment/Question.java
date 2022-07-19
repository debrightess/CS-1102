import javax.swing.JOptionPane;
public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;
    String question;
    String correctAnswer;

    abstract String ask();
    void check(){
        nQuestions++;
        String answer = ask();
        if (answer.equals(correctAnswer)){
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + "Answer correct out of " + nQuestions + " Questions ");
    }
}
