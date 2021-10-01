import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodsDemo {

    public static void main(String[] args) {
        // write your code here
//        Class cl = null;

        try {
            var cl = SomeClass.class;  //Class.forName("SomeClass");
            System.out.println(cl.getDeclaredMethods()[0].invoke(null));
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}