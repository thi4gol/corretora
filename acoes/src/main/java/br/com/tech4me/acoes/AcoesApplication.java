package br.com.tech4me.acoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AcoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcoesApplication.class, args);
	}

}
