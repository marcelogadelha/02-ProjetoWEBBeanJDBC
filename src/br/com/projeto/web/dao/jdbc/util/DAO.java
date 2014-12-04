package br.com.projeto.web.dao.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public static Connection getConexao() {
		//IBM DB2:		"com.ibm.db2.jcc.DB2Driver"; jdbc:db2://localhost:50000/banco,usuario,senha
		//SQL SERVER:	"com.microsoft.sqlserver.jdbc.SQLServerDriver"; jdbc:sqlserver://localhost:1433/banco,usuario,senha
		//MY SQL:		"org.gjt.mm.mysql.Driver" ou "com.mysql.jdbc.Driver"; jdbc:mysql://localhost:3306/banco,usuario,senha
		String classe= "org.postgresql.Driver";
		String gerenciador = "postgresql";
		String host = "127.0.0.1";
		String porta = "5432";
		String banco = "banco";
		String usuario = "postgres";
		String senha = "G@delha";
		return getConexao(classe, gerenciador, host, porta, banco, usuario, senha );
	}
	public static Connection getConexao(String classe, String gerenciador, String host, String porta, String banco, String usuario, String senha) {
		Connection conexao = null;
		try {
			Class.forName(classe);
			conexao = DriverManager.getConnection("jdbc:"+gerenciador+"://"+host+":"+porta+"/"+ banco, usuario, senha);
		}catch (Exception e){
			e.printStackTrace();
		}
		return conexao;
	}
}