import java.time.LocalDate;
public class Paycheck {
    private String employeeName;
    private int employeeID;
    private LocalDate payDate;
    private double totalAmountPaidMonthly;
    private String payMethod; 

    // Constructor to initialize Paycheck object
    public Paycheck(String employeeName, int employeeID,
                    LocalDate payDate, double totalAmountPaidMonthly, String payMethod) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.payDate=payDate;
        this.totalAmountPaidMonthly = totalAmountPaidMonthly;
        this.payMethod = payMethod;
    }
    public String getPayMethod(){
        return payMethod;
    }

    // Getters and setters for private fields
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setPayDate(LocalDate pay) {
        this.payDate = pay;
    }
    public LocalDate getPayDate(){
        return payDate;
    }

    public double getTotalAmountPaidMonthly() {
        return this.totalAmountPaidMonthly;
    }

}