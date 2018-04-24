package PersonasManagedBean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.Persona;
import repositorioPersona.RepositorioPersona;

@ManagedBean
@RequestScoped
public class PersonasManagedBeans {
	
	private List<Persona> personas;
	
	public PersonasManagedBeans() {}
	
	@PostConstruct
	public void inicializar() {
		this.personas = RepositorioPersona.consultar("", "", "", null, "");
	}
	
	public List<Persona> getPersonas(){
		return this.personas;
	}
	
	public void eliminarPersona(Persona persona) {
		RepositorioPersona.eliminarPersona(persona.getIdUsuario());
	}
	
	

}
