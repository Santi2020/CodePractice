package javaTpoint;

import java.io.FileOutputStream;    
public class FileOutputStreamExample {    
    public static void main(String args[]){      
           try{      
             FileOutputStream fout=new FileOutputStream("C:\\Users\\TISHAN1KA\\Desktop\\My Test folder\\testout.txt");      
             fout.write(65);
             fout.write(66);
             fout.write(67);
             fout.write(68);
             fout.write(69);
             fout.close();      
             System.out.println("success...");      
            }catch(Exception e){System.out.println(e);}      
      }      
}    