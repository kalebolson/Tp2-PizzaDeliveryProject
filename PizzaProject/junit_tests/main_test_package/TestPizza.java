package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.Pizza;

class TestPizza {

	@Test
	
	public void PizzaTesting() {
		Pizza p = new Pizza ("sausage", "small");
		assertEquals("sausage", p.getPizzaType());
		assertEquals("small", p.getPizzaSize());
	}
	


}