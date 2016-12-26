package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Demo;
import com.demo.dao.DemoMapper;
import com.demo.service.DemoService;
@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoMapper demoMapper;
	public String getData() {
		Demo demo = demoMapper.selectByPrimaryKey(1l);
		return demo.getName();
	}

}
