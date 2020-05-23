package com.s1626022055.test;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.s1626022055.po.Customer;
import com.s1626022055.utils.MybatisUtils;
public class MybatisTest {
	/**
	 * 根据客户loginname和username组合条件查询客户信息列表  if
	 */
	@Test
	public void findCustomerByNameAndJobsTest(){
		// 通过工具类生成SqlSession对象
		SqlSession session = MybatisUtils.getSession();
		// 创建Customer对象，封装需要组合查询的条件
		Customer customer = new Customer();
		customer.setLoginname("lzy");
		customer.setUsername("123");
		// 执行SqlSession的查询方法，返回结果集
	   List<Customer> customers = session.selectList("com.s1626022055.mapper" 
		       + ".CustomerMapper.findCustomerByNameAndJobs",customer);
		// 输出查询结果信息
		for (Customer customer2 : customers) {
			// 打印输出结果
			System.out.println(customer2);
		}
		// 关闭SqlSession
		session.close();
	}

	
	/**
	 * 根据客户loginname和username组合条件查询客户信息列表  where
	 */
	@Test
	public void findCustomerByloginnameAndusernameTest(){
		// 通过工具类生成SqlSession对象
		SqlSession session = MybatisUtils.getSession();
		// 创建Customer对象，封装需要组合查询的条件
		Customer customer = new Customer();
		customer.setLoginname("rose");
		customer.setUsername("123");
		// 执行SqlSession的查询方法，返回结果集
	   List<Customer> customers = session.selectList("com.s1626022055.mapper" 
		       + ".CustomerMapper.findCustomerByNameAndJobs",customer);
		// 输出查询结果信息
		for (Customer customer2 : customers) {
			// 打印输出结果
			System.out.println(customer2);
		}
		// 关闭SqlSession
		session.close();
	}
	
	
	/**
	 * 根据客户Username或password查询客户信息列表 choose
	 */
	@Test
	public void findCustomerByNameOrJobsTest(){
	    // 通过工具类生成SqlSession对象
	    SqlSession session = MybatisUtils.getSession();
	    // 创建Customer对象，封装需要组合查询的条件
	    Customer customer = new Customer();
//	    customer.setUsername("123");
	    customer.setPassword("123456");
	    // 执行SqlSession的查询方法，返回结果集
	    List<Customer> customers = session.selectList("com.s1626022055.mapper" 
	            + ".CustomerMapper.findCustomerByNameOrJobs",customer);
	    // 输出查询结果信息
	    for (Customer customer2 : customers) {
	        // 打印输出结果
	        System.out.println(customer2);
	    }
	    // 关闭SqlSession
	    session.close();
	}

	/**
	 * 更新客户 set
	 */
	@Test
	public void updateCustomerTest() {		
	    // 获取SqlSession
	    SqlSession sqlSession = MybatisUtils.getSession();
	    // 创建Customer对象，并向对象中添加数据
	    Customer customer = new Customer();
	    customer.setId(3);
	    customer.setUsername("alreadyset");
	    customer.setPassword("passssss");
	    
	    // 执行SqlSession的更新方法，返回的是SQL语句影响的行数
	    int rows = sqlSession.update("com.s1626022055.mapper"
	            + ".CustomerMapper.updateCustomer", customer);
	    // 通过返回结果判断更新操作是否执行成功
	    if(rows > 0){
	        System.out.println("您成功修改了"+rows+"条数据！");
	    }else{
	        System.out.println("执行修改操作失败！！！");
	    }
	    // 提交事务
	    sqlSession.commit();
	    // 关闭SqlSession
	    sqlSession.close();
	}
	
	/**
	 * 根据客户编号批量查询客户信息 foreach
	 */
	@Test
	public void findCustomerByIdsTest(){
	    // 获取SqlSession
	    SqlSession session = MybatisUtils.getSession();
	    // 创建List集合，封装查询id
	    List<Integer> ids=new ArrayList<Integer>();
	    ids.add(1);
	    ids.add(3);
	    // 执行SqlSession的查询方法，返回结果集
	    List<Customer> customers = session.selectList("com.s1626022055.mapper"
	            + ".CustomerMapper.findCustomerByIds", ids);
	    // 输出查询结果信息	
	    for (Customer customer : customers) {
	        // 打印输出结果
	        System.out.println(customer);
	    }
	    // 关闭SqlSession
	    session.close();
	}

	/**
	 * bind元素的使用：根据客户名模糊查询客户信息 
	 */
	@Test
	public void findCustomerByNameTest(){
	    // 通过工具类生成SqlSession对象
	    SqlSession session = MybatisUtils.getSession();
	    // 创建Customer对象，封装查询的条件
	    Customer customer =new Customer();
	    customer.setLoginname("j");
	    // 执行sqlSession的查询方法，返回结果集
	    List<Customer> customers = session.selectList("com.s1626022055.mapper"
	            + ".CustomerMapper.findCustomerByName", customer);
	    // 输出查询结果信息	
	    for (Customer customer2 : customers) {
	        // 打印输出结果
	        System.out.println(customer2);
	    }
	    // 关闭SqlSession
	    session.close();
	}

}
