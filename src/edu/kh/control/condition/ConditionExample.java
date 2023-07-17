package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	public void ex1() {
		
		//if문
		//조건식이 true일때만 내부 코드 수행

		
		/*[작성법]
		 * if(조건식){
		 * 	 조건식이 true 일때 수행할코드
		 * }
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		int input = sc.nextInt();
		
		
		//입력된 정수가 양수인지 검사
		if(input>0) {
			System.out.println("양수입니다.");
		}
		
		if(input<=0) {
			System.out.println("양수가아닙니다.");
		}
		
	}	
	public void ex2(){	
		//if - else 문
		//조건식 결과가 true이면 if문,
		//false이면 else 구문이 수행됨/
		
		/* if (조건식){
		 * 	조건식이 true 일때 수행
		 * }else{
		 *   조건식이 false일때 수행
		 * }
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		//홀짝검사
		System.out.print("정수입력 :" );
		int input = sc.nextInt();
		
		if(input%2 != 0) {
			System.out.println("홀수입니다");
		}else {//짝수 또는 0입력시 시행}
			
			//중첩 if문
			if(input ==0) {
				System.out.println("0입니다");
			}else {
				System.out.println("짝수입니다");
			}
		}
		
	}
	public void ex3() {
		//양수, 음수, 0 판별
		//if - else if - else
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력:");
		int input = sc.nextInt();
		
		if(input > 0) { //input 양수일경우
			System.out.println("양수입니다.");
		}else if(input < 0){//input이 음수일경우
			//바로 위에있는 if 문이 만족되지않을경우 수행
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
	}	
	public void ex4(){
			//달()month 입력받아 해당 달에 맞는 계절 출력
			//단, 겨울일때 온도가 -15도 이하"한파 경보",-12이하 "한파주의보"
			//여름일때 온도가 35도이상 "폭염경보",33도 이상 "폭염주의보"
			//1~12 사이가 아닐땐 "해당하는 계절이 없습니다"출력
			
			Scanner sc = new Scanner(System.in);
			System.out.print("달입력: ");
			int month = sc.nextInt();
			
			int temp = -16;
			String season; //아래 조건문 수행 결과를 저장할 변수 선언
	
			
			if(month==1 || month==2 || month==12 ) {
				season = "겨울";
				if(temp<=-15) {
			
					season +="한파경보";
					
				}else if(temp<=-12) {
					season += "한파주의보";
				}
				
			}else if(month>=3 && month <=5){
				season="봄";
			}else if((month>= 6) && (month<=8)){
				season="여름";
				if(temp>=35) {
					
					season +="폭염경보";
					
				}else if(temp>=33) {
					season += "폭염주의보";
				}
				
			}else if(month >= 9 && month<=11) {
				season="가을";
			}else {
				season="해당하는 계절이 없습니다.";
			}
			
			System.out.println(season);
						
	}	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age= sc.nextInt();
		
		if(age<=13) {
			System.out.print("13세 이하면 \"어린이 입니다.\"");
		}else if((age>13)&&(age<=19)) {
			System.out.print("13세 초과 19세 이하면 : \"청소년 입니다.\"");
		}else if(age > 19) {
			System.out.print("19세 초과 시 : \"성인 입니다\".");
		}
	}
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		
		if(score>100) {
			System.out.print("잘못입력하셨습니다");
		}else if(score>=90) {
			System.out.print("A");
		}else if(score>=80 && score<90) {
			System.out.print("B");
		}else if(score>=70 && score<80) {
			System.out.print("C");
		}else if(score>=60 && score<70) {
			System.out.print("D");
		}else if(score<60 && score>=0) {
			System.out.print("F");
		}else if(score<0){
			System.out.print("잘못입력하셨습니다");
		}
	}
	public void ex7() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		if(age<0) {System.out.print("잘못 입력하셨습니단.");}
		if(age>=0 && age<12) {
			System.out.print("적정 연령이 아닙니다.");
		}
		
		if(age>100) {
			System.out.print("잘못 입력 했습니다.");
		}
		
		System.out.print("키: ");
		int tall = sc.nextInt();
		
		if(tall<140) {
			System.out.print("적정 키가 아닙니다.");
		}
	
		if(age >= 12 && tall>=140) {
			System.out.print("탑승가능");
		}
	}
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		
		//-------------------------
		System.out.print("나이:");
		int age =sc.nextInt();
		
		if(age<=0 || age > 100) {
			System.out.print("나이를 잘못 입력 하셨습니다.\n");
		}
		//----------------------------
		System.out.print("키:");
		int tall=sc.nextInt();
		
		if(tall<=0 || tall >= 250) {
			System.out.print("키를 잘못 입력 하셨습니다.\n");
		}
		
		//-------------------------------
		
		if (!(age<=0 || age > 100) && (tall<=0 || tall >= 250)) {
			System.out.println("나이는 적절하나, 키는 적절치 않음");
		}else if((age<=0 || age > 100) && !(tall<=0 || tall >= 250)) {
			System.out.println("키는 적절하나, 나이는 적절치 않음");
		}else if((age<=0 || age > 100) && (tall<=0 || tall >= 250)) {
			System.out.println("나이와 키 모두 적절치 않음");
		}else if(!(age<=0 || age > 100) && !(tall<=0 || tall >= 250)){
			System.out.println("탑승가능");
		}
	}
	
}

