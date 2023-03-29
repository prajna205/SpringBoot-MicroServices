package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menu")
@Data
public class MenuItemPrices {
	@Value("${menu.dosarate}")
	private Float DosaPrice;
	@Value("${menu.idlyrate}")
	private Float idlyPrice;
	@Value("${menu.poharate}")
	private Float pohaPrice;
	
	@Override
	public String toString() {
		return "MenuItemPrices [DosaPrice=" + DosaPrice + ", idlyPrice=" + idlyPrice + ", pohaPrice=" + pohaPrice + "]";
	}
	
}
