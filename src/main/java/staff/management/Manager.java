package staff.management;

import staff.Employee;

public class Manager extends Employee{

    private String deptName;

    public Manager(String name, Double salary, String ni, String deptName) {
        super(name, salary, ni);
        this.deptName = deptName;
    }

    public String getDepartment(){
        return this.deptName;
    }

    public void setDepartment(String newDepartment){
        this.deptName = newDepartment;
    }
}
