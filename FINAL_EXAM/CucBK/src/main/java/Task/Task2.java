package Task;

import java.util.*;
import java.util.stream.Collectors;

/**
 * There is a Cat class with a String variable name, int variable age.
 *
 * Create a Map<Integer, Cat> and add 10 cats represented by (index, Cat) pairs.
 *
 * Get a Set of all cats from the Map and display it on the screen.
 *
 * Requirements
 * •The program must not read data from the keyboard.
 * •The createMap method must create a new HashMap<Integer, Cat> object.
 * •The createMap method must add 10 cats to the map, represented by (index, Cat) pairs.
 * •The createMap method must return the created map.
 * •The convertMapToSet method must create and return the set of cats retrieved from the passed map.
 * •The program must display name and age each cats in the set.
 */

public class Task2 {
    public static void main(String[] args) {
        Map<Integer,Cat> catMap1= new HashMap<>();
        Task2 t2 = new Task2();
        catMap1 = t2.createMap();
        Set<Cat> catSet1 = new HashSet<>();
        catSet1 = t2.convertMapToSet(catMap1);
        t2.printCats(catSet1);

    }

    public Map<Integer,Cat> createMap() {
        //write your code here
        Map<Integer,Cat> catMap= new HashMap<>();
        catMap.put(1, new Cat("Tom", 1));
        catMap.put(2, new Cat("Jerry", 2));
        catMap.put(3, new Cat("Boid", 5));
        catMap.put(4, new Cat("Shark", 6));
        catMap.put(5, new Cat("Cosy", 3));
        catMap.put(6, new Cat("Marry", 1));
        catMap.put(7, new Cat("Jonny", 4));
        catMap.put(8, new Cat("Huck", 5));
        catMap.put(9, new Cat("Fin", 7));
        catMap.put(10, new Cat("Pippi", 1));
        return catMap;
    }

    public Set<Cat> convertMapToSet(Map<Integer, Cat> map){
        //write your code here
        Set<Cat> catSet = new HashSet<>();
        for (Map.Entry<Integer, Cat> entry : map.entrySet()) {
            catSet.add(entry.getValue());
        }
        return catSet;
    }

    public void printCats(Set<Cat> cats) {
        //write your code here
        Iterator<Cat> i = cats.iterator();
        while (i.hasNext())
            System.out.println(i.next().toString());
    }

    public class Cat{
        //write your code here
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "+ {" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
