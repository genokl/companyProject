package cn.cpService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@MapperScan("cn.cpService.basic.dao")
public class CpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpServiceApplication.class, args);
	}
}
