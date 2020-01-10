package es.Studium.Ejercicio2;

/**
 * @author alvaro
 *
 */
import java.awt.*;
public class Ejercicio2_1 extends Frame {
	private static final long serialVersionUID = 1L; public Ejercicio2_1()
	{

		// Crear la distribución
		GridBagLayout gridbag = new GridBagLayout();
		// Crear las restricciones
		GridBagConstraints gbc = new GridBagConstraints();
		// Establecer la distribución 
		setLayout( gridbag );
		// Establecer restricciones
		gbc.gridwidth = GridBagConstraints.RELATIVE; //Relative, indicamos que coja todo lo que pueda
		Label lblCantidad = new Label("Introduzca la cantidad");
		gridbag.setConstraints(lblCantidad,gbc );
		add(lblCantidad);
		gbc.gridwidth = GridBagConstraints.REMAINDER;//Remainder coje solo lo que queda de espacio
		TextField txtCantidad = new TextField(20);
		gridbag.setConstraints(txtCantidad,gbc );
		add(txtCantidad);

		// Establecer restricciones
		gbc.gridwidth = GridBagConstraints.RELATIVE; //Relative, indicamos que coja todo lo que pueda
		Label lblPorcentaje = new Label("Introduzca el porcentaje");
		gridbag.setConstraints(lblPorcentaje,gbc );
		add(lblPorcentaje);
		gbc.gridwidth = GridBagConstraints.REMAINDER;//Remainder coje solo lo que queda de espacio
		TextField txtPorcentaje = new TextField(20);
		gridbag.setConstraints(txtPorcentaje,gbc );
		add(txtPorcentaje);

		// Establecer restricciones
		gbc.gridwidth = GridBagConstraints.RELATIVE; //Relative, indicamos que coja todo lo que pueda
		Button btnCalcular = new Button("Calcular");
		gridbag.setConstraints(btnCalcular,gbc );
		add(btnCalcular);
		gbc.gridwidth = GridBagConstraints.REMAINDER;//Remainder coje solo lo que queda de espacio
		Label lblResultado = new Label("Resultado");
		gridbag.setConstraints(lblResultado,gbc );
		add(lblResultado);
		
		//Establecer restricciones
		gbc.weightx = 0.0;// si ponemos 0 lo ocupa todo
		TextField txtResultado = new TextField(20);
		gridbag.setConstraints(txtResultado,gbc );
		add(txtResultado);

		setSize(400,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	// Fin del constructor
	public static void main(String[] args) {
		new Ejercicio2_1(); }
	// Fin del main 
}
// Fin de la clase