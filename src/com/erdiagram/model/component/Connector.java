package com.erdiagram.model.component;

public class Connector extends Component {

	@Override
	public void setId(int aId) {
	}

	@Override
	public int getId() {
		return 0;
	}

	@Override
	public void setType(int aType) {
	}

	@Override
	public int getType() {
		return 0;
	}

	@Override
	public void setText(String aText) {
	}

	@Override
	public String getText() {
		return null;
	}

	@Override
	public void ConnectTo(Component aComponent) {
	}

	@Override
	public boolean canConnectTo(Component aComponent) {
		return false;
	}
}
