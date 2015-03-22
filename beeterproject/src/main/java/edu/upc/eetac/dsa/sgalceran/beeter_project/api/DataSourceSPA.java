package edu.upc.eetac.dsa.sgalceran.beeter_project.api;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.ws.rs.core.Context;

public class DataSourceSPA {

	private DataSource dataSource; //referencia ds
	private static DataSourceSPA instance;
 
	private DataSourceSPA() {
		super();
		Context envContext = null;
		try {
			envContext = new InitialContext();
			Context initContext = (Context) envContext.lookup("java:/comp/env");
			dataSource = (DataSource) initContext.lookup("jdbc/beeterdb"); //referencia al datasource DS
		} catch (NamingException e1) {
			e1.printStackTrace();
		}
	}
 
	public final static DataSourceSPA getInstance() { //INSTACIA DEL SINGELTON
		if (instance == null)
			instance = new DataSourceSPA();
		return instance;
	}
 
	public DataSource getDataSource() { //DEVUELVE LA INSTACIA
		return dataSource;
	}
	
}