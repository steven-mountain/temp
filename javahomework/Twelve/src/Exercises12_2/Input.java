package Exercises12_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		while(true) {
			try {
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				break;
			}catch (InputMismatchException e) {
				System.out.println("�����������������������");
				sc.nextLine();
			}
		}
		System.out.println("���������ֵĺ�Ϊ ��" + (num1 + num2));
	}
}
