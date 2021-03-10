package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Cibernauta {

	public CabeceraAdministrador ccbn;
	public ListaProductosAdministrador lpa;
	public VerticalLayout layout;
 
	 
	
	public Administrador() {
		
		 ccbn = new CabeceraAdministrador();	
		 lpa = new ListaProductosAdministrador();
		 layout = this.getLayoutCibernauta().as(VerticalLayout.class);
		 layout.addComponentAsFirst(ccbn);
		 layout.add(lpa);
		 
	}
	
}
