public class SalariedEmployee {
    private String First_Name;
    private String Last_Name;
    private String Hire_Date;
    private double Salary;
    public SalariedEmployee(String first_Name,String last_Name,String hire_Date,double salary)
    {
        setFirst_Name(first_Name);
        setLast_Name(last_Name);
        setHire_Date(hire_Date);
        setSalary(salary);
    }
    public String get_First_Name()
    {
        return First_Name;
    }
    public String get_Last_Name()
    {
        return Last_Name;
    }
    public String get_Hire_Date()
    {
        return Hire_Date;
    }
    public double get_Salary()
    {
        return Salary;
    }
    public void setFirst_Name(String firstName)
    {
        First_Name=firstName;
    }
    public void setLast_Name(String lastName)
    {
        Last_Name=lastName;
    }
    public void setHire_Date(String hireDate)
    {
        Hire_Date=hireDate;
    }
    public void setSalary(double salary)
    {
        Salary=salary;
    }
}
