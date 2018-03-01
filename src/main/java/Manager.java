public class Manager extends Employee {
    private String departmentName;

    public Manager(String name, String NI, Integer salary, String departmentName){
        super(name, NI, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
