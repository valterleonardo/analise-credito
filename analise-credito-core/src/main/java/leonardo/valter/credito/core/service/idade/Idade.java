package leonardo.valter.credito.core.service.idade;

public interface Idade {
	public abstract void proximo(Idade proximaRegra);
	public abstract int processar(Integer idade);
}
