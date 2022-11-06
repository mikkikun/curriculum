package dentaku;

import java.util.Scanner;

public class Caluculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("整数を入力して下さい");
		int num1 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("演算子を選択してください");
		System.out.println("1: +");
		System.out.println("2: -");
		System.out.println("3: ×");
		System.out.println("4: ÷");
		int ens = sc.nextInt();
		
		System.out.println("2つ目の数字を入力してください");
		int num2= sc.nextInt();
		
		int res = 0;
		
		if(ens == 1) {
			res = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + res);
		}else if (ens == 2) {
			res = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + res);
		}else if (ens == 3) {
			res = num1 * num2;
			System.out.println(num1 + "×" + num2 + "=" + res);
		}else if (ens == 4) {
			res = num1 / num2;
			System.out.println(num1 + "÷" + num2 + "=" + res);
		}
		sc.close();
	}
}

