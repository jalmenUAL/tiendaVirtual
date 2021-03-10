package interfaz;

public class ProductoNoRegistrado extends Producto {

	
	public ProductoNoRegistrado()
	{
		super();
		this.getAnadirCarrito().setVisible(false);
		this.getAnadirOferta().setVisible(false);
		this.getQuitarOferta().setVisible(false);
		this.getImagenProducto().setSrc("https://dummyimage.com/600x400/000/fff");
	}
	
	
	
}
