package leonardo.valter.credito.entity.dict;

public enum LimiteEnum {
	
	SUPERIOR_2000	("Superior a 2000"),
	ENTRE_1500_2000	("Entre 1500 e 2000"),
	ENTRE_1000_1500	("Entre 1000 e 1500"),
	ENTRE_500_1000	("Entre 500 e 1000"),
	ENTRE_100_500	("Entre 100 e 500"),	
	RENDA_BAIXA		("Renda Baixa"),
	REPROVADO		("Reprovado pela política de crédito");
	
	public String valorLimite;
	
	LimiteEnum(String valor){
		valorLimite = valor;
	}
}
