package model;

import dao.CursoDAO;
import to.CursoTO;

public class Curso {



	private int idCurso,vagas;
	private double valorCurso;
	private String nomeCurso,dataDeInicio,dataDeTermino,horario;
	public Curso(int codigoCurso, int vagas, double valorCurso, String nomeCurso, String inicioCurso,
			String dataDeInicio, String dataDeTermino, String horario) {
		super();
		this.idCurso = codigoCurso;
		this.vagas = vagas;
		this.valorCurso = valorCurso;
		this.nomeCurso = nomeCurso;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
		this.horario = horario;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int codigoCurso) {
		this.idCurso = codigoCurso;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	public double getValorCurso() {
		return valorCurso;
	}
	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public String getDataDeTermino() {
		return dataDeTermino;
	}
	public void setDataDeTermino(String dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void criar(){
		CursoDAO dao = new CursoDAO();
		CursoTO to = new CursoTO();
		to.setCodigoCurso(idCurso);
		to.setNomeCurso(nomeCurso);
		to.setDataDeInicio(dataDeInicio);
		to.setDataDeTermino(dataDeTermino);
		to.setHorario(horario);
		to.setVagas(vagas);
		to.setValorCurso(valorCurso);
		dao.incluir(to);
	}
	public void excluir(){
		CursoDAO dao = new CursoDAO();
		CursoTO to = new CursoTO();
		to.setCodigoCurso(idCurso);
		dao.excluir(to);
	}
	public void atualizar(){
		CursoDAO dao = new CursoDAO();
		CursoTO to = new CursoTO();
		to.setCodigoCurso(idCurso);
		to.setNomeCurso(nomeCurso);
		to.setDataDeInicio(dataDeInicio);
		to.setDataDeTermino(dataDeTermino);
		to.setHorario(horario);
		to.setVagas(vagas);
		to.setValorCurso(valorCurso);
		dao.atualizar(to);
	}
	public void carregar(){
		CursoDAO dao = new CursoDAO();
		CursoTO to = dao.carregar(idCurso);
		nomeCurso = to.getNomeCurso();
		dataDeInicio = to.getDataDeInicio();
		dataDeTermino = to.getDataDeTermino();
		horario = to.getHorario();
		vagas = to.getVagas();
		valorCurso = to.getValorCurso();
	}
	@Override
	public String toString() {
		return "Curso [codigoCurso=" + idCurso + ", vagas=" + vagas + ", valorCurso=" + valorCurso + ", nomeCurso="
				+ nomeCurso + ", inicioCurso=" + ", dataDeInicio=" + dataDeInicio + ", dataDeTermino="
				+ dataDeTermino + ", horario=" + horario + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (dataDeInicio == null) {
			if (other.dataDeInicio != null)
				return false;
		} else if (!dataDeInicio.equals(other.dataDeInicio))
			return false;
		if (dataDeTermino == null) {
			if (other.dataDeTermino != null)
				return false;
		} else if (!dataDeTermino.equals(other.dataDeTermino))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (idCurso != other.idCurso)
			return false;
		if (nomeCurso == null) {
			if (other.nomeCurso != null)
				return false;
		} else if (!nomeCurso.equals(other.nomeCurso))
			return false;
		if (vagas != other.vagas)
			return false;
		if (Double.doubleToLongBits(valorCurso) != Double.doubleToLongBits(other.valorCurso))
			return false;
		return true;
	}
	
}

