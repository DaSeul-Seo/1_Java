package org.comstudy21.sb_phonebook.view;

import org.comstudy21.sb_phonebook.resource.Resource;

public abstract class MyView implements Resource {
	
	protected abstract void display();
	
	public void show() {
		display();
	}
}
