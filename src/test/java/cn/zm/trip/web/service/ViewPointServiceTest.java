package cn.zm.trip.web.service;

import cn.zm.trip.web.domain.ViewPoint;
import cn.zm.trip.web.domain.ViewPointExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class ViewPointServiceTest {
	@Autowired
	ViewPointService viewPointService;
	@Test
	public void selectByPrimaryKey() {
		ViewPoint viewPoint = viewPointService.selectByPrimaryKey(12);
		System.out.println(viewPoint);
	}

	@Test
	public void selectByExample() {
		ViewPointExample example = new ViewPointExample();
		viewPointService.selectByExample(example);
	}
}