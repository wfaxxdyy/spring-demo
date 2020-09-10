package cn.wf.springdemo.beanutils;

import cn.wf.springdemo.model.User;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

public class BeanUtilsDemo {

    @Test
    public void test(){

        User user1 = new User();
        user1.setName("wf");
        user1.setAge(18);
        User user2 = (User) user1.clone();
        System.out.println(user2);
        User user3 = new User();
        BeanUtils.copyProperties(user1,user3);
        System.out.println(user3);
    }

}
