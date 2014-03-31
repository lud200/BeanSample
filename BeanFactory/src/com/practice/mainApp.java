package com.practice;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class mainApp {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory
	                             (new ClassPathResource("Beans.xml"));

	      helloWorld obj = (helloWorld) factory.getBean("helloWorld");
	      obj.getMessage();
	   }
}
