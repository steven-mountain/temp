/*
	һӢ�����1.609��
*/
class PrintTab{
	public static void main(String[] args){
		final double tfRate = 1.609;
		System.out.println("Ӣ��\tǧ��");
		for(int i = 1; i < 11; ++i){
			System.out.println(i + "\t" + tfRate * i);
		}
	}
	
}