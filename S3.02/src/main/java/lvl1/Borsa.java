package lvl1;

import java.util.*;

public class Borsa {

	private List<Agencia> agencias = new ArrayList<Agencia>();
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
		notificarAgencias();
	}

	public void agregar(Agencia agencia) {
		agencias.add(agencia);
	}
	
	public void notificarAgencias() {
		agencias.forEach(a->a.actualizar());

	}

}
