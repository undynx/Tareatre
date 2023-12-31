package controladores;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import datatypes.DtClase;
import datatypes.DtProfesor;
import datatypes.DtSocio;
import datatypes.DtUsuario;
import excepciones.NicknameRepetidoException;
import interfaces.IUsuario;
import logica.InstitucionDeportiva;
import logica.Profesor;
import logica.Socio;
import logica.Usuario;
import persistencia.Conexion;

public class CUsuario implements IUsuario {
	Conexion conexion = Conexion.getInstancia();
	EntityManager em = conexion.getEntityManager();

	private static CUsuario instancia = null;

	public static CUsuario getInstancia() {
		if (instancia == null)
			instancia = new CUsuario();
		return instancia;
	}


	@Override
	public void altaUsuario(String nickname, String nombre, String apellido, String correoElectronico, Date fechaNacimiento, InstitucionDeportiva institucion, String descripcionGeneral, String biografia, String sitioWeb)throws NicknameRepetidoException{

		boolean existeProfe = existeUsuario(nickname);
		if(existeProfe) {
			throw new NicknameRepetidoException("Ya existe un usuario con ese nickname");
		}else {
			Usuario profe = new Profesor(nickname, nombre, apellido, correoElectronico, fechaNacimiento, nickname, institucion, descripcionGeneral, biografia, sitioWeb);
			em.getTransaction().begin();
			em.persist(profe);
			em.getTransaction().commit();
		}


	}

	@Override
	public void altaUsuario(String nickname, String nombre, String apellido, String correoElectronico, Date fechaNacimiento)throws NicknameRepetidoException {
		boolean existeSocio = existeUsuario(nickname);
		if(existeSocio) {
			throw new NicknameRepetidoException("Ya existe un usuario con ese nickname");
		}else {
			Usuario socio = new Socio(nickname, nombre, apellido, correoElectronico, fechaNacimiento, nickname);
			em.getTransaction().begin();
			em.persist(socio);
			em.getTransaction().commit();
		}
	}

	@Override
	public boolean existeUsuario(String nombre) {
		Socio socio = em.find(Socio.class, nombre);
		if(socio != null)
			return true;
		else {
			Profesor profesor = em.find(Profesor.class, nombre);
			if(profesor != null)
				return true;
			else
				return false;
		}
	}

	@Override
	public boolean esSocio(String nickname) {
		Socio usuario = em.find(Socio.class, nickname);
		if(usuario == null)
			return false;
		 else
			return true;
	}

