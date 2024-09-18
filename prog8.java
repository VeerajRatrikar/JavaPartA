package veeraj1;


class Employee {
	int empID;
	String name;
	String phone;
 	double salary;

 public Employee(int empID, String name, String phone, double salary) {
     this.empID = empID;
     this.name = name;
     this.phone = phone;
     this.salary = salary;
 }

 public void display() {
     System.out.println(this);
 }

 @Override
 public String toString() {
     return "Employee ID: " + empID + "\n" +
            "Name: " + name + "\n" +
            "Phone: " + phone + "\n" +
            "Salary: " + salary;
 }
}


class Tester extends Employee {
	String projectID;
	String projectName;

 public Tester(int empID, String name, String phone, double salary, String projectID, String projectName) {
     super(empID, name, phone, salary);
     this.projectID = projectID;
     this.projectName = projectName;
 }

 public String toString() {
     return "Role: Tester\n" + super.toString() + "\n" +
            "Project ID: " + projectID + "\n" +
            "Project Name: " + projectName;
 }
}


class Developer extends Employee {
	String projectName;

 public Developer(int empID, String name, String phone, double salary, String projectName) {
     super(empID, name, phone, salary);
     this.projectName = projectName;
 }

 public String toString() {
     return "Role: Developer\n" + super.toString() + "\n" +
            "Project Name: " + projectName;
 }
}


public class prog8 {
 public static void main(String[] args) { 
     Employee[] employees = new Employee[4];

     employees[0] = new Tester(101, "AJ", "123-456-7890", 60000, "T101", "Project A");
     employees[1] = new Tester(102, "Bob", "098-765-4321", 65000, "T102", "Project B");

     employees[2] = new Developer(201, "Charlie ", "555-123-4567", 70000, "Project C");
     employees[3] = new Developer(202, "Dana       ", "555-987-6543", 75000, "Project D");


     System.out.println("\nEmployee Details:");
     for (Employee employee : employees) {
         employee.display();
         System.out.println("-------------------------");
     }
 }
}
 