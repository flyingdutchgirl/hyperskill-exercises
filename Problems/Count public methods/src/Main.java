import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class ReflectionUtils {

    public static int countPublicMethods(Class targetClass) {
        return (int) Arrays.stream(targetClass.getDeclaredMethods())
                .mapToInt(Method::getModifiers)
                .filter(Modifier::isPublic)
                .count();
    }
}