package InnerClasses;
interface Eatable{
    void eat();
}
public class Program3 {
    public static void main(String[] args)
    {
        Eatable e = new Eatable(){
        public void eat()
        {
            System.out.println("Nice fruits");
        }
        };
        e.eat();
    }
}
