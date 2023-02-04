package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Testing DepartmentDaoJDBC");
		System.out.println("---------------");		
		System.out.println();
		
		System.out.println("=== TEST 1 --> DepartmentDaoJDBC : findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== TEST 2 --> DepartmentDaoJDBC : findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println();
		System.out.println("=== TEST 3 --> DepartmentDaoJDBC : insert ===");
		Department newDepartment = new Department(null, "Tecnology");
		departmentDao.insert(newDepartment);
		System.out.println("Completed insert!!");
		System.out.println(newDepartment);
		
		
		
		
		sc.close();

	}

}
