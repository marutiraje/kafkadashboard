package com.zen.kafkadashboard;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author mnimbalk
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.zen.kafkadashboard")
public class KafkaDashboardConfig {

}