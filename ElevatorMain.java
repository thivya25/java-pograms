package Assignment;

import java.util.Scanner;

class Elevator{
	int currentFloor =1;
	public void selectFloor(int selectFloor) {
		if(selectFloor>currentFloor) {
			System.out.print("going up...");
			for(int i=currentFloor+1;i<=selectFloor;i++) {
				System.out.print(i+"..");
				currentFloor=i;
			}
			System.out.println("ding!");
		}
		else if(selectFloor < currentFloor) {
			
			System.out.print("going down...");
			for(int i=currentFloor-1;i>=selectFloor;i--) {
				System.out.print(i+"..");
				currentFloor=i;
			}
			System.out.println("ding!");
		}
		else {
			System.out.println("you are on the same floor");
		}
	}
		public void fireAlram() {
			int groundFloor =1;
			
			if(currentFloor > groundFloor) {
				
				System.out.print("danger! you must exit the building going down...");
				for(int i=currentFloor;i>=groundFloor;i--) {
					System.out.print(i+"..");
					currentFloor=i;
				}
				System.out.println("ding!");
			}
		
			else {
				System.out.print("danger! you must exit the building you are on the same floor");
				
			}
	}
}
class InvalidInput extends Exception{
	 /**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public InvalidInput(String msg)
    {
          super(msg);
     }
}

public class ElevatorMain {

	public static void main(String[] args) {
		Elevator elevator =new Elevator();
		char choice = 0;
		Scanner sc = new Scanner(System.in);
        
		while( choice!='q'  ) 
		{
        System.out.println("options: (s)elect the floor (f)ire alarm (q)uit");
        System.out.print("Enter s,f, or q ==>");
        choice = sc.next().charAt(0);
        switch(choice) {
        case 's':{
        	System.out.print("enter the floor that you'd like to go to ==>");
        	int input=sc.nextInt();
        	try {
        		if(input>10 || input<=0) {
        			throw new InvalidInput ("Invalid Selection");
        			}
        		else {
        			elevator.selectFloor(input);
                	break;
        		}
        	}
        	catch(InvalidInput e) {
        		e.printStackTrace();
        		break;
        	}
        
        }
        	
       case'f':
        	elevator.fireAlram();
        	
        	break;
        	
        case'q':
        	System.out.println("quit");
        	break;
        	
        }
        	
		}
	}
}
