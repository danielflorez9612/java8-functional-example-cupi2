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
package uniandes.cupi2.avion.mundo;

/**
 * Pasajero del avión.
 */
public class Pasajero
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Cédula del pasajero.
     */
    private String cedula;

    /**
     * Nombre del pasajero.
     */
    private String nombre;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un pasajero con su cédula y nombre. <br>
     * <b>post: </b> El pasajero tiene sus datos básicos cédula y nombre asignados.
     * @param pCedula Cédula del pasajero. pCedula > 0.
     * @param pNombre Nombre del pasajero. pNombre != null && pNombre != "".
     */
    public Pasajero( String pCedula, String pNombre )
    {
        cedula = pCedula;
        nombre = pNombre;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna la cédula del pasajero.
     * @return La cédula del pasajero.
     */
    public String darCedula( )
    {
        return cedula;
    }

    /**
     * Retorna el nombre del pasajero.
     * @return El nombre del pasajero.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Indica si el pasajero es igual a otro.
     * @param pOtroPasajero Pasajero a comparar. pOtroPasajero != null.
     * @return Retorna true si es el mismo pasajero, false en caso contrario.
     */
    public boolean igualA( Pasajero pOtroPasajero )
    {
        boolean esIgual = false;
        if( cedula.equals( pOtroPasajero.darCedula( ) ) )
        {
            esIgual = true;
        }

        return esIgual;
    }
}