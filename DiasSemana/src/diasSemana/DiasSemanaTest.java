package diasSemana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiasSemanaTest {

	@Test
	void V1() {
		assertEquals("El día seleccionado es LUNES", DiasSemana.decisionDia(1));
	}
	
	@Test
	void NV1() {
		assertEquals("El día seleccionado es MARTES", DiasSemana.decisionDia(2));
	}
	
	@Test
	void V2() {
		assertEquals("El día seleccionado es MARTES", DiasSemana.decisionDia(2));
	}
	
	@Test
	void NV2() {
		assertEquals("El día seleccionado es MIÉRCOLES", DiasSemana.decisionDia(3));
	}
	
	@Test
	void V3() {
		assertEquals("El día seleccionado es MIÉRCOLES", DiasSemana.decisionDia(3));
	}
	
	@Test
	void NV3() {
		assertEquals("El día seleccionado es JUEVES", DiasSemana.decisionDia(4));
	}
	
	@Test
	void V4() {
		assertEquals("El día seleccionado es JUEVES", DiasSemana.decisionDia(4));
	}
	
	@Test
	void NV4() {
		assertEquals("El día seleccionado es VIERNES", DiasSemana.decisionDia(5));
	}
	
	@Test
	void V5() {
		assertEquals("El día seleccionado es VIERNES", DiasSemana.decisionDia(5));
	}
	
	@Test
	void NV5() {
		assertEquals("El día seleccionado es SÁBADO", DiasSemana.decisionDia(6));
	}
	
	@Test
	void V6() {
		assertEquals("El día seleccionado es SÁBADO", DiasSemana.decisionDia(6));
	}
	
	@Test
	void NV6() {
		assertEquals("El día seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
	
	@Test
	void V7() {
		assertEquals("El día seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
	
	@Test
	void NV7() {
		assertEquals("ERROR: número incorrecto.", DiasSemana.decisionDia(8));
	}

	@Test
	void V8() {
		assertEquals("ERROR: número incorrecto.", DiasSemana.decisionDia(8));
	}
	
	@Test
	void NV8() {
		assertEquals("El día seleccionado es DOMINGO", DiasSemana.decisionDia(7));
	}
}
