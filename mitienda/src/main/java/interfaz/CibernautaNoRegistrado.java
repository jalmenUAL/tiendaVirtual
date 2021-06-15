package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


public class CibernautaNoRegistrado extends Cibernauta {

	public CabeceraNoRegistrado ccbn;	
	public ListaProductosNoRegistrado lpnr;
	public Login lg;
	public VerticalLayout layout;
	
	public CibernautaNoRegistrado() {
		
		
	
		 ccbn = new CabeceraNoRegistrado();	
		 lpnr = new ListaProductosNoRegistrado();
		 layout = this.getLayoutCibernauta().as(VerticalLayout.class);
		 layout.addComponentAsFirst(ccbn);
		 layout.add(lpnr);
		 
	
			 
		 
		 lg = new Login();
		 
		 ccbn.getLogin().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				 
				layout.remove(ccbn);	
				layout.remove(lpnr);
				layout.add(lg);
				
			}
		});
		  
		 
	}
	
	
	
}
