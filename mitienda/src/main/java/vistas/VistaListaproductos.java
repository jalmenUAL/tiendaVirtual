package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-listaproductos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listaproductos")
@JsModule("./src/vista-listaproductos.js")
public class VistaListaproductos extends PolymerTemplate<VistaListaproductos.VistaListaproductosModel> {

    @Id("listaProductos")
	private HorizontalLayout listaProductos;

	/**
     * Creates a new VistaListaproductos.
     */
    public VistaListaproductos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListaproductos and vista-listaproductos
     */
    public interface VistaListaproductosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public HorizontalLayout getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(HorizontalLayout listaProductos) {
		this.listaProductos = listaProductos;
	}
}
