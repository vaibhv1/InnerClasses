package InnerClasses;

public class Program5 {
    private int x = 10;
    void display()
    {
        int value = 50;
        class Local{
            void msg()
            {
                System.out.println(value);
            }
        }
        Local l = new Local();
        l.msg();
    }
    public static void main(String[] args)
    {
        Program5 li = new Program5();
        li.display();
    }
}
