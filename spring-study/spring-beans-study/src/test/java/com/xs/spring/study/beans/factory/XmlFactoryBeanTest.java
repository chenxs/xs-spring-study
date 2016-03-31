package com.xs.spring.study.beans.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.xs.spring.study.beans.MyTestBean;

public class XmlFactoryBeanTest {
	public static BeanFactory factory;
	
	@SuppressWarnings("deprecation")
	public static void init(){
		if(factory==null){
			Resource resource=new ClassPathResource("BeanTest.xml",XmlFactoryBeanTest.class);
			factory=new XmlBeanFactory(resource);
		}
	}
	
	public static void main(String[] args){
		init();
		((MyTestBean)factory.getBean("myTestBean")).printName();
	}
}
