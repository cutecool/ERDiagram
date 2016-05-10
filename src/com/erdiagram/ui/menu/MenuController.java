package com.erdiagram.ui.menu;

import com.erdiagram.util.StringUtil;

public class MenuController {
	
	private String mMenuSelect;
	
	public MenuController() {}
	
	public void executeMenu() {
		while(true) {
			StringUtil.cout(MenuEnum.AddNode.getDesc());
			StringUtil.cout(MenuEnum.Connect2Nodes.getDesc());
			StringUtil.cout(MenuEnum.DisplayDiagram.getDesc());
			StringUtil.cout(MenuEnum.SetPrimaryKey.getDesc());
			StringUtil.cout(MenuEnum.DisplayTable.getDesc());
			StringUtil.cout(MenuEnum.Exit.getDesc());
			StringUtil.cout("> ");
			
			mMenuSelect = StringUtil.cin();
			
			if (mMenuSelect.equals(MenuEnum.Exit.getInstance())) {
				System.out.println("Goodbye!");
				return;
			}
		}
	}
}
