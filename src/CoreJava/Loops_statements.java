package CoreJava;

public
class Loops_statements {
    public static
    void main (String[] args) {
        Loops_statements l = new Loops_statements ();
        l.while_loop (1);
        l.do_while_loop(7);

    }

    private
    void do_while_loop (int a) {
        do {
            System.out.println ("do while loop" +a);
            a++;
        }while (a<10);
    }

    private
    void while_loop (int i) {
        while (i < 5) {
            System.out.println ("While loop  " +i);
            i++;}
            System.out.println ("After post increment  " +i);
        }
    }
