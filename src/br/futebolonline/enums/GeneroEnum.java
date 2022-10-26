package br.futebolonline.enums;

public enum GeneroEnum {
	Masculino("Masculino"),Feminino("Feminino"),transgenero("Transgenero"),GeneroNeutro("Genero Neutro"), 
	NaoBinario("Nao-Binario"), Agenero("Agenero"), Pangenero("Pangenero");
	private String descricao;

	GeneroEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.getDescricao();
	}

	public static GeneroEnum getEnum(String value) {
		if (value == null)
			throw new IllegalArgumentException();
		for (GeneroEnum v : values())
			if (value.equalsIgnoreCase(v.getDescricao()))
				return v;
		throw new IllegalArgumentException();
	}
}
