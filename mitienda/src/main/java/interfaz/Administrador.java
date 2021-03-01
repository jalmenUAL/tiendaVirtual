package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Administrador extends Cibernauta {

	public CabeceraAdministrador ccbn;
	 
	 
	
	public Administrador() {
		
		 ccbn = new CabeceraAdministrador();	
		 this.getLayoutCibernauta().as(VerticalLayout.class).add(ccbn);
		  
		 
	}
	
}
