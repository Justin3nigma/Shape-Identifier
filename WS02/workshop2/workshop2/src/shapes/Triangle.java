package shapes;

import java.io.IOException;

public class Triangle implements Shape{
	double l1, l2, l3;

	public Triangle(double l1, double l2, double l3) throws IOException {
		if(l1 > 0 && l2 > 0 && l3 > 0 && (l1 + l2) > l3) {
			this.l1 = l1;
			this.l2 = l2;
			this.l3 = l3;
		}
		
		else {
			throw new IOException("Invalid side{s)!");
		}
	}
	
	public double getl1() {
		return l1;
	}

	public double getl2() {
		return l2;
	}

	public double getl3() {
		return l3;
	}	

	public double perimeter() {
		return getl1() + getl2() + getl3();
	}
	
	public String toString() {
		return String.format("%s {s1=" + getl1() +", s2=" + getl2() + ", s3=" + getl3() + "} perimeter = %g\n", "Triangle", perimeter());
	}
	

}
