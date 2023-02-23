
public class Employee {
    // private var to store employee data
    private String name;
    private int ID;
    private double hourlyRate;
    private double hoursWorked;
    private double overtimeRate;
    private double overtimeHours;
    private String paymentMethod;

    // constructor to initialize the employee's name, hourly rate, and default values for other var
    public Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
        this.overtimeRate = 1.5 * hourlyRate;
        this.overtimeHours = 0;
    }

    // method to add hours worked by the employee and calculate overtime hours if applicable
    public void addHoursWorkedWeekly(double hours) {
        this.hoursWorked += hours;
        // check if employee worked more than 40 hours, and calculate overtime hours if applicable
        if(hoursWorked > 40)  {
            this.overtimeHours += hoursWorked - 40;
            this.hoursWorked = 40;
        }
    }

    // method to calculate regular pay based on hourly rate and regular hours worked
    public double calculateRegularPayWeekly() {
        return hourlyRate * hoursWorked;
    }

    // method to calculate overtime pay based on overtime rate and overtime hours worked
    public double calculateOvertimePayWeekly() {
        return overtimeRate * overtimeHours;
    }

    // method to calculate total pay by adding regular pay and overtime pay
    public double calculateTotalPayWeekly() {
        return calculateRegularPayWeekly() + calculateOvertimePayWeekly();
    }
    public double calculateTotalPayMonthly(){
        return calculateTotalPayWeekly()*4;
    }

    // getters and setters for private var to ensure encapsulation 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setID(int id){
        this.ID = id;
    }
    public int getID(){
        return ID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    public void setPaymentMethod(String s){
        paymentMethod = s;
    }
    public String getPaymentMethod(){
        return paymentMethod;
    }
}