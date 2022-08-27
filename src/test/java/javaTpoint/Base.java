package javaTpoint;

class Base   
{  
    public void baseMethod()  
    {  
        System.out.println("BaseMethod called ...");  
    }
    
    public void baseMethod1()  
    {  
        System.out.println("BaseMethod called ...");  
    }
    
}  
class Derived extends Base   
{  
    public void baseMethod()  
    {  
        System.out.println("Derived method called ...");  
    }  
    
    public void baseMethod2()  
    {  
        System.out.println("BaseMehod 2 is called ...");  
    }
    
}  