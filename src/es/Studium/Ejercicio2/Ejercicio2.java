package es.Studium.Ejercicio2;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class Ejercicio2 extends Frame
{
	private static final long serialVersionUID = 1L; 
	Label lblCantidad = new Label("Introduzca la cantidad"); //Etiqueta que queremos poner.
	TextField txtCantidad = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	TextField txtPorcentaje = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	Button Calcular = new Button("Calcular");
	Label lblResultado = new Label("Resultado");
	TextField txtResultado = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	//Creamos el panel
	Panel pnlPanel1 = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();

	public Ejercicio2() 
	{
		// Establecer la distribución con 3 filas y 2 columnas 
		setLayout( new GridLayout( 4,2 ) );
		//añadimos los botones dentro del panel
		pnlPanel1.add(lblCantidad);
		pnlPanel1.add(txtCantidad);
		pnlPanel2.add(lblPorcentaje); 
		pnlPanel2.add(txtPorcentaje); 
		pnlPanel3.add(Calcular); 
		pnlPanel3.add(lblResultado);
		pnlPanel4.add(txtResultado);
		add(pnlPanel1);
		add(pnlPanel2);
		add(pnlPanel3);
		add(pnlPanel4);
		setSize(400,200); 
		setLocationRelativeTo(null); 
		setVisible(true);
	}
	// Fin del Constructor
	public static void main(String[] args) {
		new Ejercicio2(); }
	// Fin del main 
}