package logica;

import java.util.ArrayList;
import java.util.List;

public class InstitucionDeportiva {
	private String nombre;
	private String descripcion;
	private String url;
	private List<Profesor> profesores = new ArrayList<>();
	private List<ActividadDeportiva> actividades = new ArrayList<>();
	
	//Constructor
	public InstitucionDeportiva (String nombre, String descripcion, String url)
	{
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url = url;
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Profesor> getArrayProfesor() {
		return profesores;
	}

	public void setArrayProfesor(List<Profesor> arrayProfesor) {
		this.profesores = arrayProfesor;
	}

	public List<ActividadDeportiva> getArrayActividadDeportiva() {
		return actividades;
	}

	public void setArrayActividadDeportiva(List<ActividadDeportiva> arrayActividadDeportiva) {
		this.actividades = arrayActividadDeportiva;
	}
	
	public void listarActividades() {
		if(actividades.size() == 0) {
			System.out.println("  ERROR - No existe ninguna actividad");
		} else {
			int contador = 1;
			for(ActividadDeportiva a: actividades) {
				System.out.println("  " + contador + " - " + a.getNombre());
				contador++;
			}
		}
	}
	
	public ActividadDeportiva obtenerActividad(int opt) {
		ActividadDeportiva ad = null;
		if (actividades.size() == 0) {
			return ad;
		} else {
			if (opt > actividades.size()) {
				return ad;
			} else {
				ad = actividades.get(opt - 1);
			}
		}
		return ad;
	}
	
	public ActividadDeportiva buscarActividadDeportiva(String nombreActividad) {
		ActividadDeportiva actividad = null;
		if (actividades.size() == 0) {
			actividad = null;
		} else {
			for(ActividadDeportiva a: actividades) {
				if (a.getNombre().equals(nombreActividad)) {
					actividad = a;
				}
			}
		}
		return actividad;
	}
	
	public void agregarActividadDeportiva(ActividadDeportiva actividad) {
		actividades.add(actividad);
	}

}
