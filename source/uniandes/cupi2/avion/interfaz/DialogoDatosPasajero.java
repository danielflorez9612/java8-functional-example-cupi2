/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n3_avion
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.avion.interfaz;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.avion.mundo.*;
import uniandes.cupi2.avion.mundo.Silla.Clase;
import uniandes.cupi2.avion.mundo.Silla.Ubicacion;

/**
 * Formulario para presentar los datos y el registro del pasajero.
 */
@SuppressWarnings("serial")
public class DialogoDatosPasajero extends JDialog
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Opción Aceptar.
     */
    public final static String ACEPTAR = "ACEPTAR";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Interfaz principal.
     */
    private InterfazAvion principal;

    /**
     * Texto que contiene la cédula.
     */
    private JTextField txtCedula;

    /**
     * Texto que contiene el nombre.
     */
    private JTextField txtNombre;

    /**
     * Texto que contiene la clase.
     */
    private JTextField txtClase;

    /**
     * Texto que contiene la ubicación.
     */
    private JTextField txtUbicacion;

    /**
     * Texto que contiene la silla.
     */
    private JTextField txtSilla;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la ventana con los datos del pasajero.
     * @param pPrincipal Ventana o frame padre del diálogo. pPrincipal != null.
     * @param pSilla Silla en la que el pasajero está ubicado.
     */
    public DialogoDatosPasajero( InterfazAvion pPrincipal, Silla pSilla )
    {
        principal = pPrincipal;

        setTitle( "Datos del pasajero" );
        setSize( 270, 200 );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );

        Pasajero pasajero = pSilla.darPasajero( );
        setLayout( new BorderLayout( ) );

        // Crea el panel de datos del pasajero
        JPanel panelDatosPasajero = new JPanel( );

        panelDatosPasajero.setBorder( new CompoundBorder( new TitledBorder( "Datos del pasajero" ), new EmptyBorder( 3, 3, 3, 3 ) ) );
        panelDatosPasajero.setLayout( new GridLayout( 5, 2, 1, 1 ) );

        // Cédula
        JLabel etiquetaCedula = new JLabel( "Cédula: " );
        panelDatosPasajero.add( etiquetaCedula );

        txtCedula = new JTextField( pasajero.darCedula( ) + "" );
        txtCedula.setEditable( false );
        panelDatosPasajero.add( txtCedula );

        // Nombre
        JLabel etiquetaNombre = new JLabel( "Nombre: " );
        panelDatosPasajero.add( etiquetaNombre );

        txtNombre = new JTextField( pasajero.darNombre( ) );
        txtNombre.setColumns( 15 );
        txtNombre.setEditable( false );
        panelDatosPasajero.add( txtNombre );

        // Silla
        JLabel etiquetaSilla = new JLabel( "Silla: " );
        panelDatosPasajero.add( etiquetaSilla );

        txtSilla = new JTextField( pSilla.darNumero( ) + "" );
        txtSilla.setEditable( false );
        panelDatosPasajero.add( txtSilla );

        // Clase
        JLabel etiquetaClase = new JLabel( "Clase: " );

        panelDatosPasajero.add( etiquetaClase );
        String sClase;
        if( pSilla.darClase( ) == Clase.ECONOMICA )
        {
            sClase = "Económica";
        }
        else
        {
            sClase = "Ejecutiva";
        }
        txtClase = new JTextField( sClase );
        txtClase.setEditable( false );
        panelDatosPasajero.add( txtClase );

        // Ubicación
        JLabel etiquetaUbicacion = new JLabel( "Ubicación: " );
        panelDatosPasajero.add( etiquetaUbicacion );

        String sUbicacion;
        if( pSilla.darUbicacion( ) == Ubicacion.CENTRAL )
        {
            sUbicacion = "Centro";
        }
        else if( pSilla.darUbicacion( ) == Ubicacion.PASILLO )
        {
            sUbicacion = "Pasillo";
        }
        else
        {
            sUbicacion = "Ventana";
        }
        txtUbicacion = new JTextField( sUbicacion );
        txtUbicacion.setEditable( false );
        panelDatosPasajero.add( txtUbicacion );
        add( panelDatosPasajero, BorderLayout.CENTER );

        setModal( true );
        setLocationRelativeTo( principal );
        setResizable( false );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

}