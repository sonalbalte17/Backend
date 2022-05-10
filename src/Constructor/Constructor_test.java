package Constructor;

public
class Constructor_test {
    Constructor_test(){
        System.out.println ("Constructor");
    }

    public static
    void main (String[] args) {
        Constructor_test c1=new Constructor_test ();
        Constructor_test c2=new Constructor_test ();
        Constructor_test c3=new Constructor_test ();

    }
}
