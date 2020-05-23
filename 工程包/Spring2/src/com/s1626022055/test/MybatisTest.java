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
 * ���ų��������
 */
public class MybatisTest {
	/**
	 * ����id��ѯѧ����Ϣ
	 */
	@Test
	public void findCustomerByIdTest() throws Exception {
		// 1����ȡ�����ļ�
		String resource = "mybatis-config.xml";
		InputStream inputStream = 
                     Resources.getResourceAsStream(resource);
		// 2�����������ļ�����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = 
                     new SqlSessionFactoryBuilder().build(inputStream);
		// 3��ͨ��SqlSessionFactory����SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		Customer customer = sqlSession.selectOne("com.s1626022055.mapper"
				  + ".CustomerMapper.findCustomerById", 1);
		// ��ӡ������
		System.out.println(customer.toString());
		// 5���ر�SqlSession
		sqlSession.close();
	}
	
	/**
	 * �����û�������ģ����ѯ�û���Ϣ�б�
	 */
	@Test
	public void findCustomerByNameTest() throws Exception{	
	    // 1����ȡ�����ļ�
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    // 2�����������ļ�����SqlSessionFactory
	    SqlSessionFactory sqlSessionFactory = 
	new SqlSessionFactoryBuilder().build(inputStream);
	    // 3��ͨ��SqlSessionFactory����SqlSession
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    // 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
	    List<Customer> customers = sqlSession.selectList("com.s1626022055.mapper"
					+ ".CustomerMapper.findCustomerByName", "r");
	    for (Customer customer : customers) {
	        //��ӡ��������
	        System.out.println(customer);
	    }
	    // 5���ر�SqlSession
	    sqlSession.close();
	}
	
	/**
	 * ���
	 */
	@Test
	public void addCustomerTest() throws Exception{		
	    // 1����ȡ�����ļ�
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    // 2�����������ļ�����SqlSessionFactory
	    SqlSessionFactory sqlSessionFactory = 
	    		new SqlSessionFactoryBuilder().build(inputStream);
	    // 3��ͨ��SqlSessionFactory����SqlSession
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    // 4��SqlSessionִ����Ӳ���
	    // 4.1����Customer���󣬲���������������
	    Customer customer = new Customer();
	    customer.setLoginname("rose");
	    customer.setPassword("123456");
	    customer.setUsername("13333533092");
	    // 4.2ִ��SqlSession�Ĳ��뷽�������ص���SQL���Ӱ�������
		int rows = sqlSession.insert("com.s1626022055.mapper"
					+ ".CustomerMapper.addCustomer", customer);
	    // 4.3ͨ�����ؽ���жϲ�������Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ�������"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ�в������ʧ�ܣ�����");
	    }
	    
	    Customer customer2 = new Customer();
	    customer2.setLoginname("mike");
	    customer2.setPassword("123457");
	    customer2.setUsername("13160373975");
		int rows2 = sqlSession.insert("com.s1626022055.mapper"
					+ ".CustomerMapper.addCustomer", customer2);
	    if(rows2 > 0){
	        System.out.println("���ɹ�������"+rows2+"�����ݣ�");
	    }else{
	        System.out.println("ִ�в������ʧ�ܣ�����");
	    }
	    
	    Customer customer3 = new Customer();
	    customer3.setLoginname("liu");
	    customer3.setPassword("000000");
	    customer3.setUsername("188521098677");
		int rows3 = sqlSession.insert("com.s1626022055.mapper"
					+ ".CustomerMapper.addCustomer", customer3);
	    if(rows3 > 0){
	        System.out.println("���ɹ�������"+rows3+"�����ݣ�");
	    }else{
	        System.out.println("ִ�в������ʧ�ܣ�����");
	    }
	    
	    
	    Customer customer4 = new Customer();
	    customer4.setLoginname("lzy");
	    customer4.setPassword("971113");
	    customer4.setUsername("13162522222");
		int rows4 = sqlSession.insert("com.s1626022055.mapper"
					+ ".CustomerMapper.addCustomer", customer4);
	    if(rows4 > 0){
	        System.out.println("���ɹ�������"+rows4+"�����ݣ�");
	    }else{
	        System.out.println("ִ�в������ʧ�ܣ�����");
	    }
	    
	    // 4.4�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

	/**
	 * ����
	 */
	@Test
	public void updateCustomerTest() throws Exception{		
	    // 1����ȡ�����ļ�
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    // 2�����������ļ�����SqlSessionFactory
	    SqlSessionFactory sqlSessionFactory = 
	    		new SqlSessionFactoryBuilder().build(inputStream);
	    // 3��ͨ��SqlSessionFactory����SqlSession
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    // 4��SqlSessionִ�и��²���
	    // 4.1����Customer���󣬶Զ����е����ݽ���ģ�����
	    Customer customer = new Customer();
	    customer.setId(2);
	    customer.setLoginname("jack");
	    customer.setPassword("programmer");
	    customer.setUsername("13311111111");
	    // 4.2ִ��SqlSession�ĸ��·��������ص���SQL���Ӱ�������
	    int rows = sqlSession.update("com.s1626022055.mapper"
	            + ".CustomerMapper.updateCustomer", customer);
	    // 4.3ͨ�����ؽ���жϸ��²����Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ��޸���"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ���޸Ĳ���ʧ�ܣ�����");
	    }
	    // 4.4�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

	/**
	 * ɾ��
	 */
	@Test
	public void deleteCustomerTest() throws Exception{		
	    // 1����ȡ�����ļ�
	    String resource = "mybatis-config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    // 2�����������ļ�����SqlSessionFactory
	    SqlSessionFactory sqlSessionFactory = 
	            new SqlSessionFactoryBuilder().build(inputStream);
	    // 3��ͨ��SqlSessionFactory����SqlSession
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    // 4��SqlSessionִ��ɾ������
	    // 4.1ִ��SqlSession��ɾ�����������ص���SQL���Ӱ�������
	    int rows = sqlSession.delete("com.s1626022055.mapper"
	            + ".CustomerMapper.deleteCustomer", 4);
	    // 4.2ͨ�����ؽ���ж�ɾ�������Ƿ�ִ�гɹ�
	    if(rows > 0){
	        System.out.println("���ɹ�ɾ����"+rows+"�����ݣ�");
	    }else{
	        System.out.println("ִ��ɾ������ʧ�ܣ�����");
	    }
	    // 4.3�ύ����
	    sqlSession.commit();
	    // 5���ر�SqlSession
	    sqlSession.close();
	}

}
