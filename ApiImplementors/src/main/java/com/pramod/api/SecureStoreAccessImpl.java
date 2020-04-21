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
	
	public SecureStoreAccessImpl() {
		
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

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getServerlist() {
		return serverlist;
	}

	public void setServerlist(List<String> serverlist) {
		this.serverlist = serverlist;
	}

	public Map<String, String> getConfigParams() {
		return configParams;
	}

	public void setConfigParams(Map<String, String> configParams) {
		this.configParams = configParams;
	}
	

}
