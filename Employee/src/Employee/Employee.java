package Employee;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String department;
    private String code;
    private int salaryRate;
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setSalaryRate(int salaryRate) {
        this.salaryRate = salaryRate;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    public String getCode() {
        return code;
    }
    public int getSalaryRate() {
        return salaryRate;
    }
    public Employee(String id, String name, int age, String department, String code, int salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }
    public Employee(){
    }
}

