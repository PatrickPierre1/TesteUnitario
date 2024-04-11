package TesteUnitario;

//RA: 14169
public class Math_RAsAlunos {
    public static Integer adicionar(Integer a, Integer b) {
        return a + b;
    }

    public static Integer subtrair(Integer a, Integer b) {
        return a - b;
    }

    public static Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    public static Integer dividir(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
