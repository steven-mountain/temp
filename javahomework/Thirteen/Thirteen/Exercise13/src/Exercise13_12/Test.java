package Exercise13_12;

import java.util.Scanner;

import Exercise13_1.GeometricObject;
import Exercise13_9.Circle;


public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GeometricObject[] g = new GeometricObject[4];
		for(int i = 0; i < 2; ++i){
			System.out.println("�����볤���εĳ��Ϳ�");
			g[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
		}
		
		for(int i = 2; i < 4; ++i){
			System.out.println("������Բ�İ뾶");
			g[i] = new Circle(sc.nextDouble());
		}
		sumArea(g);
	}
	public static double sumArea(GeometricObject[] g){
		double sum = 0;
		for(int i = 0; i < g.length; ++i){
			sum += g[i].getArea();
		}
		return sum;
	}
}
