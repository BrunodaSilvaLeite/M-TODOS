
public class Main {
    //Criando método para verificar se num1 é negativo. Se num1 for menor que 0, imprime "negativo", caso contrário, imprime "positivo".
    public static void verificaNegativoOuPositvo(double num1) {
        if(num1 < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Positivo");
        }
    }
    //Criando um método que recebe num1, num2 e num3 e acha a média aritmética desses 3 números e mostra na tela
    public static void calculaMedia(double num1, double num2, double num3) {

        System.out.println( "A média é:" +(num1 + num2 + num3) / 3);
    }

    //Criando um método que recebe num1, num2 e num3 e retorna para a main o maior número entre os 3
    public static double maiorNumero(double num1, double num2, double num3) {

        if(num1 > num2 && num1>num3 ) {
            return num1;
        }
        else if(num2> num1 && num2>num3) {
            return num2;
        }
        return num3;
        //Existe Math.max(a, Math.max(b, c)); esse metodo math que retorna a maior numero tambem
    }
    //Criando um método que recebe num1, num2 e retorna para o main o num1 * num2
    public static double metodoAB(double num1, double num2) {
        return (num1 * num2);

    }
    // Ciando um método que recebe um valor em minutos, converte para horas dividindo por 60 e calcula os minutos restantes usando o operador %, e depois retorna para main
    public static String converterMinutosParaHoras(int minutos) {
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        return horas + " hora e " + minutosRestantes + " minuto";
    }
    // Criando um metodo que recebe um número, valida se é menor que 0 e, caso contrário, calcula o fatorial e retorna para main.

    public static String fatorial (int num1) {
        if(num1 < 0 ){
            return "Não existe fatorial de número negativo";
        }
        int resultado = 1;
        for (int i = 1; i <= num1; i++) {
            resultado *= i;
        }
        return "fatorial de " + num1 +" é:"  + resultado;
    }

    public static void main(String[] args) {
        verificaNegativoOuPositvo(2);
        calculaMedia(2,3,4);
        System.out.println("O mario número é : "+ maiorNumero(5,6,4));
        System.out.println(metodoAB(5,6));
        System.out.println(converterMinutosParaHoras(130));
        System.out.println( fatorial(5));
    }
}