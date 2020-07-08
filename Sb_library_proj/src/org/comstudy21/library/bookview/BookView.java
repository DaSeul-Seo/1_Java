package org.comstudy21.library.bookview;

import org.comstudy21.library.resource.BookRes;

public abstract class BookView implements BookRes{
	protected abstract void display();

	public void show() {
		display();
	}
}
