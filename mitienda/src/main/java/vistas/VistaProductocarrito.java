package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-productocarrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productocarrito")
@JsModule("./src/vista-productocarrito.js")
public class VistaProductocarrito extends PolymerTemplate<VistaProductocarrito.VistaProductocarritoModel> {

    @Id("layoutProductoCarrito")
	private HorizontalLayout layoutProductoCarrito;
	@Id("NombreProducto")
	private Label nombreProducto;
	@Id("Cantidad")
	private Label cantidad;
	@Id("Total")
	private Label total;
	@Id("eliminarCarrito")
	private Button eliminarCarrito;
	/**
     * Creates a new VistaProductocarrito.
     */
    public VistaProductocarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductocarrito and vista-productocarrito
     */
    public interface VistaProductocarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getLayoutProductoCarrito() {
		return layoutProductoCarrito;
	}

	public void setLayoutProductoCarrito(HorizontalLayout layoutProductoCarrito) {
		this.layoutProductoCarrito = layoutProductoCarrito;
	}

	public Label getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(Label nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Label getCantidad() {
		return cantidad;
	}

	public void setCantidad(Label cantidad) {
		this.cantidad = cantidad;
	}

	public Label getTotal() {
		return total;
	}

	public void setTotal(Label total) {
		this.total = total;
	}

	public Button getEliminarCarrito() {
		return eliminarCarrito;
	}

	public void setEliminarCarrito(Button eliminarCarrito) {
		this.eliminarCarrito = eliminarCarrito;
	}
}
