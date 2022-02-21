//(a) Arithmetic exception
package excep1;

public class Arithmatic {

    public static void main (String args[]){
        
        try
        {
            int a = 21/0;
        }catch(ArithmeticException e){System.out.println("Error : Cannot Divide by Zero");}
    }
    
}