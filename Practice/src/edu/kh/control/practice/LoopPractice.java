package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1 () {
		Scanner sc = new Scanner (System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input >= 1) {
			for ( int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			} 
		} else { 
			System.out.println(" 1 이상의 숫자를 입력하세요.");
		}
	}
		
	public void practice2() {
		Scanner sc = new Scanner (System.in);
		System.out.print(" 1 이상의 숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		if (input >=1) {
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {System.out.println("1이상의 숫자를 입력하세요.");
		
		}
	}

	public void practice3() {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수를 하나 입력하세요:");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++ ) {
			sum += i;
			
			if (i < num) {
				System.out.print(i + " + ");
			}else {
				System.out.println(i + " = " + sum);
				
			}
		}
	}	

	public void practice4() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.println(" 1 이상의 숫자를 입력해주세요");
		} else {
			
			int start = num1;
			int end = num2;
			
			if (num1 > num2) {
				start = num2;
				end = num1;
			}
			
			for (int i = start; i <= end; i++) {
				System.out.println(i + " ");
			}
	
		}
    }
	
}
