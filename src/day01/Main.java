package day01;

public class Main {

    public static void main(String[] args) {
        System.out.println("STRING");
        //String -->sequence of characters, it is an object and immutable.
        //There is two ways to create a String
        //With String literal
        String name = "Seyma";
        //With new keyword
        String name1 = new String("Semih");
        //With array
        char[]arr = { 's','c','o','t'};
        String name2 = new String(name);

        String name4 = "java";
        name4.concat("selenium"); //stack memory -> doesn't effect name4
        name4=name4.concat("selenium");//heap memory
        System.out.println(name4);

        System.out.println("PARSING");
        //Converting string to integer
        String number="10";
        int result=Integer.parseInt(number);//primitive==>none
        Integer result1=Integer.parseInt(number);//primitive==>auto-boxing
        System.out.println(result);
        System.out.println(result1);

        String numbers="25";
        int rslt=Integer.valueOf(numbers);//Wrapper==>unboxing
        Integer rslt1=Integer.valueOf(numbers);//Wrapper==>none
        System.out.println(rslt);
        System.out.println(rslt1);

        //Converting integer to String
        int num=123;
        String a=Integer.toString(num);
        System.out.println(a);

        int nums=123456;
        String b=String.valueOf(nums);
        System.out.println(b);

        System.out.println("REVERSE");
        //REVERSE
        //first way
        String str="Java is fun";
        StringBuilder abc=new StringBuilder(str);
        //DAIR=>delete,appand,insert,reverse
        System.out.println(abc.reverse());//reverse
        System.out.println(abc.append(" selenium"));//add
        System.out.println(abc.delete(0,2));//substring
        System.out.println(abc.insert(0,"Pyhton"));

        //second way
        String reversing="Selenium is easy for me";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            //reverse+=reversing.charAt(i);
            reverse+=reversing.substring(i,i+1);
        }
        System.out.println(reverse);

        String[] array = reversing.split(" ");
        String reverse2 = "";
        for (int i = array.length-1; i < 0 ; i--) {
            reverse2+=array[i];
        }
        System.out.println(reverse2);

    }
}
