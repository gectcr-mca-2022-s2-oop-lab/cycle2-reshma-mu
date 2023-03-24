

import java.util.Scanner;

class Employee {
	int eNo, eSalary;
	String eName;

	public Employee(int e_no, String e_name, int e_salary) {
		this.eNo = e_no;
		this.eName = e_name;
		this.eSalary = e_salary;
	}

	public String toString() {
		return "Employee Information\nEmployee No  : " + this.eNo + "\nEmployee Name  : " + this.eName
				+ "\nEmployee salary  : " + this.eSalary;
	}
}

public class EmployeeSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of employee aray: ");
		int len = sc.nextInt();
		Employee obarray[] = new Employee[len];
		int no, salary;
		String name;
		for (int i = 0; i < len; i++) {
			System.out.println("Enter employee " + i + " Information");
			System.out.println("Enter employee No: ");
			no = sc.nextInt();
			System.out.println("enter Employee name: ");
			name = sc.next();
			System.out.println("Enter Employee Salary: ");
			salary = sc.nextInt();
			obarray[i] = new Employee(no, name, salary);
		}
		int flag = 0;
		System.out.println("Enter Employee number to search");
		no = sc.nextInt();
		for (Employee temp : obarray) {
			if (temp.eNo == no) {
				flag = 1;
				System.out.println(temp);
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Searched Employee not found");
		}
		sc.close();
	}

}

