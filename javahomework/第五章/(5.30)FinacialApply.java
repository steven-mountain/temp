import java.util.Scanner;
class FinacialApply{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//ÿ��֧����
		System.out.print("������ÿ���ڴ����˻��ϴ洢�Ľ��");
		double monthlyPay = sc.nextDouble();
		
		//������
		System.out.print("����������");
		double rate = sc.nextDouble();
		
		//�����·�
		System.out.print("�������·���");
		int month = sc.nextInt();
		
		//������һ
		final double totalRate = (1 + (rate / 12));
		//�˻��ܽ��
		double sum = 0;
		
		for(int i = 0; i <month; ++i){
			sum = (sum + monthlyPay) * totalRate;
		}
		System.out.printf("%d����֮������˻����ܶ��Ϊ��%.3f", month, sum);
	}
}