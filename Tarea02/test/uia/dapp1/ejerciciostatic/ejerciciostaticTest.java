package uia.dapp1.ejerciciostatic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ejerciciostaticTest {

    @Test
    void multiplicacion() {
        assertEquals(6, ejerciciostatic.multiplicacion(3,2));
    }
    @Test
    void Multiplicacion(){
        ejerciciostatic mult = new ejerciciostatic();
        assertEquals(6, mult.multiplicacion(2,3));
    }
}