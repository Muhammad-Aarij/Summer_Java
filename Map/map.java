package Map;

import java.util.Map;
import java.util.HashMap;

// create a Map object named "students" and add key-value pairs to it.  The key is a String (name), and the value is an Integer (age).  Print the Map to the console.  The output should be: {student=21, student2=22}  This is a simple example of a Map in Java.  You can also use a Map to store other data types, such as lists or other Maps.  For example: Map
public class map {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("student", 21);
        students.put("student2", 22);
        students.put("student3", 22);
        students.put("student4", 22);
        students.put("student5", 22);
        System.out.println(students);
        System.out.println(students.keySet());

        for(String k: students.keySet()){
            System.out.println(k +" : "+ students.get(k));
        }

    }

}
