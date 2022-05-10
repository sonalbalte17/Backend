package CoreJava;

public class try_catch_finally {
    public static void main (String[] args) {
        //Case1:If there is no exception,flow is 1,2,3,5,6.NT
        //Case2:If exception is raised at stmt 2 & corresponding catch block is found,flow is 1,4,5,6,NT
        //Case3:If exception raised at stmt 2 & corresponding catch block is not found,flow is 1,5,AT
        //Case4:If an exception raised at stmt 4,AT but before termination finally block will be executed
        //Case5:If an exception raised at stmt 5 or stmt 6,AT.
        //Any exception outside the try block leads to abnormal termination.
       try {
           System.out.println ("stmt 1");
           System.out.println ("stmt 2");
           System.out.println ("Stmt 3");
       }
       catch(ArithmeticException e)
       {
           System.out.println ("Exception found.");
       }
       finally {
           System.out.println ("finally");
       }
        System.out.println (10/0);
    }
}
