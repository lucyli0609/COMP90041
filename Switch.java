/*
 *
 *  @author Lucy Li
 *
 *  @Description: This document is my own solution for tutorial 3 of COMP90041.           
 *
 *  @Date: 20/8/2019
 *
*/

public class Switch {
	public static void main (String[] args) {
	  	if (args.length > 0){
		    switch (args[0].charAt(0))
		    {
		    	case 'N':
		    		System.out.println(0);
		    		break;
		    	case 'E':
		    		System.out.println(90);
		    		break;
		    	case 'W':
		    		System.out.println(270);
		    		break;
		    	case 'S':
		    		System.out.println(180);
		    		break;
		    	default:
		    		System.out.println("Invalid Input");
		    		System.exit(1);
		    }
		}else{
		    	System.out.println("No args input");
		}
	}
}