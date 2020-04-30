package pruebas;

import examen.Paciente;

public class PruebaRapida implements PrubeaCovid19{

	private String nombre;
	private int temperatura;
	private int edad;
	
	public PruebaRapida(Paciente paciente) {
		Paciente p = (Paciente)paciente;
		this.nombre = p.getNombre();
		this.temperatura = p.getTemperatura();
		this.edad = p.getEdad();
		}
	
	
	@Override
	public boolean isPositiveCase() {
		if(temperatura >= 37 && edad >= 60) {
			return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() {
		return nombre;
	}

}
