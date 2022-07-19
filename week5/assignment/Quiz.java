public class Quiz {
    public static void main(String[] args) {
//        Question 1
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
                "What is Java? ",
                "It is a programming language",
                "Its a thread",
                "its a software",
                "Its a virus",
                "There is nothing like java",
                "A"
        );

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
                "What is a computer?",
                "Its a Book",
                "Its an Instrument",
                "A computer is an electronic device",
                "Its a software",
                "Its a keyboard",
                "C"
        );
        question2.check();

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
                "What is a software?",
                "Battery",
                "Charger",
                "Executable",
                "Query",
                "Program for a computer",
                "E"
        );
        question3.check();

        Question question4 = new TrueFalseQuestion(
                "The World is flat?",
                "f"
        );
        question4.check();

        Question question5 = new TrueFalseQuestion(
                "Java and JavaScript are the same?",
                "f"
        );
        question5.check();

        Question question6 = new TrueFalseQuestion("Zambia is not a landlocked Country!", "False");
        question6.check();

        MultipleChoiceQuestion.showResults();
    }
}
