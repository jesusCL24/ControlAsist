package com.AsisteciaControl.Asistencia;

import com.AsisteciaControl.Asistencia.entidad.Usuario;
import com.AsisteciaControl.Asistencia.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsistenciaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AsistenciaApplication.class, args);
	}

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        /*Usuario usu1=new Usuario("jose","coronel","luna",4256345,"hola");
        repositorio.save(usu1);
        Usuario usu2=new Usuario("carla","lopez","lujan",4256300,"chau");
        repositorio.save(usu2);*/
    }
}
