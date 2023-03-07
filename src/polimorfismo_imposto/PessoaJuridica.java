package polimorfismo_imposto;

public class PessoaJuridica extends Imposto{

	private Integer funcionarios;

	public PessoaJuridica(String name, Double rendaAnual, Integer funcionarios) {
		super(name, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public final double calculoImposto() {
		if (getFuncionarios() > 10) {
			return getRendaAnual() * 0.14;
		}
		return getRendaAnual() * 0.16;
	}
	
	
}
