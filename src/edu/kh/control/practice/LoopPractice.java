package edu.kh.control.practice;
import java.util.Scanner;
public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.print("1이상의 숫자를 입력하세요:");
		int input = sc.nextInt();
		if(input<0) {
			System.out.print("1이상의 숫자를 입력하세요");
		}
		for(int i=1 ; i<=input ; i++) {
			System.out.printf("%2d " ,i);
			
			 
		}
		
 	}
}
