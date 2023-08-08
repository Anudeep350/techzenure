import java.util.Scanner;

public class EvenNumBetw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first num  :  ");
		int n = sc.nextInt();
		System.out.print("enter the second num :  ");
		int m = sc.nextInt();
		System.out.println("even nums between   " + n + "  and  "+ m + "  are : ");
        int i = n+1;
		while(i<m){
        	
        
			int r=i%2;
			if(r==0)
			System.out.print(" "+i);
			i++;

		}
       
	}

}
