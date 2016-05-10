package com.erdiagram.model.component;

public class ComponrntFactory {
	
	public final static int ENTITY = 1;
	public final static int ATTRIBUTE = 2;
	public final static int RELATIONSHIP = 3;
	public final static int CONNECTOR = 4;

	public ComponrntFactory() {}
	
	public static Component create(int aComponentType) {
		switch (aComponentType) {
		case ENTITY :
			return createEntity();
		case ATTRIBUTE :
			return createAttribute();
		case RELATIONSHIP :
			return createRelationship();
		case CONNECTOR :
			return createConnector();
		default :
			return null;
		}
	}
	
	private static Component createEntity() {
		return new Entity();
	}
	
	private static Component createAttribute() {
		return new Attribute();
	}
	
	private static Component createRelationship() {
		return new Relationship();
	}
	
	private static Component createConnector() {
		return new Connector();
	}
}
