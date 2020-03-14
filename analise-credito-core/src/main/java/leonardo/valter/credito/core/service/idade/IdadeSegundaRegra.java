package leonardo.valter.credito.core.service.idade;

public class IdadeSegundaRegra implements Idade {

	private Idade proximaRegraIdade;
	
	public void proximo(Idade regra) {
    	proximaRegraIdade = regra; 
    } 

	public int processar(Integer idade) {
		if(idade > 18 && idade < 60)
			return 0;
		else
			return 1;
	}

}
