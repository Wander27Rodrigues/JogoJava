import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

    public  class jogo {
            public  static void  main(String [] args){
                PrintStream show = System.out;
                Scanner scan = new Scanner(System.in);
                Random gerador = new Random();

                int opcao;
                int escolha_computador;
                int escolha_usuario;

                show.println("Oi! Qual o seu nome?");
                String nome = scan.nextLine();
                show.println("Prazer em conhece-lo " + nome+"!");
                show.println(nome + ", você quer jogar comigo?");
                show.println("\nInforme o número da sua opção.\n1");
                opcao = scan.nextInt();

                    if(opcao == 2) {
                        show.println("Que pena! mas tudo bem, fica para proxima");
                    }else if(opcao == 1){
                        show.println("ok! o jogo é assim...");
                        show.println("Eu vou escolher um número de 0 a 10");
                        show.println("Mas não vou falar para você qual vai ser!");
                        show.println("Se você conseguir adivinhar qual será");
                        show.println("Você será o vencendor!!");

                        escolha_computador = gerador.nextInt(11);

                        show.println("Ok, "+nome+". Eu já escolhi!");
                        show.println("Que comece o jogo! tente adivinhar!");

                            do {
                                escolha_usuario = scan.nextInt();
                                if (escolha_usuario != escolha_computador) {
                                    show.println("Resposta errada!");
                                } else {
                                    show.println("Parabéns! Você acertou!");
                                }
                            }while (escolha_computador != escolha_usuario);
                            }
                    }
            }
}
}