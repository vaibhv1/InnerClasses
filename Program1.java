package InnerClasses;

public class Program1 {
    class Inner{
        void msg()
        {
            System.out.println("Hello World");
        }
    }
public static void main(String[] args)
{
    Program1 p1 = new Program1();
    Program1.Inner in = p1.new Inner();
    in.msg();
}
}
