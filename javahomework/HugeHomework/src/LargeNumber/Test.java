package LargeNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
		BigInteger l1 = new BigInteger(sc.next());
		BigInteger l2 = new BigInteger(sc.next());
		System.out.println("��");
		System.out.println("" + l1.add(l2));
		System.out.println("��");
		System.out.println("" + l1.divide(l2));
		System.out.println("��");
		System.out.println("" + l1.multiply(l2));
		System.out.println("����");
		System.out.println("" + l1.subtract(l2));
	}
}