package paquet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class Gestor {

	private static Connection conn;
	private String sql;
	private int id;
	private String nom;
	private String password;
	private String horari;
	private String grup;
	private int edat;
	private String nomalumne;
	AlumneMati alumne=new AlumneMati();
	

	

	/*
	 * inicialització del servlet. (non-Javadoc)
	 * 
	 * @see javax.servlet.GenericServlet#init()
	 */

	public String getNomalumne() {
		return nomalumne;
	}

	public void setNomalumne(String nomalumne) {
		this.nomalumne = nomalumne;
	}

	public void init() {

		conn=null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String servidor="jdbc:mysql://localhost/dbeducation";
			String usuarioDB="root";
			String passwordDB="";
			conn=DriverManager.getConnection(servidor,usuarioDB,passwordDB);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn=null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn=null;
		}catch (Exception e){
			
			e.printStackTrace();
			conn=null;
		}
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getHorari() {
		return horari;
	}


	public void setHorari(String horari) {
		this.horari = horari;
	}


	public String getGrup() {
		return grup;
	}


	public void setGrup(String grup) {
		this.grup = grup;
	}


	public int getEdat() {
		return edat;
	}


	public void setEdat(int edat) {
		this.edat = edat;
	}


	public void OmplirAlumne() {

		init();
		try {
			System.out.println(this.nom+","+this.password+","+this.edat);
			Statement stmt = conn.createStatement();
			System.out.println(this.grup+","+this.horari+","+this.id);
			sql = "INSERT INTO alumne SET id='" + this.id
					+ "',nom='" + this.nom + "',edat='"
					+ this.edat + "',horari='"
					+ this.horari + "',password='"
					+ this.password + "',grup='"
					+ this.grup + "'";
			stmt.executeUpdate(sql);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

    public ArrayList<String> getLlista() {

		String ida ="";
		ArrayList<String> llista=new ArrayList<String>();
		init();
		try {
			Statement stmt = conn.createStatement();
			sql = "SELECT nom FROM alumne";
			ResultSet aux = stmt.executeQuery(sql);
			while(aux.next())
			{
			ida = aux.getString("nom");
			llista.add(ida);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return llista;
	}
    
    public AlumneMati getAlumne() {

    		
    		AlumneMati alumne=new AlumneMati();
			int ida = 0;
			String nom = "";
			int edat = 0;
			String grup = "";
			String horari="";
			String password="";

			init();
			try {
				Statement stmt = conn.createStatement();
				sql = "SELECT id,nom,edat,grup,horari,password FROM alumne WHERE nom='" + nomalumne + "'";
				ResultSet aux = stmt.executeQuery(sql);
				aux.beforeFirst();
				aux.next();
				ida = aux.getInt("id");
				nom = aux.getString("nom");
				edat = aux.getInt("edat");
				grup = aux.getString("grup");
				horari=aux.getString("horari");
				password=aux.getString("password");
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


				alumne.setIdPersona(ida);
				alumne.setEdatPersona(edat);
				alumne.setNomPersona(nom);
				alumne.setGrupPersona(grup);
				alumne.setHorariPersona(horari);
				alumne.setPasswordPersona(password);

				return alumne;

			}
		
		
		public String comprovar(){
			
			String succes = "succes";
			this.alumne=getAlumne();
			return succes;
		}
		
		public String omplir(){
			
			String succes = "succes";
			OmplirAlumne();
			return succes;
		}
		
		public String principal(){
			
			return "succes";
		}
		
		
	}

	

