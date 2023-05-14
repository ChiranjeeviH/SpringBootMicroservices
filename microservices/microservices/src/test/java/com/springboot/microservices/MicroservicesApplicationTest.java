package com.springboot.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MicroservicesApplicationTest {
	
	
	    public static void main(String[] args) {
	        SpringApplication.run(MicroservicesApplicationTest.class, args);
	    }
	    
//	    @Autowired
//	    private ApplicationContext appContext;
//	    @Override
//	    public void run(String... strings) {
//	    	
//	        String[] beans = appContext.getBeanDefinitionNames();
//	        for(String bean:beans){
//	             System.out.println("Bean name: " + bean);
//	             Object object = appContext.getBean(bean);
//	             System.out.println( "Bean object:" + object);
//	        }
//	    }
//	

}
