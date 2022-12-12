package com.driver;

class A{
    public String Meth(){
        return "Invoking method from class A";
    }
}

class B extends A{

    public void callAMeth(){
        super.Meth();
    }
    @Override
    public String Meth(){
        return "Method is overridden in Extendend class B";
    }
}

public class Main {
   public static void main(String[] args){
       B b=new B();
       b.callAMeth();
       b.Meth();
   }
}