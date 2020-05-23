package com.s1626022055.test;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.s1626022055.po.Clazz;
import com.s1626022055.po.Student;
import com.s1626022055.utils.MybatisUtils;
/**
 * Mybatis关联查询映射测试类
 */
public class MybatisAssociatedTest {
	
	/**
	 * 添加班级
	 */
	@Test
	public void addClazzTest() throws Exception{		
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    SqlSessionFactory sqlSessionFactory = 
	    		new SqlSessionFactoryBuilder().build(inputStream);
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    Clazz clazz = new Clazz();
	    clazz.setId(172);
	    clazz.setCname("ruanjian172");

		int rows = sqlSession.insert("com.s1626022055.mapper"
					+ ".StudentMapper.addClazz", clazz);
	    if(rows > 0){
	        System.out.println("您成功插入了"+rows+"条数据！");
	    }else{
	        System.out.println("执行插入操作失败！！！");
	    }
	    	    
	    sqlSession.commit();
	    sqlSession.close();
	}	
	
	
	/**
	 * 添加学生
	 */
	@Test
	public void addCustomerTest() throws Exception{		
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    SqlSessionFactory sqlSessionFactory = 
	    		new SqlSessionFactoryBuilder().build(inputStream);
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    Student student = new Student();
	    student.setLoginname("stu3");
	    student.setPassword("12323124");
	    student.setUsername("13323579");
	    student.setclazz_id(172);	    
	    int rows = sqlSession.insert("com.s1626022055.mapper"
					+ ".StudentMapper.addCustomer", student);
	    if(rows > 0){
	        System.out.println("您成功插入了"+rows+"条数据！");
	    }else{
	        System.out.println("执行插入操作失败！！！");
	    }
	    
	    
	    Student student2 = new Student();
	    student2.setLoginname("stu4");
	    student2.setPassword("hbhfhhh");
	    student2.setUsername("2462280");
	    student2.setclazz_id(172);
	    int rows2 = sqlSession.insert("com.s1626022055.mapper"
					+ ".StudentMapper.addCustomer", student2);
	    if(rows2 > 0){
	        System.out.println("您成功插入了"+rows+"条数据！");
	    }else{
	        System.out.println("执行插入操作失败！！！");
	    }
	    
	    sqlSession.commit();
	    sqlSession.close();
	}

	/**
	 * 修改
	 */
	@Test
	public void updateCustomerTest() throws Exception{		
	    // 1、读取配置文件
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    // 2、根据配置文件构建SqlSessionFactory
	    SqlSessionFactory sqlSessionFactory = 
	    		new SqlSessionFactoryBuilder().build(inputStream);
	    // 3、通过SqlSessionFactory创建SqlSession
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    // 4、SqlSession执行更新操作
	    // 4.1创建Customer对象，对对象中的数据进行模拟更新
	    Student customer = new Student();
	    customer.setId(12);
	    customer.setLoginname("stu1");
	    customer.setPassword("123456");
	    customer.setUsername("13333533092");
	    customer.setclazz_id(172);
	    // 4.2执行SqlSession的更新方法，返回的是SQL语句影响的行数
	    int rows = sqlSession.update("com.s1626022055.mapper"
	            + ".StudentMapper.updateCustomer", customer);
	    // 4.3通过返回结果判断更新操作是否执行成功
	    if(rows > 0){
	        System.out.println("您成功修改了"+rows+"条数据！");
	    }else{
	        System.out.println("执行修改操作失败！！！");
	    }
	    // 4.4提交事务
	    sqlSession.commit();
	    // 5、关闭SqlSession
	    sqlSession.close();
	}
	

    /**
     * 一对多	
     */
    @Test
    public void findStudentTest() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        // 2、查询id为1的用户信息
        Clazz clazz = session.selectOne("com.s1626022055.mapper."
                                + "StudentMapper.findClazzWithStudent", 171);
        // 3、输出查询结果信息
        System.out.println(clazz);
        // 4、关闭SqlSession
        session.close();
    }

    /**
     * 多对一
     */
    @Test
    public void findClazzTest(){
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        // 2、查询id为1的订单中的商品信息
        Student student = session.selectOne("com.s1626022055.mapper."
                               + "StudentMapper.findCWithS", 12);
        // 3、输出查询结果信息
        System.out.println(student);
        // 4、关闭SqlSession
        session.close();
    }


}