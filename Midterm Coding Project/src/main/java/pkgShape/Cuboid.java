package shape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	private int depth;
	
	public Cuboid(int len, int wid, int dep) {
		super(len, wid);
		if(dep<=0) {
			throw new IllegalArgumentException();
		}
		depth = dep;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	@Override
	public double area() {
		return 2*super.getLength()*super.getWidth()+2*super.getLength()*depth+2*depth*super.getWidth();
	}
	@Override 
	public double perimeter() {
		throw new UnsupportedOperationsException();
	}
	public double volume() {
		return super.getLength()*super.getWidth()*depth;
	}
	public int compareTo(Object cub) {
		return(int)(this.volume()-((Cuboid)cub).volume());
	}
}

class SortByArea implements Comparator<Cuboid>{
	
	@Override
	public int compare(Cuboid c1,Cuboid c2) {
		if(c1.area()>c2.area()) {
			return 1;
		}else if(c1.area()<c2.area()) {
			return -1;
		}else {
			return 0;
		}
	}
}
	
class SortByVolume implements Comparator<Cuboid>{
	
	@Override
	public int compare(Cuboid c1, Cuboid c2) {
		if(c1.volume()>c2.volume()) {
			return 1;
		}else if(c1.volume()<c2.volume())
			return -1;
		}else {
			return 0;
		}
	}
}
	
public static class SortByVolume implements Comparator<Cuboid> {
	
	@Override
	public int compare(Cuboid c1, Cuboid c2) {
		if(c1.volume()>c2.volume()) {
			return 1;
		}else if(c1.volume()<c2.volume()) {
			return -1;
		}else {
			return 0;
		
		}
	}
}
	
	
	
	
	
	
	
	
	
	
