package shapes;

import java.io.IOException;

public class Square extends Rectangle{
	
	public Square(double length) throws IOException{
		super(length, length);
	}
	
	public String toString() {
		return String.format("%s {s=" + getLength() +"} perimeter = %g\n", "Square", perimeter());
	}
}
