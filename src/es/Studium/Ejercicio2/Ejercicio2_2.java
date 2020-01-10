package es.Studium.Ejercicio2;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class Ejercicio2_2 extends Frame
{
	private static final long serialVersionUID = 1L; 
	Label lblCantidad = new Label("Introduzca la cantidad"); //Etiqueta que queremos poner.
	TextField txtCantidad = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	TextField txtPorcentaje = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	Button Calcular = new Button("Calcular");
	Label lblResultado = new Label("Resultado");
	TextField txtResultado = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	public Ejercicio2_2() 
	{
		// Establecer la distribución del Frame 
		setLayout(new FlowLayout());
		// Establecer el título de la aplicación 
		setTitle("FlowLayout");
		// Añadir los botones antes creados
		add(lblCantidad);
		add(txtCantidad);
		add(lblPorcentaje);
		add(txtPorcentaje);
		add(Calcular);
		add(lblResultado);
		add(txtResultado);
		setSize(340,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	// Fin del Constructor
	public static void main(String[] args) {
		new Ejercicio2_2(); }
	// Fin del main 
}