public class FinchButtonScore {
    public static void main(String[] args) {
        Finch finch = new Finch(); // Initiates finch robot
        int score = 0; // creates score variable

        while (true) { keeps program running forever
            if (finch.getButton("A") || finch.getButton("B")) { // checks if either button is pressed
                score++;  // adds to score=

                while (finch.getButton("A") || finch.getButton("B")) {} // the program wont do anything if it is held
            }
        }
    }
}
