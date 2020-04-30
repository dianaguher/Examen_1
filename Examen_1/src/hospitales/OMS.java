package hospitales;
import java.util.ArrayList;
import java.util.List;
import pruebas.PrubeaCovid19;
import pruebas.PruebaPCR;
import pruebas.PruebaRapida;
import examen.Paciente;


public abstract class OMS {
	
    List<Paciente> pacienteList;
	List<PrubeaCovid19> resultadoList;
	
	
	public OMS() {
		this.pacienteList = new ArrayList<Paciente>();
		this.resultadoList = new ArrayList<PrubeaCovid19>();
	}
	
	protected abstract boolean isGamHospital();
	abstract Hospital getNombreHospital();
	
	private void diagnosticar() {
		if(isGamHospital()) {
			for(Paciente pl:pacienteList ) {
				PruebaRapida pr = new PruebaRapida(pl); 
				System.out.println("Prueba Rapida: "+pr.isPositiveCase());
			}
		}else {
			for(Paciente pl:pacienteList ) {
				PruebaPCR pcr = new PruebaPCR(pl); 
				System.out.println("PruebaPCR: "+pcr.isPositiveCase());
			}
			
		}
	}
}
