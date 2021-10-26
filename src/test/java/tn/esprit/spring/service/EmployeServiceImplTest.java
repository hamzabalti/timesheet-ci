
package tn.esprit.spring.service;

 
import java.text.ParseException;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {

		@Autowired
		IEmployeService es; 
	
		/*@Test
		public void testRetrieveAllEmploye() {
			List<Employe> listEmployes = es.retrieveAllEmploye(); 
			// if there are 7 employes in DB : 
			Assert.assertEquals(8, listEmployes.size());
		}*/
		
		
		@Test
		public void testAddEmploye() throws ParseException {
			Employe e = new Employe("ut", "balti", "baltihamza6@gmail.com", "12345", true, Role.ADMINISTRATEUR); 
			Employe employeAdded = es.addEmploye(e); 
			Assert.assertEquals(e.getNom(), employeAdded.getNom());
		}
	 
		/*@Test
		public void testModifyEmploye() throws ParseException   {
			Employe e = new Employe(19,"vvn", "ppppp", "baltihamza6@gmail.com", "12345", true, Role.ADMINISTRATEUR); 
			Employe employeUpdated  = es.updateEmploye(e);
			Assert.assertEquals(e.getNom(), employeUpdated.getNom());
		}
	
		@Test
		public void testRetrieveUser() {
			Employe employeRetrieved = es.retrieveEmploye("9"); 
			Assert.assertEquals(9, employeRetrieved.getId());
		}
		
		@Test
		public void testDeleteUser() {
			es.deleteEmploye("26");
			Assert.assertNull(es.retrieveEmploye("26"));
		
		}*/
		// 5 tests unitaires  
 
}





