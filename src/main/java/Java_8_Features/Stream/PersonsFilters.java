package Java_8_Features.Stream;

import java.util.Arrays;
import java.util.List;

 class Person {

    private String name;
    private Integer age;
    private String job;

    public Person(String name, Integer age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getname()
    {
        return name;
    }
    public void setname(String y)
    {
        this.name=y ;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String getJob()
    {
        return job;
    }

    @Override
    public String toString() {
        return  "name= "+name+" , age="+age+" job="+job+" ";
    }



}

    //setters, getters & toString()



    public class PersonsFilters {

        public static void main(String[] args) {
            Person p1 = new Person("Raju", 28, "Software");
            Person p2 = new Person("Mahesh", 29, "Driver");
            Person p3 = new Person("Ashok", 30, "Teacher");
            Person p4 = new Person("Sunil", 27, "Mechanic");
            Person p5 = new Person("Bharat", 30, "Chef");

            List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

            persons.stream()
                    .filter(p -> p.getAge() > 21 && p.getAge() < 30 && p.getJob().equals("Software"))
                    .forEach(System.out::println);


        }
    }
