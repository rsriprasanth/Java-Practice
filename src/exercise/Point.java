package exercise;

public class Point {
	 private int x;
	    private  int y;
	 
	    public Point() {
	 
	    }
	 
	    public Point(int X, int Y) {
	        this.x = X;
	        this.y = Y;
	    }
	 
	    public int getX() {
	        return x;
	    }
	 
	    public void setX(int x) {
	        this.x = x;
	    }
	 
	    public int getY() {
	        return y;
	    }
	 
	    public void setY(int y) {
	        this.y = y;
	    }
	 
	    public double distance(){
	 
	        int x1 = 0;
	        int y1 = 0;
	 
	        double distance = Math.sqrt((this.x-x1) * (this.x-x1) + (this.y-y1) * (this.y-y1));
	 
	        return distance;
	    }
	 
	    public double distance(int x, int y){
	 
	        double distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	        return distance;
	    }
	 
	    public double distance(Point point) {
	        return distance(point.getX(), point.getY());
	    }
}
