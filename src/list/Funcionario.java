package list;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalario(Double porcentagem) {
		setSalario(salario * (porcentagem/100 + 1));
	}
	

	public String toString() {
		return String.format("%d, %s, $%.2f", id, nome, salario);
	}
	
	
	
}
