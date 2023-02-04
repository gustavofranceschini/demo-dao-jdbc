package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("Testing DepartmentDaoJDBC");
		System.out.println("---------------");		
		System.out.println();
		
		System.out.println("=== TEST 1 --> DepartmentDaoJDBC : findById ===");
		Department dep = department.findById(10);
		System.out.println(dep);
		
		
		
		sc.close();

	}

}
