package com.fullmoon.study.test;

import com.fullmoon.study.dao.UserDao;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author jingping.liu
 * @Date 2019-09-17
 * @Description TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-mybatis.xml" })
@Log4j2
public class MybatisTest {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void testMybatisCache(){
        SqlSession session = sqlSessionFactory.openSession(true);
        SqlSession session2 = sqlSessionFactory.openSession(true);

        UserDao mapper = session.getMapper(UserDao.class);
        UserDao mapper2 = session2.getMapper(UserDao.class);

        log.info(mapper.queryUserById(3));
        /*User user = new User();
        user.setId(3);
        user.setName("null");
        mapper2.updateUserById(user);*/

        log.info(mapper2.queryUserByName(""));
    }

    @Test
    public void testTwoMybatisCache(){
        // 需在对应的XML文件中添加<cache/>，二级缓存将缓存至该namespace区域，也可以使用<cache-ref namespace="">将缓存放置指定的namespace区域
        SqlSession session1 = sqlSessionFactory.openSession(true);
        SqlSession session2 = sqlSessionFactory.openSession(true);

        UserDao mapper1 = session1.getMapper(UserDao.class);
        UserDao mapper2 = session2.getMapper(UserDao.class);

        log.info(mapper1.queryUserById(1));
        session1.commit();
        log.info(mapper2.queryUserById(1));
    }

}
