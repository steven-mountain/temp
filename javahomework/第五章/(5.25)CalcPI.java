import java.util.Scanner;

class CalcPI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sign = 1;
		double low = 1;
		double sum = 0;
		System.out.print("������i��ֵ��");
		double i = sc.nextInt();
		while(low <= (2 * i - 1)){
			sum += (sign*(1 / low));
			sign *= -1;
			low += 2;
		}
		sum *= 4;
		System.out.println("��iΪ " + (int)i + " ʱ����������Ϊ��" + sum);
	}
}