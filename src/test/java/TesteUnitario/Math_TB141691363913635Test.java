package TesteUnitario;

import static org.junit.jupiter.api.Assertions.*;

class Math_TB141691363913635Test {

    @org.junit.jupiter.api.Test
    void adicionar() {
        int resultadoValido = Math_TB_14169_13639_13635.adicionar(2, 3);
        assertEquals(5, resultadoValido, "A soma de 2 e 3 deve ser igual a 5");

        try {
            Math_TB_14169_13639_13635.adicionar(2, null);
        } catch (IllegalArgumentException e) {
            assertEquals("Valor nulo não é permitido", e.getMessage());
        }
        try {
            Math_TB_14169_13639_13635.adicionar(2, -1);
        } catch (IllegalArgumentException e) {
            assertEquals("Valor negativo não é permitido", e.getMessage());
        }

        int resultadoBorda = Math_TB_14169_13639_13635.adicionar(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, resultadoBorda, "A soma de Integer.MAX_VALUE e 1 deve ser igual a Integer.MIN_VALUE");
    }

    @org.junit.jupiter.api.Test
    void subtrair() {
        int resultadoValido = Math_TB_14169_13639_13635.subtrair(5, 3);
        assertEquals(2, resultadoValido, "A subtração de 5 e 3 deve ser igual a 2");

        try {
            Math_TB_14169_13639_13635.subtrair(5, null);
        } catch (NullPointerException e) {
            assertEquals("Valor nulo não é permitido", e.getMessage());
        }
        try {
            Math_TB_14169_13639_13635.subtrair(5, -1);
        } catch (NullPointerException e) {
            assertEquals("Valor negativo não é permitido", e.getMessage());
        }

        int resultadoBorda = Math_TB_14169_13639_13635.subtrair(Integer.MAX_VALUE, -1);
        assertEquals(Integer.MAX_VALUE + 1, resultadoBorda, "A subtração de Integer.MAX_VALUE e -1 deve resultar em estouro de inteiro");
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        int resultadoValido = Math_TB_14169_13639_13635.multiplicar(5, 3);
        assertEquals(15, resultadoValido, "A multiplicação de 5 por 3 deve ser igual a 15");

        try {
            Math_TB_14169_13639_13635.multiplicar(5, null);
        } catch (NullPointerException e) {
            assertEquals("Valor nulo não é permitido", e.getMessage());
        }

        int resultadoBorda = Math_TB_14169_13639_13635.multiplicar(Integer.MAX_VALUE, 2);
        assertEquals(Integer.MAX_VALUE, resultadoBorda, "A multiplicação de Integer.MAX_VALUE por 2 deve resultar em estouro de inteiro");
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        int resultadoValido = Math_TB_14169_13639_13635.dividir(10, 2);
        assertEquals(5, resultadoValido, "A divisão de 10 por 2 deve ser igual a 5");

        try {
            Math_TB_14169_13639_13635.dividir(10, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero não é permitida.", e.getMessage());
        }
        try {
            Math_TB_14169_13639_13635.dividir(10, -1);
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por número negativo não é permitido.", e.getMessage());
        }

        int resultadoBorda = Math_TB_14169_13639_13635.dividir(5, 1);
        assertEquals(5, resultadoBorda, "A divisão de qualquer número por 1 deve ser igual ao próprio número");
    }
}