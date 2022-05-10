package CoreJava;

public
class ControlStatementExample {
    public static
    void main (String[] args) {
        ControlStatementExample c= new ControlStatementExample ();
        c.conditionalChecks(true);
    }

    private
    void conditionalChecks (boolean flag) {
        if(flag==true){
            System.out.println ("Active block");
        }else {
            System.out.println ("Non Active block");
        }
    }

}
