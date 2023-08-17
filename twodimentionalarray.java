package code1;

import java.util.Scanner;

public class twodimentionalarray {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3x3 matrix");
		
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				arr[r][c]=sc.nextInt();
			}
		}
		
		
		System.out.println("Enterd matrix is ");
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
