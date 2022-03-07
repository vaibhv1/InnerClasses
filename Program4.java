package InnerClasses;

public class Program4 {
    private int x =10;
    void display()
    {
        class Local{
            void msg()
            {
                System.out.println(x);
            }
        }
        Local l = new Local();
        l.msg();
    }
    public static void main(String[] args) {
        Program4 p = new Program4();
        p.display();
    }
}
