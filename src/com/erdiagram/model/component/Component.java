package com.erdiagram.model.component;

public abstract class Component {

	protected int mId;
	protected int mType;
	protected String mText;
//	protected Connector mConnections;
	
	abstract public void setId(int aId);
	
	abstract public int getId();
	
	abstract public void setType(int aType);
	
	abstract public int getType();
	
	abstract public void setText(String aText);
	
	abstract public String getText();
	
	abstract public void ConnectTo(Component aComponent);
	
	abstract public boolean canConnectTo(Component aComponent);
}
