package com.erdiagram.ui.menu;

import java.io.IOException;

public class MenuController {
	
	public MenuController() {}
	
	public void executeMenu() {
		while(true) {
			System.out.println(MenuEnum.AddNode.getDescription());
			System.out.println(MenuEnum.Connect2Nodes.getDescription());
			System.out.println(MenuEnum.DisplayDiagram.getDescription());
			System.out.println(MenuEnum.SetPrimaryKey.getDescription());
			System.out.println(MenuEnum.DisplayTable.getDescription());
			System.out.println(MenuEnum.Exit.getDescription());
			System.out.print("> ");
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
