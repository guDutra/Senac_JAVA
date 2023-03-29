import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

	public class Dados {



		 private Item itensDados[] = new Item[100];
		 

		 private int contador = 0;
		 
		 private Autor autorVet[] = new Autor[100];
		 private int cont = 0;
		 
		 private TCC tccVet[] = new TCC[100];
		 private int conti = 0;
		 
		 
		 


		 DetalhesInterface detalhes = new DetalhesInterface(); 

		 public void inserir(Item item, String tipoDeItem) {

		 itensDados[this.contador] = item;

		 this.contador++;



		 }
		 
		 Autor  autoridade = new Autor(23, "uriel", "locao", "aaa"); 

		 public void inserirA(Autor autor) {

		 autorVet[this.contador] = autor;

		 this.contador++;



		 }
		 
		 DetalhesInterface detalhesccc = new DetalhesInterface(); 

		 public void inserirTCC(TCC tcc) {

		 tccVet[this.contador] = tcc;

		 this.contador++;



		 }
		 
		 public void mostrarTodosTCC() {



			 for (int i = 0; i < contador; i++) {

			 

			System.out.println(tccVet[i].getId());

			 System.out.println(tccVet[i].getAnoEntrega());

			 System.out.println(tccVet[i].getAnoDefesa());
			 
			 System.out.println(tccVet[i].getOrientadores()); //.getnomeOrientadores());
			
			 
			 



			 detalhes.mostrarEspacos(1, 1);



			

			}

		 }
		 
		 ///aqui
		 
		 public void pesquisarTCC (String titulo) {



			 boolean encontrado = false;

			 int i;

			for (i = 0; i < contador; i++) {



			if (tccVet[i].getOrientadores().equals(titulo)) {



			 encontrado = true;

			 break;


			 }

			}

			 if (encontrado) {




			 System.out.println(tccVet[i].getId());
			 System.out.println(tccVet[i].getAnoDefesa());
			 System.out.println(tccVet[i].getAnoEntrega());
			 System.out.println(tccVet[i].getOrientadores());
			 

			 detalhes.mostrarEspacos(1, 1);


			 } else {

			 System.out.println("Os Orientadores digitados n�o foi encontrado.");}


			 }
		

		 

		 public void mostrarTodosAutor() {



			 for (int i = 0; i < contador; i++) {

			 

				 System.out.println(autorVet[i].getId());

				 System.out.println(autorVet[i].getNome());

				 System.out.println(autorVet[i].getSobrenome());

				 System.out.println(autorVet[i].getAreaFormacao());
			
			 
			 



			 detalhes.mostrarEspacos(1, 1);



			

			}

		 }
		 
		 
		 public void pesquisarAutor (String autor) {



			 boolean encontrado = false;

			 int i;

			for (i = 0; i < contador; i++) {



			if (autorVet[i].getNome().equals(autor)) {



			 encontrado = true;

			 break;


			 }

			}

			 if (encontrado) {


		

			 System.out.println(autorVet[i].getId());

			 System.out.println(autorVet[i].getNome());

			 System.out.println(autorVet[i].getSobrenome());

			 System.out.println(autorVet[i].getAreaFormacao());

			


			 } else {

			 System.out.println("O nome digitado n�o foi encontrado");}
			 }


		 
		 

		 public int tamanho() {

		 return this.contador;



		}

		 public void mostrarTodos() {



		 for (int i = 0; i < contador; i++) {

		 

		System.out.println(itensDados[i].getId());
		
		System.out.println(itensDados[i].getAno());

		 System.out.println(itensDados[i].getTitulo());// .getNome());

		 System.out.println(itensDados[i].getAutores());
		
		 
		 



		 detalhes.mostrarEspacos(1, 1);



	}

		}

		 
		 





		 public void pesquisarCod (int codigo) {



		 boolean encontrado = false;

		 int i;

		 for (i = 0; i < contador; i++) {



		 if (itensDados[i].getId() == codigo) {



		encontrado = true;

		 break;







		 }
		 }

		 if (encontrado) {




		 System.out.println(itensDados[i].getId());

		 System.out.println(itensDados[i].getTitulo());

		System.out.println(itensDados[i].getAutores());

		 System.out.println(itensDados[i].getAno());

		 detalhes.mostrarEspacos(1, 1);



		 }else {



		 System.out.println("O c�digo digitado n�o foi encontrado.");

		}







		 }

		 public void pesquisarTitulo (String titulo) {



		 boolean encontrado = false;

		 int i;

		for (i = 0; i < contador; i++) {



		if (itensDados[i].getTitulo().equals(titulo)) {



		 encontrado = true;

		 break;


		 }

		}

		 if (encontrado) {




		 System.out.println(itensDados[i].getId());

		 System.out.println(itensDados[i].getTitulo());

		 System.out.println(itensDados[i].getAutores());

		 System.out.println(itensDados[i].getAno());

		 detalhes.mostrarEspacos(1, 1);


		 } else {

		 System.out.println("O t�tulo digitado n�o foi encontrado.");


		 }
		 
		
		 


		 }
	}
	
		 


