package model;

import dao.AlunoDAO;
import to.AlunoTO;

public class Aluno {
	 private int idAluno;
	 private String nomeAluno;
	 private String telefoneAluno;
	 private String emailAluno;
	 private String rGAluno;
	 private String cPFAluno;
	
	 public Aluno(int idAluno, String nomeAluno, String telefoneAluno, String emailAluno, String rGAluno,
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
	
	public void criar(){
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setIdAluno(idAluno);
		to.setTelefoneAluno(telefoneAluno);
		to.setcPFAluno(cPFAluno);
		to.setNomeAluno(nomeAluno);
		to.setrGAluno(rGAluno);
		dao.inserirAluno(to);
	}
	public void excluir(){
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setIdAluno(idAluno);
		dao.excluir(to);
	}

	public void carregar(int id) {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = dao.carregar(id);
		idAluno = to.getIdAluno();
		nomeAluno = to.getNomeAluno();
		telefoneAluno = to.getTelefoneAluno();
		emailAluno = to.getEmailAluno();
		rGAluno = to.getEmailAluno();
		cPFAluno = to.getcPFAluno();
	}

	public void atualizar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setIdAluno(idAluno);
		to.setTelefoneAluno(telefoneAluno);
		to.setcPFAluno(cPFAluno);
		to.setNomeAluno(nomeAluno);
		to.setrGAluno(rGAluno);
		dao.atualizar(to);
	}
	
	
	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nomeAluno=" + nomeAluno + ", telefoneAluno=" + telefoneAluno
				+ ", emailAluno=" + emailAluno + ", rGAluno=" + rGAluno + ", cPFAluno=" + cPFAluno + "]";
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cPFAluno == null) {
			if (other.cPFAluno != null)
				return false;
		} else if (!cPFAluno.equals(other.cPFAluno))
			return false;
		if (emailAluno == null) {
			if (other.emailAluno != null)
				return false;
		} else if (!emailAluno.equals(other.emailAluno))
			return false;
		if (idAluno != other.idAluno)
			return false;
		if (nomeAluno == null) {
			if (other.nomeAluno != null)
				return false;
		} else if (!nomeAluno.equals(other.nomeAluno))
			return false;
		if (rGAluno == null) {
			if (other.rGAluno != null)
				return false;
		} else if (!rGAluno.equals(other.rGAluno))
			return false;
		if (telefoneAluno == null) {
			if (other.telefoneAluno != null)
				return false;
		} else if (!telefoneAluno.equals(other.telefoneAluno))
			return false;
		return true;
	}
}