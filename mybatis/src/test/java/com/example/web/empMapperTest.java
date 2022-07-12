package com.example.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.web.emp.mapper.empMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class empMapperTest {
	
	@Autowired empMapper mapper;
	
	@Test
	public void list() {
		System.out.println(mapper.getEmpList(null));
	}
}
