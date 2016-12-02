package com.test.model;

import java.io.Serializable;

public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String phNr;
	String provider;
	/**
	 * @return the phNr
	 */
	public String getPhNr() {
		return phNr;
	}
	/**
	 * @param phNr the phNr to set
	 */
	public void setPhNr(String phNr) {
		this.phNr = phNr;
	}
	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}
	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Phone(String phNr, String provider) {
		super();
		this.phNr = phNr;
		this.provider = provider;
	}
}

