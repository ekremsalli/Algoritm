package print;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {

//		for(int i=65;i<300;i++) {
//			
//			System.out.print(i+"."+(char)i + " ");
//		}
		
		int b = 10;
		Scanner input = new Scanner(System.in);
		
		input.nextInt();
		
		Print.over(b);
	}
	
	public static void over(short a) {
		System.out.println("INTEGER");
	}
	
	public static void over(long a) {
		System.out.println("LONG");
	}

}
