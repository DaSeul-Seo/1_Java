package org.comstudy21.library.memberview;

import org.comstudy21.library.resource.MemberRes;

public abstract class MemberView implements MemberRes{
	protected abstract void display();
	
	public void show() {
		display();
	}
	
}
