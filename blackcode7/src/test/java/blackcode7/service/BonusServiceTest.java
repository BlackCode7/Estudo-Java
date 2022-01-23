package blackcode7.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import blackcode7.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveSerZeroParaSalarioMuitoAlto() {		
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Anderson", LocalDate.now(), new BigDecimal("35000")));
		assertEquals(BigDecimal.ZERO, bonus);
	}
	
	@Test
	void deveAcrescentar10porCentoAoSalario() {		
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Simone", LocalDate.now(), new BigDecimal("3500")));
		assertEquals(new BigDecimal("350.0"), bonus);
	}
	
	@Test
	void bonusdeveriaSerDezPorCertoParaSalarioDeExatamente10000() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Mário", LocalDate.now(), new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.0"), bonus);
	}

}
