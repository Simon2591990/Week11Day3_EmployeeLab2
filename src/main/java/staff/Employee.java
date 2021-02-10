package staff;

public abstract class Employee {
    private double salary;
    private String name;
    private String ni;

    public Employee(String name, Double salary, String ni) {

        this.name = name;
        this.salary = salary;
        this.ni = ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public void raiseSalary(Double bonus){
        this.salary += bonus;
    }
    public Double payBonus(){
        return this.salary * 0.01;
    }

}
