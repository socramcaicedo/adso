package nuevoAño;

public class ProyectoResul {

	public String nombre;
	public int importe;
	public ProyectoResul(String nombre, int importe) {
		super();
		this.nombre = nombre;
		this.importe = importe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	
}

