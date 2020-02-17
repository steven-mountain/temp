package HugeHomeWork.src.ShopingCart;

import java.util.Scanner;

import ShoppingCart.Cart;

public class ShoppingCartSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		Cart ct = new Cart();
		while(true){
			System.out.println("������ָ���showList: ��ʾ��Ʒ�嵥�� showCartList����ʾ���ﳵ�е���Ʒ��add�������Ʒ��del��ɾ����Ʒ��getCount������; exit���˳���");
			sb.append(sc.next());
			if(sb.toString().equals("exit")) {
				System.out.println("Byebye~");
				break;
			}
			switch(sb.toString()) {
				case "showList": {
					ProductList.getList();
					ProductList.showList();
					break;
				}
				case"showCartList":{
					ct.list();
					break;
				}
				case"add":{
					System.out.println("��������Ʒ�����Ƶ��ۺ�����");
					ct.add(sc.next(), sc.nextDouble(), sc.nextDouble());
					break;
				}
				case"del":{
					System.out.println("������Ҫɾ������Ʒ��");
					ct.del(sc.next());
					break;
				}
				case"getCount":{
					System.out.println(ct.getSum());
					break;
				}
				default:
					System.out.println("�������ָ����������������");
					break;
			}
			sb.delete(0, sb.length());
		}
	}
}
