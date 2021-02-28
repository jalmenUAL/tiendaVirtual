package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-carrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-carrito")
@JsModule("./src/vista-carrito.js")
public class VistaCarrito extends PolymerTemplate<VistaCarrito.VistaCarritoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("labelCarrito")
	private Label labelCarrito;
	@Id("cerrarCarrito")
	private Button cerrarCarrito;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	 

	/**
     * Creates a new VistaCarrito.
     */
    public VistaCarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCarrito and vista-carrito
     */
    public interface VistaCarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Label getLabelCarrito() {
		return labelCarrito;
	}

	public void setLabelCarrito(Label labelCarrito) {
		this.labelCarrito = labelCarrito;
	}

	public Button getCerrarCarrito() {
		return cerrarCarrito;
	}

	public void setCerrarCarrito(Button cerrarCarrito) {
		this.cerrarCarrito = cerrarCarrito;
	}
}
