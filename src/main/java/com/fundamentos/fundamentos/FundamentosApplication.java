package com.fundamentos.fundamentos;

import com.fundamentos.fundamentos.bean.MyBean;
import com.fundamentos.fundamentos.bean.MyBeanwithDependency;
import com.fundamentos.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanwithDependency myBeanwithDependency;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanwithDependency myBeanwithDependency) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanwithDependency = myBeanwithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();
		myBean.print();
		myBeanwithDependency.printWithDependency();
	}
}
