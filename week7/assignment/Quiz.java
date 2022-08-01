public class Quiz {
    public static void main(String[] args){

        Question question = new MultipleChoiceQuestion(
                "What is the color of surrender flag?",
                "Red",
                "white",
                "Blue",
                "Black",
                "Yellow",
                "b"
        );
        question.check();

        Question question1 = new MultipleChoiceQuestion(
                "How many starts are in the United States flag?",
                "50",
                "45",
                "40",
                "55",
                "60",
                "a"
        );
        question1.check();

        Question question2 = new MultipleChoiceQuestion(
                "Which footballer has the highest ballon de or?",
                "Ronaldo",
                "Rooney",
                "Kafka",
                "Messi",
                "Donaldina",
                "d"
        );
        question2.check();

        Question question3 = new MultipleChoiceQuestion(
                "How many days are in a week?",
                "five",
                "three",
                "seven",
                "ten",
                "fourteen",
                "c"
        );
        question3.check();

        Question question4 = new MultipleChoiceQuestion(
                "Which country has a flag of a red circle with white background",
                "South Korea",
                "North Korea",
                "Bangladesh",
                "Japan",
                "Thailand",
                "d"
        );
        question4.check();

        Question question5 = new TrueFalseQuestion(
                "Do camels have three sets of eyelids?",
                "true"
        );
        question5.check();

        Question question6 = new TrueFalseQuestion(
                "Australia is a country as well as a continent",
                "true"
        );
        question6.check();

        Question question7 = new TrueFalseQuestion(
                "It is possible to sneeze while sleeping",
                "false"
        );
        question7.check();

        Question question8 = new TrueFalseQuestion(
                "Jupiter is the smallest planet in the solar system",
                "false"
        );

    }
}
