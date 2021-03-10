package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

public class ProductoAdministrador extends Producto {

	
	
	public ProductoAdministrador()
	{
		
		super();
		this.getAnadirCarrito().setVisible(false);
		this.getImagenProducto().setSrc("https://dummyimage.com/600x400/000/fff");
		
		this.getAnadirOferta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				 
				Notification.show("Elemento Añadido a Ofertas");
				
			}
		});
		
		this.getQuitarOferta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				 
				Notification.show("Elemento Eliminado de Ofertas");
				
			}
		});
		 
	}
	
}
