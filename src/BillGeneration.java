import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		double pz = 100;
		double pf = 20;
		double cld = 10;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of pizzas bought      :  ");
        int m = sc.nextInt();
        System.out.print("Enter the no.of puffs bought       :  ");
        int n = sc.nextInt();
        System.out.print("Enter the no.of cool drinks bought :  ");
        int o = sc.nextInt();

      System.out.println("Bill Details ");
      System.out.println("No of pizzas      :" + m +"    "+"cost :" + pz*m);
      System.out.println("No of puffs       :" + n +"    "+"cost :" + pf*n);
      System.out.println("No of cool drinks :" + o +"     "+"cost :" + cld*o);
      double k = pz*m+pf*n+cld*o;
    System.out.println("");
    System.out.println("Total price = "+ k);
    System.out.println("ENJOY THE SHOW!!!");
	}
	

}
