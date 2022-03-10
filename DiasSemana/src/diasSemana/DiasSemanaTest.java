package diasSemana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiasSemanaTest {

	/** Caso válido, usuario introduce 1 y devuelve cadena correcta
	 * @Test
	 */
	void V1() {
		assertEquals("El día seleccionado es LUNES", DiasSemana.decisionDia(1));
	}
	
	/** Caso no válido, usuario introduce 2 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV1() {
		assertEquals("El día seleccionado es MARTES", DiasSemana.decisionDia(2));
	}
	
	/** Caso válido, usuario introduce 2 y devuelve cadena correcta
	 * @Test
	 */
	void V2() {
		assertEquals("El día seleccionado es MARTES", DiasSemana.decisionDia(2));
	}
	
	/** Caso no válido, usuario introduce 3 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV2() {
		assertEquals("El día seleccionado es MIÉRCOLES", DiasSemana.decisionDia(3));
	}
	
	/** Caso válido, usuario introduce 3 y devuelve cadena correcta
	 * @Test
	 */
	void V3() {
		assertEquals("El día seleccionado es MIÉRCOLES", DiasSemana.decisionDia(3));
	}
	
	/** Caso no válido, usuario introduce 4 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV3() {
		assertEquals("El día seleccionado es JUEVES", DiasSemana.decisionDia(4));
	}
	
	/** Caso válido, usuario introduce 4 y devuelve cadena correcta
	 * @Test
	 */
	void V4() {
		assertEquals("El día seleccionado es JUEVES", DiasSemana.decisionDia(4));
	}
	
	/** Caso no válido, usuario introduce 5 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV4() {
		assertEquals("El día seleccionado es VIERNES", DiasSemana.decisionDia(5));
	}
	
	/** Caso válido, usuario introduce 5 y devuelve cadena correcta
	 * @Test
	 */
	void V5() {
		assertEquals("El día seleccionado es VIERNES", DiasSemana.decisionDia(5));
	}
	
	/** Caso no válido, usuario introduce 6 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV5() {
		assertEquals("El día seleccionado es SÁBADO", DiasSemana.decisionDia(6));
	}
	
	/** Caso válido, usuario introduce 6 y devuelve cadena correcta
	 * @Test
	 */
	void V6() {
		assertEquals("El día seleccionado es SÁBADO", DiasSemana.decisionDia(6));
	}
	
	/** Caso no válido, usuario introduce 7 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV6() {
		assertEquals("El día seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
	
	/** Caso válido, usuario introduce 7 y devuelve cadena correcta
	 * @Test
	 */
	void V7() {
		assertEquals("El día seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
	
	/** Caso no válido, usuario introduce 8 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV7() {
		assertEquals("ERROR: número incorrecto.", DiasSemana.decisionDia(8));
	}

	/** Caso válido, usuario introduce 8 y devuelve cadena correcta
	 * @Test
	 */
	void V8() {
		assertEquals("ERROR: número incorrecto.", DiasSemana.decisionDia(8));
	}
	
	/** Caso no válido, usuario introduce 7 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV8() {
		assertEquals("El día seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
}
