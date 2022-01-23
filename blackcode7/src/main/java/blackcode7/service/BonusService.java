package blackcode7.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import blackcode7.modelo.Funcionario;

public class BonusService {
	public BigDecimal calcularBonus(Funcionario funcionario) {
		/* Pega o salario da classe funcion�rio */
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		/* Regra de neg�cio com casos if/else/else if */
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			valor = BigDecimal.ZERO;
		}
		/* Arredonda a m�dia pra cima */
		return valor;//.setScale(2, RoundingMode.HALF_UP);
	}
}
