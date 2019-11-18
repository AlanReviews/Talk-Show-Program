/**
 * 
 */
package talkshow;

// Import the java swing package and input/output package
import javax.swing.*;
import java.io.*;

/**
 * @author Alan Zhou
 *
 */
public class HostDriver2 {
    public static void main(String[] args) throws IOException {
        // Declare and initialize the myHost variable
        Host myHost = null;

        // Adding a printwriter
        PrintWriter fileOut = new PrintWriter(new FileWriter("I:\\ComputerScience\\transcript.txt"));
        
        // Prompt the user to enter their name
        String name = JOptionPane.showInputDialog("Enter your name");
        
        // Declare and initialize the count variable
        int count = 3;
        
        // Declare and initialize the common variables: reply, question, action, and host
        String reply = "", question = "", action = "", host = "";
        
        // In a do while loop, the user selects the talk show host. If an invalid number is selected, the user will be prompted to try again. No exception thrown.
        do {
            // Prompt the user to enter a talk show host to meet
            host = JOptionPane.showInputDialog(
                    "Welcome! Who would you like to meet?\n1. Ellen Degeneres\n2. Jimmy Fallon\n3. Stephen Colbert\n 4. Help");

            if (host.equals("1")) {
                // Instantiate an "Ellen Degeneres" object
                myHost = new Ellen(fileOut);   
            } 
            
            // Meeting Jimmy Fallon
            else if (host.equals("2")) {
                // Instantiate a "Jimmy Fallon" object
                myHost = new Jimmy(fileOut);
            } 
            
            // Meeting Stephen Colbert
            else if (host.equals("3")) {
                // Instantiate a "Stephen Colbert" object
                myHost = new Stephen(fileOut);
            } 
            
            // Accessing the help menu
            else if (host.equals("4")) {
                // In a dialog box, print out the instructions
                JOptionPane.showMessageDialog(null, "Welcome to the Talk Show Program. You can talk with America's best hosts and have some fun!"
                        + "\n1. Enter the host you would like to meet and talk with him/her."
                        + "\n2. Follow the instructions on the next steps.");
            }
            
        } while (myHost == null);
        
        // Set the name of the user
        myHost.setName(name);
        
        // Call the introduction method
        myHost.introduce();
        
        // Call the greeting method
        myHost.greeting();
        
        // In a do while, loop have fun with the host with 3 actions to do!
        do {
            // Prompt the user to do an action
            action = JOptionPane.showInputDialog(
                    "What would you like to do?\n1. Answer a question\n2. Call up someone" + myHost.getThirdActionName());
            
            // The first option, user chooses to answer a question
            if (action.equals("1")) {
                // Generate and get the random question
                question = myHost.randomQuestionGenerator();
                
                // Print out random question and write it to the transcript file
                System.out.println(myHost.getHostName() + ": " + question);
                fileOut.println(myHost.getHostName() + ": " + question);
                
                // Answer the question
                reply = JOptionPane.showInputDialog(myHost.getHostName() + ": " + question);
                
                // Print out the reply and write it to the transcript file
                System.out.println(name + ": " + reply);
                fileOut.println(name + ": " + reply);
                System.out.println(myHost.getHostName() + " nods their head.");
                fileOut.println(myHost.getHostName() + " nods their head.");
                
                // Decrement the counter
                count--;
            }  // if (action.equals("1")) {
            
            // The second option, invite someone on the stage (Call up someone)
            else if (action.equals("2")) {
                // Prompt the user to enter a person to meet Ellen
                String meetHost = JOptionPane.showInputDialog("Who would you like to bring up on the stage?");
                
                // Call the method to determine whether a person is there or not.
                myHost.callUp(meetHost);
                
                // Decrement the counter
                count--;
            }  // if (action.equals("2")) {
            
            // The third option, call the third option method
            else if (action.equals("3")) {
                // Call the thirdAction method
                myHost.thirdAction();
                
                // Decrement the counter
                count--;
            }  // if (action.equals("3")) {

            // Reset the action variable
            action = "";
        } while (count > 0);
        
        // Call the outro method
        myHost.outro();
        
        // Close the print writer
        fileOut.close();
    }
}
