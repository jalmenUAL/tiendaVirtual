package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

public class ProductoAdministrador extends Producto {

	
	
	public ProductoAdministrador()
	{
		
		super();
		this.getAnadirCarrito().setVisible(false);
		
		 
	}
	
	public void inicializar() {
	
		
		
		
		
		
		this.getImagenProducto().setSrc("https://dummyimage.com/600x400/000/fff");
		
		
		
		this.getAnadirOferta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				 
				anadir_oferta();
				
			}
		});
		
		this.getQuitarOferta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				 
				quitar_oferta();
				
			}
		});
	}
	
	public void anadir_oferta() {
		/* accede a la base de datos y añade el producto a las ofertas*/
		
	}
	
	public void quitar_oferta() {
		/* accede a la base de datos y elimina el producto a las ofertas*/
	}
	
	
}
