package com.harman.Annotation;

public class Inter {
    void display(){
        System.out.println("this is parent class");
    }
    @Deprecated
    void test()
    {
        System.out.println("testing");
    }
}
class Sub_class extends Inter
{
    @Override
    void display() {
        super.display();
    }
    public  @interface myannotation
    {
        int age() default 18;
        String name();
    }
    @myannotation(
            name = "dhanush", age = 21
    )


    public static void main(String[] args) {
        Sub_class s=new Sub_class();
        s.test();
    }
}
