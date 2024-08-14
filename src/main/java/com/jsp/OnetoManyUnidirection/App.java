package com.jsp.OnetoManyUnidirection;

import java.util.ArrayList;
import java.util.List;

import com.jsp.OnetoManyUnidirection.Dao.CompanyDao;
import com.jsp.OnetoManyUnidirection.dta.Company;
import com.jsp.OnetoManyUnidirection.dta.Employee;

public class App 
{
    public static void main( String[] args )
    {
       Company company=new Company();
       Employee employee=new Employee();
       CompanyDao companyDao=new CompanyDao();
       
       Employee e1=new Employee();
       e1.setName("Omkar");
       e1.setAddress("Bangalore");
       
       Employee e2=new Employee();
       e2.setName("Bruce");
       e2.setAddress("BatCave");
    		   
       List<Employee>list=new ArrayList<Employee>();
       list.add(e1);
       list.add(e2);
       
       company.setCname("TCS");
       company.setList(list);
       companyDao.savecompany(company);
    		   
    }
}
