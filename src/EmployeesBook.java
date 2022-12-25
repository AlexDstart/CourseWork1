public class EmployeesBook {
    private static Employee[]employees=new Employee[10];

    public void addEmployee(Employee employee){
        for(int i=0;i<employees.length;i++){
            if(employees[i]==null){
                 employees[i]=employee;
                 return;
            }
        }
        System.out.println("Нет свободных мест");
    }
    public void printAllEmployee(){

    }
}
