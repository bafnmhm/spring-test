package cn.mit.service;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor
{
    // simply return the instantiated bean as-is
    public Object postProcessBeforeInitialization(@Nullable Object bean, String beanName) {
        return bean; // we could potentially return any object reference here...
    }

    public Object postProcessAfterInitialization(@Nullable Object bean, String beanName) {
//        System.out.println("Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}
