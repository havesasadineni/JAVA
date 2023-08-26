package test;
import java.util.*;
import maccess.*;

public class DemoArray1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter the number of employees:");
				int n = Integer.parseInt(s.nextLine());
				Employee ob[] = new Employee[n];
				System.out.println("Enter "+n+" Employee details..");
				for(int i=0;i<ob.length;i++)
				{
				System.out.println("***Enter Employee-"+(i+1)+"***");
				ob[i] = new Employee();
				System.out.println("Enter the EmpId:");
				ob[i].id = s.nextLine();
				System.out.println("Enter the EmpName:");
				ob[i].name = s.nextLine();
				System.out.println("Enter the EmpDesg:");
				ob[i].desg = s.nextLine();
				System.out.println("Enter the EmpBSal:");
				ob[i].bSal = Integer.parseInt(s.nextLine());
				ob[i].totSal = ob[i].bSal+(0.93F*ob[i].bSal)+(0.63F*ob[i].bSal);
				}
				System.out.println("====EmployeDetails=====");
				Spliterator<Employee> sp = Arrays.spliterator(ob);
				sp.forEachRemaining((k)->
				{
				System.out.println(k.toString());
				});
				}//end of try
				catch(InputMismatchException ime)
				{
				System.out.println("Enter only integer value..");
				}
				}//end of try with resource
				}
				}
				
