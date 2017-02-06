package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
	
	private final String name;
	private final ArrayList<Address> addresses = new ArrayList<Address>();
	

	Address address = new Address("street","city","state","zip");
	
	
	public Business(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	
	@Override
	public List<Address> getAddresses() {
		for (int i = 0; i < addresses.size(); i++) {
			((Addressable) addresses).addAddress(address);
		}
		return addresses;
	}

	@Override
	public void addAddress(Address newAddress) {
		address = newAddress;
	}

}
