package javaTpoint;

import samplePrograms.Model;

public class Test   
{  
    public static void main (String args[])  
    {  
        Base b = new Derived();  
        b.baseMethod();  
        
        
        Derived d = new Derived();
        //d.baseMethod2();
        System.out.println(b instanceof Base);//true  
    }  
}  