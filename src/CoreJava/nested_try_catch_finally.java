package CoreJava;

public
class nested_try_catch_finally {
    public static
    void main (String[] args) {
        try {
            System.out.println("outer try block executed.");
                    try{
                        System.out.println ("inner try block.");
                        System.out.println (10/0);
                    }
        catch (ArithmeticException ae){
                        System.out.println ("AE found inner try block.");
        }
                    System.out.println ("AFter inner try catch block is exceuted.");
        }
        catch(ArithmeticException ae){
            System.out.println ("Exception found in outer try block.");
        }
        finally {
            System.out.println ("outer Finally block is executed.");
        }
    }
}
