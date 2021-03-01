package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class CibernautaNoRegistrado extends Cibernauta {

	public CabeceraNoRegistrado ccbn;	
	public Login lg;
	public VerticalLayout layout;
	
	public CibernautaNoRegistrado() {
		
		 ccbn = new CabeceraNoRegistrado();	
		 layout = this.getLayoutCibernauta().as(VerticalLayout.class);
		 layout.add(ccbn);
		 lg = new Login();
		 
		 ccbn.getLogin().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				 
				layout.remove(ccbn);				
				layout.add(lg);
				
			}
		});
		  
		 
	}
	
	
	
}
