package com.gxw.msc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient // 本服务启动后自动注册到eureka服务器
@SpringBootApplication
@EnableDiscoveryClient // 服务发现
public class ProviderGoods8002_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ProviderGoods8002_APP.class, args);
	}

}
