import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter


public class Employee {
    private String lastName;
    private String name;
    private String middleName;
    private String department;
    private double salary;
    private final long id=count;
    private static long count=1l;


    public Employee(String lastName, String name, String middleName, String department, double salary) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        if(Utilit.isDepartment(department)){
            this.department=department;

        }else {
            System.out.println("Этого отдела не существует");
        }
        this.department = department;
        this.salary = salary;
        count++;
    }

    private boolean isDepartment(String department){
        if(department.equals("1")||department.equals("2")||department.equals("3")||department.equals("4")
        ||department.equals("5")){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Работник №"+id+", ФИО "+ lastName +" " + name+ " "+ middleName+" работает в отделе: "
                + department+ ", получает зарплату"+ String.format("%.2d",salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
