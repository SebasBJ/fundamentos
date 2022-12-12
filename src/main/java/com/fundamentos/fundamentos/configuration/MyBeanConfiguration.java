package com.fundamentos.fundamentos.configuration;

import com.fundamentos.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfiguration {
    @Bean
    public MyBean beanOpreation(){
        return new MyBeanTwoImplement();
    }
    @Bean
    public MyOperation myOpreation(){
        return new MyOperationImplement();
    }
    @Bean
    public MyBeanwithDependency myOpreationWithDependency(MyOperation myOperation){
        return new MyBeanWithDepedencyImplement(myOperation);
    }
}
