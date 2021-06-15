package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Cibernauta {

	public CabeceraAdministrador ccbn;
	public ListaProductosAdministrador lpa;
	public VerticalLayout layout2;
 
	 
	
	
	
	public Administrador() {
		
		 ccbn = new CabeceraAdministrador();	
		 lpa = new ListaProductosAdministrador();
		 layout2 = this.getLayoutCibernauta().as(VerticalLayout.class);
		 layout2.addComponentAsFirst(ccbn);
		 layout2.add(lpa);
		 
	}
	
}
