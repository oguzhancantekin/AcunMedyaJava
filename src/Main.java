import java.util.Scanner;

public class Main {
	
	public static void topla(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));   
	   }
	public static void cikar(int a, int b) {
		System.out.println(a+" - "+b+" = "+ (a-b));   
	   }
	public static void carp(int a, int b) {
		System.out.println(a+" * "+b+" = "+(a*b));   
	   }
	public static void bol(int a, int b) {
		System.out.println(a+" / "+b+" = "+(a/b));   
	   }
	public static void mod(int a, int b) {
		System.out.println(a+" mod "+b+" = "+(a%b));   
	   }
	public static int fact (int a) {
		if (a==1||a==0) {
			return 1;
		}
		return a*fact(a-1);  
	   }
	public static void factyaz(int a,int b) {
		
		System.out.println("Factorial of "+a+" = "+ fact(a));
		System.out.println("Factorial of "+b+" = "+ fact(b));
	}
	

	
	
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("iki sayi giriniz");
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		
		System.out.println("ISLEMLER");
		
		topla(a, b);
		cikar(a, b);
		carp(a, b);
		bol(a, b);
		mod(a, b);
		factyaz(a,b);
		
		
		
		
	}

}
