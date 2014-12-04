package br.com.projeto.web.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.web.dao.DAOClasse;
import br.com.projeto.web.dao.jdbc.util.DAO;
import br.com.projeto.web.model.Classe;

public class DAOJDBCClasse extends DAO implements DAOClasse{
	private Connection conexao=DAO.getConexao();
	@Override
	public boolean alterar(Classe classe) {
		try {
			PreparedStatement preparacao = conexao.prepareStatement("update CLASSE set NOME=?, DATA=? where NUMERO=?");
			preparacao.setString(1, classe.getNome());
			preparacao.setDate(2, new java.sql.Date(classe.getData().getTime()));
			preparacao.setLong(3, classe.getNumero());
			preparacao.executeUpdate();//RETORNA 0 SE FALSE
			preparacao.close();
			//conexao.close();
			return true;
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Classe consultar(Classe classe) {
		try {
			PreparedStatement preparacao = conexao.prepareStatement("select * from CLASSE where NUMERO=?");
			preparacao.setLong(1, classe.getNumero());
			ResultSet resultado = preparacao.executeQuery();//RETORNA 0 SE FALSE
			//while (resultado.next()) {//fica com o último
			if(resultado.next()){//fica com o primeiro
				classe.setNumero(resultado.getLong("numero"));
				classe.setNome(resultado.getString("nome"));
				//classe.setData(new java.util.Date(resultado.getDate("data").getTime()));
				classe.setData(resultado.getDate("data"));
			}
			preparacao.close();
			//conexao.close();
			return classe;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean excluir(Classe classe) {
		try {
			PreparedStatement preparacao = conexao.prepareStatement("delete from CLASSE where NUMERO=?");
			preparacao.setLong(1, classe.getNumero());
			preparacao.executeUpdate();//RETORNA 0 SE FALSE
			preparacao.close();
			//conexao.close();
			return true;
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean existe(Classe classe) {
		boolean achou = false;
		try {
			PreparedStatement preparacao = conexao.prepareStatement("select * from CLASSE where NUMERO=?");
			preparacao.setLong(1, classe.getNumero());
			ResultSet resultado = preparacao.executeQuery();//RETORNA 0 SE FALSE
			//while (resultado.next()) {//fica com o último
			if(resultado.next()){//fica com o primeiro
				achou = true;
			}
			preparacao.close();
			//conexao.close();
			return achou;
		}catch (SQLException e) {
			e.printStackTrace();
			return achou;
		}
	}
	@Override
	public boolean inserir(Classe classe) {
		try {
			PreparedStatement preparacao = conexao.prepareStatement("insert into CLASSE (NUMERO, NOME, DATA) values (?,?,?)");
			preparacao.setLong(1, classe.getNumero());
			preparacao.setString(2, classe.getNome());
			preparacao.setDate(3, new java.sql.Date(classe.getData().getTime()));
			preparacao.executeUpdate();//RETORNA 0 SE FALSE
			preparacao.close();
			//conexao.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public List<Classe> listar() {
		List<Classe> lista = new ArrayList<>();
		try {
			Statement preparacao = conexao.createStatement();
			ResultSet resultado = preparacao.executeQuery("select * from CLASSE");//RETORNA 0 SE FALSE
			while (resultado.next()) {
				Classe classe = new Classe();
				classe.setNumero(resultado.getLong("numero"));
				classe.setNome(resultado.getString("nome"));
				//classe.setData(new java.util.Date(resultado.getDate("data").getTime()));
				classe.setData(resultado.getDate("data"));
				lista.add(classe);
			}
			preparacao.close();
			//conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
}