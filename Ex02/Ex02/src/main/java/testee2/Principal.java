package testee2;

import testee2.DAO;
import testee2.Usuario;
import java.util.*;
class Principal {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		Usuario usuario = new Usuario();
		do{
		
			DAO dao = new DAO();
			
			dao.conectar();
	
			
			//Inserir um elemento na tabela
			if(escolha == 2) {
					 usuario = new Usuario("Rua X", 10, 501, 79);
				if(dao.inserirAp(usuario) == true) {
					System.out.println("Inserção com sucesso -> " + usuario.toString());
				}
			}
			
			//Atualizar ap
			if(escolha == 4) {
				usuario.setAndar(15);
				dao.atualizarAp(usuario);
			}
			
			//Excluir ap
			if(escolha == 3)
			dao.excluirAp(usuario.getRua());
			
			//Mostrar aps
			if(escolha == 3) {
				Usuario[] usuarios = dao.getUsuarios();
				System.out.println("==== Mostrar Aptos === ");		
				for(int i = 0; i < usuarios.length; i++) {
					System.out.println(usuarios[i].toString());
				}
			}
			
			dao.close();
			System.out.println("Escolha uma das opções:\r\n "
					+ "1) Listar\r\n"
					+ "2) Inserir\r\n"
					+ "3) Excluir\r\n"
					+ "4) Atualizar\r\n"
					+ "5) Sair");
			escolha = sc.nextInt();
		}while (escolha != 5);
		sc.close();
	}
}