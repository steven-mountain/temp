package ShoppingCart;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
	ArrayList<Product> ct = new ArrayList<Product>();
	//�������ﳵ
	public void list() {
		Iterator<Product> it = ct.iterator();
		if(ct.size() == 0) {
			System.out.println("��Ĺ��ﳵ�ǿյ�");
			return;
		}
		System.out.println("��Ĺ��ﳵ��������Ʒ");
		while(it.hasNext()) {
			Product p = (Product)it.next();
			System.out.println("��Ʒ���ƣ� " + p.name + "�� ��Ʒ�۸�" + p.price + "; ��Ʒ������" + p.number);
		}
	}
	
	//�����Ʒ
	public void add(String name, double price, double number) {
		ct.add(new Product(name, price, number));
	}
	
	//ɾ����Ʒ
	public void del(String name) {
		if(ct.size() == 0) {
			System.out.println("��Ĺ��ﳵû����Ʒ");
			return;
		}
		else {
			for(int i = 0; i < ct.size(); ++i) {
				if(ct.get(i).name.equals(name)) {
					ct.remove(i);
					return;
				}
			}
		}
		System.out.println("��Ĺ��ﳵ��û�и���Ʒ");
	}

	//����ܷ���
	public double getSum() {
		Iterator<Product> it = ct.iterator();
		double sum = 0;
		while(it.hasNext()) {
			Product p = (Product)it.next();
			sum += p.getTotalFare();
		}
		return sum;
	}


}