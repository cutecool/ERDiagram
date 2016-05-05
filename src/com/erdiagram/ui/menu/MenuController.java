package com.erdiagram.ui.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuController {
	
	private String mMenuSelect;
	
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
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				mMenuSelect = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if (mMenuSelect.equals(MenuEnum.Exit.getInstance())) {
				System.out.println("Goodbye!");
				return;
			}
		}
	}
}
