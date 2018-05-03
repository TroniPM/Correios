# Consultar cep ou endereço diretamente no site dos correios SEM API EXTERNA - JAVA.

Para extrair dados do site dos Correios utilizar apenas:

```JAVA
	public static void main(String[] args) {
		Correios c = new Correios("25 de marco");
		if(c.isValid()) {
			ArrayList<Endereco> end = c.getEnderecos();
			System.out.println("\n----ENCONTRADOS (" + end.size() + ")----");
			for(Endereco in : end) {
				System.out.println(in);
			}
		}

		c = new Correios("55295555");
		if(c.isValid()) {
			ArrayList<Endereco> end = c.getEnderecos();
			System.out.println("\n----ENCONTRADOS (" + end.size() + ")----");
			for(Endereco in : end) {
				System.out.println(in);
			}
		}
	}
```
