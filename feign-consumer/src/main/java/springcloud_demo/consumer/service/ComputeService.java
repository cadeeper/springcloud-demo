package springcloud_demo.consumer.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "compute-service" , fallback = ComputeServiceHystrix.class)
public interface ComputeService {
	
	
	@RequestMapping(method = RequestMethod.GET , value = "/add")
	@LoadBalanced
	Integer add(@RequestParam("a") Integer a,@RequestParam("b") Integer b);
	
}
