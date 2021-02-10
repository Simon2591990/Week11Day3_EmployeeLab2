package staff.management;



public class Director extends Manager {

    Double budget;

    public Director(String name, Double salary, String ni, String deptName, Double budget) {
        super(name, salary, ni, deptName);
        this.budget = budget;
    }


    public double getBudget() {
        return this.budget;
    }

    public void setBudget(Double newBudget){
        this.budget = newBudget;
    }
}
