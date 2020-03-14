package leonardo.valter.credito.core.service.salario;

import java.math.BigDecimal;

import leonardo.valter.credito.core.exceptions.SalarioException;

public class SalarioPrimeiraRegra implements Salario {
	
	private Salario proximaRegraSalario;
	private static final Integer MENOR_OU_IGUAL = 0;
	  
    public void proximo(Salario regra) {
    	proximaRegraSalario = regra; 
    } 
  
    public int processar(BigDecimal salario) {
    	
    	if (salario.compareTo(new BigDecimal(500)) <= MENOR_OU_IGUAL)
    		throw new SalarioException();
    	else 
    		return 0;
    } 
}
