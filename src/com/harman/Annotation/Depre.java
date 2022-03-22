package com.harman.Annotation;

public class Depre {


}
    void display(){
        System.out.println("this is parent class");
    }
    @Deprecated
    void test()
    {
        System.out.println("testing");
    }
}
class Sub extends Depre
{
    @Override
    void display() {
        super.display();
    }


    public static void main(String[] args) {
        Sub s=new Sub();
        s.test();
    }