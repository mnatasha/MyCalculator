/**
 * Created by biswadipm on 22/6/17.
 */
public class MyCalc {


    public static void main(String... args){
        System.out.println("hi ");
        MyCalc obj=new MyCalc();
        obj.add(4,5);
        obj.deduct(4,5);
        obj.multiply(4,5);
        obj.divide(4,5);

    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public void deduct(int a, int b)
    {
        System.out.println(a-b);
    }
    public void multiply(int a, int b)
    {
        System.out.println(a*b);
    }
    public void divide(int a, int b)
    {
        System.out.println(a/b);
    }

}
