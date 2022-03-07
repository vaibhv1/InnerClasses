package InnerClasses;

public class Program7 {
    static int x =101;
    static class Innerr
    {
       static void msg()
        {
            System.out.println("Koenigsegg");
        }
    }
    public static void main(String[] args)
    {
        Program7.Innerr.msg();
    }
}
