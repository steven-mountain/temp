import java.util.Scanner;
class Count{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int positive = 0;//��¼�����ĸ�����
		int negative = 0;//��¼�����ĸ�����
		int num;//�������
		double sum = 0;//��
		
		//��ʾ����
		System.out.print("Enter an interger, the input ends if it is 0: ");
		num = sc.nextInt();
		while(num != 0){
			sum += num;
			if(num > 0)
				++positive;
			else
				++negative;
			num = sc.nextInt();
		}
		//���ƽ��ֵ
		double averge = sum / (positive + negative);
		//display the result
		System.out.println("The number of positive is " + positive);
		System.out.println("The number of negative is " + negative);
		System.out.println("The total is " + (double)(negative + positive + 1));
		System.out.println("The average is " + averge);
	}
	
}