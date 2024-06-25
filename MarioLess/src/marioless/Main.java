package marioless;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int height;
		do {
			System.out.println("Height:");
			height = scanner.nextInt();
		} while (height <= 0);
		
		for (int i = 0; i < height; i++) {
			
			for (int spaces = height - 1; spaces > i; spaces--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			
			System.out.print("\n");
		}
		
	}

}
