package day18.view;

public abstract class DObject2 {
	public DObject2 next; // 외부에서 써야되기 때문에 public
	public DObject2() {
		next = null;
	}
	public abstract void draw();
}
