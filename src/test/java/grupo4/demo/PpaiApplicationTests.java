package grupo4.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import grupo4.demo.domain.Marca;

@SpringBootTest
class PpaiApplicationTests {

	@Test
	void testMarca() {

		// Probar la creación de un objeto Marca
		Marca marca = new Marca();
		marca.setNombre("Marca de prueba");
		marca.setModelos(null);

		// Imprimir el nombre
		System.out.println(marca.getNombre());
	}

	@Test
	void testList()
	{
		List<String> lista = new ArrayList<>();
	}
}
