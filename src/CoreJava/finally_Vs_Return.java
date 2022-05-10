package CoreJava;

public
class finally_Vs_Return {
    public static
    void main (String[] args) {
        System.out.println (m1 ());
    }
//finally block will get more priority than return statement
    public static int m1 () {
        try {
            //  System.out.println("try");
            System.exit (10);
            return 777;
        }
        catch (Exception e) {
            //System.out.println("Exception");
            return 888;
        }
        finally {
            System.out.println("finally");
            return 999;
        }

    }
}
