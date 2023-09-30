import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc= new Scanner(System.in);
		
		int p=sc.nextInt();
		double r=sc.nextDouble();
		int t=sc.nextInt();

		double inter=(p*r*t)/100;
		int q=(int)(inter);
		System.out.println(q);

		
	}
}
