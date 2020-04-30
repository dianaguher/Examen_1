package pruebas;

import examen.Paciente;

public class PruebaPCR implements PrubeaCovid19 {

	private String nombre;
	private int temperatura;
	private boolean vomito;
	
	public PruebaPCR(Paciente paciente) {
		Paciente p = (Paciente)paciente;
		this.nombre = p.getNombre();
		this.temperatura = p.getTemperatura();
		this.vomito = p.getVomito();
		}
	
	@Override
	public boolean isPositiveCase() {
		if( temperatura >= 39 && vomito == true) {
			return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() {
		return nombre;
	}

}