	@Override
	public boolean esProfesor(String nombre) {
		Profesor profesor = em.find(Profesor.class, nombre);
		if(profesor == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<DtUsuario> getUsuarios() {
		List<DtUsuario> dtUsuarios = new ArrayList<>();
		String consultaProfes = "SELECT p FROM Profesor p";
		TypedQuery<Profesor> queryProfes = em.createQuery(consultaProfes, Profesor.class);
		List <Profesor> profesores = queryProfes.getResultList();
		for(Profesor u: profesores) {
			Calendar fecha = Calendar.getInstance();
			fecha.setTime(u.getFechaNacimiento());
			DtUsuario dtP = new DtUsuario(u.getNickname(), u.getNombre(), u.getApellido(), u.getCorreoElectronico(), fecha);
			dtUsuarios.add(dtP);
		}
		String consultaSocios = "SELECT s FROM Socio s";
		TypedQuery<Socio> querySocios = em.createQuery(consultaSocios, Socio.class);
		List <Socio> socios = querySocios.getResultList();
		for(Socio u: socios) {
			Calendar fecha = Calendar.getInstance();
			fecha.setTime(u.getFechaNacimiento());
			DtUsuario dtS = new DtUsuario(u.getNickname(), u.getNombre(), u.getApellido(), u.getCorreoElectronico(), fecha);
			dtUsuarios.add(dtS);
		}

		return dtUsuarios;
	}

	@Override
	public void modificarNombre(String nickname, String nuevoNombre) {
		Usuario user = buscarUsuario(nickname);
		em.getTransaction().begin();
		user.setNombre(nuevoNombre);
		em.merge(user);
		em.getTransaction().commit();
	}

	@Override
	public void modificarApellido(String nickname, String nuevoApellido) {
		Usuario user = buscarUsuario(nickname);
		em.getTransaction().begin();
		user.setApellido(nuevoApellido);
		em.merge(user);
		em.getTransaction().commit();
	}

	@Override
	public void modificarFechaNacimiento(String nickname, Date nuevaFecha) {
		Usuario user = buscarUsuario(nickname);
		em.getTransaction().begin();
		user.setFechaNacimiento(nuevaFecha);
		em.merge(user);
		em.getTransaction().commit();
	}

	@Override
	public Usuario buscarSocio(String nickname) {
		Usuario socio = em.find(Socio.class, nickname);
			return socio;
	}

	@Override
	public boolean existenUsuarios() {
		List<String> nicknames = new ArrayList<>();
		String consultaProfes = "SELECT p FROM Profesor p";
		TypedQuery<Profesor> queryProfes = em.createQuery(consultaProfes, Profesor.class);
		List <Profesor> profesores = queryProfes.getResultList();

		String consultaSocios = "SELECT s FROM Socio s";
		TypedQuery<Socio> querySocios = em.createQuery(consultaSocios, Socio.class);
		List <Socio> socios = querySocios.getResultList();
		if(profesores.size() == 0 && socios.size() == 0)
			return false;
		else
			return true;
	}

	@Override
	public List<String> obtenerArrayNicknames() {
		List<String> nicknames = new ArrayList<>();
		String consultaProfes = "SELECT p FROM Profesor p";
		TypedQuery<Profesor> queryProfes = em.createQuery(consultaProfes, Profesor.class);
		List <Profesor> profesores = queryProfes.getResultList();
		for(Profesor u: profesores) {
			nicknames.add(u.getNickname());
		}
		String consultaSocios = "SELECT s FROM Socio s";
		TypedQuery<Socio> querySocios = em.createQuery(consultaSocios, Socio.class);
		List <Socio> socios = querySocios.getResultList();
		for(Socio u: socios) {
			nicknames.add(u.getNickname());
		}
		return nicknames;
	}
	@Override
	public Usuario buscarUsuario(String nickname) {
		Profesor p = em.find(Profesor.class, nickname);
		if (p != null)
			return p;
		else {
			Socio s = em.find(Socio.class, nickname);
			if(s !=null)
				return s;
			else
				return null;
		}
	}
	@Override
	public DtUsuario getDtUsuario(String nickname) {
		Usuario user = buscarUsuario(nickname);
		Calendar fecha = Calendar.getInstance();
		fecha.setTime(user.getFechaNacimiento());
		return new DtUsuario(user.getNickname(), user.getNombre(), user.getApellido(), user.getCorreoElectronico(), fecha);
	}

	@Override
	public DtSocio getDtSocio(String nickname) {
		Socio socio = em.find(Socio.class, nickname);
		return socio.getDtSocio();
	}

	@Override
	public DtProfesor getDtProfesor(String nickname) {
		Usuario user = buscarUsuario(nickname);

		Profesor profesor = (Profesor) user;

		return profesor.getDtProfesor();
	}

	@Override
	public List<DtProfesor> getListaProfesores() {
		List<DtProfesor> dtProfesores = new ArrayList<>();

		String consultaProfes = "SELECT p FROM Profesor p";
		TypedQuery<Profesor> queryProfes = em.createQuery(consultaProfes, Profesor.class);
		List <Profesor> profesores = queryProfes.getResultList();
		for (Profesor p : profesores) {
			Calendar fecha = Calendar.getInstance();
			fecha.setTime(p.getFechaNacimiento());
			
			List<DtClase> listDtC = p.getDtArrayClases();
			DtClase[] arrDtClases = new DtClase[listDtC.size()];
			int i = 0;
			for(DtClase dtC : listDtC) {
				arrDtClases[i] = dtC;
			}
			DtProfesor dtP = new DtProfesor(p.getNickname(), p.getNombre(), p.getApellido(), p.getCorreoElectronico(), fecha, p.getInstitucion().getDtInstitucion(), p.getDescripcionGeneral(), p.getBiografia(), p.getSitioWeb(), arrDtClases, listDtC.size());
			dtProfesores.add(dtP);
		}
		return dtProfesores;
	}

	@Override
	public boolean esContrasena(String nickname, String password) {
		Usuario user = buscarUsuario(nickname);

		if(user.getPassword().equals(password)) {
			return true;
		}

		return false;
	}

}
