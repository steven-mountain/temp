import java.util.Scanner;
class FindMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//ѧ���ĸ���
		int number;
		number = sc.nextInt();
		
		//��һ���ַ��������һ������ֱ����洢ѧ����������ѧ���ĳɼ�
		String[] name = new String[number];
		int[] grade = new int[number];
		
		for(int i = 0; i < number; ++i){
			name[i] = sc.next();
			grade[i] = sc.nextInt();
		}
		
		//�ҳ���ߵķֺ͵ڶ��ߵķ�
		int maxIndex = 0;
		int secondIndex = 0;
		//����߷�
		for(int x = 0; x < number; ++x){
			if(grade[x] > grade[maxIndex])
				maxIndex = x;
			else if(grade[x] > grade[secondIndex])
				secondIndex = x;
		}
		//�ҵڶ��߷�
		if(maxIndex == 0)
			++secondIndex;
		for(int x = 0; x < number; ++x){
			if(x == maxIndex)
				continue;
			else if(grade[x] > grade[secondIndex])
				secondIndex = x;
		}
		//������
		System.out.println("�����߷�" + grade[maxIndex] + "��ͬѧ�ǣ�" + name[maxIndex]);
		System.out.println("��õڶ��߷�" + grade[secondIndex] + "��ͬѧ�ǣ�" + name[secondIndex]);
	}
}