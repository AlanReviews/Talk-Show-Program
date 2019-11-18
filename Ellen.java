/**
 * 
 */
package talkshow;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

/**
 * The Ellen Degeneres Class
 *
 */
public class Ellen extends Host {
    // Default Ellen class
    public Ellen(PrintWriter fileOut) {
        // Call the super class
        super(fileOut);
        // Give the host name Ellen
        hostName = "Ellen";
        // Give the third option the Who'd You Rather
        thirdActionName = "\n3. Who'd You Rather";
    }

    // Introduce method
    public void introduce() {
        // Ellen introduces. Write it to the transcript and print it out
        System.out.println("Ellen: Can you please welcome our guest " + getName() + " (Probably dance)");
        fileOut.println("Ellen: Can you please welcome our guest " + getName() + " (Probably dance)");
    }

    // Outro method
    public void outro() {
        // Ellen says her farewell. Write it to the transcript and show the speech in the console
        System.out.println("Ellen: Here is a gift for you. " + randomGiftGenerator()
                + ". Thank you  for being on our show, " + getName() + " (Probably dance)");
        fileOut.println("Ellen: Here is a gift for you. " + randomGiftGenerator()
                + ". Thank you  for being on our show, " + getName() + " (Probably dance)");

    }

    // Greeting method
    public void greeting() {
        // Prompt the user to the greeting
        String firstreply = JOptionPane.showInputDialog("Ellen: So, how are you doing?");
        // Ellen greets. Write question in transcript and print out the greeting
        System.out.println("Ellen: So, how are you doing?");
        fileOut.println("Ellen: So, how are you doing?");
        // Print out the user's reply and write it in the transcript
        System.out.println(getName() + ": " + firstreply);
        fileOut.println(getName() + ": " + firstreply);
    }
    
    // Overwrite Third action method into Ellen's Who'd You Rather
    public void thirdAction() {
        // Declare the choices for the Who'd you rather game
        int choice1, choice2;
        // Declare and initialize the title of the selected choice
        String chosen = "";
        // Declare and initialize the choice array
        String choices[] = new String[5];
        choices[0] = "A friend";
        choices[1] = "A singer";
        choices[2] = "Ellen Degeneres";
        choices[3] = "A teacher";
        choices[4] = "A politican";
        
        // Prompt the user to add the name of the person
        String nameOfPerson = "";
        // Prompt the user to choose who they would like to meet. Ellen asks a
        // question. Show the question in the console and write it into the transcript
        System.out.println("Ellen: Who would you like to meet?");
        fileOut.println("Ellen: Who would you like to meet?");
        
        // Generate 2 random different choices by generating 2 different random numbers
        do {
            choice1 = (int) (Math.random() * 5);
            choice2 = (int) (Math.random() * 5);
        } while (choice1 == choice2);
        
        // Prompt the user to choose the person
        String Rather = JOptionPane
                .showInputDialog("Who would you like to meet?\n1-" + choices[choice1] + "\n2- " + choices[choice2]);
        
        // If the user chose the first choice, make the chosen variable equal to the first choice
        if (Rather.equals("1")) {
            chosen = choices[choice1];
        } 
        
        // If the user chose the second choice, make the chosen variable equal to the second choice
        if (Rather.equals("2")) {
            chosen = choices[choice2];
        }
        
        // If the first or second choice is Ellen Degeneres, make the name of the person Ellen Degeneres
        if (choices[choice1].equals("Ellen Degeneres")) {
            nameOfPerson = "Ellen Degeneres";
        }
        
        if (choices[choice2].equals("Ellen Degeneres")) {
            nameOfPerson = "Ellen Degeneres";
        } 
        
        // If the name of the person is not Ellen Degeneres, prompt the user to add the name of the person
        if (nameOfPerson.equals("")) {
            do {
            nameOfPerson = JOptionPane.showInputDialog("What is the name of " + chosen);
            } while (nameOfPerson.equals(null));
        }
        
        // Print out the reply and write it in the transcript
        System.out.println(getName() + ": I would like to meet " + nameOfPerson);
        fileOut.println(getName() + ": I would like to meet " + nameOfPerson);
    }
}
