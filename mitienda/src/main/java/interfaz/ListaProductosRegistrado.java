package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaProductosRegistrado extends ListaProductos {

	
	public ListaProductosRegistrado()
	{
		 super();
		 ProductoRegistrado p = new ProductoRegistrado();
		 ProductoRegistrado p2 = new ProductoRegistrado();
		 ProductoRegistrado p3 = new ProductoRegistrado();

		 this.getHorizontalLayout().add(p);
		 this.getHorizontalLayout().add(p2);
		 this.getHorizontalLayout().add(p3);
		
	}
	
}
