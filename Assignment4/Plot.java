
public class Plot {
	
	int x;
	int y;
	int depth;
	int width;
	
	public Plot() {//default plot? //no x and y?
		depth=1;
		width=1;
		x = 0;
		y = 0;
	}
	public Plot(int x, int y, int width, int depth) {
		this.x=x;
		this.y=y;
		this.depth=depth;
		this.width=width;
	}
	public Plot(Plot otherPlot) {
		this.x=otherPlot.x;
		this.y=otherPlot.y;
		this.depth=otherPlot.depth;
		this.width=otherPlot.width;
	}
	
	public boolean encompasses(Plot plot1) {
		if(this.x<=plot1.x && this.y<=plot1.y && this.width + this.x >=plot1.width +plot1.x && this.depth + this.y>=plot1.depth+plot1.y) {
	return true;//note
	}
		return false;//else
		}
	
	public int getDepth() {
		return depth;
	}
	public int getWidth() {
		return width;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean overlaps(Plot plot1) {
	if(  (this.y + this.depth > plot1.y) && (this.y < plot1.y + plot1.depth) &&  (this.x + this.width > plot1.x)&& (this.x < plot1.x + plot1.width)) {
		return true;//note
	}
	else {
		return false;//else
	}
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return x+","+y+","+width+","+depth;
	}
}
