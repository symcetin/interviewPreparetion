public class InstanceAndStaticBlock {

    public InstanceAndStaticBlock(){

        System.out.println("constructor");//belongs to object
    }

    static{
        System.out.println("static block");
    }

    {
        System.out.println("instance block");//belongs to object
    }

    public static void main(String[] args) {
        System.out.println("main method1");
        InstanceAndStaticBlock ab=new InstanceAndStaticBlock();
        InstanceAndStaticBlock ab1=new InstanceAndStaticBlock();
        System.out.println("main method2");
    }
}
