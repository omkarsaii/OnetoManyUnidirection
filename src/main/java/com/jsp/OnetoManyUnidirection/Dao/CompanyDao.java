package com.jsp.OnetoManyUnidirection.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.OnetoManyUnidirection.dta.Company;
import com.jsp.OnetoManyUnidirection.dta.Employee;

public class CompanyDao {
	
	private Object company;
	
	public EntityManager getEntityManager()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkarr");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void savecompany(Company company)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	
		entityTransaction.begin();
		
		List<Employee>list=company.getList();
		
		for(Employee employee:list)
		{
			entityManager.persist(employee);
		}
		entityManager.persist(company);
		entityTransaction.commit();
	}
	
}
