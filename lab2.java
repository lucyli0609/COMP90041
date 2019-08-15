/*
 *
 *  @author Lucy Li
 *
 *  @Description: This document is my own solution for tutorial 2 of COMP90041.           
 *
 *  @Date: 13/8/2019
 *
*/

import java.util.Scanner;

public class lab2{

	public static void main(String[] args){
		//task 1
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		System.out.println(input.length());
		String[] arr = input.split(" ");

		System.out.println(arr[0]);

		for(int i=1; i<arr.length;i++){
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();

		//task 2
		System.out.println("command line arguments:");

		//to avoid zero command line argument cases
		if (args.length>0){
			System.out.println("\""+args[0]+"\"");
		}
		
	}
}
