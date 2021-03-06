package Exercises12_7;
import java.util.Scanner;

public class Bin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数：");
		String hexString = sc.nextLine();
		try {
			System.out.println(bin2Dec(hexString));
		}catch (NumberFormatException n) {
			
		}
	}
	public static int bin2Dec(String hexString) {
		int decimalValue = 0;
		for(int i = 0; i < hexString.length(); ++i) {
			char hexChar = hexString.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return 0;
	}
	private static int hexCharToDecimal(char ch) {
		if(ch == '0' || ch == '1')
			return ch - '0';
		else
			throw new NumberFormatException("这不是一个二进制数");
	}
}