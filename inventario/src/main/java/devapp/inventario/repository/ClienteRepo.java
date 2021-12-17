package devapp.inventario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import devapp.inventario.entities.Cliente;
public interface ClienteRepo extends CrudRepository<Cliente, Integer>{
	 List<Cliente> findBynombre(String nombre);
	 
}

