import java.util.Scanner;

public class FrstnOdd {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("enter how many odd numbers to be generated : ");
	     int n = sc.nextInt();
	     for(int i = 1; i<=n;i++){
	    	int p =  2*i-1;
	    	 System.out.print(" " + p );

	}

	}}
