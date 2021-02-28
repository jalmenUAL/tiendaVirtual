package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCarrito;

public class Carrito extends VistaCarrito {
	

public void anadirProductoCarrio(ProductoCarrito pc) {
	
	this.getVaadinVerticalLayout().as(VerticalLayout.class).add(pc);
}

public void eliminarProductoCarrito(ProductoCarrito pc) {}


}
