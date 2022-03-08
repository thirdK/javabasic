package pm;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println((int)(Math.random()*9)+1); 
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
	    System.out.print("성:");
	    String s1 = sc.nextLine();
	    System.out.print("이름:");
	    String s2 = sc.nextLine();
	    System.out.println("안녕하세요. " + s1+s2+" 씨.");
	}
}
