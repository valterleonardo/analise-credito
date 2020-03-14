package leonardo.valter.credito.core.service.dependente;

public interface Dependente {
	public abstract void proximo(Dependente proximaRegra);
	public abstract int processar(Integer dependente);
}
