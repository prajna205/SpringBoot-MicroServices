package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
	@Value("12345")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.addrs}")
	private String hotelAddrs;
	@Value("${hotel.contactno}")
	private String phnNo;
	
	@Value("${customer.name}")
	private String custName;
	
	@Value("#{menu.idlyPrice+menu.pohaPrice}")
	private float billAmount;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", phnNo="
				+ phnNo + ", custName=" + custName + ", billAmount=" + billAmount + ", osName=" + osName + ", pathData="
				+ pathData + "]";
	}
	
	
	
}
