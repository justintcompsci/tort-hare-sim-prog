package tortoiseAndHare;

public class tortoiseAndHare {

	public static void main(String[] args) throws InterruptedException {

		Tortoise turtle = new Tortoise(); // class data type (obj of tortoise) for variable turtle
		Hare rabbit = new Hare(); // class data type (obj of hare) for variable hare

		int time = 0; // time that is needed for this project time++
		int finish = 70; // finish line

		// *****************************************************************(comment for
		// me)*******
		// calling the turtle and rabbit as a variable to be assigned from tortoise and
		// hare object
		// to call what we need to compare to finish variable or any variable we want to
		// getter we
		// would first call the variable assigned to object then the method that would
		// make sense in
		// comparing the getter.
		// ****************************************************************************************

		// ***************************************************************************************
		// Runs a while loop that will 1). get the position of the hare from the class
		// and methods
		// 2). get the position of the tortoise from the class and methods
		// 3). Get the information of position to output the display of HT and the lines
		// 4). Thread.sleep is something that would help slow down the output to see
		// the action between H and T.
		// 5). while race is continuing running the time increments in seconds
		// This is all managed as long a the race is not finished
		// **************************************************************************************
		while (turtle.getPosition() != finish && rabbit.getPosition() != finish) {
			turtle.movePosition(); // movement of turtle
			rabbit.movePosition(); // movement of hare
			displayRace(turtle, rabbit);
			Thread.sleep(1000);
			time++;
		}

		if (turtle.getPosition() > rabbit.getPosition()) // if T beats H output this
			System.out.println("TORTOISE WINS, YAY!!!\n");
		else if (turtle.getPosition() < rabbit.getPosition())// if H beats T output this
			System.out.println("HARE WINS, YUCH!!!\n");
		else
			System.out.println("IT'S A TIE!!!\n");// none above then output tie

		System.out.println("Time of race: " + time + " seconds\n"); // output time

	}

	// *****************************************************************************
	// Name: displayRace();
	//
	// Pre: grabbing the class object of tortoise and hare's position in their
	// classes
	// to help us output our display if the position is the same output ouch. And
	// output
	// H for the hare position and T for the tortoise position.
	// The lines help us see the race course and bounds of the race
	//
	// Post: displaying ouch for same position
	// H for hare, and T for tortoise.
	// *****************************************************************************
	// start method
	public static void displayRace(Tortoise turtle, Hare hare) {

		for (int i = 1; i <= 70; i++) {
			if (i == turtle.getPosition() && i == hare.getPosition())
				System.out.print("OUCH!!!");
			else if (i == hare.getPosition())
				System.out.print("H");
			else if (i == turtle.getPosition())
				System.out.print("T");
			else
				System.out.print('-');

		}
		System.out.println();
	}// end display method
}
