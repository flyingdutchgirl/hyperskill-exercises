import java.util.*;

class SelectionContext {

    private PersonSelectionAlgorithm algorithm;

    public void setAlgorithm(PersonSelectionAlgorithm algorithm) {
        // write your code here
        this.algorithm = algorithm;
    }

    public Person[] selectPersons(Person[] persons) {
        // write your code here
        return this.algorithm.select(persons);
    }
}

interface PersonSelectionAlgorithm {

    Person[] select(Person[] persons);
}

class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {

    private int step;

    public TakePersonsWithStepAlgorithm(int step) {
        // write your code here
        this.step = step;
    }

/*
    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        System.out.println("select start!");
        // division with rounding up
        //int chosenLength = persons.length % 2 == 1 ? (persons.length / step) + 1 : (persons.length / step);
        int chosenLength = persons.length % step == 1 ? (persons.length / step) + 1 : (persons.length / step);
        Person[] chosen = new Person[chosenLength];
        int n = 0;
        for (int i = 0; i < persons.length; i += this.step) {
            chosen[n++] = persons[i];
        }
        
        for (int i = 0; i < chosen.length; i++) { // -------------------------------------------------------------
            if (chosen[i] == null) {
                throw new RuntimeException("Wyjatek w i=" + i + " ,length=" + chosen.length);
            }
        }
        
        System.out.println("Chosen: " + chosen.toString()); // ---------------------------------------------------------------------------------
        return chosen;


    }
    
    */
    
     @Override
    public Person[] select(Person[] persons) {
        // write your code here
        ArrayList<Person> selected = new ArrayList<>();
        for (int i = 0; i < persons.length; i += this.step) {
            selected.add(persons[i]);
        }
        
        Person[] result = new Person[selected.size()];
        for (int i = 0; i < selected.size(); i++) {
            result[i] = selected.get(i);
        }
        
        return result;
    }
}





class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {
    
    private int count;
    
    public TakeLastPersonsAlgorithm(int count) {
        // write your code here
        this.count = count;
    }

    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        System.out.println("take last start!");
        //return Arrays.copyOfRange(persons, persons.length - count, persons.length);
        
        if (persons.length == count) {
            return persons;
        }
        
        Person[] chosen = Arrays.copyOfRange(persons, persons.length - count, persons.length);
        
        /*
        for (int i = 0; i < chosen.length; i++) {
            if (chosen[i] == null) {
                throw new RuntimeException("222Wyjatek w i=" + i + " ,length=" + chosen.length);
            }
        }
        if (chosen == null) {
            throw new RuntimeException(" range is null");
        }
        */
        return chosen;
    }
}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int count = Integer.parseInt(scanner.nextLine());
        final Person[] persons = new Person[count];

        for (int i = 0; i < count; i++) {
            persons[i] = new Person(scanner.nextLine());
        }

        final String[] configs = scanner.nextLine().split("\\s+");

        final PersonSelectionAlgorithm alg = create(configs[0], Integer.parseInt(configs[1]));
        SelectionContext ctx = new SelectionContext();
        ctx.setAlgorithm(alg);

        final Person[] selected = ctx.selectPersons(persons);
        for (Person p : selected) {
            System.out.println(p.name);
        }
    }

    public static PersonSelectionAlgorithm create(String algType, int param) {
        switch (algType) {
            case "STEP": {
                return new TakePersonsWithStepAlgorithm(param);
            }
            case "LAST": {
                return new TakeLastPersonsAlgorithm(param);
            }
            default: {
                throw new IllegalArgumentException("Unknown algorithm type " + algType);
            }
        }
    }
}
