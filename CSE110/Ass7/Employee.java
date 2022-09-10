public class Employee
{
  public String name;
  public int salary;
  public void increaseSalary (int x)
  {
    this.salary=this.salary+(this.salary*x/100);
  }
}