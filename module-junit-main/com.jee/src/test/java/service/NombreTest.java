package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class NombreTest {

	@Test
	public void test_add_two_positive_integers() {
		
		int result = Nombre.addIntegers(128, 64);
		
		assertEquals(192, result);
	}
	

	@Test
	public void test_division_two_positive_numbers() {
		
		Nombre n1 = new Nombre(9);
		
		Nombre n2 = new Nombre(3);
		
		n1.division(n2);
		
		assertEquals(3, n1.getMonNombre());
		
	}

	@Test
	public void test_division_by_zero() {
		
		
		assertThrows(ArithmeticException.class,
		            new Executable() {
						public void execute() throws Throwable {
							Nombre n1 = new Nombre(9);
							Nombre n2 = new Nombre(0);
							
							n1.division(n2);
						}
					});
	}
	
	@Test
	public void test_division_two_negative_numbers() {
		Nombre n1 = new Nombre(-9);
		Nombre n2 = new Nombre(-3);
		
		assertEquals(3, n1.division(n2).getMonNombre());		
	}
	
	@Test
	public void test_division_positive_and_negative_numbers() {
		Nombre n1 = new Nombre(-9);
		Nombre n2 = new Nombre(3);
		
		assertEquals(-3, n1.division(n2).getMonNombre());		
	}

	@Test
	public void test_power_of_two_positive_numbers() {
		
		Nombre n1 = new Nombre(2);
		Nombre n2 = new Nombre(2);
		
		n1.pow(n2);
		
		assertEquals(4, n1.getMonNombre());
	}
	
	@Test
	public void test_negative_number_power_odd_positive_number_is_negative() {
		
		Nombre n1 = new Nombre(-5);
		Nombre n2 = new Nombre(5);
		
		n1.pow(n2);
		
		assertTrue(n1.getMonNombre() < 0);
	}
	
	
	
	
}
