package leonardo.valter.credito.core.service.idade;

public class IdadePrimeiraRegra implements Idade {

	private Idade proximaRegraIdade;
	
	public void proximo(Idade regra) {
    	proximaRegraIdade = regra; 
    } 

	public int processar(Integer idade) {
    	if (idade > 65)
    		return 2;
    	else 
    		return proximaRegraIdade.processar(idade);
    } 
}