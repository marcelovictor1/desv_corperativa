
public class InfoPessoal extends Cliente{
	private String nome;
	private String cpf;
	private String xml;
	
	public InfoPessoal(Cliente proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}
	
	public InfoPessoal(){
		
	}
	
	@Override
	protected String gerarXML(String dados) {
		this.nome = "Pedro Rhamon";
		this.cpf = "000.526.874-83";
		this.xml = "<infoPessoal>xxxxx</infoPessoal>";
		return xml;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}
	
	
}
