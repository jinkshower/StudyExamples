//public class Main {
//    public static void main(String[] args) {
//        Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager");
//        Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "Java");
//        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Python");
//
//        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
//        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
//        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());
//
//        System.out.println(manager.generatePerformanceReport());
//        System.out.println(developer.generatePerformanceReport());
//        System.out.println(programmer.generatePerformanceReport());
//
//        manager.manageProject();
//        developer.writeCode();
//        programmer.debugCode();
//    }
//}
//
//class Employee {
//    private String name;
//    private String address;
//    private double salary;
//    private String jobTitle;
//
//    public Employee(String name, String address, double salary, String jobTitle) {
//        this.name = name;
//        this.address = address;
//        this.salary = salary;
//        this.jobTitle = jobTitle;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public String getJobTitle() {
//        return jobTitle;
//    }
//
//    public double calculateBonus() {
//        return 0.0;
//    }
//    public String generatePerformanceReport() {
//        return "No report";
//    }
//}
//
//class Manager extends Employee {
//    public Manager(String name, String address, double salary, String jobTitle) {
//        super(name, address, salary, jobTitle);
//    }
//
//    @Override
//    public double calculateBonus() {
//        return getSalary() * 1.5;
//    }
//
//    @Override
//    public String generatePerformanceReport() {
//        return "Performance Report for manager" + getName() + "Excellent!";
//    }
//
//    public void manageProject() {
//        System.out.println("Manager" + getName() + "is managing project.");
//    }
//}
//
//class Developer extends Employee {
//    private String language;
//    public Developer(String name, String address, double salary, String jobTitle, String language) {
//        super(name, address, salary, jobTitle);
//        this.language = language;
//    }
//
//    @Override
//    public double calculateBonus() {
//        return getSalary() * 1.3;
//    }
//
//    @Override
//    public String generatePerformanceReport() {
//        return "Performance Report for Developer" + getName() + "Great!";
//    }
//
//    public void writeCode() {
//        System.out.println("Developer" + getName() + " is writing code.");
//    }
//}
//
//class Programmer extends Employee {
//
//    public Programmer(String name, String address, double salary, String jobTitle) {
//        super(name, address, salary, jobTitle);
//    }
//
//    @Override
//    public double calculateBonus() {
//        return getSalary() * 1.3;
//    }
//
//    @Override
//    public String generatePerformanceReport() {
//        return "Performance Report for Programmer" + getName() + "good";
//    }
//
//    public void debugCode() {
//        System.out.println("Programmer " + getName() + " is debuggin code.");
//    }
//}