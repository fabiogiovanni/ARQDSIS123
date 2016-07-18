package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;
import to.AlunoTO; 
public class AlunoDAO {
	
	public void inserirAluno(AlunoTO to){
		
		String sqlInsert = "INSERT TO Aluno(id,nome,telefone,email,rg,cpf) VALUES (?,?,?,?,?,?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
			PreparedStatement stm = conn.prepareStatement(sqlInsert);){
			stm.setInt(1,to.getIdAluno());
			stm.setString(2,to.getNomeAluno());
			stm.setString(3,to.getTelefoneAluno());
			stm.setString(4, to.getEmailAluno());
			stm.setString(5, to.getrGAluno());
			stm.setString(6, to.getcPFAluno());
			stm.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void atualizar(AlunoTO to){
		String sqlUpdate = "UPDATE Aluno SET nome = ?, telefone = ?, email = ?, rg = ?, cpf = ? WHERE id ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);){
					stm.setString(1,to.getNomeAluno());
					stm.setString(2,to.getTelefoneAluno());
					stm.setString(3,to.getEmailAluno());
					stm.setString(4,to.getrGAluno());
					stm.setString(5,to.getcPFAluno());
					stm.setInt(6,to.getIdAluno());
					stm.execute();
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	public void excluir(AlunoTO to){
		String sqlDelete = "DELETE FROM Aluno WHERE id = ?";
		try(Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);){
			stm.setInt(1,to.getIdAluno());
			stm.execute();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public AlunoTO carregar(int id){
		AlunoTO to = new AlunoTO();
		String sqlSelect = "select * from Aluno WHERE id = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
			PreparedStatement stm = conn.prepareStatement(sqlSelect);){
			stm.setInt(1,id);
			try (ResultSet rs = stm.executeQuery();){
				if(rs.next()){
					to.setNomeAluno("nome");
					to.setTelefoneAluno("telefone");
					to.setEmailAluno("email");
					to.setrGAluno("rg");
					to.setcPFAluno("cpf");
				}
			} catch(SQLException e){
				e.printStackTrace();
			}
		}catch(SQLException e1){
			e1.printStackTrace();
		}
		return to;
	}
}
