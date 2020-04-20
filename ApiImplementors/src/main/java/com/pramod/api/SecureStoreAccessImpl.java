package com.pramod.api;

import java.util.List;
import java.util.Map;

import com.pramod.secureStore.SecureStoreAccess;

public class SecureStoreAccessImpl implements SecureStoreAccess {

	int accountId;
	String username;
	String password;
	List<String> serverlist;
	Map<String,String> configParams;

	public SecureStoreAccessImpl(int accountId, String username, String password, List<String> serverlist, Map<String, String> configParams) {
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.serverlist = serverlist;
		this.configParams = configParams;
		
	}
	
	public void configureServers(int accountId, String username, String password, List<String> serverlist, Map<String, String> configParams) {
		System.out.println("Server configs are set.");
	}

	public void connect() {
		configureServers(accountId, username, password, serverlist, configParams);
		System.out.println("Connected to servers.");
	}

	public void accessData() {
		System.out.println("Data accessed.");	
	}
	
	public void disconnect() {
		System.out.println("Disconnected.");		
	}

	public void putData() {
		System.out.println("Data Inserted.");
	}

}
