package org.comstudy21.library.userview;

import org.comstudy21.library.resource.UserRes;

public abstract class UserView implements UserRes{

	protected abstract void display();

	public void show() {
		display();
	}
}
