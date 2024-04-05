package IgorAntonio.model.domain;

public class Grade {
	
	private int codigo;
	private String nome;
	
	@Override
    public String toString() {
        return "Grade [codigo=" + codigo + ", nome=" + nome + "]";
    }
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
