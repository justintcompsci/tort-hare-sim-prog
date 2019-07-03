package tortoiseAndHare;

//**************************************************************************************************
//This is the object for the tortoise. Since in the program we focus a lot of the movement and position
//of the hare and turtle. Hence the reason why we have a tortoise class.
//**************************************************************************************************
public class Tortoise {

	// Making the position secret for this class only to be use for this class
	private int position;

	// ************************************************************************
	// Name: public Hare();
	//
	// Pre: This is constructor to grab the variable position to set it to 1
	// since we are having the hare starting at the starting line which is 1
	//
	// Post: Setting position to 1 to be called and return from methods and
	// dot operator.
	// ************************************************************************
	public Tortoise() { // constructor building your object (tortoise)
		position = 1;
	}

	// ************************************************************************
	// Name: public int getPosition()
	//
	// Pre: This method is for grabbing our secret variable of position which is
	// set to 1 by our constructor.
	//
	// Post: This method will return the position from another method that is being
	// changed of the position of the hare
	// ************************************************************************
	public int getPosition() { // method, returning a position
		return position;
	}

	// ************************************************************************
	// Name: public void movePosition();
	//
	// Pre: This method determines the moves of the hare which adjusts the position
	// of the it through the purpose of the random number generator from 1-10.
	// With the output of the rand number gen we will have move determine the
	// position of the hare.
	//
	// Post: Position is being adjusts form the move which is being return from the
	// help of the method getPosition.
	// ************************************************************************
	public void movePosition() {
		int move;

		move = (int) (1 + Math.random() * 10); // generation move from 1-10

		/*
		 * if (move>=1 && move <=5) position+=3; //3 sq. to the right else if (move==6
		 * || move==7) position-=6; //6 sq. to the right else if (move>=8 && move<=10)
		 * position++; //1 sq. to the right
		 */

		switch (move) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			position += 3; // 3 sq. to the right
			break;
		case 6:
		case 7:
			position -= 6; // 6 sq. to the right
			break;
		case 8:
		case 9:
		case 10:
			++position; // 1 sq. to the right
			break;

		}

		if (position > 70) // bound check of the obj doesnt get out of the race
			position = 70;

		if (position < 1) // bound check of the obj doesnt get out of the race
			position = 1;
	}

}
