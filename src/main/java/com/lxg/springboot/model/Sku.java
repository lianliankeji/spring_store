package com.lxg.springboot.model;

import java.io.Serializable;

public class Sku extends BasicObject {

	/**
	 * author xuhuadong
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private String specifi;

	private String code;
	
	private double price;
	
	private int amount;
	
	private int total;
	
	private int skuamount;
	
	private int tag;

	private int num;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecifi() {
		return specifi;
	}

	public void setSpecifi(String specifi) {
		this.specifi = specifi;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSkuamount() {
		return skuamount;
	}

	public void setSkuamount(int skuamount) {
		this.skuamount = skuamount;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public int getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	
}