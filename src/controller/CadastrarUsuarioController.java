package controller;

import Model.Usuario;

public class CadastrarUsuarioController {
	
	public boolean salvarDados(Usuario usuario) {
		return true;
	}
	
	public boolean editarDados(Usuario usuario) {
		return true;
	}
	
	public boolean excluirDados(int idUsuario) {
		return true;
	}
	
	public Usuario getDadosUsuario(int idUsuario) {
		return new Usuario();
	}
}
