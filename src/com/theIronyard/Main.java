package com.theIronyard;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("sam", "hays", 0, 1));
        students.add(new Student("billy", "clemmons", 1, 1));
        students.add(new Student("chuck", "bass", 2, 1));
        students.add(new Student("blair", "waldorf", 3, 1));
        students.add(new Student("dan", "styles", 4, 1));
        students.add(new Student("kovu", "king", 5, 1));
        students.add(new Student("billy", "ray", 6, 1));
        students.add(new Student("sadf", "fas", 7, 1));
        students.add(new Student("basdf", "clasdf", 8, 1));
        students.add(new Student("chucsdfak", "basdafss", 9, 1));
        students.add(new Student("blfdsafair", "waafsdfsldorf", 10, 1));
        students.add(new Student("dfasdfan", "stfasdyles", 11, 1));
        students.add(new Student("kafsdovu", "kisafng", 12, 1));
        students.add(new Student("bafsdfilly", "rafasy", 13, 1));
        students.add(new Student("safafm", "haasdys", 14, 1));
        students.add(new Student("biafdlly", "clemmfdsaons", 15, 1));

        HashSet<Student> class1 = new HashSet<>();
        class1.add(students.get( 0 ));
        class1.add(students.get( 1 ));
        class1.add(students.get( 2 ));
        class1.add(students.get( 3 ));
        class1.add(students.get( 4 ));
        class1.add(students.get( 5 ));

        HashSet<Student> class2 = new HashSet<>();
        class2.add(students.get( 6 ));
        class2.add(students.get( 7 ));
        class2.add(students.get( 8 ));
        class2.add(students.get( 9 ));
        class2.add(students.get( 10 ));

        HashSet<Student> class3 = new HashSet<>();
        class3.add(students.get( 11 ));
        class3.add(students.get( 12 ));
        class3.add(students.get( 13 ));
        class3.add(students.get( 14 ));
        class3.add(students.get( 15 ));


        ArrayList<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("john", "king", 20, 1));
        teachers.add(new Teacher("jen", "stanley", 21, 1));
        teachers.add(new Teacher("rolf", "stanley", 22, 1));

        HashMap<Teacher, HashSet> rollCall = new HashMap<>();
        rollCall.put(teachers.get(0), class1);
        rollCall.put(teachers.get(1), class2);
        rollCall.put(teachers.get(2), class3);

        for (Teacher educators : rollCall.keySet()) {
            System.out.println( educators );
        }

        for (HashSet educated : rollCall.values()) {
            System.out.println( educated );

        }
    }
}
