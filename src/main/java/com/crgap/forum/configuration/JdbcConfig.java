package com.crgap.forum.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.crgap.forum")
@PropertySource("classpath:db.properties")
public class JdbcConfig {

	@Bean
	public DataSource mysqlDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("mysql.jdbcUrl");
		dataSource.setUsername("mysql.username");
		dataSource.setPassword("");

		return dataSource;
	}
}
