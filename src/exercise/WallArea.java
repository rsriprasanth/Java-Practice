package exercise;

public class WallArea {
	private double width;
	private double height;
	
	public WallArea() {
	}
	
	public WallArea(double width, double height) {
		setWidth(width);
		setHeight(height);
		
	}
	
	public double getWidth() {
		return width;
		
	}

	public void setWidth(double width) {
		if (width>=0) {
			this.width = width;
		}
		else {
			width = 0;
		}
	}

	public double getHeight() {
		return height;
		
	}

	public void setHeight(double height) {
		
		if (height>=0) {
			this.height = height;
		}
		
		else {
			height = 0;
		}
	}
	
	public double getArea() {
		 return(this.getWidth()*this.getHeight());
	}
	public static void main(String[] args) {
		WallArea w1 = new WallArea(-1.25,-1.25);
		System.out.println(w1.getArea());
	}

	
}
