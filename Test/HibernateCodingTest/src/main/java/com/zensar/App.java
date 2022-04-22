package com.zensar;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;


public class App {

	public static void loadTesting() {
		// write code here to load employee object
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		Employee employee=em.find(Employee.class, 101);


		em.close();
		emf.close();

	}

	public static void insertTesting() {
		// write the code here to persist employee object
		Employee employee = new Employee(101, "adity", 2000.00, null, null);



		Address address = new Address("bbsr", "761104",null);
		employee.setAddress(address);

		employee.addSkill(new Skill("java",8));
		employee.addSkill(new Skill("spring",6));

		BankAccount bankAccount=new BankAccount("12GF24");
		employee.setAccount(bankAccount);

		employee.setAddress(address);



		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();

		
	}

	public static void main(String[] args) {
		
		loadTesting();
	}
}
