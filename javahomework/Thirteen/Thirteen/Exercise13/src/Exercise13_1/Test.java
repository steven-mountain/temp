package Exercise13_1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Trangle t = new Trangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������е�����");
		t.setEdg1(sc.nextDouble());
		t.setEdg2(sc.nextDouble());
		t.setEdg3(sc.nextDouble());
		System.out.println("��������������ε���ɫ�ǣ�");
		t.setColor(sc.next());
		System.out.println("��������������������񣿣��ǣ�true����:false��");
		t.setFilled(sc.nextBoolean());
		System.out.println(t.toString());
	}
}
