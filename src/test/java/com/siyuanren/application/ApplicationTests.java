package com.siyuanren.application;

import com.siyuanren.application.dao.UserDAO;
import com.siyuanren.application.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

	@Autowired
	private UserDAO userDAO;

	@Test
	public void contextLoads() {
		User user = userDAO.getById(1);
		System.out.println("user = " + user);
//		logger.info("user.getName() = " + userDAO);

//		User user = new User();
//		user.setName("zs");
//		int insert = userDAO.insert(user);
//		System.out.println(insert);
	}

}
