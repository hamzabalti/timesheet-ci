
package tn.esprit.spring.service;

 
import java.text.ParseException;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartmentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeprtmentServiceImplTest {

		@Autowired
		IDepartmentService ds; 
	
		@Test
		public void testRetrieveAlldepartments() {
			List<Departement> listDepartments = ds.retrieveAlldepartment(); 
			// if there are 7 employes in DB : 
			Assert.assertEquals(2, listDepartments.size());
		} 
		
		
		@Test
		public void testAddDepartment() throws ParseException {
			Departement d = new Departement("Cloud"); 
			Departement departmentAdded = ds.addDepartement(d); 
			Assert.assertEquals(d.getName(), departmentAdded.getName());
		}
	 
		@Test
		public void testModifyDepartment() throws ParseException   {
			Departement d = new Departement(2,"IOT"); 
			Departement DepartmentUpdated  = ds.updateDepartement(d);
			Assert.assertEquals(d.getName(), DepartmentUpdated.getName());
		}
	
		@Test
		public void testRetrieveDepartment() {
			Departement departmentRetrieved = ds.retreieveDepartement("5"); 
			Assert.assertEquals(5, departmentRetrieved.getId());
		}
		
		@Test
		public void testDeleteDepartment() {
		ds.deleteDepartement("4");
			Assert.assertNull(ds.retreieveDepartement("4"));
		
		}
		// 5 tests unitaires  
 
}




