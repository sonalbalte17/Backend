package CoreJava;

public class Finally {
    public static void main(String[] args) {
       //Case1:No exception
        try{
            System.out.println("try");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("stmt1");

        //Case 2:Exception occurred and handled
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("stmt1");

        //Case3: Exception occurred and not handled,finally block will be executed always.
        //JVM will check whether the corresponding exception is available or not,if not avlbl-Abnormal termination of the program.
        //Before ATermination,finally block will be executed and the control will be given to the default exception handler.
        //Statements after finally will not be executed.

        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch (NullPointerException e){
            System.out.println("null");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("stmt1");
    }


}
