package edu.kh.control.practice;
import java.util.Scanner;
public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요:");
		int input = sc.nextInt();
		if(input<0) {
			System.out.print("1이상의 숫자를 입력하세요");
		}
		for(int i=1 ; i<=input ; i++) {
			System.out.printf("%2d " ,i);
			
			 
		}
		
 	}
	
	//===================ex2()===
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요:");
		int input = sc.nextInt();
		
		if(input<=0) {
			System.out.print("1이상의 숫자를 입력하세요");
		}
		
		for(int i=input ; i>=1 ; i--) {
			System.out.print(i);
		}

	}
	//================ex3()============
	public void practice3() {
		System.out.print("정수를 하나 입력하세요:");
		int input = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=input ; i++) {
			
				sum = sum + i;
				if(i<input) {
					System.out.print(i+"+");
				}else {
					System.out.print(i);
				}
		}
		System.out.printf("= %d",sum);
		
	}
	
	//================ex4()=================
	public void practice4() {
		System.out.print("첫 번째 숫자:");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자:");
		int input2 = sc.nextInt();
		
		for(int i=input1 ; i<=input2 ; i++) {
			System.out.print(i);
			
			
		}

	}
	
	
	//==============ex5()====================
	public void practice5() {
		System.out.print("숫자:");
		int input1 = sc.nextInt();
		System.out.printf("====== %d단========\n",input1);
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",input1,i,(input1*i));
		}
	}
	//===========ex6()=========
	public void practice6() {
		System.out.print("숫자:");
		int input = sc.nextInt();
		if(input>=2 && input<=9) {
			System.out.printf("====== %d단========\n",input);
		}else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		for(int i=1;i<=9;i++) {
			if(input>=2 && input<=9) {
				System.out.printf("%d * %d = %d\n",input,i,(input*i));
			}
		}
	}
	//======================ex7()
	public void practice7() {
		System.out.print("정수입력: ");
		int count = sc.nextInt();
		
		for(int x=1; x<=count; x++) {//줄반복
			for(int i=1; i<=x; i++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	//=============ex8()=====
	public void practice8() {
		System.out.print("정수입력: ");
		int count = sc.nextInt();
		
		for(int x=count; x>=1; x--) {//3
			for(int i=x; i>=1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//========ex9()===============
	public void practice9() {
		System.out.print("정수입력: ");
		int count = sc.nextInt();
		
		for (int i = 0; i <= count; i++) {
			for (int j = count; j > 0; j--) {
				
				if (i < j) {
					System.out.print(" ");
				} else
					System.out.print("*");
				
			}
			System.out.println();
		}
			
		
	}
	public void practice10() {
		System.out.print("정수입력: ");
		int count = sc.nextInt();
		
		for(int x=1; x<=count; x++) {//줄반복
			for(int i=1; i<=x; i++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int x=count; x>=1; x--) {//3
			for(int i=x; i>=1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//====================ex11======
	public void practice11() {
		
	}
}
