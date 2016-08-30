package springcloud_demo.config_server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@EnableConfigServer
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(App.class).web(true).run(args);
	}
}
