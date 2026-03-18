import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Olá, voce está em uma calculadora, escolha a operação que deseja realizar: \n\ndigite: \n1 para Soma \n2 para Subtração \n3 para Multiplicação \n4 para Divisão\n");
        int operacao = leia.nextInt();
        
        if (operacao == 1) {
        System.out.println("Você escolheu a operação de Soma.");   
        } else if (operacao == 2) {
            System.out.println("Você escolheu a operação de Subtração.");
        } else if (operacao == 3) {
            System.out.println("Você escolheu a operação de Multiplicação.");
        } else if (operacao == 4) {
            System.out.println("Você escolheu a operação de Divisão.");
        }else {
            System.out.println("Operação inválida. Por favor, escolha uma operação entre 1 e 4.");
            return; // Encerra o programa se a operação for inválida
        }

        System.out.println("Digite o primeiro número: ");
        double num1 = leia.nextDouble();

        System.out.println("Digite o segundo número: ");
        if (operacao == 4) {
            System.out.println("(OBS: Você escolheu a operação de Divisão, lembre-se de que o segundo número não pode ser zero.)");
        }
        double num2 = leia.nextDouble();

        System.out.println("Você digitou os números: " + num1 + " e " + num2);

        double resultado = 0; // Variável para armazenar o resultado da operação

        if(operacao == 1){
            resultado = num1 + num2;
            System.out.println("O resultado da soma é: " + resultado);
        } else if(operacao == 2){
            resultado = num1 - num2;
            System.out.println("O resultado da subtração é: " + resultado);
        } else if(operacao == 3){
            resultado = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else if(operacao == 4){
            if(num2 != 0){
            resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } 

        System.out.println("\nDeseja realizar outra operação? (S/N)");
        String resposta = leia.next();

        if(resposta.equalsIgnoreCase("S")){
            System.out.println("Deseja manter o resultado anterior para a próxima operação? (S/N)");
            String manterResultado = leia.next();

            if(manterResultado.equalsIgnoreCase("S")){
                System.out.println("\nVocê escolheu manter o resultado anterior. O resultado da última operação será usado como o primeiro número para a próxima operação.");
                System.out.println("Informe qual será sua operação deseja: \n1 para Soma \n2 para Subtração \n3 para Multiplicação \n4 para Divisão\n");
                int novaOperacao = leia.nextInt();
                
                if(novaOperacao == 1) {
                    System.out.println("Você escolheu a operação de Soma.");   
                } else if (novaOperacao == 2) {
                    System.out.println("Você escolheu a operação de Subtração.");
                } else if (novaOperacao == 3) {
                    System.out.println("Você escolheu a operação de Multiplicação.");
                } else if (novaOperacao == 4) {
                    System.out.println("Você escolheu a operação de Divisão.");
                } else {
                    System.out.println("Operação inválida. Por favor, escolha uma operação entre 1 e 4.");
                    return; // Encerra o programa se a operação for inválida
                }

                System.out.println("Digite o segundo número: ");
                if (novaOperacao == 4) {
                    System.out.println("(OBS: Você escolheu a operação de Divisão, lembre-se de que o segundo número não pode ser zero.)");    
                }
                
                double novoNum2 = leia.nextDouble();

                System.out.println("\nVocê digitou os números: " + resultado + " e " + novoNum2);

                if (novaOperacao == 1) {
                    resultado = resultado + novoNum2;
                    System.out.println("O resultado da soma é: " + resultado);
                } else if (novaOperacao == 2) {
                    resultado = resultado - novoNum2;
                    System.out.println("O resultado da subtração é: " + resultado);
                } else if (novaOperacao == 3) {
                    resultado = resultado * novoNum2;
                    System.out.println("O resultado da multiplicação é: " + resultado);
                } else if (novaOperacao == 4) {
                    if (novoNum2 != 0) {
                        resultado = resultado / novoNum2;
                        System.out.println("O resultado da divisão é: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                }

            }else {
                System.out.println("Você escolheu não manter o resultado anterior. A próxima operação começará do zero.");
                return; // Encerra o programa para iniciar uma nova operação do zero
            }
        } else {
            System.out.println("Encerrando a calculadora. Obrigado por usar!");
        }
        leia.close();}  
}
