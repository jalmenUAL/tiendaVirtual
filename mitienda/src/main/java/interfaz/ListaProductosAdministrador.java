package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaProductosAdministrador extends ListaProductos {

	
	public ListaProductosAdministrador()
	{
		
super();
		
		this.getMainLayout().getStyle().set("overflow", "auto");
        
   
		 ProductoAdministrador p = new ProductoAdministrador();
		 
		 p.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
	      
		 ProductoAdministrador p2 = new ProductoAdministrador();
		 
		 p2.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 ProductoAdministrador p3 = new ProductoAdministrador();
		 
		 p3.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 ProductoAdministrador p4 = new ProductoAdministrador();
		 
		 p4.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 ProductoAdministrador p5 = new ProductoAdministrador();
		 
		 p5.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		 
		 ProductoAdministrador p6 = new ProductoAdministrador();
		 
		 p6.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 ProductoAdministrador p7 = new ProductoAdministrador();
		 
		 p7.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 this.getContent().add(p);
		 this.getContent().add(p2);
		 this.getContent().add(p3);
		 this.getContent().add(p4);
		 this.getContent().add(p5);
		 this.getContent().add(p6);
		 this.getContent().add(p7);

		
	}
	
	
}
