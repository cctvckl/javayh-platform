package com.javayh.config;

import com.javayh.common.annotation.JavayhBootApplication;
import com.javayh.common.i18n.annotation.EnableAutoInternationalization;
import org.springframework.boot.SpringApplication;

/**
 * <p>
 * nacos分布式中心测试
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-09 17:45
 */
@EnableAutoInternationalization
@JavayhBootApplication
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

}
