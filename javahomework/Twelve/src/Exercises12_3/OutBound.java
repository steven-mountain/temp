package Exercises12_3;

import java.util.Scanner;

public class OutBound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		for(int i = 0; i < 100; ++i) {
			num[i] = (int)(Math.random() * 100);
		}
		System.out.println("������һ���±�");
		try {
			System.out.println(num[sc.nextInt()]);
		}catch (ArrayIndexOutOfBoundsException a){
			System.out.println("Out of Bounds");
		}
	}
}
