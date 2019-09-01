package com.zephyr.chan.test;

import com.zephyr.chan.dao.AccountDao;
import com.zephyr.chan.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    @Test
    public void test1() throws IOException {
        //加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建SqlSessionFactory对象
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder().build(resourceAsStream);

        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取到代理对象

        AccountDao dao = sqlSession.getMapper(AccountDao.class);

        List<Account> all = dao.findAll();
        for (Account account : all) {
            System.out.println(account);
        }

        sqlSession.close();
        resourceAsStream.close();
    }


    @Test
    public void test2() throws IOException {
        //加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建SqlSessionFactory对象
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder().build(resourceAsStream);

        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取到代理对象

        AccountDao dao = sqlSession.getMapper(AccountDao.class);

        Account account = new Account();
        account.setMoney(321d);
        account.setName("呵呵");

        dao.saveAccount(account);
        sqlSession.commit();

        sqlSession.close();
        resourceAsStream.close();
    }
}
