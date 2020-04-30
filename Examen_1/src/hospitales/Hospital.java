package hospitales;

public enum Hospital
{
	Nicoya,Mexico;
	
	private String tipo;
	
	private Hospital (){
		if(tipo == "Nicoya") {
			tipo = "Hospital de Nicoya";
		}else {
			tipo = "Hospital Mexico";
		}
	}

	public String tipoEnum() {
		return tipo;
	}

}