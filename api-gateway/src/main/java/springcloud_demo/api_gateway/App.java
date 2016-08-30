package springcloud_demo.api_gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import springcloud_demo.api_gateway.filter.AccessFilter;

/**
 * Hello world!
 *
 */
@EnableZuulProxy
@SpringCloudApplication
public class App {
	
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(App.class).web(true).run(args);
	}
}
