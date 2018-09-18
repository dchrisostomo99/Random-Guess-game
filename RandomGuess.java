import javax.swing.JOptionPane;

public class RandomGuess
{
    public static void main(String[] args) 
    {
        //Variables and constants will go first
        int guess;
        int randomNum;
        String message;
        int attempts = 1;
        final int HIGH = 10;
        final int LOW = 1;
        //Generates a random number between 1 and 10
        randomNum = LOW + (int)(Math.random() * HIGH);
        //Promts user for their guess and changes it from a string to an integer
        guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between " + LOW + " and " + HIGH));

      
        while(guess != randomNum)
        {
            if(guess < randomNum)
                message = "Your guess was too low...";
            else
                message = "Your guess was too high...";
                guess = Integer.parseInt(JOptionPane.showInputDialog(null, message + "\nGuess a number between " + LOW + " and " + HIGH));
                ++attempts;    
        }
        JOptionPane.showMessageDialog(null, "Hurry you guessed it! \nIt only took you " + attempts + " attempts");
        
    }    
}

