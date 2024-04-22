package Employee;

import java.util.ArrayList;

public class EmployeeManage {
    private ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public boolean createEmployee(String id, String name, int age, String department, String code, int salaryRate) {
        if (id.equals("") || name.equals("") || age <= 18 || department.equals("") || code.equals("")
                || salaryRate <= 0) {
            return false;
        } 
        Employee e = new Employee(id, name, age, department, code, salaryRate);
        employees.add(e);
        return true;
    }

    public void initializeEmployees() {
        for (int i = 0; i < 10; i++) {
            employees.add(new Employee(Integer.toString(i), "Employee" + i, 25 + i, "Department" + (i % 3), "Code" + i,
                    1000 + i * 100));
        }
    }

    public boolean deleteEmployee(String id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().toString().equals(id)) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }
}
