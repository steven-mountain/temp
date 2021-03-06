package Exercise13_1;

public class Trangle extends GeometricObject{

	public double edg1;
	public double edg2;
	public double edg3;
	

	
	public double getEdg1() {
		return edg1;
	}

	public void setEdg1(double edg1) {
		this.edg1 = edg1;
	}

	public double getEdg2() {
		return edg2;
	}

	public void setEdg2(double edg2) {
		this.edg2 = edg2;
	}

	public double getEdg3() {
		return edg3;
	}

	public void setEdg3(double edg3) {
		this.edg3 = edg3;
	}

	
	public Trangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trangle(String color, boolean filled, double edg1, double edg2, double edg3) {
		super(color, filled);
		this.edg1 = edg1;
		this.edg2 = edg2;
		this.edg3 = edg3;
	}

	@Override
	public double getArea() {
		double p = (edg1 + edg2 + edg3) / 2;
		return Math.sqrt((p - edg1) * (p - edg2) * (p - edg3));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return edg1 + edg2 + edg3;
	}

	@Override
	public String toString() {
		return super.toString() + "Trangle [edg1=" + edg1 + ", edg2=" + edg2 + ", edg3=" + edg3
				+ "]" + " area:" + getArea() + " perimeter:" + getPerimeter();
	}

}
