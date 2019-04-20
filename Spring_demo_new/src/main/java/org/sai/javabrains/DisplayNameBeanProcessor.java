package org.sai.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanProcessor implements BeanPostProcessor{
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.print("\n\nAfter / Bean name " + beanName);  return bean;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.print("\n\nBefore /Bean name " + beanName); return bean;
	}

}
