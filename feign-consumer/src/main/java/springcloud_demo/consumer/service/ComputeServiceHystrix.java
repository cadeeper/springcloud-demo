package springcloud_demo.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class ComputeServiceHystrix implements ComputeService{

	
	@Override
	public Integer add(Integer a, Integer b) {
		return -9999;
	}
}
