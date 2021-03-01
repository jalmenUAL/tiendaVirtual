package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class CibernautaRegistrado extends Cibernauta {

	public CabeceraRegistrado ccbn;
	public Carrito cr;
	public VerticalLayout layout;
	
	public CibernautaRegistrado() {
		
		 ccbn = new CabeceraRegistrado();	
		 layout = this.getLayoutCibernauta().as(VerticalLayout.class);
		 layout.add(ccbn);
		 cr = new Carrito();	
		 
		//TEST
			ProductoCarrito pc = new ProductoCarrito();
			cr.anadirProductoCarrio(pc);
		  
		 
		 ccbn.getVerCarrito().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {		
					layout.add(cr);
					
				}
			});
		 
		 cr.getCerrarCarrito().addClickListener(new ComponentEventListener() {
				@Override
				public void onComponentEvent(ComponentEvent event) {		
					layout.remove(cr);
					
				}
			});
		  
		 
	}
}
