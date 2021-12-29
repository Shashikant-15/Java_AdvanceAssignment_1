package Adv_12;


 import java.io.*;
 import java.util.Scanner;
// A public class create as  Employee
public class Employee {
    // variable declared as task required
    int employeeID,employeeAge;
    String employeeName;
    Employee(int empID, String empName,int empAge){
        this.employeeID = empID;
        this.employeeName = empName;
        this.employeeAge = empAge;
    }
    @Override
    public String toString() {
        return " Employee Id = " + employeeID + ",Employee Name = " + employeeName + ",\tAge = " + employeeAge ;
    }

    //    Using static block as per the question requirement
    static {

//        creating two ref of BufferedReader class
        BufferedReader br1,br2;
        FileReader file,file1;
        String line;

//        the l_Number will hold the number of lines in the file
        int l_Number = 0;
        String[] data;
        Employee[] employee = null ;
        Scanner sc =new Scanner(System.in);
        try {
            file1 =new FileReader("src/Adv_12/Employee.txt");

//         this will count the lines in the text file
            br2=new BufferedReader(file1);
            while (br2.readLine()!= null){
                l_Number++;
            }
            br2.close();
            file1.close();


//            Here we will start read the file
            employee = new Employee[l_Number];
            file = new FileReader("src/Adv_12/Employee.txt");
            br1=new BufferedReader(file);


//            here we are getting the data line by line and storing the employee object
//            in the employee[] array after initialization of employee class objects.
            int i =0;
            while ((line = br1.readLine()) != null){
                data = line.split(",");
                employee[i] = new Employee(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
                i++;
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
        int in;
        do {
//                It will print the list of employees
            assert employee != null;
            for (Employee emp: employee) {
                System.out.println(emp);
            }
            System.out.println("\n ______________Enter your choice _____________________\n" +
                    "Edit: Press 1 to Edit\n" +
                    "Exit: Press 2 to Exit");
            in = sc.nextInt();
            if(in == 1){
                Employee[] employees = editEmployee(employee);
//                    Calling updateFile method()
                updateFile(employees);
            }
        }while (in !=2 );
    }

    //    editEmployee will return an array of Employee type after update
    static Employee[] editEmployee(Employee[] employees){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter employee id");
        int employeeID = sc.nextInt();
        for (Employee employee : employees) {
            if (employee.employeeID == employeeID) {
                System.out.println("Enter Name");
                String editName = sc.next();
                System.out.println("Enter Age");
                int editAge = sc.nextInt();
                employee.employeeName = editName;
                employee.employeeAge = editAge;
            }
        }
        return employees;
    }

    //    updateFile method will take an Employee[] type argument and update the data in Employee.txt file
    static void updateFile(Employee[] employees){
        FileWriter writer = null;
        File fileToBeModified = new File("src/Adv_12/Employee.txt");
        StringBuilder newContent = new StringBuilder();
        try {
            for (Employee emp:employees) {
                newContent.append(emp.employeeID).append(",").append(emp.employeeName).append(",").append(emp.employeeAge).append(System.lineSeparator());
            }
            System.out.println(newContent);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent.toString());
            System.out.println("The File is updated successfully");
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                assert writer != null;
                writer.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
    }
}