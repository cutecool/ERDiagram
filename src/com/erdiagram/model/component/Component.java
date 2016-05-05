package com.erdiagram.model.component;

public class Component {

	protected int mId;
	protected int mType;
	protected String mText;
//	protected Connector mConnections;
	
	public void setId(int aId) {
		mId = aId;
	}
	
	public int getId() {
		return mId;
	}
	
	public void setType(int aType) {
		mType = aType;
	}
	
	public int getType() {
		return mType;
	}
	
	public void setText(String aText) {
		mText = aText;
	}
	
	public String getText() {
		return mText;
	}
	
	public void ConnectTo(Component aComponent) {
		
	}
	
	public boolean canConnectTo(Component aComponent) {
		return false;
	}
}
