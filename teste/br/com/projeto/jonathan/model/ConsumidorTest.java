package br.com.projeto.jonathan.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class ConsumidorTest {

	Consumidor consumidor;

	@Before
	public void initialize() {
		consumidor = new Consumidor();
	}

	@Test
	public void testeGetIdConsumidorTest() {

		consumidor.setIdConsumidor(1);
		assertEquals(1, consumidor.getIdConsumidor());
	}

}
