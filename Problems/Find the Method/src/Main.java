import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

class MethodFinder {

    public static int testNumber = 0;

    public static String findMethod(String methodName, String[] classNames) {
        testNumber++;
        String msg = "nr = " + testNumber + " methodName=" + methodName + "classNames=" + Arrays.toString(classNames);
        try {
            FileWriter fileWriter = new FileWriter(new File("C:\\Users\\wkoca\\IdeaProjects\\HyperMetro\\Problems\\Find the Method\\src\\test121" + testNumber + ".txt"));
            fileWriter.write(msg);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (String className: classNames) {
            try {
                Method[] methods = Class.forName(className).getDeclaredMethods();
                for (Method method : methods) {
                    if (method.getName().equals(methodName)) {
                        return className;
                    }
                }
            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
            }
        }
        return null;
    }
}