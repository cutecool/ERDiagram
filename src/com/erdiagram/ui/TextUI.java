package com.erdiagram.ui;

import com.erdiagram.ui.menu.MenuController;

public class TextUI implements IUserInterface {

	@Override
	public void show() {
		MenuController menu = new MenuController();
		menu.executeMenu();
	}

}
