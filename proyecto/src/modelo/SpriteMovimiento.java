package modelo;
/**
 * Es clase abstracta, es un fragmento que sera utilizado por los objetos creados
 * por el juego que tengan la necesidad de mover. Esta clase abstracta tiene la funicion
 * de contener los metodos de movimiento de los objetos.
 * 
 * @author Javier Andres Torres, Maria Camila Lenis, Juan Sebastian Palma
 * @version 1.0
 *
 */
public abstract class SpriteMovimiento extends Sprite implements Movible{
	//atributos
	/**
	 * dx es un int que tiene la funcion de aplicar la velocidad en la que se movera el objeto
	 * en el eje x
	 */
	private int dX;
	/**
	 * dY es un int que la funcion de almacenar la velocidad de movimiento que tendra el objeto
	 * en el eje y
	 */
	private int dY;
	// Constructor
	
	/**
	 * Constructor de la clase SpriteMovimiento, este constructor se encarga de 
	 * enviar los datos del objeto a la clase sprite, la super clase de la cual hereda.<br>
	 * @param x
	 * 			Es un int que contiene la ubicacion del objeto en el eje x
	 * @param y
	 * 			Es un int que contiene la ubicacion del objeto en el eje y
	 * @param imagen
	 * 			Es un String que contiene la ruta de imagen para el objeto
	 */
	public SpriteMovimiento(int x, int y, String imagen) {
		super(x, y, imagen);
	}
	/**
	 * Metodo sobreescrito de la super clase sprite, este metodo se encarga de modificar las velocidades
	 * del objeto en los ejes X y Y.<br>
	 * <b>post:</b> La velocidad del objeto cambia en dX y dY<br>
	 */
	@Override
	public void mover() {
		 setX(getX()+dX);
		 setY(getY()+dY);
	}
	/**
	 * Getter de la velocidad en x.<br>
	 * @return retorna un valor entero de la velocidad velocidad actual del objeto
	 */
	public int getDX() {
		return dX;
	}
	/**
	 * Setter de la velocidad del objeto en el eje x
	 * @param dX Es un valor entero que sera utilizado para reemplazar la velocidad. dX!=null.
	 */
	public void setDX(int dX) {
		this.dX = dX;
	}
	/**
	 * Getter del valor de la velocidad del objeto en el eje Y
	 * @return retorna un valor entero que representa la velocidad del eje y
	 */
	public int getDY() {
		return dY;
	}
	/**
	 * Setter de la velocidad del eje Y
	 * @param dY Este valor entero se utiliza para modificar la velocidad del eje Y. dY!=null.
	 */
	public void setDY(int dY) {
		this.dY = dY;
	}
	
	

}
