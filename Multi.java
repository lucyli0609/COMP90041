/*
 *
 *  @author Lucy Li
 *
 *  @Description: This document is my own solution for tutorial 3 of COMP90041.           
 *
 *  @Date: 20/8/2019
 *
*/

import java.util.*;

public class Multi{
	public static void main(String[] args){
		for(int i=0; i<=10; i++){
			for(int j=0; j<=10; j++){
				if(i==0 && j==0){
					System.out.print("  *  ");
				}else if(i==0){
					System.out.print("|"+space(j));
				}else if(j==0){
					System.out.print(space(i));
				}else{
					System.out.print("|"+space(i*j));
				}
			}
			System.out.println();
			if(i==10){
				continue;
			}
			System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
		}
	}

	public static String space(int num){
		if(num > 0 && num < 10){
			return "  " + num + "  ";
		} else if(num >= 10 && num < 100) {
			return " " + num + "  ";
		} else if(num == 100) {
			return num+"  ";
		}else{
			return "";
		}
	}

}