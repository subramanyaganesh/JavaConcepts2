package CHECK_TOSTRING_EQUALS;

import java.util.Objects;

public class Employee {

    private int id;
    private int salary;
    private String description;
    private String empNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(description, employee.description) &&
                Objects.equals(empNo, employee.empNo);
    }

    @Override
    public int hashCode() {
        return -1;
        //return Objects.hash(id, salary, description, empNo);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", description='" + description + '\'' +
                ", empNo='" + empNo + '\'' +
                '}';
    }
}


class Execution{

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDescription("hello");
        employee.setEmpNo("1567");
        employee.setId(5677);
        employee.setSalary(67890);

        Employee employee1 = new Employee();
        employee1.setDescription("hello");
        employee1.setEmpNo("1567");
        employee1.setId(5677);
        employee1.setSalary(67890);

        if(employee.equals(employee1)){
            System.out.println("equals is true");
        }else {
            System.out.println("equals is false");
        }

        if(employee==employee1){
            System.out.println("=== is true");
        }else {
            System.out.println("=== is false");
        }

    }

}
