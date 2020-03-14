package leonardo.valter.credito.core.service.sexo;

import org.springframework.stereotype.Service;

@Service
public class SexoService {
	public static Sexo iniciarRegraSexo() {
		Sexo sexoPrimeiraRegra = new SexoPrimeiraRegra();
		Sexo sexoSegundaRegra = new SexoSegundaRegra();
		Sexo sexoTerceiraRegra = new SexoTerceiraRegra();
		sexoPrimeiraRegra.proximo(sexoSegundaRegra);
		sexoSegundaRegra.proximo(sexoTerceiraRegra);
		
		return sexoPrimeiraRegra;
	}
}
