package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

import vistas.VistaProducto;

public class Producto extends VistaProducto {
	
	
public Producto() {
	
	this.getAnadirCarrito().addClickListener(new ComponentEventListener() {
		@Override
		public void onComponentEvent(ComponentEvent event) {
			 
			Notification.show("Elemento Añadido a Carrito");
			
		}
	});
	
	this.getAnadirOferta().addClickListener(new ComponentEventListener() {
		@Override
		public void onComponentEvent(ComponentEvent event) {
			 
			Notification.show("Elemento Añadido a Oferta");
			
		}
	});
	
}

}
