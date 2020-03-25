import java.util.Scanner;
public class Employee
{
    private String name;
    private int idNumber;
    private String department;
    private String position;
    public void setName(String n) {
        name = n;
    }
    public void setIdNumber(int id)
    {
        idNumber = id;
    }
    public void setDepartment(String d)
    {
        department = d;
    }
    public void setPosition(String p)
    {
        position = p;
    }
    public String getName()
    {
        return name;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
    public String getDepartment()
    {
        return department;
    }
    public String getPosition()
    {
        return position;
    }
    public Employee(String nameGiven, int idNumberGiven, String departmentGiven, String positionGiven)
    {
        name = nameGiven;
        idNumber = idNumberGiven;
        department = departmentGiven;
        position = positionGiven;
    }
    public static void main(String[] args)
    {
        Employee one = new Employee("Susan Meyers", 47899,
                "Marketing", "Sales Rep");
        Employee two = new Employee("Mark Jones", 39119,
                "IT", "Programmer");
        Employee three = new Employee("Joy Rogers", 81774,
                "Manufacturing", "Engineer");
        one.setName("Susan Meyers");
        one.setIdNumber(47899);
        one.setDepartment("Marketing");
        one.setPosition("Sales Rep");
        two.setName("Mark Jones");
        two.setIdNumber(39119);
        two.setDepartment("IT");
        two.setPosition("Programmer");
        three.setName("Joy Rogers");
        three.setIdNumber(81774);
        three.setDepartment("Manufacturing");
        three.setPosition("Engineer");
        System.out.println(one.getName() + ", employee number " + one.getIdNumber() + ", works as a "
                + one.getPosition() +  " in " + one.getDepartment() + ".");
        System.out.println(two.getName() + ", employee number " + two.getIdNumber() + ", works as a "
                + two.getPosition() + " in " + two.getDepartment() + ".");
        System.out.println(three.getName() + ", employee number " + three.getIdNumber() + ", works as a "
                + three.getPosition() + " in " + three.getDepartment() + ".");
    }
}
