package lvl1;

public class Agencia extends AgentBorsa{
	
	
	public Agencia(Borsa borsa) {
		this.borsa=borsa;
		this.borsa.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("La bolsa ha "+borsa.getEstado());
		
	}
	
	

}
