package io.cloudadc.websocket;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ProxyConfiguration.class)
@ConfigurationProperties("proxy")
public class ProxyConfiguration {
	
    private String host;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	} 

}
