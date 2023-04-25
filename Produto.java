package Poo;

public class Produto {
	
	private String nome;
	private String descricao;
	private String plataforma;
	private double preco ;
	private int estoque ;
	
	public Produto(String nome, String descricao, String plataforma,double preco ,int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.plataforma = plataforma;
        this.preco = preco;
        this.estoque = estoque;
           
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getPreco() {
		return preco;
	}

	public void setValor(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}	
	
		public void visualizar() {
			System.out.println("Nome do produto:" + this.nome);
			System.out.println("Descrição do produto:" + this.descricao);
			System.out.println("Plataforma:" + this.plataforma);
			System.out.println("Preço do produto:" + this.preco);
			System.out.println("Disponível em Estoque:" +  this.estoque);
		}
	}

