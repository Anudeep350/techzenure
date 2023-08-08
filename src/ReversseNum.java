import java.util.Scanner;

public class ReversseNum {

	public static void main(String[] args) {
		int m, n, rev = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            
            m = m / 10;
            rev = rev * 10 + n;
           
        }
        System.out.println("Reverse of a Number is "+rev);

	}

}
