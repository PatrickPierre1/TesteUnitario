package TesteUnitario;

import static org.junit.jupiter.api.Assertions.*;

class Math_RAsAlunosTest {

    @org.junit.jupiter.api.Test
    void adicionar() {
        int resultadoValido = Math_RAsAlunos.adicionar(2, 3);
        assertEquals(5, resultadoValido, "A soma de 2 e 3 deve ser igual a 5");

        try {
            Math_RAsAlunos.adicionar(2, null);
        } catch (IllegalArgumentException e) {
            assertEquals("Valor nulo não é permitido", e.getMessage());
        }

        int resultadoBorda = Math_RAsAlunos.adicionar(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, resultadoBorda, "A soma de Integer.MAX_VALUE e 1 deve ser igual a Integer.MIN_VALUE");
    }

    @org.junit.jupiter.api.Test
    void subtrair() {
        int resultadoValido = Math_RAsAlunos.subtrair(5, 3);
        assertEquals(2, resultadoValido, "A subtração de 5 e 3 deve ser igual a 2");

        try {
            Math_RAsAlunos.subtrair(5, null);
        } catch (NullPointerException e) {
            assertEquals("Valor nulo não é permitido", e.getMessage());
        }

        int resultadoBorda = Math_RAsAlunos.subtrair(Integer.MAX_VALUE, -1);
        assertEquals(Integer.MAX_VALUE + 1, resultadoBorda, "A subtração de Integer.MAX_VALUE e -1 deve resultar em estouro de inteiro");
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        int resultadoValido = Math_RAsAlunos.multiplicar(5, 3);
        assertEquals(15, resultadoValido, "A multiplicação de 5 por 3 deve ser igual a 15");

        try {
            Math_RAsAlunos.multiplicar(5, null);
        } catch (NullPointerException e) {
            assertEquals("b é null", e.getMessage());
        }

        int resultadoBorda = Math_RAsAlunos.multiplicar(Integer.MAX_VALUE, 2);
        assertEquals(Integer.MAX_VALUE, resultadoBorda, "A multiplicação de Integer.MAX_VALUE por 2 deve resultar em estouro de inteiro");
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        int resultadoValido = Math_RAsAlunos.dividir(10, 2);
        assertEquals(5, resultadoValido, "A divisão de 10 por 2 deve ser igual a 5");

        try {
            Math_RAsAlunos.dividir(10, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero não é permitida.", e.getMessage());
        }

        int resultadoBorda = Math_RAsAlunos.dividir(5, 1);
        assertEquals(5, resultadoBorda, "A divisão de qualquer número por 1 deve ser igual ao próprio número");
    }
}