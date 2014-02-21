package paquet;

/**
 * Clase que descriu els atributs de l'Alumne
 * 
 * @author eric
 * 
 */
public class AlumneMati extends Persona {

	private int id;
	private String nom;
	private int edat;
	private String grup;
	private String horari;
	private String password;

	/**
	 * @return the id
	 */
	public int getIdPersona() {
		return this.id;
	}

	/**
	 * @param id
	 *            the idPersona to set
	 * 
	 */
	public void setIdPersona(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNomPersona() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 * 
	 */
	public void setNomPersona(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the edat
	 */
	public int getEdatPersona() {
		return this.edat;
	}

	/**
	 * @param edat
	 *            the edat to set
	 * 
	 */
	public void setEdatPersona(int edat) {
		this.edat = edat;
	}

	/**
	 * @return the grup
	 */
	public String getGrupPersona() {
		return this.grup;
	}

	/**
	 * @param grup
	 *            the grup to set
	 * 
	 */
	public void setGrupPersona(String grup) {
		this.grup = grup;
	}

	/**
	 * @return the grup
	 */
	public String getHorariPersona() {
		return this.horari;
	}

	/**
	 * @param grup
	 *            the grup to set
	 * 
	 */
	public void setHorariPersona(String horari) {
		this.horari = horari;
	}

	public String getPasswordPersona() {
		return this.password;
	}

	/**
	 * @param grup
	 *            the password to set
	 * 
	 */
	public void setPasswordPersona(String password) {
		this.password = password;
	}

	@Override
	public void setGrupPersona() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHorariPersona() {
		// TODO Auto-generated method stub
		
	}

}
