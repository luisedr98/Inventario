package devapp.inventario;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import devapp.inventario.entities.Cliente;
import devapp.inventario.repository.ClienteRepo;


@SpringBootApplication
public class InventarioApplication {
	private static final Logger log = LoggerFactory.getLogger(InventarioApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	
		
	}
	
	@Bean
	public CommandLineRunner demo(ClienteRepo cl) {
	return (args) -> {
	      // save a few customers
	      cl.save(new Cliente("Jack", "Baer","","",""));
	      cl.save(new Cliente("Jack", "Ber","","",""));
	      cl.save(new Cliente("Jack", "Br","","",""));
	      cl.save(new Cliente("Jack", "l","","",""));
	      log.info("El usuario fue almacenado");

	    };
	  }
	
}
	

