package modelo;

public class Juego {

	//ATRIBUTOS
	private int turno;
	private int nivel ;
	private Jugador jugador1;
	private Jugador jugador2;
	private String temas;
	
	
	//CONSTRUCTOR
	public Juego(int turno, int nivel, Jugador jugador1, Jugador jugador2){
		super();
		this.turno 		= turno;
		this.nivel 		= nivel;
		this.jugador1 	= jugador1;
		this.jugador2 	= jugador2;
	}
	///METODOS
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public Jugador getJugador1() {
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	
}
