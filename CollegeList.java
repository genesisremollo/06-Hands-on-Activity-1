import java.util.Scanner;

class Person {
    private String name;
    private String contactNum;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setContactNum(String c) {
        this.contactNum = c;
    }

    public String getContactNum() {
        return contactNum;
    }
}

class Employee extends Person {
    private double salary;
    private String department;

    public void setSalary(double s) {
        this.salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String d) {
        this.department = d;
    }

    public String getDepartment() {
        return department;
    }
}

class Faculty extends Employee {
    private boolean isRegular;

    public void setIsRegular(boolean status) {
        this.isRegular = status;
    }

    public boolean getIsRegular() {
        return isRegular;
    }
}

class Student extends Person {
    private String program;
    private int yearLevel;

    public void setProgram(String p) {
        this.program = p;
    }

    public String getProgram() {
        return program;
    }

    public void setYearLevel(int y) {
        this.yearLevel = y;
    }

    public int getYearLevel() {
        return yearLevel;
    }
}

public class CollegeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press E for Employee, F for Faculty, or S for Student:");
        char choice = scanner.next().charAt(0);
        scanner.nextLine(); 

        if (choice == 'E' || choice == 'e') {
            Employee emp = new Employee();
            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.println("Press Enter after every input.");

            emp.setName(scanner.nextLine());
            emp.setContactNum(scanner.nextLine());
            emp.setSalary(Double.parseDouble(scanner.nextLine()));
            emp.setDepartment(scanner.nextLine());

            System.out.println("\n-------------------------------");
            System.out.println("Name: " + emp.getName());
            System.out.println("Contact Number: " + emp.getContactNum());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Department: " + emp.getDepartment());

        } else if (choice == 'F' || choice == 'f') {
            Faculty fac = new Faculty();
            System.out.println("Type faculty member's name, contact number, salary, department, and if regular (Y/N).");
            System.out.println("Press Enter after every input.");

            fac.setName(scanner.nextLine());
            fac.setContactNum(scanner.nextLine());
            fac.setSalary(Double.parseDouble(scanner.nextLine()));
            fac.setDepartment(scanner.nextLine());
            fac.setIsRegular(scanner.nextLine().equalsIgnoreCase("Y"));

            System.out.println("\n-------------------------------");
            System.out.println("Name: " + fac.getName());
            System.out.println("Contact Number: " + fac.getContactNum());
            System.out.println("Salary: " + fac.getSalary());
            System.out.println("Department: " + fac.getDepartment());
            System.out.println("Status: " + (fac.getIsRegular() ? "Regular" : "Not Regular"));

        } else if (choice == 'S' || choice == 's') {
            Student stu = new Student();
            System.out.println("Type student's name, contact number, enrolled program, and year level (1-4).");
            System.out.println("Press Enter after every input.");

            stu.setName(scanner.nextLine());
            stu.setContactNum(scanner.nextLine());
            stu.setProgram(scanner.nextLine());
            stu.setYearLevel(Integer.parseInt(scanner.nextLine()));

            System.out.println("\n-------------------------------");
            System.out.println("Name: " + stu.getName());
            System.out.println("Contact Number: " + stu.getContactNum());
            System.out.println("Program: " + stu.getProgram());
            System.out.println("Year Level: " + stu.getYearLevel());

        } else {
            System.out.println("Invalid selection.");
        }

        scanner.close();
    }
}

