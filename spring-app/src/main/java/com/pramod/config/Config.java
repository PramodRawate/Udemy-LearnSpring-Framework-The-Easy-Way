package com.pramod.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pramod.api.SecureStoreAccessImpl;
import com.pramod.app.ManageAppData;

@Configuration
public class Config {

	@Bean
	public SecureStoreAccessImpl secureStoreAccessImpl()
	{		
		int accountId = 100;
		String username = "pramod";
		String password = "rawate";
		List<String> serverlist = Arrays.asList("10.11.12.13","20.21.22.23","30.31.32.33");
		Map<String, String> configParams = new HashMap<String,String>();	
		configParams.put("cores", "2");
		configParams.put("ram", "16gb");
		configParams.put("disk", "1TB");
		
		SecureStoreAccessImpl secureStoreAccessImpl = new SecureStoreAccessImpl();
		secureStoreAccessImpl.setAccountId(accountId);
		secureStoreAccessImpl.setUsername(username);
		secureStoreAccessImpl.setPassword(password);
		secureStoreAccessImpl.setServerlist(serverlist);
		secureStoreAccessImpl.setConfigParams(configParams);

		return secureStoreAccessImpl;
	}	

	@Bean
	public ManageAppData manageAppData(SecureStoreAccessImpl secureStoreAccessImpl) {
		return new ManageAppData(secureStoreAccessImpl());
	}
}
