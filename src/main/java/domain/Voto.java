package domain;

public class Voto {

	private String name; // This string returns the name of the vote, not the
							// voter
	private Integer edad;
	private String poblacion;

	// Getters and setters

	public String getNombre() {
		return this.name;
	}

	public void setNombre(String n) {
		this.name = n;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer e) {
		this.edad = e;
	}

	public String getPoblacion() {
		return this.poblacion;
	}

	public void setPoblacion(String p) {
		this.poblacion = p;
	}
}