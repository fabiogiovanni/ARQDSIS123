package to;

public class CursoTO {

	private int codigoCurso,vagas;
	private double valorCurso;
	private String nomeCurso,inicioCurso,dataDeInicio,dataDeTermino,horario;
	
	public CursoTO(){
		
	}
	public CursoTO(int codigoCurso, int vagas, double valorCurso, String nomeCurso, String inicioCurso,
			String dataDeInicio, String dataDeTermino, String horario) {
		super();
		this.codigoCurso = codigoCurso;
		this.vagas = vagas;
		this.valorCurso = valorCurso;
		this.nomeCurso = nomeCurso;
		this.inicioCurso = inicioCurso;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
		this.horario = horario;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
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
	public String getInicioCurso() {
		return inicioCurso;
	}
	public void setInicioCurso(String inicioCurso) {
		this.inicioCurso = inicioCurso;
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
	
	
}
