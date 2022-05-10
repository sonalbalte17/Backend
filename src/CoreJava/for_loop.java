package CoreJava;

public
class for_loop {
    public static
    void main (String[] args) {
        for_loop fr=new for_loop ();
        fr.FR_loop(1);
    }

    private static
    void FR_loop (int i) {
        for ( i=1;i<=10;i++){
            System.out.println ("For loop  "+i);
        }
    }
}
