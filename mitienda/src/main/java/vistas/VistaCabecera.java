package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-cabecera template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera")
@JsModule("./src/vista-cabecera.js")
public class VistaCabecera extends PolymerTemplate<VistaCabecera.VistaCabeceraModel> {

     

	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("buscar")
	private Button buscar;
	@Id("busqueda")
	private TextField busqueda;
	@Id("verCarrito")
	private Button verCarrito;
	@Id("login")
	private Button login;
	@Id("salir")
	private Button salir;

	/**
     * Creates a new VistaCabecera.
     */
    public VistaCabecera() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCabecera and vista-cabecera
     */
    public interface VistaCabeceraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getCabecera() {
		return cabecera;
	}

	public void setCabecera(HorizontalLayout cabecera) {
		this.cabecera = cabecera;
	}

	public Button getBuscar() {
		return buscar;
	}

	public void setBuscar(Button buscar) {
		this.buscar = buscar;
	}

	public TextField getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(TextField busqueda) {
		this.busqueda = busqueda;
	}

	public Button getVerCarrito() {
		return verCarrito;
	}

	public void setVerCarrito(Button verCarrito) {
		this.verCarrito = verCarrito;
	}

	public Button getLogin() {
		return login;
	}

	public void setLogin(Button login) {
		this.login = login;
	}

	public Button getSalir() {
		return salir;
	}

	public void setSalir(Button salir) {
		this.salir = salir;
	}
}
