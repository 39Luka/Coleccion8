

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class calculadoraTest {

    @Test
    void sumar() {
        Assertions.assertEquals(12, calculadora.sumar(7,5));
    }

    @Test
    void restar() {
        Assertions.assertEquals(2, calculadora.restar(7,5));
    }

    @Test
    void multiplicar() {
        Assertions.assertEquals(35, calculadora.multiplicar(7,5));

    }

    @Test
    void dividir() {
        Assertions.assertEquals("2.0", calculadora.dividir(10,5));

    }
    @Test
    void dividir0() {
        Assertions.assertEquals("Error: División por cero", calculadora.dividir(7,0));

    }

    @Test
    void escogerValorEntradaValida() {
        ByteArrayInputStream in = new
                ByteArrayInputStream("6\n".getBytes());
        System.setIn(in);
        Assertions.assertEquals(6, calculadora.escogerValor());

    }
    @Test
    void escogerValorEntradaInvalida() {
        ByteArrayInputStream in = new
                ByteArrayInputStream("s\n".getBytes());
        System.setIn(in);
        Assertions.assertEquals(1, calculadora.escogerValor());

    }
    //ByteArrayInputStream: Simula la entrada de datos, poniendo tú lo que se va ha introducir
    //setIn: Hace que introduzca lo que se ha puesto en ByteArrayInputStream en vez del teclado
    //Assertions: Comprueba el valor esperado que se le ponga con el valor que te da el programa

}