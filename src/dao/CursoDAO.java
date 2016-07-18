package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;
import to.CursoTO; 
public class CursoDAO {
	
	public void incluir(CursoTO to){
		String sqlInsert = "INSERT INTO Curso(id,nome,vagas,valor,dataInicio,dataTermino,horario) VALUES (?,?,?,?,?,?,?)";
		try(Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);){
			stm.setInt(1, to.getCodigoCurso());
			stm.setString(2,to.getNomeCurso());
			stm.setInt(3,to.getVagas());
			stm.setDouble(4,to.getValorCurso());
			stm.setString(5,to.getDataDeInicio());
			stm.setString(6,to.getDataDeTermino());
			stm.setString(7,to.getHorario());
			stm.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void atualizar(CursoTO to){
		String sqlUpdate = "UPDATE Curso SET nome = ?, vagas = ?,dataInicio = ?, dataTermino = ?, horario = ?,valor = ? WHERE id = ?";
		try(Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);){
			stm.setString(1,to.getNomeCurso());
			stm.setDouble(2,to.getValorCurso());
			stm.setInt(3, to.getVagas());
			stm.setString(4, to.getDataDeInicio());
			stm.setString(5, to.getDataDeTermino());
			stm.setString(6, to.getHorario());
			stm.setDouble(7,to.getValorCurso());
			stm.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void excluir(CursoTO to){
		String sqlDelete = "DELETE from Curso WHERE id = ?";
		try(Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);){
			stm.setInt(1,to.getCodigoCurso());
			stm.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public CursoTO carregar(int idCurso){
		CursoTO to = new CursoTO();
		String sqlSelect = "SELECT nome,vagas,dataInicio,dataTermino,horario,valor from WHERE Curso.id = ?"; 
		try(Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);){
			stm.setInt(1,to.getCodigoCurso());
			try(ResultSet rs = stm.executeQuery();){
				if(rs.next()){
					to.setNomeCurso(rs.getString("nome"));
					to.setVagas(rs.getInt("vagas"));
					to.setDataDeInicio(rs.getString("dataDeInicio"));
					to.setDataDeTermino(rs.getString("dataDeTermino"));
					to.setHorario(rs.getString("horario"));
					to.setValorCurso(rs.getDouble("valor"));
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return to;
	}
}
