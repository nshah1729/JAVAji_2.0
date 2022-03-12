package com.company.Cir;

public class argu {
    void run(){
        System.out.println("Running");
    }
}
class Child extends argu{
    void run(){
        System.out.println("Child hai");
    }
}
class Main{
    public static void main(String[] args) {
        argu obj=new Child();
        obj.run();
    }

}

