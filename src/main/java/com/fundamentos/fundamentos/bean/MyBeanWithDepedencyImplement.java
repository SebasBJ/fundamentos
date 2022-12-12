package com.fundamentos.fundamentos.bean;

public class MyBeanWithDepedencyImplement implements MyBeanwithDependency{
    private MyOperation myOperation;

    public MyBeanWithDepedencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int number = 1;
        System.out.println(myOperation.sum(number));
        System.out.println("Hola desde la implementacion de un bean con dependencia");
    }
}
