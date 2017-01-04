package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
/*import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;*/
import com.demo.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	Log log = LogFactory.getLog(DemoController.class);
	org.apache.commons.logging.Log logg = org.apache.commons.logging.LogFactory.getLog(DemoController.class);
	@Autowired
	private DemoService demoService;
	@ResponseBody
	@RequestMapping("/getData")
	public String getData(){
		log.info("log="+demoService.getData());
		logg.info(demoService.getData());
		System.out.println("sysout"+demoService.getData());
		return demoService.getData();
	}
}
