package com.arco.helpdek.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.arco.helpdek.services.DBServices;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBServices dbServices;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String hibernateDdlAuto;

	@Bean
	public boolean instanciaDatabase() {
		if ("create".equals(hibernateDdlAuto)) {
			this.dbServices.instanciaDB();
		}
		return false;
	}
}