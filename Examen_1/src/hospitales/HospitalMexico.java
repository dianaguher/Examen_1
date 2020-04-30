package hospitales;

import java.util.ArrayList;

import examen.Paciente;

public class HospitalMexico extends OMS {

	public HospitalMexico() {
		this.pacienteList = new ArrayList<Paciente>();
		}
	
	
	@Override
	protected boolean isGamHospital() {
		return true;
	}

	@Override
	Hospital getNombreHospital() {
		
		return this.getNombreHospital();
	}

}
