package InnerClasses;

public class Program6 {
    static int x =100;
    static class Inner{
        void msg()
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args)
    {
        Program6.Inner o = new Program6.Inner();
        o.msg();
    }
}
