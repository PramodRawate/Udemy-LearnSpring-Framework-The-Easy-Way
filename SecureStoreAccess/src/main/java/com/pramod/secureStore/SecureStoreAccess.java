package com.pramod.secureStore;
import java.util.List;
import java.util.Map;

public interface SecureStoreAccess {
	public void configureServers(int accoutnId, String username, String password, List<String> serverlist, Map<String, String> configParams);
	public void connect();
	public void accessData();
	public void putData();
	public void disconnect();	
}
