public class Director extends Manager {

    private int budget;

    public Director(String name, String NI, int salary, String departmentName, int budget){
        super(name, NI, salary, departmentName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

}
