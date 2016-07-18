package to;


public class AlunoTO {

	private int idAluno;
	private String nomeAluno;
	private String telefoneAluno;
	private String emailAluno;
	private String rGAluno;
	private String cPFAluno;
	
	public AlunoTO(){
		
	}
	public AlunoTO(int idAluno, String nomeAluno, String telefoneAluno, String emailAluno, String rGAluno,
			String cPFAluno) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.telefoneAluno = telefoneAluno;
		this.emailAluno = emailAluno;
		this.rGAluno = rGAluno;
		this.cPFAluno = cPFAluno;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getTelefoneAluno() {
		return telefoneAluno;
	}
	public void setTelefoneAluno(String telefoneAluno) {
		this.telefoneAluno = telefoneAluno;
	}
	public String getEmailAluno() {
		return emailAluno;
	}
	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}
	public String getrGAluno() {
		return rGAluno;
	}
	public void setrGAluno(String rGAluno) {
		this.rGAluno = rGAluno;
	}
	public String getcPFAluno() {
		return cPFAluno;
	}
	public void setcPFAluno(String cPFAluno) {
		this.cPFAluno = cPFAluno;
	}

	
}
