 interface Moveable
{
    default void Move()
    {
        System.out.println("This Methos is from MOve()");
    }
}
/**
 * DeafaultMethods
 */
public class DeafaultMethods implements Moveable{

    @Override
    public void Move()
    {
 System.out.println("This Method call is from Move()->DefaultMethods");
    }
    public static void main(String args[])
    {
 
    DeafaultMethods dm = new DeafaultMethods();
    dm.Move();



    }
}