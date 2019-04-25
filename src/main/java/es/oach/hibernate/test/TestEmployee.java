package es.oach.hibernate.test;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oach.hibernate.model.Address;
import es.oach.hibernate.model.Employee;

public class TestEmployee {

	private static EntityManager manager;

	private static EntityManagerFactory emf;

	public static void main(String[] args)
		{
			emf = Persistence.createEntityManagerFactory("Persistence");
			manager = emf.createEntityManager();

			Address address = new Address(5L, "Pintor Fortuny", "Molins de Rei", "Catalonia");
			Employee employee = new Employee(1L, "Abad", "Oliver", LocalDate.of(1979, 2, 6), address);
			Employee employee2 = new Employee(2L, "Garcia", "Juan", LocalDate.of(2002, 5, 5), address);

			manager.getTransaction().begin();

			manager.persist(employee);
			manager.persist(employee2);

			manager.getTransaction().commit();

			printAllEmployees();

			manager.close();

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
			manager.close();
		}
}
