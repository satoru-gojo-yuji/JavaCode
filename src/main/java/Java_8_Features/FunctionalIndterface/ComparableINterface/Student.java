package Java_8_Features.FunctionalIndterface.ComparableINterface;

public class Student {

    String name ;
    int id ;
    String add ;

    public Student(String name , int id , String add)
    {
        this.name=name;
        this.id= id ;
        this.add= add ;
    }

    public String getname()
    {
        return name ;
    }

    public void setname(String name )
    {
        this.name = name ;
    }

    public Integer getid()
    {
        return id ;
    }

    public void setid(Integer id )
    {
        this.id = id ;
    }
    public String getadd()
    {
        return add ;
    }

    public void setadd(String add )
    {
        this.add = add ;
    }

    @Override
    public String toString() {
        return " " + name + " " + id + " "  + add + " ";
    }
}
