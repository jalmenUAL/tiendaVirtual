package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaProductosNoRegistrado extends ListaProductos {



	public ListaProductosNoRegistrado()
	{
		
		super();
		 ProductoNoRegistrado p = new ProductoNoRegistrado();
		 ProductoNoRegistrado p2 = new ProductoNoRegistrado();
		 ProductoNoRegistrado p3 = new ProductoNoRegistrado();
		 this.getHorizontalLayout().add(p);
		 this.getHorizontalLayout().add(p2);
		 this.getHorizontalLayout().add(p3);


		
	}

}
