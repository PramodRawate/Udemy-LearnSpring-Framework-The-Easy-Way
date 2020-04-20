package com.pramod.app;
import com.pramod.secureStore.SecureStoreAccess;

public class ManageAppData {
	
	SecureStoreAccess secureStoreAccess;
	
	public ManageAppData() {
		
	}
	
	public ManageAppData(SecureStoreAccess secureStoreAccess) {
		this.secureStoreAccess = secureStoreAccess;
		
	}
	public void accessData() {
		secureStoreAccess.connect();
		secureStoreAccess.accessData();
	}
	
	public void storeData() {
		secureStoreAccess.connect();
		secureStoreAccess.putData();
	}
	
	public void disconnect() {
		secureStoreAccess.disconnect();
		
	}
}
