package com.feelfly.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.feelfly.enums.ItemSize;
import com.feelfly.enums.ItemType;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "barCode")
	private Integer barCode;

	private String model;

	private ItemType itemType;

	private ItemSize itemSize;

	private String color;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBarCode() {
		return barCode;
	}

	public void setBarCode(Integer barCode) {
		this.barCode = barCode;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public ItemSize getItemSize() {
		return itemSize;
	}

	public void setItemSize(ItemSize itemSize) {
		this.itemSize = itemSize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
