

public class Constructor2 {

    public Constructor2(){

        //this(6);
        System.out.println("default constructor");

    }

    private Constructor2(int tall){
      this();
        System.out.println("non-default constructor "+tall);
    }

    protected Constructor2(double salary, int age){
       this(5);
        System.out.println("non-default constructor2"+salary+age);
    }




    public static void main(String[] args) {
        Constructor2 cons=new Constructor2();
        Constructor2 cons1=new Constructor2(5);
        Constructor2 cons2=new Constructor2(4500.6,44);
        /*
        constructor belongs to object
        Access modifier and class name
        constructor can call from another constructor
        this(),super()
        constructor can not called itself
        Access modifier can be different
         */

    }

}
