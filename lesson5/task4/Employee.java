package lesson5.task4;

import java.math.BigDecimal;

public class Employee {
    public String getShortDescriptionOfEmployee() {
        return "Employee name : " + name  + surname;
    }
    public String getLongDescriptionOfEmployee() {
        return "Employee details : " + name  + surname + " is " + AGE;
    }
    public BigDecimal getTotalSalary() {
        return base_Salary.add(bonus);
    }
    public BigDecimal getBase_Salary() { return base_Salary;  }
    public BigDecimal getBonus() {
        return bonus;
    }

   public Employee(String name, String surname) {
        this.name = name; this.surname = surname;
    }
    public Employee(String name, String surname, int AGE) 
  {
        this(name, surname);
        this.AGE = AGE;}
  
    private final String name;
  
   
    public Employee(String name, String surname, int age, BigDecimal base_Salary) {
        this(name, surname, age);
        this.base_Salary = base_Salary;
    }
    public Employee(String name, int age, BigDecimal base_Salary, BigDecimal bonus, String surname) {
        this(name, surname, age, base_Salary);
        this.bonus = bonus;
    }
    private final String surname;
              private int AGE;
    private       BigDecimal base_Salary;
    private BigDecimal 
  bonus;
}
   
  
