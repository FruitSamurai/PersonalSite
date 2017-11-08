package com.github.fruitsamurai.framework.common.search;

import java.io.Serializable;

/**
 * 查询条件
 */
public class Condition implements Serializable {

	private static final long serialVersionUID = -5355773325400152119L;

	public Condition(){}

	public Condition(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * 参数名称
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * 参数值
	 */
	private Object value;
	
}