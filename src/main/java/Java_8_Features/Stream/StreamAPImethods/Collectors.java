package Java_8_Features.Stream.StreamAPImethods;

import java.util.ArrayList;
import java.util.List;

public class Collectors {

    public static void main(String[] args) {
        List<Emp> e = new ArrayList<>();
        e.add(new Emp("Mahesh", 29, "Driver"));
        e.add(new Emp("Ashok", 30, "Teacher"));
        e.add(new Emp("Sunil", 27, "Mechanic"));
        e.add(new Emp("Bharat", 30, "Driver"));

     // List<String>  t =  e.stream().map(Emp::getJob).collect(Collectors.toList());

    }
}

    class Emp {

         String name;
         Integer age;
        String job;

        public Emp(String name, Integer age, String job) {
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

