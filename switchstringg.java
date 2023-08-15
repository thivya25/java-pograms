package code1;

import java.util.Scanner;

public class switchstringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER DAY NAME");
		String day=sc.next().toLowerCase();
		switch(day) {
		case "monday":System.out.println("FIRST DAY OF THE WEEK");
		              break;
		case "tuesday":System.out.println("SECOND DAY OF THE WEEK");
                       break; 
		case "wednesday":System.out.println("THIRD DAY OF THE WEEK");
                        break; 
		case "thursday":System.out.println("FOURTH DAY OF THE WEEK");
                        break; 
		case "friday":System.out.println("FIFTH DAY OF THE WEEK");
                      break; 
		case "saturday":System.out.println("SIXTH DAY OF THE WEEK");
                        break;
		case "sunday":System.out.println("SEVENTH DAY OF THE WEEK");
                      break; 
        default:System.out.println("INVALID INPUT");
		}
		

	}

}
