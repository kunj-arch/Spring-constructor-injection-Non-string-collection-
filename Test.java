package spring8;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Resource r=new  ClassPathResource("ApplicationContext.xml");
BeanFactory f=new	XmlBeanFactory(r);
	Ques q =(Ques)f.getBean("abc");
	q.displayInfo();
	}

}
