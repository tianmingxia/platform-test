package cn.iald.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: 服务启动入口
 * @author: wangyc
 * @create: 2020-12-29 11:20
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class TestApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}
