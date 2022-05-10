package CoreJava;

public class try_multipleCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
         }
//child exception first  to parent exception later order is followed
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
        //multiple catch block for AE -CE time error -java: exception java.lang.ArithmeticException has already been caught
       /* catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }*/
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
