package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

// Interface que define los metodos del Servicio de Usuarios.
public interface ServicioLogin {

	Usuario consultarUsuario(String email, String password);
	Usuario registrar(String email, String password) throws Exception;
	Usuario actualizarPerfil(String barrio,String direccion,Usuario usuario);
	void actualizar(Usuario usuario, Long id);
}
