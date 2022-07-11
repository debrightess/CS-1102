public class Quiz {
    public static void main(String[] args) {
        MultipleChoiceQuestion question = new
                MultipleChoiceQuestion("In Harry Potter, what is the name of The Weasley's house?",
                "Hawkworth family",
                "The Burrow",
                "Hitchin family",
                "Oddpick family",
                "Brand family",
                "b");
        question.check();
        question.showResults();

        MultipleChoiceQuestion question1 = new
                MultipleChoiceQuestion("What does He stand for on the periodic table?",
                "Helen",
                "Hellom",
                "Hydrogen",
                "Hello",
                "Helium",
                "e"
                );
        question1.check();
        question1.showResults();

        MultipleChoiceQuestion question2 = new
                MultipleChoiceQuestion("What is the smallest country in the world?",
                "Jamaica",
                "Portugal",
                "Vatican City",
                "Nigeria",
                "Belarus",
                "c");
        question2.check();
        question2.showResults();
    }
}
