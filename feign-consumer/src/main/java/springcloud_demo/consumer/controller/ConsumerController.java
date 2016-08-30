package springcloud_demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springcloud_demo.consumer.service.ComputeService;

@RefreshScope
@RestController
public class ConsumerController {

	@Autowired
	ComputeService computeService;
	
	@Value("${from}")
	String from;
	
	@RequestMapping(value = "/add" , method = RequestMethod.GET)
	public Integer add(){
		return computeService.add(10, 20);
	}
	
	@RequestMapping("/from")
	public String from(){
		return this.from;
	}
}
