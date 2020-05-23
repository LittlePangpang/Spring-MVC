package com.s1626022055.test;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.s1626022055.po.Customer;
/**
 * 入门程序测试类
 */
public class MybatisTest {
	/**
	 * 根据id查询学生信息
	 */
	@Test
	public void findCustomerByIdTest() throws Exception {
		// 1、读取配置文件
		String resource = "mybatis-config.xml";
		InputStream inputStream = 
                     Resources.getResourceAsStream(resource);
		// 2、根据配置文件构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = 
                     new SqlSessionFactoryBuilder().build(inputStream);
		// 3、通过SqlSessionFactory创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
		Customer customer = sqlSession.selectOne("com.s1626022055.mapper"
				  + ".CustomerMapper.findCustomerById", 1);
		// 打印输出结果
		System.out.println(customer.toString());
		// 5、关闭SqlSession
		sqlSession.close();
	}
	
	/**
	 * 根据用户名称来模糊查询用户信息列表
	 */
	@Test
	public void findCustomerByNameTest() throws Exception{	
	    // 1、读取配置文件
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    // 2、根据配置文件构建SqlSessionFactory
	    SqlSessionFactory sqlSessionFactory = 
	new SqlSessionFactoryBuilder().build(inputStream);
	    // 3、通过SqlSessionFactory创建SqlSession
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    // 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
	    List<Customer> customers = sqlSession.selectList("com.s1626022055.mapper"
					+ ".CustomerMapper.findCustomerByName", "r");
	    for (Customer customer : customers) {
	        //打印输出结果集
	        System.out.println(customer);
	    }
	    // 5、关闭SqlSession
	    sqlSession.close();
	}
	
	/**
	 * 添加
	 */
	@Test
	public void addCustomerTest() throws Exception{		
	    // 1、读取配置文件
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    // 2、根据配置文件构建SqlSessionFactory
	    SqlSessionFactory sqlSessionFactory = 
	    		new SqlSessionFactoryBuilder().build(inputStream);
	    // 3、通过SqlSessionFactory创建SqlSession
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    // 4、SqlSession执行添加操作
	    // 4.1创建Customer对象，并向对象中添加数据
	    Customer customer = new Customer();
	    customer.setLoginname("rose");
	    customer.setPassword("123456");
	    customer.setUsername("13333533092");
	    // 4.2执行SqlSession的插入方法，返回的是SQL语句影响的行数
		int rows = sqlSession.insert("com.s1626022055.mapper"
					+ ".CustomerMapper.addCustomer", customer);
	    // 4.3通过返回结果判断插入操作是否执行成功
	    if(rows > 0){
	        System.out.println("您成功插入了"+rows+"条数据！");
	    }else{
	        System.out.println("执行插入操作失败！！！");
	    }
	    
	    Customer customer2 = new Customer();
	    customer2.setLoginname("mike");
	    customer2.setPassword("123457");
	    customer2.setUsername("13160373975");
		int rows2 = sqlSession.insert("com.s1626022055.mapper"
					+ ".CustomerMapper.addCustomer", customer2);
	    if(rows2 > 0){
	        System.out.println("您成功插入了"+rows2+"条数据！");
	    }else{
	        System.out.println("执行插入操作失败！！！");
	    }
	    
	    Customer customer3 = new Customer();
	    customer3.setLoginname("liu");
	    customer3.setPassword("000000");
	    customer3.setUsername("188521098677");
		int rows3 = sqlSession.insert("com.s1626022055.mapper"
					+ ".CustomerMapper.addCustomer", customer3);
	    if(rows3 > 0){
	        System.out.println("您成功插入了"+rows3+"条数据！");
	    }else{
	        System.out.println("执行插入操作失败！！！");
	    }
	    
	    
	    Customer customer4 = new Customer();
	    customer4.setLoginname("lzy");
	    customer4.setPassword("971113");
	    customer4.setUsername("13162522222");
		int rows4 = sqlSession.insert("com.s1626022055.mapper"
					+ ".CustomerMapper.addCustomer", customer4);
	    if(rows4 > 0){
	        System.out.println("您成功插入了"+rows4+"条数据！");
	    }else{
	        System.out.println("执行插入操作失败！！！");
	    }
	    
	    // 4.4提交事务
	    sqlSession.commit();
	    // 5、关闭SqlSession
	    sqlSession.close();
	}

	/**
	 * 更新
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
	    Customer customer = new Customer();
	    customer.setId(2);
	    customer.setLoginname("jack");
	    customer.setPassword("programmer");
	    customer.setUsername("13311111111");
	    // 4.2执行SqlSession的更新方法，返回的是SQL语句影响的行数
	    int rows = sqlSession.update("com.s1626022055.mapper"
	            + ".CustomerMapper.updateCustomer", customer);
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
	 * 删除
	 */
	@Test
	public void deleteCustomerTest() throws Exception{		
	    // 1、读取配置文件
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    // 2、根据配置文件构建SqlSessionFactory
	    SqlSessionFactory sqlSessionFactory = 
	            new SqlSessionFactoryBuilder().build(inputStream);
	    // 3、通过SqlSessionFactory创建SqlSession
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    // 4、SqlSession执行删除操作
	    // 4.1执行SqlSession的删除方法，返回的是SQL语句影响的行数
	    int rows = sqlSession.delete("com.s1626022055.mapper"
	            + ".CustomerMapper.deleteCustomer", 4);
	    // 4.2通过返回结果判断删除操作是否执行成功
	    if(rows > 0){
	        System.out.println("您成功删除了"+rows+"条数据！");
	    }else{
	        System.out.println("执行删除操作失败！！！");
	    }
	    // 4.3提交事务
	    sqlSession.commit();
	    // 5、关闭SqlSession
	    sqlSession.close();
	}

}
