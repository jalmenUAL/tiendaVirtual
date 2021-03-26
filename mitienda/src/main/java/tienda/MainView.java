package tienda;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Administrador;
import interfaz.CibernautaNoRegistrado;
import interfaz.CibernautaRegistrado;
import interfaz.ListaProductos;
import interfaz.Login;
import interfaz.Producto;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
	
	CibernautaNoRegistrado cbn = new CibernautaNoRegistrado();
	
    public MainView() {
    	
    	 
    	  //DIAGRAMAS DE SECUENCIA: ARRASTRAR, INTERFAZ (DONDE), FLECHAS, MÉTODOS, PARÁMETROS, RETORNOS
    	  // HERENCIA ENTRE ACTORES
    	 // HERENCIA ENTRE CASOS DE USO
    	 
    	  
    	  //COPIAR Y PEGAR
    	  //MÉTODOS EXTRA
    	  //SCROLLING
    	  //CONSTRUCTORAS DE LAS COMPONENTES GRÁFICAS
    	
    	
    	 add(cbn);
        
         
        
        
         login();
    	
    	 


    	
        

         
        
    }
    
    public void login() {
        
        cbn.lg.getVaadinLoginForm().addLoginListener(e -> {
        	
        	cbn.layout.remove(cbn.lg);
        	cbn.layout.add(cbn.ccbn);
        	
        	
        	
        	
        	
    	    if (e.getUsername().equals("admin")) {
    	    	
    	    	Administrador ad = new Administrador();
    	    	remove(cbn);
    	    	add(ad);
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	ad.ccbn.getSalir().setVisible(true);
    	    	
    	    	ad.ccbn.getSalir().addClickListener(new ComponentEventListener() {
    				@Override
    				public void onComponentEvent(ComponentEvent event) {
    					 
    					cbn.lg = new Login();
    					login();
    					remove(ad);
    					add(cbn);
    					
    				}
    			});
    	    	
    	    	
    	    }
    	    else if (e.getUsername().equals("usuario")) {
    	    	
    	    	
    	    	CibernautaRegistrado cr = new CibernautaRegistrado();
    	    	remove(cbn);
    	    	add(cr);
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	cr.ccbn.getSalir().setVisible(true);
    	    	cr.ccbn.getSalir().addClickListener(new ComponentEventListener() {
    				@Override
    				public void onComponentEvent(ComponentEvent event) {
    					 
    					cbn.lg = new Login();
    					login();
    					remove(cr);
    					add(cbn);
    					
    				}
    			});
    	    	 
    	        
    	    } else {
    	    	Notification.show("Este usuario no esta registrado");
    	    }
    	});
    
    
        
    }

}
