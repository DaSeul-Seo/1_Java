package day18.view;

public abstract class DObject2 {
	public DObject2 next; // �ܺο��� ��ߵǱ� ������ public
	public DObject2() {
		next = null;
	}
	public abstract void draw();
}
