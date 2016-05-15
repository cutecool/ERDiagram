package com.erdiagram.ui.menu;

import com.erdiagram.util.StringUtil;

public enum MenuEnum {
	AddNode(1, "Add a node"),
	Connect2Nodes(2, "Connect two nodes"),
	DisplayDiagram(3, "Display the current diagram"),
	SetPrimaryKey(4, "Set a primary key"),
	DisplayTable(5, "Display the table"),
	Exit(6, "Exit");
	
	private String mDescription;
	private int mInstance;
	
	MenuEnum(int aInstance, String aDescription) {
		mInstance = aInstance;
		mDescription = aDescription;
	}
	
	public String getDesc() {
		return StringUtil.append(mInstance, ". ", mDescription);
	}
	
	public String getInstance() {
		return String.valueOf(mInstance);
	}
}
