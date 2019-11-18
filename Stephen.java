/**
 * 
 */
package talkshow;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

/**
 * The Stephen Colbert Class
 *
 */
public class Stephen extends Host {
	// Default Stephen class
	public Stephen(PrintWriter fileOut) {
		// Call the super class
		super(fileOut);
		
		// Declare the host name as Stephen
		hostName = "Stephen";
		
		// Declare the third option as blank ("")
		thirdActionName = "\n3. Learn a Fact";
	}
	
	// Introduce method
    public void introduce () {
    	// Print out the introduction and write it to the transcript
        System.out.println("Stephen: Hello, please welcome " + getName());
        fileOut.println("Stephen: Hello, please welcome " + getName());
    }
    
    // Outro method
    public void outro () {
    	// Print out the outro and write it to the transcript
        System.out.println("Stephen: Thank you for being on our show, " + getName() + ". Here is a gift for you: " + randomGiftGenerator());
        fileOut.println("Stephen: Thank you for being on our show, " + getName() + ". Here is a gift for you: " + randomGiftGenerator());
    }
    
    // Greeting method
    public void greeting() {
    	// Prompt the user to reply to Stephen Colbert
        String firstreply = JOptionPane.showInputDialog("Stephen: Welcome, how are you doing?");
        
        // Print out the greeting and write it to the transcript
        System.out.println("Stephen: Welcome, how are you doing?");
        fileOut.println("Stephen: Welcome, how are you doing?");
        
        // Print out the user reply and write it to the transcript
        System.out.println(getName() + ": " + firstreply);
        fileOut.println(getName() + ": " + firstreply);
    } 
    
    // Colbert's third option is to generate random facts
    public void thirdAction () {
        // Declare and initialize the fact array
        String fact[] = new String[4];
        fact[0] = "Hi";
        fact[1] = "Stephen Colbert is a satire reporter. He does do interviews";
        fact[2] = "Colbert ran many shows: Daily Show, Colbert Report, and Late Show. You are probably on one of these shows.";
        fact[3] = "Colbert is funny and good.";
        
        // Generate random facts
        int randomFactNumber = (int) (Math.random() * 4);
        
        // Print out the fact and write it to the transcript file
        System.out.println(fact[randomFactNumber]);
        fileOut.println(fact[randomFactNumber]);
    }
}
