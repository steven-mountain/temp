class FinaApply{
	public static void main(String[] args){
		//������
		final double rate = 1.05;
		double currentFair = 10000;
		double sum = 0.0;
	
		//����10����ѧ��
		for(int i = 0; i < 10; ++i){
			currentFair *= rate;
		}
		System.out.println("10����ѧ��Ϊ��" + currentFair);
	
		//�����11 - 15 ��ѧ�ѵ��ܺ�
		for(int x = 0; x < 4; ++x){
			currentFair *= rate;
				sum += currentFair;
		}
		System.out.println("10���������ڵ���ѧ��Ϊ��" + sum);
	}
}