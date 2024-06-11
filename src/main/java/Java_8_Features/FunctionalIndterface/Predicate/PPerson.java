package Java_8_Features.FunctionalIndterface.Predicate;

public class PPerson {

    String name ;
    int age ;

    PPerson(String name , int age)
    {
        this.age = age;
        this.name = name ;
    }

    public String getName()
    {
        return  name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getage()
    {
        return  age ;
    }

    public  void setAge(int age)
    {
        this.age = age ;
    }

    @Override
    public String toString() {
        return  "name"+name+ "age" +age+  " ";
    }
}
