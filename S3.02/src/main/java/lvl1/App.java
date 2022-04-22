package lvl1;

public class App {

	public static void main(String[] args) {
		
		Borsa borsa= new Borsa();
		Agencia agencia1=new Agencia(borsa);
		Agencia agencia2=new Agencia(borsa);
		
		borsa.setEstado("subido");
		
		System.out.println("----------");
		
		borsa.setEstado("bajado");
		
		//Se imprimirá dos veces ya que se actualiza en las dos agencias creadas
		
		

	}

}
