package CoreJava;

public
class NestedIF_else {
    public static
    void main (String[] args) {
        NestedIF_else n=new NestedIF_else ();
        n.nestedif_elsecheck(11);
    }

    public
    void nestedif_elsecheck (int i) {
        if(i==10){
            System.out.println ("no.is 10");
        } else if (i==9) {
            System.out.println ("no.is less than 10");
        } else if (i==11) {
            System.out.println ("no.is greater than 10");
        }else {
            System.out.println ("no.is not 10");
        }
    }
}
