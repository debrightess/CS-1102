import javax.swing.JOptionPane;


public class Quiz {
    public static int nQuestions = 0;
    public static int nCorrect = 0;
    public static void main(String[] args) {
        String question1 = "Which Tennis Grand Slam is played on a clay surface?\n";
        question1 += "A. Wimbledon\n";
        question1 += "B. Roland Garros\n";
        question1 += "C. US Open\n";
        question1 += "D. Australian Open\n";
        question1 += "E. African Open\n";
        check(question1, "B");

        String question2 = "What is the name of the main antagonist in the Shakespeare play Othello?\n";
        question2 += "A. Benson\n";
        question2 += "B. David\n";
        question2 += "C. Michel\n";
        question2 += "D. Kent\n";
        question2 += "E. Lago\n";
        check(question2, "E");

        String question3 = "How many human players are there on each side in a polo match?\n";
        question3 += "A. Six\n";
        question3 += "B. Three\n";
        question3 += "C. Four\n";
        question3 += "D. Eight\n";
        question3 += "E. Ten\n";
        check(question3, "C");

    }
    static String ask(String question){

        while (true){
            String ans = JOptionPane.showInputDialog(question);
            ans = ans.toUpperCase();
            if (!(ans.equals("A") ||
                    ans.equals("B") ||
                    ans.equals("C") ||
                    ans.equals("D") ||
                    ans.equals("E"))){
                JOptionPane.showMessageDialog(null, "Invalid Answer");
                continue;
            }
            return ans;
        }

    }

    static void check(String question, String correctAnswer){
        String ans = ask(question);
        nQuestions++;
        if(ans.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++;
            JOptionPane.showMessageDialog(null, "You got " + nCorrect+ " questions correct. Out of " + nQuestions+" questions.");

        } else{
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is: " + correctAnswer);
            JOptionPane.showMessageDialog(null, "You got " + nCorrect+ " questions correct. Out of " + nQuestions + " questions.");
        }

    }

}
