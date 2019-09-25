package com.bj58.fang.hugopenapi.vo;

public class ParameterVo{
	int value;
	String text;
	
	public ParameterVo(int value, String text) {
		this.value = value;
		this.text = text;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}