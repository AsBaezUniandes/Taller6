package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;
    
    

    public VentanaAgregarRestaurante( VentanaPrincipal principal )
    {
        this.ventanaPrincipal = principal;
        setLayout( new BorderLayout( ) );

        
        panelMapa = new PanelMapaAgregar();
        panelBotones = new PanelBotonesAgregar(this);
        
        
        panelDetalles = new PanelEditarRestaurante();
        
        
        add(panelMapa,  BorderLayout.CENTER );
        
        
       
        JPanel southPanel = new JPanel();
        southPanel.setLayout( new BorderLayout( ) );
        southPanel.add(panelDetalles,  BorderLayout.WEST );
        
        southPanel.add(panelBotones,  BorderLayout.SOUTH );

        add(southPanel,  BorderLayout.SOUTH);
        pack( );
        
        setLocationRelativeTo( null );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setResizable( false );
    }

    /**
     * Le pide al panelDetalles los datos del nuevo restaurante y se los envía a la ventana principal para que cree el nuevo restaurante, y luego cierra la ventana.
     */
    public void agregarRestaurante( )
    {
    	String nombre = panelDetalles.getNombre();
    	int cal = panelDetalles.getCalificacion();
    	boolean visitado = panelDetalles.getVisitado();
    	int[] coor = panelMapa.getCoordenadas();
    	ventanaPrincipal.agregarRestaurante(nombre, cal, coor[0], coor[1], visitado);
    }

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
