package primeWithRecursiveMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Say� giriniz: ");
		number=scan.nextInt();
		
		System.out.println(number+" say�s�"+(isPrime(number,(2))?" asald�r":" asal de�ildir."));
		
	}
	
	static boolean isPrime(int number,int bol) {
		
		if(number!=bol&&number%bol!=0) {
			return isPrime(number,bol+1);
		}else if(number==bol){
			return true;
		}
		
		return false;
	}

}
