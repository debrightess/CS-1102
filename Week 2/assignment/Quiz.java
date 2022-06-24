// Name: Adunola Smith

import javax.swing.JOptionPane;
public class Quiz {
    public static void main(String[] args) {
        String question = "In which country can you find the Eiffel Tower\n";
        question += "A. Germany\n";
        question += "B. France\n";
        question += "C. Portugal\n";
        question += "D. England\n";
        question += "E. Brazil\n";

        while (true){
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("B")){
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            } else if (answer.equals("A") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter: A, B, C, D, E.");
            }
        }


    }
}
