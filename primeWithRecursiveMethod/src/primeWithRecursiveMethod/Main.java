package primeWithRecursiveMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Sayý giriniz: ");
		number=scan.nextInt();
		
		System.out.println(number+" sayýsý"+(isPrime(number,(2))?" asaldýr":" asal deðildir."));
		
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
