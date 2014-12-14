package org.wproject.desktop.application.enums;

public enum ButtonTypeEnum {

	INSERT("Adicionar"),

	UPDATE("Atualizar"),

	DELETE("Deletar"),

	FIND("Buscar");

	private final String text;

	private ButtonTypeEnum(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

}
