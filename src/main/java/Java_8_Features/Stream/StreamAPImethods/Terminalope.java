package Java_8_Features.Stream.StreamAPImethods;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;


class Persons {

        private String name;
        private Integer age;
        private String job;

        public Persons(String name, Integer age, String job) {
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



    public class Terminalope {

        public static void main(String[] args) {

            
            Persons p1 = new Persons("Raju", 28, "Software");
            Persons p2 = new Persons("Mahesh", 29, "Driver");
            Persons p3 = new Persons("Ashok", 30, "Teacher");
            Persons p4 = new Persons("Sunil", 27, "Mechanic");
            Persons p5 = new Persons("Bharat", 30, "Driver");

            List<Persons> persons = Arrays.asList(p1, p2, p3, p4, p5);

       /*  boolean f=   persons.stream().anyMatch(P-> P.getname().equals("Ashok"));
            System.out.println("   "+f);*/

           /* boolean f=   persons.stream().allMatch(P-> P.getname().equals("Ashok"));
            System.out.println("   "+f);*/

           /* boolean f=   persons.stream().noneMatch(P-> P.getname().equals("Ashok"));
            System.out.println("   "+f);*/

          /* Optional<Persons>  r =  persons.stream().filter(p -> p.getJob().equals("Sfte")).findFirst();

          if(r.isPresent())
            System.out.println("   "+r);*/

            Optional<Persons>  r =  persons.stream().filter(p -> p.getJob().equals("Driver")).findAny();

            if(r.isPresent())
                System.out.println("   "+r);

        }
    }


