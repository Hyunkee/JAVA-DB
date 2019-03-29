package practice;

public class Hello {

	public static void main(String[] args) {
		/* 
		 * println("문자열") : 내가 원하는 문자열을 콘솔에 출력한 후 엔터를 입력
		 * 
		 * print("문자열") : 내가 원하는 문자열을 콘솔에 출력
		 * */
		/*
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.print("Hello");
		System.out.print("Hello"); */
		
		/*int num = 0;
		char ch = 'A';
		double num2 = 1.123;
		boolean isEven = true;		
		System.out.println(num);
		System.out.println(ch);
		System.out.println(num2);
		System.out.println(isEven);*/		
		//MAX_SIZE라는 상수에 리터럴 10의 값을 저장
		/*final int MAX_SIZE = 10;
		int num1 = 10;
		long num3 = 10l;
		float num4 = 1.123f;
		double num5 = 1.123d;*/
		/*int num = 10;
		System.out.println("num의 값은"+ num + "입니다.");			
		System.out.printf("num의 값은 %d 입니다. %d", num,num);*/
		
			/*String input = scan.nextLine();
			System.out.println(input);
			num = Integer.parseInt(input);*///nextLine을 쓸 경우
			/*Scanner scan = new Scanner(System.in);
			int num = 0;
			num = scan.nextInt();
			System.out.println(num);			
			double num2 = scan.nextDouble();
			System.out.println(num2);
			char op = scan.next().charAt(0);
			System.out.println(op);*/// 정수 실수 문자열 차례로 하기
		
		/*int num ='a';
		double num2 = 1.23f;
		float num3 = (float)1.23d;
		num = (int)num3;
		System.out.println(num);*///명시적변환
		
			// 대입연산 (=)
			// 대입연산자를 기준으로 좌측에는 무조건 변수명 1개가 와야한다.
			// 나중에 조건문에서 비교연산자와 대입연산자를 혼동
			/*int num = 0;
			num = 3;
			int num1 = 10, num2 = 20;
			int res = 0;
			res = num1 + num2;*///올바른예
			//num1 + num2 = res; //에러발생
			//3 = num;//에러발생
		
		//+, -, *, /
		/*int num1 = 1 + 2;
		int num2 = 1 - 2;
		int num3 = 1 * 2;
		double num4 = 1 / (double)2;
		System.out.println(num1); // 3
		System.out.println(num2); // -1
		System.out.println(num3); // 2
		System.out.println(num4); // 0.5
		System.out.println((char)('A'+1));
		char ch = 'A'+1;
		System.out.println(ch);
		char ch2 = (char)(ch + 1);
		System.out.println(ch2);*///정수 + 정수 / 정수 - 정수 / 정수 * 정수 /..
		
			/*System.out.println(5 % 3);*/ //5를 3으로 나눈 값 *나머지연산자
			
		/*System.out.println( 1<2 );
		System.out.println( 1>2 );
		System.out.println( 1<=2 );
		System.out.println( 1>=2 );
		System.out.println( 1==2 );
		System.out.println( 1!=2 );*///비교 연산자
		
			/*int num1 = 7;
			int num2 = 9;*/
			//System.out.println(num1 & num2); //&(AND연산자)
			//System.out.println(num1 ^ num2); //^(XOR 연산자)
		
		/*int num = 10;		
		System.out.println("후위형 진행 : "+num++);
		System.out.println("후위형 결과 : "+num);
		num = 10;
		System.out.println("전위형 진행 : "+ ++num);
		System.out.println("전위형 결과 : "+num);
		
		num = 10;
		num = num + 1; //++num; num++;
		System.out.println("전위형 진행 : "+ num);
		System.out.println("전위형 결과 : "+num);
		
		int x = 20;
		boolean isEven = x%2==0 ? true:false;
		System.out.println(x+"은 짝수? " +isEven);
		
		int num2 = 10;		
		num2 += 1; // num2 = num2 + 1;
		num *= 2; // num2 = num2 * 2;
		''*/
		
		
		
	}

}


