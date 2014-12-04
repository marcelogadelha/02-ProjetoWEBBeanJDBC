package br.com.projeto.web.dao.factory;

import br.com.projeto.web.dao.DAOClasse;
import br.com.projeto.web.dao.jdbc.DAOJDBCClasse;

public class DAOFactoryJDBC {
	public static DAOClasse getDAOClasse(){
		return new DAOJDBCClasse();
	}
}