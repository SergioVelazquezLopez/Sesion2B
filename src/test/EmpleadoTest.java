package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sesion2B.Empleado;
import sesion2B.TipoEmpleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	Empleado emp = new Empleado();
    
    @Test
    void testNominaBrutaVMenos1000() {
        assertEquals(2000.0f, emp.calculoNominaBruta(TipoEmpleado.VENDEDOR, 999.99f, 0), 0.01f);
    }

    @Test
    void testNominaBrutaVExacto1000() {
        assertEquals(2100.0f, emp.calculoNominaBruta(TipoEmpleado.VENDEDOR, 1000.0f, 0), 0.01f);
    }

    @Test
    void testNominaBrutaVMenos1500() {
        assertEquals(2100.0f, emp.calculoNominaBruta(TipoEmpleado.VENDEDOR, 1499.99f, 0), 0.01f);
    }

    @Test
    void testNominaBrutaVExacto1500() {
        assertEquals(2200.0f, emp.calculoNominaBruta(TipoEmpleado.VENDEDOR, 1500.0f, 0), 0.01f);
    }

    @Test
    void testNominaBrutaEHorasExtra() {
        assertEquals(2560.0f, emp.calculoNominaBruta(TipoEmpleado.ENCARGADO, 0.0f, 2.0f), 0.01f);
    }

    @Test
    void testNominaNetaMenos2100() {
        assertEquals(2099.99f, emp.calculoNominaNeta(2099.99f), 0.01f);
    }

    @Test
    void testNominaNetaExacto2100() {
        assertEquals(1785.0f, emp.calculoNominaNeta(2100.0f), 0.01f);
    }

    @Test
    void testNominaNetaMenos2500() {
        assertEquals(2124.9915f, emp.calculoNominaNeta(2499.99f), 0.01f);
    }

    @Test
    void testNominaNetaExacto2500() {
        assertEquals(2050.0f, emp.calculoNominaNeta(2500.0f), 0.01f);
    }

}
