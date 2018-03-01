public abstract class Employee {
    private String name;
    private String NI;
    private int salary;

            public Employee(String name, String NI, int salary){
                this.name = name;
                this.NI = NI;
                this.salary = salary;
            }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNI() {
        return NI;
    }

    public void setNI(String NI) {
        this.NI = NI;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double raiseSalary( ){
           return this.salary * 0.01 ;

    }

    public double payBonus(){
        return salary + raiseSalary();

    }
}
