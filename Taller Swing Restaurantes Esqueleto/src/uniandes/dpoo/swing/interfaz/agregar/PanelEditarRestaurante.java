package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	
    	
    	setLayout(new BorderLayout());
    	
    	txtNombre = new JTextField(16);
    	txtNombre.setHorizontalAlignment(0);
    	JLabel labNombre = new JLabel( "Nombre" );
    	JPanel nom = new JPanel();
    	nom.add(labNombre);
    	nom.add(txtNombre);
    	

    	cbbCalificacion = new JComboBox<String>();
    	cbbCalificacion.addItem("1");
    	cbbCalificacion.addItem("2");
    	cbbCalificacion.addItem("3");
    	cbbCalificacion.addItem("4");
    	cbbCalificacion.addItem("5");
    	JLabel labCalificacion = new JLabel( "Calificacion" );
    	JPanel cal = new JPanel();
    	cal.add(labCalificacion);
    	cal.add(cbbCalificacion);
        


    	
    	cbbVisitado = new JComboBox<String>();
    	cbbVisitado.addItem("Si");
    	cbbVisitado.addItem("No");
    	JLabel labVisitado = new JLabel( "Visitado" );
    	JPanel vis = new JPanel();
    	vis.add(labVisitado);
    	vis.add(cbbVisitado);


    	add(nom, BorderLayout.BEFORE_FIRST_LINE);
    	add(cal, BorderLayout.WEST);
    	add(new JPanel(), BorderLayout.EAST);
    	add(vis, BorderLayout.AFTER_LAST_LINE);
    	

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
    	boolean visitado = false;
    	String vis = ( String )cbbVisitado.getSelectedItem( );
    	if (vis.contentEquals("Si")) {
    		visitado = true;
    	}
        return visitado;
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	String nombre = txtNombre.getText();
        return nombre;
    }
}
