import java.util.Scanner;
class SolveString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//��ʾ�û�����һ���ַ���
		System.out.print("Enter a String: ");
		String s;
		s = sc.nextLine();
		for(int i = 0; i < s.length();){
			System.out.print(s.charAt(i));
			i += 2;
		}
	}
}