package com.java;

import java.util.Scanner;

public class EVenODD {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No");
		int num=scanner.nextInt();
		
		if(num%2==0)
		{
			System.out.println("It is Even No");
		}
		else {
			System.out.println();
		}
	}
}
