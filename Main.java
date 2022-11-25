package Customer_and_Address;

import java.util.*;
public class Main{
 public static void main(String[] args) {
 EmployeeDemo demo = new EmployeeDemo();
 Employee emp = new Employee();
 demo.storeData(emp);
 demo.showData(emp);
 }
}
class Employee
{
 String empId;
 String empName;
 Address address;
 void setEmpId(String empId)
 {
 this.empId = empId;
 }
 String getEmpId()
 {
 return empId;
 }
 void setEmpName(String empName)
 {
 this.empName = empName;
 }
 String getEmpName()
 {
 return empName;
 }
 void setAddress(Address address)
 {
 this.address = address;
 }
 Address getAddress()
 {
 return address;
 }
}
class Address
{
 String addr1, addr2, city;
 int pin;
 void setAddr1(String addr1)
 {
 this.addr1 = addr1;
 }
 String getAddr1()
 {
 return addr1;
 }
 void setAddr2(String addr2)
 {
 this.addr2 = addr2;
 }
 String getAddr2()
 {
 return addr2;
 }
 void setCity(String city)
 {
 this.city = city;
 }
 String getCity()
 {
 return city;
 }
 void setPin(int pin)
 {
 this.pin = pin;
 }
 int getPin()
 {
 return pin;
 }
}
class EmployeeDemo
{
 void storeData(Employee emp)
 {
 Address address = new Address();
 Scanner sc = new Scanner(System.in);
 String empId = sc.nextLine();
 String ename = sc.nextLine();
 String addr1 = sc.nextLine();
 String addr2 = sc.nextLine();
 String city = sc.nextLine();
 int pin = sc.nextInt();
 emp.setEmpId(empId);
 emp.setEmpName(ename);
 address.setAddr1(addr1);
 address.setAddr2(addr2);
 address.setCity(city);
 address.setPin(pin);
 emp.setAddress(address);
 }
 void showData(Employee emp)
 {
 System.out.println("Employee Id :"+emp.getEmpId());
 System.out.println("Employee Name :"+emp.getEmpName());
 System.out.println("Address 1 :"+emp.getAddress().getAddr1());
 System.out.println("Address 2 :"+emp.getAddress().getAddr2());
 System.out.println("City :"+emp.getAddress().getCity());
 System.out.println("Pin :"+emp.getAddress().getPin());
 }
}

