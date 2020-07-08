package org.comstudy21.library.managerview;

import org.comstudy21.library.resource.ManagerRes;

public abstract class ManagerView implements ManagerRes{
	public abstract void display();
	
	public void show() {
		display();
	}
}
