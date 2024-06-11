package Java_8_Features.FunctionalIndterface.ComparableINterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stdmain {

    public static void main(String[] args) {
        Student s1 = new Student("abhi", 5, " maharashtra");
        Student s2 = new Student("hi", 2, " maharashtra");
        Student s3 = new Student("cbhi", 9, " maharashtra");


        List<Student> stud = Arrays.asList(s1, s2, s3); // converted Obj into list

        for (Student s : stud) {
            System.out.println(s);
        }
        // Approach one
      /*  Collections.sort(stud, new stred());
        for (Student s : stud) {
            System.out.println(s);
        }*/
        // Second approach
       /* Collections.sort(stud, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getname().compareTo(o2.getname());
            }*/

        Collections.sort(stud, (a, b) -> a.name.compareTo(b.name));
        for (Student s : stud) {
            System.out.println(s);

        }
    }
}


  /*  class stred implements Comparator<Student>
    {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getname().compareTo(o2.getname());
        }
    }*/

