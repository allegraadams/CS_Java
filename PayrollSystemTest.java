// PayrollSystemTest.java

// Employee hierarchy test program.
import java.
import javax.swing.JOptionPane;


public class PayrollSystemTest

{

   public static void main( String args[] )

   {
           // create four-element Employee array

      Employee employees[] = new Employee[ 5 ];
 
      for(int count = 1; count <= 5; count++)
   {

     String empTypeString;
     int empType;
     empTypeString=JOptionPane.showInputDialog(null,"Enter Employee Type: \n (0-Salaried; 1-Hourly; 2-Commisioned; 3-BasePlus)","Employee Type",JOptionPane.QUESTION_MESSAGE);
     empType = Integer.parseInt(empTypeString);
    switch(empType)
   {

  case 0: 
     String firstName;
     firstName=JOptionPane.showInputDialog(null,"Enter First Name:  ","First Name",JOptionPane.QUESTION_MESSAGE);
     
     String lastName;
     lastName=JOptionPane.showInputDialog(null,"Enter Last Name:  ","Last Name",JOptionPane.QUESTION_MESSAGE);
     
     String monthString;
     int month;
     monthString=JOptionPane.showInputDialog(null,"Enter Date of Birth (MONTH):  ","Month",JOptionPane.QUESTION_MESSAGE);
     month=Integer.parseInt(monthString);
     
     String dayString;
     int day;
     dayString=JOptionPane.showInputDialog(null,"Enter Date of Birth (DAY):  ","Day",JOptionPane.QUESTION_MESSAGE);
     day=Integer.parseInt(dayString);
     
     String yearString;
     int year;
     yearString=JOptionPane.showInputDialog(null,"Enter Date of Birth (YEAR):  ","Year",JOptionPane.QUESTION_MESSAGE);
     year=Integer.parseInt(yearString);
     
     Date birthDate;
     birthDate=new Date(month, day, year);
     
     String socialSecurityNumber;
     socialSecurityNumber=JOptionPane.showInputDialog(null,"Enter Social Security Number:  ","Social Security Number",JOptionPane.QUESTION_MESSAGE);
      
     String salaryString;
     double salary;
     salaryString=JOptionPane.showInputDialog(null,"Enter Weekly Salary:  ","Salary",JOptionPane.QUESTION_MESSAGE);
     salary=Double.parseDouble(salaryString);
               break;
    case 1:
  
     firstName=JOptionPane.showInputDialog(null,"Enter First Name:  ","First Name",JOptionPane.QUESTION_MESSAGE);
     
     lastName=JOptionPane.showInputDialog(null,"Enter Last Name:  ","Last Name",JOptionPane.QUESTION_MESSAGE);
  
     monthString=JOptionPane.showInputDialog(null,"Enter Date of Birth (MONTH):  ","Month",JOptionPane.QUESTION_MESSAGE);
     month=Integer.parseInt(monthString);
   
     dayString=JOptionPane.showInputDialog(null,"Enter Date of Birth (DAY):  ","Day",JOptionPane.QUESTION_MESSAGE);
     day=Integer.parseInt(dayString);
     
    
     yearString=JOptionPane.showInputDialog(null,"Enter Date of Birth (YEAR):  ","Year",JOptionPane.QUESTION_MESSAGE);
     year=Integer.parseInt(yearString);
     
    
     birthDate=new Date(month, day, year);
     
 
     socialSecurityNumber=JOptionPane.showInputDialog(null,"Enter Social Security Number:  ","Social Security Number", JOptionPane.QUESTION_MESSAGE);

     String wageString;
     double wage;
     wageString=JOptionPane.showInputDialog(null,"Enter Hourly Wage:  ","Wage",JOptionPane.QUESTION_MESSAGE);
     wage=Double.parseDouble(wageString);
     
     String hoursString;
     int hours;
     hoursString=JOptionPane.showInputDialog(null,"Enter Weekly Hours:  ","Hours",JOptionPane.QUESTION_MESSAGE); 
     hours=Integer.parseInt(hoursString);
               break;
   case 2:
    
     firstName=JOptionPane.showInputDialog(null,"Enter First Name:  ","First Name",JOptionPane.QUESTION_MESSAGE);
     

     lastName=JOptionPane.showInputDialog(null,"Enter Last Name:  ","Last Name",JOptionPane.QUESTION_MESSAGE);

     monthString=JOptionPane.showInputDialog(null,"Enter Date of Birth (MONTH):  ","Month",JOptionPane.QUESTION_MESSAGE);
     month=Integer.parseInt(monthString);
     
     dayString=JOptionPane.showInputDialog(null,"Enter Date of Birth (DAY):  ","Day",JOptionPane.QUESTION_MESSAGE);
     day=Integer.parseInt(dayString);

     yearString=JOptionPane.showInputDialog(null,"Enter Date of Birth (YEAR):  ","Year",JOptionPane.QUESTION_MESSAGE);
     year=Integer.parseInt(yearString);
 
     birthDate=new Date(month, day, year);
     
     socialSecurityNumber=JOptionPane.showInputDialog(null,"Enter Social Security Number:  ","Social Security Number", JOptionPane.QUESTION_MESSAGE); 
     
     String salesString;
     Double sales;
     salesString=JOptionPane.showInputDialog(null,"Enter Weekly Sales:  ", "Gross Sales", JOptionPane.QUESTION_MESSAGE);
     sales=Double.parseDouble(salesString);
     
     String rateString;
     Double rate;
     rateString=JOptionPane.showInputDialog(null,"Enter Commission Percentage:  ", "Commision Rate", JOptionPane.QUESTION_MESSAGE);
     rate=Double.parseDouble(rateString);
               break;
  
  case 3:
   
     firstName=JOptionPane.showInputDialog(null,"Enter First Name:  ","First Name",JOptionPane.QUESTION_MESSAGE);
  
     lastName=JOptionPane.showInputDialog(null,"Enter Last Name:  ","Last Name",JOptionPane.QUESTION_MESSAGE);

     monthString=JOptionPane.showInputDialog(null,"Enter Date of Birth (MONTH):  ","Month",JOptionPane.QUESTION_MESSAGE);
     month=Integer.parseInt(monthString);

     dayString=JOptionPane.showInputDialog(null,"Enter Date of Birth (DAY):  ","Day",JOptionPane.QUESTION_MESSAGE);
     day=Integer.parseInt(dayString);

     yearString=JOptionPane.showInputDialog(null,"Enter Date of Birth (YEAR):  ","Year",JOptionPane.QUESTION_MESSAGE);
     year=Integer.parseInt(yearString);

     birthDate=new Date(month, day, year);

     socialSecurityNumber=JOptionPane.showInputDialog(null,"Enter Social Security Number:  ","Social Security Number", JOptionPane.QUESTION_MESSAGE);

     salesString=JOptionPane.showInputDialog(null,"Enter Weekly Sales:  ", "Gross Sales", JOptionPane.QUESTION_MESSAGE);
     sales=Double.parseDouble(salesString);

     rateString=JOptionPane.showInputDialog(null,"Enter Commission Percentage:  ", "Commision Rate", JOptionPane.QUESTION_MESSAGE);
     rate=Double.parseDouble(rateString);

     salaryString=JOptionPane.showInputDialog(null,"Enter Weekly Salary:  ","Salary",JOptionPane.QUESTION_MESSAGE);
     salary=Double.parseDouble(salaryString);
            break;     
     }
     }
      // create subclass objects
 String first = "";
 String last = "";
 String ssn = "";
 Date bday=null;
 double salary=0;
 double wage=0;
 int hours=0;
 double sales=0;
 double rate=0;

 
      SalariedEmployee salariedEmployee =

         new SalariedEmployee(first, last, ssn, bday, salary );

      HourlyEmployee hourlyEmployee =

         new HourlyEmployee(first, last, ssn, bday, wage, hours );

      CommissionEmployee commissionEmployee =

         new CommissionEmployee(first, last, ssn, bday, sales, rate );

      BasePlusCommissionEmployee basePlusCommissionEmployee =

         new BasePlusCommissionEmployee(first, last, ssn, bday, sales, rate, salary );

 


      // initialize array with Employees

      employees[ 0 ] = salariedEmployee;

      employees[ 1 ] = hourlyEmployee;

      employees[ 2 ] = commissionEmployee;

      employees[ 3 ] = basePlusCommissionEmployee;

 

      System.out.println( "Employees processed polymorphically:\n" );

     

      // generically process each element in array employees

      for ( Employee currentEmployee : employees )

      {

         System.out.println( currentEmployee ); // invokes toString
         
           int currentMonth= currentEmployee.getBirthDate().getmonth();
           if (currentMonth == 11) {
               if (currentEmployee instanceof SalariedEmployee) {
                   SalariedEmployee employee = (SalariedEmployee) currentEmployee;
                   double oldSalary = employee.getWeeklySalary();
                   employee.setWeeklySalary(4 * oldSalary + 100);
                   System.out
                           .printf("$100 bonus if birthday is in current month: $%,.2f\n",
                                   employee.getWeeklySalary());
               }
      }

         // determine whether element is a BasePlusCommissionEmployee

         if ( currentEmployee instanceof BasePlusCommissionEmployee )

         {

            // downcast Employee reference to

            // BasePlusCommissionEmployee reference

            BasePlusCommissionEmployee employee =

               ( BasePlusCommissionEmployee ) currentEmployee;

 

            double oldBaseSalary = employee.getBaseSalary();

            employee.setBaseSalary( 1.10 * oldBaseSalary );

            System.out.printf(

               "new base salary with 10%% increase is: $%,.2f\n",

               employee.getBaseSalary() );

         } // end if

 

         System.out.printf(

            "earned $%,.2f\n\n", currentEmployee.earnings() );

      } // end for

 

      // get type name of each object in employees array

      for ( int j = 0; j < employees.length; j++ )

         System.out.printf( "Employee %d is a %s\n", j,

            employees[ j ].getClass().getName() );

   } // end main

} // end class PayrollSystemTest


