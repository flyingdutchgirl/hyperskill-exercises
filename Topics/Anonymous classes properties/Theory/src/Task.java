// You can experiment here, it won’t be checked

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
  public static void main(String[] args) {
    // put your code here
    List<Object> list = new ArrayList<>();


    var xInt = new X<Integer>();
    list.add(xInt);
    var xString = new X<String>();
    list.add(xString);
    var y = new Y();
    list.add(y);

    var dbl = new X<Double>() {

    };
//    list.add(dbl);

    list.stream()
            .map(Object::getClass)
            .map(cl ->
                    List.of(cl.getName(),
                            cl.getCanonicalName(),
                            cl.getSimpleName(),
                            cl.getTypeName()
                    )
            )
            .map(List::toArray)
            .map(Arrays::toString)
            .forEachOrdered(System.out::println);

            System.out.println(dbl.getClass().getName());
            System.out.println(dbl.getClass().getTypeName());
            System.out.println(dbl.getClass().getSimpleName());
            System.out.println(dbl.getClass().getCanonicalName());

            xInt.getEntity();
            xString.getEntity();
            y.getEntity();
            dbl.getEntity();
  }
}

class X<T> {
  T entity;

  public T getEntity() {
    return entity;
  }
}

class Y extends X<String> {}
