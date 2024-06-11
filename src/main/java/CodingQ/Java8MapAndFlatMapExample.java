package CodingQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Institute
{
    String name;

    List<String> locations;

    public Institute(String name, List<String> locations)
    {
        this.name = name;
        this.locations = locations;
    }

   /* public void PPR(String name, List<String> locations)
    {
        this.name = name;
        this.locations = locations;
    }*/

    public String getName()
    {
        return name;
    }

    public List<String> getLocations()
    {
        return locations;
    }
}

public class Java8MapAndFlatMapExample
{
    public static void main(String[] args)
    {
        List<Institute> instituteList = new ArrayList<>();
      //  Institute s =new Institute();

        instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
        instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
        instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));





        //Java 8 Map() : Get names of all institutes

        List<String> namesOfInstitutes = instituteList.stream().map(Institute::getName).collect(Collectors.toList());

        System.out.println(namesOfInstitutes);

        //Java 8 FlatMap() : Get unique locations of all institutes

        Set<String> locationsOfInstitutes = instituteList.stream().flatMap(institute -> institute.getLocations().stream()).collect(Collectors.toSet());

        System.out.println(locationsOfInstitutes);
    }
}
