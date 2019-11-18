/**
 * 
 */
package talkshow;

import java.io.*;

/**
 * @author Alan Zhou
 *
 */
public class Host {
	// Protected printwriter variable
    protected PrintWriter fileOut;
    // Protected string question array
    protected String []   question;
    // Protected boolean isAsked array
    protected boolean     isAsked[];
    // Protected string host name variable
    protected String      hostName;
    // Protected string third action name variable
    protected String      thirdActionName;
    
    // Getter for host name
	public String getHostName() {
		return hostName;
	}
	
	// Getter for the name of the third action
	public String getThirdActionName() {
		return thirdActionName;
	}
	
	// Private string name variable
    private String name;
    
    // Default host constructor
    public Host (PrintWriter fileOut) {
        // Initialize the file out print writer variable
    	this.fileOut = fileOut;
    	
    	// Question variable
        question    = new String[8];
        question[0] = "If you had to pick someone to be on an island with, who would it be? Why?";
        question[1] = "What is one tip to survive school? (High School, College, University etc.)";
        question[2] = "What kind of video games or board games do you play?";
        question[3] = "If you were an ice cream flavour, what would you be? Why?";
        question[4] = "If you have to sing a song, what song would you sing?";
        question[5] = "What would you do to relax?";
        question[6] = "Do you know any life hacks?";
        question[7] = "Tell a story";

        // Boolean isAsked variable. All array variables are initialized to false
        isAsked = new boolean[8];
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String n) {
        name = n;
    }
    
    // Introduce overwritable method
    public void introduce() {
    }
    
    // Outro overwritable method
    public void outro() {
    }
    
    // Greeting overwritable method
    public void greeting() {
    }
    
    // Third option overwritable method
    public void thirdAction() {
    }
    
    // Random gift generator method
    public String randomGiftGenerator() {
    	// Gift array
        String gift[] = new String[5];
        gift[0] = "$1 gift card";
        gift[1] = "$1000 gift card";
        gift[2] = "Concert tickets";
        gift[3] = "Pen";
        gift[4] = "Computer";
        // Randomly generate gift
        int randomGiftNumber = (int) (Math.random() * 5);
        //Return gift
        return gift[randomGiftNumber];
    }
    
    // Random question generator method
    public String randomQuestionGenerator() {
        // Declare the random question number variable
    	int randomQuestionNumber;
    	// In a do while loop, generate a random unanswered question for more randomness
    	do {
    	    // Random number generator to generate a random number
    	    randomQuestionNumber = (int) (Math.random() * 8);
    	} while (isAsked[randomQuestionNumber] == true);

    	// When a question is asked, mark it as true in the isAsked[] array
    	isAsked[randomQuestionNumber] = true;

    	// Return question
    	return question[randomQuestionNumber];
    }
    
    // Call up people from the audience through a method
    public void callUp (String person) {
    	// Chance of a person's availability is randomly generated
    	int chance = (int) (Math.random() * 2);
    	
    	// When chance is 0, the person is not available
    	if (chance == 0) {
    	    // Print out the person isn't here
    		System.out.println(person + " isn't here");
    		fileOut.println(person + " isn't here");
    	}
    	
    	// A person meets
    	else {
    	    // Print out and write the action of a person going up on the stage
    		System.out.println(person + " goes up on the stage.");
    		fileOut.println(person + " goes up on the stage.");
    	}
    }
}
