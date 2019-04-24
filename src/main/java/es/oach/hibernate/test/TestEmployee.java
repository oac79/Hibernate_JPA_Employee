package es.oach.hibernate.test;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oach.hibernate.model.Employee;

public class TestEmployee {

	private static EntityManager manager;

	private static EntityManagerFactory emf;

	public static void main(String[] args)
		{
			emf = Persistence.createEntityManagerFactory("Persistence");
			manager = emf.createEntityManager();

			Employee employee = new Employee(1L, "Abad", "Oliver", new GregorianCalendar(1979, 2, 26).getTime());
			Employee employee2 = new Employee(2L, "Garcia", "Juan", new GregorianCalendar(2002, 5, 5).getTime());

			manager.getTransaction().begin();

			manager.persist(employee);
			manager.persist(employee2);

			manager.getTransaction().commit();

			printAllEmployees();

		}

	private static void printAllEmployees()
		{
			@SuppressWarnings("unchecked")
			List<Employee> employees = manager.createQuery("FROM Employee").getResultList();
			System.out.println("data base Employee " + employees.size() + " Employees in the system");
			for (Employee employee : employees)
				{
					System.out.println(employee.toString());
				}
		}
}
