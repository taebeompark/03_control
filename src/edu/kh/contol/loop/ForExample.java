package edu.kh.contol.loop;
import java.util.Scanner;
public class ForExample {
	Scanner sc = new Scanner(System.in);
/*for문
 * 끝이 정해져잇는(횟수가 지정되어있는 )반복문
 * [작성법]
 * for(초기식;조건식;증감식){
 * 	반복수행할코드
 * 초기식:for문을 제어하는 용도의 변수선언
 * 조건식: for문의 반복 여부를 지정하는 식.
 * 			보통 초기식에 사용된 변수를 이용하여 조건식 작성함.
 * 증감식: 초기식에 사용된 변수를
 * 			for문이 끝날때 마다 증가 또는 감소시켜
 * 			조건식의 결과를 변하게 하는식
 * } 
 * */
	public void ex1() {
		//for문 기초 사용법1
		//1~10까지 출력하기
		//1부터 10까지 1씩증가하며 출력
		
		//*반복문은 조건식이 true 일때만 반복한다.
		
		for(int i = 1 ;i <= 10; i++) {
				 //초기식//조건식//증감식
			
				//반복 수행할 코드
				System.out.println(i);
		}
	}
	public void ex2() {
		//3에서 7까지 증가하며 출력
		//3 4 5 6 7
		for(int i = 3;i <= 7 ; i++) {
			System.out.println(i);
		}
	}
	public void ex3() {
	
		//2부터 15까지 1씩 증가하며 출력
		//2 3 4...14 15
		for(int i=2; i<=15; i++) {
			System.out.println(i);
		}
	}
	public void ex4() {
		System.out.print("입력:");
		int input = sc.nextInt();
		
		//1부터 입력받은 수까지 1씩 증가하며 출력
		
		for(int i = 1 ;i <=input ; i++ ) {
			System.out.println(i);
		}
	}
	public void ex5() {
		System.out.print("입력:");
		double input = sc.nextDouble();
		//1 부터 입력받은 수까지 2씩 증가하며 출력
		for(int i=1 ; i<=input; i=i+2){
			System.out.println(i);
		}	
	}
	public void ex6() {
		
		System.out.print("입력:");
		double input = sc.nextDouble();
		//1.0부터 입력받은 실수까지 0.5씩 증가하며 출력
		for(double i=1.0 ;i <=input ;i=i+0.5) {
			System.out.println(i);
		}
	}
	public void ex7() {
		//영어 알파벳 A부터Z까지 한줄로 출력
		//ABCDE...Z
		//* char 자료형은 문자형이지만 실제로 정수(문자번호)를 저장한다.
		
		for(int i='A';i<='Z'; i++) {
			System.out.print((char)i);// 강제형변환
		}
		System.out.println("\n-------------");
		for(char i ='A'; i<='Z'; i++) {
			System.out.print(i);
		}
		
	}
	public void ex8() {
		//10에서 1까지 1씩 감소하며 출력
		for(int i =10; i>=1; i--) {
			System.out.print(i);
		}
	}
	public void ex9() {
		//for문 응용1 : 반복문을 이용한 값의 누적
		
		//1부터 10까지 모든정수의 합구하기 :55
		
		int sum=0;//반복되어 증가되는 i값의 합계를 저장할 변수
					//0 으로 시작하는 이유는: 아무것도 더하지 않음으로
											//정확히 결과를 도출할수 있기때문
		for(int i=1 ;i<=10; i++) {
			sum = sum+i;
			//sum+=i;  
			
			
		}
		
		System.out.println("합계:"+sum);
		
	}
	public void ex10() {
		//for문 응용 2: 정수5개를 입력받아서 합계구하기
		//ex)
		//입력 1 : 10
		//입력 2 : 10
		//입력 3 : 10
		//입력 4 : 10
		//입력 5 : 10
		//합계 : 150
		
		
		int sum =0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("입력"+i+":");
			int input =sc.nextInt();
			sum+=input;//sum에 입력받은input값누락
		}
		System.out.println("합계: "+sum);
	}
	
	
	
	public void ex11() {
		//정수를 몇번 입력 받을지 먼저 입력받고
		//입력된 정수의 합계를 출력
		
		//ex)
		//입력 받을 정수의 개수: 3
		//입력 1: 10
		//입력 2: 20
		//입력 3: 30
		//합계: 60
		System.out.println("입력받을 정수의 개수: ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i <=num; i++) {
			System.out.println("입력"+i+":");
			int input =sc.nextInt();
			
			sum+=input;
		}
		System.out.println("합계:"+sum);
		
	}
	
	
	public void ex12() {
		//1부터 20까지 1씩 증가하면서 출력
		//단 5의배수()를 붙여서 출력
		//ex) 1 2 3 4 (5) 6 7 8 9(10)..(20)
		for(int i=1;i<=20;i++) {
			if(i% 5 == 0) {
				System.out.print("("+i+")");
			}else {
				System.out.print(i+ " ");
			}
		}
		
	}
	public void ex13(){
		//1부터 20까지 증가하면서 출력
		//단, 입력 받은 수의배수는()표시
		
		//ex)
		//괄호를 표시할 배수: 3
		//1 2 (3) 4 5 (6)....
		
		////괄호를 표시할 배수: 4 
		//1 2 3 (4) 5 6 7 (8) 9....
		System.out.print("괄호를 표시할 배수");
		int num = sc.nextInt(); 
		for(int i=1; i<=20; i++) {
			
			if(i % num ==0) {
				System.out.print("("+i+")");
			}else {
				System.out.print(i+ " ");
			}
			
		}
	}
}
