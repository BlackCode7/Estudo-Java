package service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import blackcode7.model.Livro;
import blackcode7.service.BonusDescontoLivros;

public class DescontoLivroTeste {
	
	@Test
	public void descontoEmLivrosAcimaDe1000() {
		BonusDescontoLivros service = new BonusDescontoLivros();
		BigDecimal desconto = service
				.calcularDesconto(new Livro("Livro_1", LocalDate.now(), new BigDecimal("600.000")));
		
		assertEquals(new BigDecimal("960.000"), desconto);
		//assertEquals(new BigDecimal("600.000"), desconto);
		//assertEquals(Integer, desconto);
	}

}
