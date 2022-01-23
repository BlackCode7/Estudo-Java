package blackcode7.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import blackcode7.model.Livro;

public class BonusDescontoLivros {
	
	public BigDecimal calcularDesconto(Livro livro) {
		
		BigDecimal valorCompra = livro.getValorCompra().multiply(new BigDecimal("1.6")) ;//getValorCompra().subtract(new BigDecimal("10"));
		
		if(valorCompra.compareTo(new BigDecimal("1000")) > 0) {
			valorCompra = BigDecimal.ZERO;
		}
		
		return valorCompra.setScale(3, RoundingMode.HALF_DOWN);
	}
}
