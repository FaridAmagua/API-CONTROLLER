package com.daw.decotea;

import com.daw.decotea.model.Product;
import com.daw.decotea.model.Rol;
import com.daw.decotea.model.User;
import com.daw.decotea.model.UserRol;
import com.daw.decotea.service.ProductService;
import com.daw.decotea.service.RolService;
import com.daw.decotea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class DecoteaApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	@Autowired
	private RolService rolService;

	public static void main(String[] args) {
		SpringApplication.run(DecoteaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User usuario = new User();
		usuario.setName("Alex");
		usuario.setSurname("Soto");
		usuario.setUsername("alex");
		usuario.setPassword("12345");
		usuario.setEmail("alex@gmail.com");
		usuario.setNumber("988212020");
		usuario.setProfile("foto.png");
		Rol rol = new Rol();
		rol.setRolId(2L);
		rol.setRolName("NORMAL");
		Set<UserRol> usuariosRoles = new HashSet<>();
		UserRol usuarioRol = new UserRol();
		usuarioRol.setRols(rol);
		usuarioRol.setUsers(usuario);
		usuariosRoles.add(usuarioRol);
		User usuarioGuardado = userService.guardarUsuario(usuario,usuariosRoles);
		System.out.println(usuarioGuardado.getUsername());

		Product product1= new Product();
		product1.setProductname("asd1");
		product1.setDescription("sad");
		product1.setPrice(1);
		product1.setCantidadTotalDisponible(2);
		Product product = productService.saveProcuct(product1);
		System.out.println(product.getProductname());
		Rol rol1 = new Rol();
		rol1.setRolName("rol3");
		Rol rols = rolService.saveRol(rol1);
		System.out.println(rols.getRolName());





	}

}
