public class Calculator {

    public double soma(double valor1, double valor2){
        return valor1 + valor2;
    }

    public double divisao(double valor1, double valor2){
        if(valor2 == 0) {
            System.out.println("Não é possível dividir por zero");
            return 0;
        }
        return valor1 / valor2;
    }
}
