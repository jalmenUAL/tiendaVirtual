package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaProductosAdministrador extends ListaProductos {

	
	public ListaProductosAdministrador()
	{
		
		super();
		 ProductoAdministrador p = new ProductoAdministrador();
		 ProductoAdministrador p2 = new ProductoAdministrador();
		 ProductoAdministrador p3 = new ProductoAdministrador();

		 this.getHorizontalLayout().add(p);
		 this.getHorizontalLayout().add(p2);
		 this.getHorizontalLayout().add(p3);

		
	}
	
	
}
