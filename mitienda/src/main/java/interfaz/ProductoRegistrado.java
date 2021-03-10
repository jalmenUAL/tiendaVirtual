package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

public class ProductoRegistrado extends Producto {

	
	public ProductoRegistrado()
	{
		super();
		this.getAnadirOferta().setVisible(false);
		this.getQuitarOferta().setVisible(false);
		this.getImagenProducto().setSrc("https://dummyimage.com/600x400/000/fff");
	
	this.getAnadirCarrito().addClickListener(new ComponentEventListener() {
		@Override
		public void onComponentEvent(ComponentEvent event) {
			 
			Notification.show("Elemento Añadido a Carrito");
			
		}
	});
	}
}
