package modelo;

import javax.swing.ImageIcon;

public class Jugador {

	
	///ATRIBUTOS
	private Double scoreFinal;
	private String nombre;
	private ImageIcon perfil;
	
	///CONSTRUCTOR
	public Jugador(Double scoreFinal, String nombre, ImageIcon perfil)
	{
		super();
		this.scoreFinal = scoreFinal;
		this.nombre 	= nombre;
		this.perfil 	= perfil;
	}
	
	
	///METODOS
	public Double getScoreFinalDouble() {
		return scoreFinal;
	}
	public void setScoreFinalDouble(Double scoreFinal) {
		this.scoreFinal = scoreFinal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ImageIcon getPerfil() {
		return perfil;
	}
	public void setPerfil(ImageIcon perfil) {
		this.perfil = perfil;
	}

}
