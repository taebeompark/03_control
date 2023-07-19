package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	Scanner sc =new Scanner(System.in);
	public void ex1() {
		
		//1부터 10까지 1씩증가하며 출력하는 반복문 작성
		//단, 5를 출력하면 반복문 종료
		//1 2 3 4 5
		for(int i=1; i<=10;i++) {
			System.out.println(i+" ");
			if(i==5) {
				break;
			}
		}
	}
	
	public void ex2() {
		//0이 입력 될때 까지의 모든 정수의 합 구하기
		
		int input=0;
		int sum=0;
		
		//while문을 처음에 무조건 수행하고, 특정조건에 종료하는 방법
		//1)input에 초기값을 0 아닌 다른값 while(input!=0)
		
		//2)do~while문 사용
		
		//3)무한 루프 상태의 while문 만들고
		//내부에 break 조건 작성

		while(true) {//무한루프
			
			System.out.println("정수입력:");
			input = sc.nextInt();
			
			if(input==0) {
				break;
				
			}
			sum += input;
		}	
		
		System.out.println("합계 :"+ sum);
	}
	
	//================ex3()============
	public void ex3() {
		//입력 받은 모든 문자열을 누적
		//단, "exit@"입력시 문자열 누적을 종료하고 결과출력
		
		String str = "";//빈문자열
						//쌍따옴표("")라는 기호를 이용해 String 리터럴임을 지정
						//하지만 내용은 없음
		while(true) {
			System.out.print("문자열 입력(exit@입력시 종료)");
			
			String input=sc.nextLine();
			//next():다음 한단어 (띄어쓰기 포함x)
			//nextLine():다음 한줄 (띄어쓰기 포함o)
			
			if(input.equals("exit@")) {
				//String 자료형은 비교연산자(==)로 같은 문자열인지 판별할수없다
				
				// 비교 연산자는 보통 기본자료형끼리의 연산에서만 사용가능
				//->string은 기본자료형이 아닌 참조형
				// **해결방법: 문자열 1.equals(문자열2)으로 비교가능
				break;
			}
			str += input +"\n";
		}
			System.out.println("===========");
			System.out.println(str);
	}
	//===============ex4()=========
	public void ex4() {
		//중첩반복문 내부에서 break사용하기
		//구구단 2~9단
		//단, 2단은 *2까지 , 3단*3까지 ..9단*9까지출력
		for(int dan=2;dan<=9; dan++) {
			for(int num=1;num<9; num++) {
				System.out.printf("%d x %d =%2d",dan,num,dan*num);
				if(num==dan) {
					break;
				}
			}System.out.println();
		}
		
	}

	public void ex5() {
		//break : 반복문을 바로멈춤
		//continue:다음 반복으로 넘어감
		
		//1~10까지 1씩 증가하며 출력
		//단,3의 배수 제외
		
		for(int i =1; i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i+" ");
		}
	}
	public void ex6() {
		//1~100까지 1씩 증가하며 출력하는 반복문
		//단,5의 배수는 건너뛰고
		//증가하는 값이 40이 되었을때 반복을 멈춤
		
		//1
		//2
		//3
		//..
		//39
		
		for(int i=1; i<=100; i++) {
			
			if(i==40) {
				break;
			}
			if(i%5==0) {
				continue;
				
			}
			System.out.println(i);
		}
	}
	
	public void ex7() {
		System.out.println("가위 바위 보 게임-!");
		System.out.print("몇판? :");
		int round = sc.nextInt();
		
		//승패 기록용 변수
		int win=0;
		int draw=0;
		int lose=0;
		
		for(int i =1; i<=round; i++) {//입력받은 판수 만큼 반복
			System.out.print("\n"+i+"번째 게임\n");
			
			System.out.print("가위/바위/보 중 하나를 입력해 주세요:");
			
			String input = sc.next();
			
			//Math.random();
			//난수 생성 -> 0.0 이상 1.0 미만의 난수생성
			
			//1) 1~3사이 난수 생성
			//2)1이면 가위, 2면 바위, 3이면 보 지정(switch)
			
			int random = (int)(Math.random() * 3 +1);
			//0.0 <= x <1.0
			//0.0 <= x* 3 < 3.0
			//1.0 <= x*3+1<4.0
			//1 <= (int)(x*3+1) <4
			//==1이상 4미만정수-> 1 2 3
			
			String com = null; //컴퓨터가 선택한 가위/바위/보를 저장하는 변수
			//null : 아무것도 참고하고 있지않음
			switch(random) {
			case 1 : com ="가위"; break;
			case 2 : com ="바위"; break;
			case 3 : com ="보"; break;
			}
			
			//컴퓨터는 [바위]선택했습니다
			System.out.printf("컴퓨터는[%s]를 선택햇다\n",com);
			//컴퓨터와 플레이어 가위 바위 보 판별
			if(input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			}else {
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("버") && com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
					
				}else {
					System.out.println("졌습니다.");
					lose++;
				}
			}
			System.out.printf("현재기록: %d승 %d무 %d패\n",win,draw,lose);
		}
		
		
		
	}
	
}
