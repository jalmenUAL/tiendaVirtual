package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto")
@JsModule("./src/vista-producto.js")
public class VistaProducto extends PolymerTemplate<VistaProducto.VistaProductoModel> {

    @Id("layoutProducto")
	private Element layoutProducto;
	@Id("imagenProducto")
	private Image imagenProducto;
	@Id("pieProducto")
	private HorizontalLayout pieProducto;
	@Id("anadirCarrito")
	private Button anadirCarrito;
	@Id("anadirOferta")
	private Button anadirOferta;
	@Id("quitarOferta")
	private Button quitarOferta;
	@Id("labelPrecio")
	private Label labelPrecio;
	@Id("labelUnidades")
	private Label labelUnidades;
	@Id("precioProducto")
	private Label precioProducto;
	@Id("cantidadProducto")
	private Label cantidadProducto;

	/**
     * Creates a new VistaProducto.
     */
    public VistaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProducto and vista-producto
     */
    public interface VistaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getLayoutProducto() {
		return layoutProducto;
	}

	public void setLayoutProducto(Element layoutProducto) {
		this.layoutProducto = layoutProducto;
	}

	public Image getImagenProducto() {
		return imagenProducto;
	}

	public void setImagenProducto(Image imagenProducto) {
		this.imagenProducto = imagenProducto;
	}

	public HorizontalLayout getPieProducto() {
		return pieProducto;
	}

	public void setPieProducto(HorizontalLayout pieProducto) {
		this.pieProducto = pieProducto;
	}

	public Button getAnadirCarrito() {
		return anadirCarrito;
	}

	public void setAnadirCarrito(Button anadirCarrito) {
		this.anadirCarrito = anadirCarrito;
	}

	public Button getAnadirOferta() {
		return anadirOferta;
	}

	public void setAnadirOferta(Button anadirOferta) {
		this.anadirOferta = anadirOferta;
	}

	public Button getQuitarOferta() {
		return quitarOferta;
	}

	public void setQuitarOferta(Button quitarOferta) {
		this.quitarOferta = quitarOferta;
	}

	public Label getLabelPrecio() {
		return labelPrecio;
	}

	public void setLabelPrecio(Label labelPrecio) {
		this.labelPrecio = labelPrecio;
	}

	public Label getLabelUnidades() {
		return labelUnidades;
	}

	public void setLabelUnidades(Label labelUnidades) {
		this.labelUnidades = labelUnidades;
	}

	public Label getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Label precioProducto) {
		this.precioProducto = precioProducto;
	}

	public Label getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Label cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
}
