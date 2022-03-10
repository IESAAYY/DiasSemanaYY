package diasSemana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiasSemanaTest {

	/** Caso v�lido, usuario introduce 1 y devuelve cadena correcta
	 * @Test
	 */
	void V1() {
		assertEquals("El d�a seleccionado es LUNES", DiasSemana.decisionDia(1));
	}
	
	/** Caso no v�lido, usuario introduce 2 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV1() {
		assertEquals("El d�a seleccionado es MARTES", DiasSemana.decisionDia(2));
	}
	
	/** Caso v�lido, usuario introduce 2 y devuelve cadena correcta
	 * @Test
	 */
	void V2() {
		assertEquals("El d�a seleccionado es MARTES", DiasSemana.decisionDia(2));
	}
	
	/** Caso no v�lido, usuario introduce 3 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV2() {
		assertEquals("El d�a seleccionado es MI�RCOLES", DiasSemana.decisionDia(3));
	}
	
	/** Caso v�lido, usuario introduce 3 y devuelve cadena correcta
	 * @Test
	 */
	void V3() {
		assertEquals("El d�a seleccionado es MI�RCOLES", DiasSemana.decisionDia(3));
	}
	
	/** Caso no v�lido, usuario introduce 4 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV3() {
		assertEquals("El d�a seleccionado es JUEVES", DiasSemana.decisionDia(4));
	}
	
	/** Caso v�lido, usuario introduce 4 y devuelve cadena correcta
	 * @Test
	 */
	void V4() {
		assertEquals("El d�a seleccionado es JUEVES", DiasSemana.decisionDia(4));
	}
	
	/** Caso no v�lido, usuario introduce 5 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV4() {
		assertEquals("El d�a seleccionado es VIERNES", DiasSemana.decisionDia(5));
	}
	
	/** Caso v�lido, usuario introduce 5 y devuelve cadena correcta
	 * @Test
	 */
	void V5() {
		assertEquals("El d�a seleccionado es VIERNES", DiasSemana.decisionDia(5));
	}
	
	/** Caso no v�lido, usuario introduce 6 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV5() {
		assertEquals("El d�a seleccionado es S�BADO", DiasSemana.decisionDia(6));
	}
	
	/** Caso v�lido, usuario introduce 6 y devuelve cadena correcta
	 * @Test
	 */
	void V6() {
		assertEquals("El d�a seleccionado es S�BADO", DiasSemana.decisionDia(6));
	}
	
	/** Caso no v�lido, usuario introduce 7 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV6() {
		assertEquals("El d�a seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
	
	/** Caso v�lido, usuario introduce 7 y devuelve cadena correcta
	 * @Test
	 */
	void V7() {
		assertEquals("El d�a seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
	
	/** Caso no v�lido, usuario introduce 8 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV7() {
		assertEquals("ERROR: n�mero incorrecto.", DiasSemana.decisionDia(8));
	}

	/** Caso v�lido, usuario introduce 8 y devuelve cadena correcta
	 * @Test
	 */
	void V8() {
		assertEquals("ERROR: n�mero incorrecto.", DiasSemana.decisionDia(8));
	}
	
	/** Caso no v�lido, usuario introduce 7 y devuelve cadena incorrecta
	 * @Test
	 */
	void NV8() {
		assertEquals("El d�a seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
}
