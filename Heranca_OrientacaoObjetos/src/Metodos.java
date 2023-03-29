
public class Metodos {

	public static void ordem() {
		
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Ordene por ID.");
		System.out.println("2 - Ordene por Letra.");
		System.out.println("3 - Para avançar.");
		
	}
	public static void opcao() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Deseja Criar um Item:");
        System.out.println("2 - Deseja Criar um TCC:");
        System.out.println("3 - Deseja criar um Autor:");
        System.out.println("4 - Parar Programa:");
        System.out.println("5 - Deseja consultar:");

    }

    public static void op1() {
        System.out.println("Qual item deseja criar:");
        System.out.println("1 - Livro");
        System.out.println("2 - Midia");
        System.out.println("3 - Periodico");

    }
    public static void op2() {
        System.out.println("Qual Tcc deseja criar:");
        System.out.println("1 - Tese");
        System.out.println("2 - Dissertação");
        System.out.println("3 - Monografia");

    }

    public static void op11(String nome) {
        System.out.println("Em ordem:");
        System.out.println("Digite o id " + nome);
        System.out.println("Digite o ano " + nome);
        System.out.println("Digite o titúlo " + nome);
        System.out.println("Digite o autor " + nome);
    }
    public static void op22(String nome) {
        System.out.println("Em ordem:");
        System.out.println("o Id " + nome);
        System.out.println("Ano da defesa " + nome);
        System.out.println("Ano da entrega " + nome);
        System.out.println("Nome dos orientadores " + nome);
    }

    public static void op3(String nome) {
    	
    	 System.out.println("Em ordem:");
         System.out.println("o Id " + nome);
         System.out.println("O nome " + nome);
         System.out.println("O sobrenome " + nome);
         System.out.println("A areá de formação " + nome);
         
    
    	
    }
    
    public static void op100() {
    	
    	System.out.println("Em ordem:");
    	System.out.println("1 - Você deseja consultar todos os itens:");
    	System.out.println("2 - Você deseja consultar um Item:");
    	System.out.println("3 - Você deseja consultar um TCC:");
    	System.out.println("4 - Você deseja consultar um Autor:");
    	System.out.println("5 - Você deseja consultar todos os TCCS:");
    	
    	
    }
}
