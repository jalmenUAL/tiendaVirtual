package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Cibernauta {

	public CabeceraAdministrador ccbn;
	public VerticalLayout layout;
	 
	
	public Administrador() {
		
		 ccbn = new CabeceraAdministrador();	
		 layout = this.getLayoutCibernauta().as(VerticalLayout.class);
		 layout.add(ccbn);
		  
		 
	}
	
}
