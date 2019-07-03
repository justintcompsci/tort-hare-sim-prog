package tortoiseAndHare;

//**************************************************************************************************
//This is the object for the hare. Since in the program we focus a lot of the movement and position
// of the hare and turtle. Hence the reason why we have a hare class.
//**************************************************************************************************
public class Hare {

	// Making the position secret for this class only to be use for this class
	private int position; // car accessories/color

	// ************************************************************************
	// Name: public Hare();
	//
	// Pre: This is constructor to grab the variable position to set it to 1
	// since we are having the hare starting at the starting line which is 1
	//
	// Post: Setting position to 1 to be called and return from methods and
	// dot operator.
	// ************************************************************************
	public Hare() { // constructor //car specific accessories/color
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
	public int getPosition() { // method //car's functionality, car accessory function

		return position; // returning your position

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
	public void movePosition() { // method //car's functionality, car accessory function
		int move;

		move = (int) (1 + Math.random() * 10); // generation move from 1-10

		/*
		 * if (move==3||move==4) position+=9; //9 sq. to the right else if (move==5)
		 * position-=12; //12 sq. to the left else if (move>=6 && move <=8) ++position;
		 * //1 sq. to the right else if (move >8) position-=2; //2 sq. to the left
		 */

		switch (move) {
		case 3:
		case 4:
			position += 9; // 9 sq. to the right
			break;
		case 5:
			position -= 12; // 12 sq. to the left
			break;
		case 6:
		case 7:
		case 8:
			++position; // 1 sq. to the right
			break;
		case 9:
		case 10:
			position -= 2; // 2 sq. to the left
			break;
		}

		if (position > 70) // bound check of the obj doesnt get out of the race
			position = 70;

		if (position < 1) // bound check of the obj doesnt get out of the race
			position = 1;
	}
}
