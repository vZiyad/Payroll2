import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
public class Test{
    public static void main (String args[]){
        LocalDate firstPaymentDate = LocalDate.of(2020, 1, 1);
        LocalDate lastPaymentDate = LocalDate.of(2023,1,30);
        Employee first = new Employee("Khalid", 40);
        first.addHoursWorkedWeekly(50);
        first.setID(443011904);
        first.calculateRegularPayWeekly();
        first.calculateOvertimePayWeekly();
        first.calculateTotalPayWeekly();
        first.calculateTotalPayMonthly();
        Employee second = new Employee("Abdulmajeed", 80);
        second.addHoursWorkedWeekly(60);
        second.setID(443009208);
        second.calculateRegularPayWeekly();
        second.calculateOvertimePayWeekly();
        second.calculateTotalPayWeekly();
        second.calculateTotalPayMonthly();
        Paycheck paycheck = new Paycheck(first.getName(), first.getID(), firstPaymentDate,first.calculateTotalPayMonthly(),"cash");
        Paycheck paycheck2 = new Paycheck(second.getName(), second.getID(), firstPaymentDate,second.calculateTotalPayMonthly(),"deposit");

        PayrollSystem system = new PayrollSystem();
        system.addEmployee(first);
        system.addEmployee(second);
        system.addPayCheck(paycheck2);
        system.addPayCheck(paycheck);
        System.out.println(system.paychecks.get(0).getEmployeeID());
        System.out.println(system.paychecks.get(0).getEmployeeName());
        System.out.println(system.paychecks.get(0).getPayMethod());
        System.out.println(system.paychecks.get(0).getTotalAmountPaidMonthly());
        System.out.println(system.paychecks.get(0).getPayDate());
        System.out.println("");
        System.out.println(system.paychecks.get(1).getEmployeeID());
        System.out.println(system.paychecks.get(1).getEmployeeName());
        System.out.println(system.paychecks.get(1).getPayMethod());
        System.out.println(system.paychecks.get(1).getTotalAmountPaidMonthly());
        System.out.println(system.paychecks.get(1).getPayDate());
        System.out.println("");
        
        int i =2;
        int j =0;
        double fullAmount=0.0;
        List<LocalDate> listOfDates = firstPaymentDate.datesUntil(lastPaymentDate).collect(Collectors.toList());
        try{
        while (listOfDates.get(j).compareTo(listOfDates.get(j+30))<0){
        system.addPayCheck(paycheck2);
        system.addPayCheck(paycheck);
        i++;
        System.out.println(system.paychecks.get(i).getEmployeeID());
        System.out.println(system.paychecks.get(i).getEmployeeName());
        System.out.println(system.paychecks.get(i).getPayMethod());
        System.out.println(system.paychecks.get(i).getTotalAmountPaidMonthly());
        fullAmount = fullAmount+system.paychecks.get(i).getTotalAmountPaidMonthly()+system.paychecks.get(i).getTotalAmountPaidMonthly();
        System.out.println(listOfDates.get(j));
        System.out.println("");
        j+=30;
    }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("The desired salary period calculation has ended");
        }
        System.out.println("Total Amount of salaries that were paid during this period of time is: "+fullAmount);
}
{
    
}
}
