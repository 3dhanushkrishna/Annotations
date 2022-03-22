package com.harman.Annotation;

public class Base {
    void display(){
        System.out.println("this is parent class");
    }
}


class Child extends Base
{
    @Override
    void display() {
        super.display();
    }


    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }

}
