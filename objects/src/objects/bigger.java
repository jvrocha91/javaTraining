package objects;

import java.util.Scanner;

public class bigger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Digite numeros para saber o maior:");
		
		int x = sc.nextInt();
		int z =sc.nextInt();
		int y =sc.nextInt();
		
		sc.close();
		
		int bigger = maior(x , y , z);
		
		result(bigger);
		
		

	}
	
	public static int maior( int a,int  b ,int c) {
		int aux;
		
		if (a>b  && a > c) {
			aux=a;
		}
		else if (b>c) {
			aux=b;
		}
		else {
			aux=c;
		}
		
		return(aux);
	}
	
	public static void result(int value) {
		System.out.println("Maior:"+value);
	}

}
