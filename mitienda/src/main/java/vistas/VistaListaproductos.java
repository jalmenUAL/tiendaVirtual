package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.menubar.MenuBar;

/**
 * A Designer generated component for the vista-listaproductos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listaproductos")
@JsModule("./src/vista-listaproductos.js")
public class VistaListaproductos extends PolymerTemplate<VistaListaproductos.VistaListaproductosModel> {

     
	 
	 
	@Id("MainLayout")
	private HorizontalLayout mainLayout;
	@Id("Content")
	private HorizontalLayout content;
	 
	 

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

	public HorizontalLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(HorizontalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public HorizontalLayout getContent() {
		return content;
	}

	public void setContent(HorizontalLayout content) {
		this.content = content;
	}

	 

	 
	 

	 
}
