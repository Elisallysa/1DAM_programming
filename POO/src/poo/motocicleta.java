package poo;
public class motocicleta {

	// Propiedades
	private String matricula;
	private String color;
	private String marca;
	private String modelo;
	private String estilo;
	private String modo;
	private String neumaticos;
	private String tipoCombustible;
	private boolean reprogramada;
	private boolean dbkiller;
	private boolean traccionTrasera;
	private int tiempos;
	private int cv;
	private int cc;
	private double deposito;
	private boolean arrancado;
	private int velocidad;

	// Getters y setters
	public String getMatricula() {
		return matricula;
	}

	public String getcolor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getEstilo() {
		return estilo;
	}

	public String getModo() {
		return modo;
	}

	public String getNeumaticos() {
		return neumaticos;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public boolean isReprogramada() {
		return reprogramada;
	}

	public boolean hasDbkiller() {
		return dbkiller;
	}

	public boolean hasTraccionTrasera() {
		return traccionTrasera;
	}

	public int getTiempos() {
		return tiempos;
	}

	public int getCv() {
		return cv;
	}

	public int getCc() {
		return cc;
	}

	public boolean isArrancado() {
		return arrancado;
	}

	public double getVelocidad() {
		return velocidad;
	}

	// Constructores

	public motocicleta(String matricula, String color, String marca, String modelo, String estilo, String modo,
			String neumaticos, String tipoCombustible, int tiempos, int cv, int cc, double deposito) {
		this.matricula = matricula;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.estilo = estilo;
		this.modo = modo;
		this.neumaticos = neumaticos;
		this.tipoCombustible = tipoCombustible;
		this.reprogramada = false;
		this.dbkiller = false;
		this.traccionTrasera = true;
		this.tiempos = tiempos;
		this.cv = cv;
		this.cc = cc;
		this.deposito = 0;
		this.arrancado = false;
		this.velocidad = 0;
	}

	// Métodos

	/**
	 * Pone el estado de la motocicleta a arrancada (true)
	 */
	public void arrancar() {
		this.arrancado = true;
	}

	public void apagar() {
		this.arrancado = false;
	}

	/**
	 * Si la motocicleta está arrancada y tiene mínimo 1 l. de combustible acelera
	 * la velocidad indicada
	 * 
	 * @param velocidad Velocidad a acelerar.
	 */
	public void acelerar(int velocidad) {
		if (this.arrancado && this.deposito > 1) {
			this.velocidad = this.velocidad + velocidad;
			this.deposito = this.deposito - 1;
		} else
			System.out.println("ERROR: arranca el coche primero premoh o métele gasofa");
	}

	public void frenar(int velocidad) {
		if (velocidad > this.velocidad)
			this.velocidad = 0;
		else
			this.velocidad = this.velocidad - velocidad;
	}

	public void repostar(double litros) {
		this.deposito = this.deposito + litros;
	}

	@Override
	public String toString() {
		return "Motocicleta [matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ ", estilo=" + estilo + ", modo=" + modo + ", neumaticos=" + neumaticos + ", tipoCombustible="
				+ tipoCombustible + ", reprogramada=" + reprogramada + ", dbkiller=" + dbkiller + ", traccionTrasera="
				+ traccionTrasera + ", tiempos=" + tiempos + ", cv=" + cv + ", cc=" + cc + ", deposito=" + deposito
				+ ", arrancado=" + arrancado + ", velocidad=" + velocidad + "]";
	}

}
