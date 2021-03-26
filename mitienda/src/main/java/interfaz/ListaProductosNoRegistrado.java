package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class ListaProductosNoRegistrado extends ListaProductos {



	public ListaProductosNoRegistrado()
	{
		
		super();
		
		this.getMainLayout().getStyle().set("overflow", "auto");
        
   
		 ProductoNoRegistrado p = new ProductoNoRegistrado();
		 
		 p.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
	      
		 ProductoNoRegistrado p2 = new ProductoNoRegistrado();
		 
		 p2.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 ProductoNoRegistrado p3 = new ProductoNoRegistrado();
		 
		 p3.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 ProductoNoRegistrado p4 = new ProductoNoRegistrado();
		 
		 p4.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 ProductoNoRegistrado p5 = new ProductoNoRegistrado();
		 
		 p5.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		 
		 ProductoNoRegistrado p6 = new ProductoNoRegistrado();
		 
		 p6.getLayoutProducto().as(VerticalLayout.class).setWidth("500px");
		  
		 ProductoNoRegistrado p7 = new ProductoNoRegistrado();
		 
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
