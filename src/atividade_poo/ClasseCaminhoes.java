package atividade_poo;

public class ClasseCaminhoes extends ClasseAutomotores{
	String cargaSuportadaAt;
	
public ClasseCaminhoes (String corPar, String marcaPar, String modeloPar, String tipoPar) {
		
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		this.corAt = corPar;
		this.marcaAt = marcaPar;
		this.modeloAt = modeloPar;
		this.tipoAt = tipoPar;
		
	}

public String getcargaSuportadaAt() {
	return cargaSuportadaAt;
}

public void setcargaSuportadaAt(String cargaSuportadaPar) {
	this.cargaSuportadaAt = cargaSuportadaPar;
}

}
