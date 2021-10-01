import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

/**
 * Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        // Add implementation here
        return Stream.of(object.getClass().getDeclaredFields())
                .filter(f -> Modifier.isPublic(f.getModifiers()))
                .map(Field::getName)
                .toArray(String[]::new);
    }

}