package atividade_poo;

public class ClasseCarros extends ClasseAutomotores {
 
	
	public ClasseCarros (String corPar, String marcaPar, String modeloPar, String tipoPar) {
		
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		this.corAt = corPar;
		this.marcaAt = marcaPar;
		this.modeloAt = modeloPar;
		this.tipoAt = tipoPar;
		
	}
}
