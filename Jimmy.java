/**
 * 
 */
package talkshow;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

/**
 * The Jimmy Fallon Class
 *
 */
public class Jimmy extends Host {
	// Default Jimmy class
	public Jimmy(PrintWriter fileOut) {
	    // Call the super class
		super(fileOut);
		
		// Declare the host name as Jimmy
		hostName = "Jimmy";
		
		// Declare the  third option as read a comment
		thirdActionName = "\n3. Read a comment";
	}
	
	// Introduce method
    public void introduce () {
    	// Print out the introduction and write it to the transcript
        System.out.println("Jimmy: Ladies and gentlemen, please welcome " + getName());
        fileOut.println("Jimmy: Ladies and gentlemen, please welcome " + getName());
    }
    
    // Outro method
    public void outro () {
    	// Print out the outro and write it to the transcript
        System.out.println("Jimmy: Thank you for being on our show, " + getName() + ". Here is a gift for you: " + randomGiftGenerator());
        fileOut.println("Jimmy: Thank you for being on our show, " + getName() + ". Here is a gift for you: " + randomGiftGenerator());
        
    }
    
    // Greeting method
    public void greeting() {
    	// Prompt the user to reply to Jimmy Fallon
        String firstreply = JOptionPane.showInputDialog("Jimmy: So, how are you?");
        
        // Print out the greeting and write it to the transcript
        System.out.println("Jimmy: So, how are you?");
        fileOut.println("Jimmy: So, how are you?");
        
        // Print out the user reply and write it to the transcript
        System.out.println(getName() + ": " + firstreply);
        fileOut.println(getName() + ": " + firstreply);
    }
    
    // Overwrite third action method into Jimmy's read a comment method
    public void thirdAction () {
    	// Comment array
        String comment[] = new String[4];
        comment[0] = "Hello";
        comment[1] = "Liking the show?";
        comment[2] = "Look in the mirror and you'll see who's awesome";
        comment[3] = "Hey, you rock!";
        
        // Generate random comment
        int commentNumber = (int) (Math.random() * 4);
        
        // Print out the comment and write it into the transcript
        System.out.println(comment[commentNumber]);
        fileOut.println(comment[commentNumber]);
    }
}
