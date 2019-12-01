/**
 * FunctionInterfaceExample
 */
@FunctionalInterface
public interface FunctionInterfaceExample {

    public void addString();
    
    public default void imple() {
        System.out.println("this is implementation method");
    }
    
    public default int addMethos() {
        return 1;
    }

}