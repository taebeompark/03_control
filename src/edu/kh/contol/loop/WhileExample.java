package edu.kh.contol.loop;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);
	/*while문
	 * 별도의 초기식, 증감식이 존재하지않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * 
	 * 확실히 언제 반복이 끝날지 모르지만
	 * 언젠다 반복 조건이 fasle 가 되는경우 반복 종료
	 * 
	 * 
	 * [작성법]
	 * while(조건식){
	 * 
	 * 		조건식이 true일때 반복 수행할 구문
	 * 
	 * }
	 * */
	public void ex1() {
		
		
		int input = 0;
		
		while(input != 9 ) {
			//input에 저장된 값이 9가아닌경우 반복
			System.out.println("====메뉴선택======");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("9. 종료");
			
			System.out.println("메뉴선택>>");
			input= sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이를 주문");break;
			case 2 : System.out.println("쫄면 주문");break;
			case 3 : System.out.println("김밥 주문");break;
			case 9 : System.out.println("메뉴선택 종료");break;
			default : System.out.println("잘못입력");
			}
			
		}
	}
	public void ex2() {
		//입력되는 모든정수의 합구하기
		//단,0이 입력되면 반복 종료후 결과출력
		//>0이 입력되지않으면 계속반복
		
		int input = -1; //입력받은값 저장할 변수
		
		int sum = 0; //모든 정수의 합을 저장하는 변수
		
		while(input != 0) {
			System.out.print("정수입력: " );
			input = sc.nextInt();
			sum += input; // 입력 받은 값을 sum에 누적
			
			
		}
		System.out.println("합계:"+sum);
	}
	
	//===============ex3()================
	
	public void ex3() {
		//입력되는 모든정수의 합구하기
		//단,0이 입력되면 반복 종료후 결과출력
		//>0이 입력되지않으면 계속반복
		
		int input = 0; //입력 받은 값을 저장할 변수
		int sum =0; //모든 정수의 합을 저장하는 변수
		
		//do while문을 최소한번은 수행하는 반복문
		//do~while
		
		do {
			System.out.print("정수입력: " );
			input = sc.nextInt();
			sum += input; // 입력 받은 값을 sum에 누적
		}while(input!=0);
			
	
	}
	
}
