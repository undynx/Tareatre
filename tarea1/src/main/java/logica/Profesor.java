package logica;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import datatypes.DtClase;
import datatypes.DtProfesor;

@Entity
@Table(name = "Profesor")
public class Profesor extends Usuario {

	@ManyToOne
    private InstitucionDeportiva institucion;
	@Column
    private String descripcionGeneral;
	@Column
    private String biografia;
	@Column
    private String sitioWeb;
	@OneToMany(mappedBy = "profesor")
    private List<Clase> clases = new ArrayList<>();


    //Constructor vacio
    public Profesor() {}

    //Constructor
    public Profesor(String nickname, String nombre, String apellido, String correoElectronico, Date fechaNacimiento, String password,
    		InstitucionDeportiva institucion, String descripcionGeneral, String biografia, String sitioWeb) {
        super(nickname, nombre, apellido, correoElectronico, fechaNacimiento, password);
        this.institucion = institucion;
        this.descripcionGeneral = descripcionGeneral;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
    }

    //Getters & Setters
	public InstitucionDeportiva getInstitucion() {
		return institucion;
	}

	public void setInstitucion(InstitucionDeportiva institucion) {
		this.institucion = institucion;
	}

	public String getNombreInstitucion() {
		return institucion.getNombre();
	}

	public String getDescripcionGeneral() {
		return descripcionGeneral;
	}

	public void setDescripcionGeneral(String descripcionGeneral) {
		this.descripcionGeneral = descripcionGeneral;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public void agregarClase(Clase c) {
		if (!clases.contains(c)) {
	        clases.add(c);
	    }

	}

	public List<Clase> getArrayClases() {
		return clases;
	}
	public List<DtClase> getDtArrayClases() {
		List<DtClase> dtClases = new ArrayList<>();
		for(Clase c : clases) {
			dtClases.add(c.getDtClase());
		}
		return dtClases;
	}

	public Clase buscarClase(String nombre) {
		Clase clase = null;
		if (clases.size() == 0) {
			return clase;
		} else {
			for(Clase c: clases) {
				if (c.getNombreClase().equals(nombre)) {
					clase = c;
				}
			}
		}

		return clase;
	}

	public DtProfesor getDtProfesor() {
		DtClase[] arrClases = new DtClase[900];

		for (int i = 0; i < clases.size(); i++) {
			arrClases[i] = clases.get(i).getDtClase();
		}
		
		Calendar calendarNacimiento = Calendar.getInstance();
		calendarNacimiento.setTime(getFechaNacimiento());
		
		return new DtProfesor(getNickname(), getNombre(), getApellido(), getCorreoElectronico(), calendarNacimiento, getInstitucion().getDtInstitucion(), getDescripcionGeneral(),getBiografia(), getSitioWeb(), arrClases, clases.size());
	}

}
