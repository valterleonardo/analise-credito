package leonardo.valter.credito.core.service.limite;

import org.springframework.stereotype.Service;

@Service
public class LimiteService {

	public static Limite iniciarRegraLimite() {
		Limite limitePrimeiraRegra = new LimitePrimeiraRegra();
		Limite limiteSegundaRegra = new LimiteSegundaRegra();
		Limite limiteTerceiraRegra = new LimiteTerceiraRegra();
		Limite limiteQuartaRegra = new LimiteQuartaRegra();
		Limite limiteQuintaRegra = new LimiteQuintaRegra();
		limitePrimeiraRegra.proximo(limiteSegundaRegra);
		limiteSegundaRegra.proximo(limiteTerceiraRegra);
		limiteTerceiraRegra.proximo(limiteQuartaRegra);
		limiteQuartaRegra.proximo(limiteQuintaRegra);
		
		return limitePrimeiraRegra;
	}	
}