package com.jd.ui;

import com.jd.domain.Account;
import com.jd.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author DJ
 * @Date 2020/7/29 0029
 * @Time 20:07
 * @Description: com.jd
 */


public class Demo {

    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService bean = ac.getBean(IAccountService.class);
        List<Account> list = bean.findAll();
        list.forEach(account-> System.out.println(account));
    }
}
