package com.kodilla.spring1;

import com.kodilla.spring1.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestsSuite {

	@Test
	public void testGetUsername() {
		ApplicationContext context = new AnnotationConfigApplicationContext(new String[]{"com.kodilla.spring1"});
		ForumUser forumUser = context.getBean(ForumUser.class);
		String name = forumUser.getUsername();
		Assert.assertEquals("John Smith", name);
	}
}
