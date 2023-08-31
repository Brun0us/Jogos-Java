import java.util.Scanner;

public class PI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (true) {
                
                System.out.println("Digite 1 (para jogo da velha), 2 (para batalha naval) ou 3 (para encerrar o programa)!");
        
                int jogo = sc.nextInt();
        
                // se escolher Jogo da velha
                if (jogo == 1) {
        
                    System.out.println("             JOGO DA VELHA");
                    System.out.println("Digite (1) se deseja jogar uma única partida");
                    System.out.println("Digite (3) se deseja jogar melhor de três");
                    System.out.println("Digite (5) se deseja jogar melhor de cinco");
        
                    int numerosDePartidas = sc.nextInt();
        
                    if (numerosDePartidas == 1) {
                        while (true) {
        
                            String result = jogoDaVelha();
                            System.out.println("Parabens " + result + " ganhou a rodada");
        
                            if (result.equals("O")) {
                                System.out.println("Parabens o (O) ganhou a jogo");
                                break;
                            } else if (result.equals("X")){
                                System.out.println("Parabens o (X) ganhou a jogo");
                                break;
                            }
                        }
                    }
                    if (numerosDePartidas == 3) {
                        int pontosO = 0;
                        int pontosX = 0;
                        while (true) {
                            String result = jogoDaVelha();
        
                            System.out.println("Parabens " + result + " ganhou a rodada");
                            if (result.equals("O")) {
                                pontosO++;
                            } else if (result.equals("X")) {
                                pontosX++;
                            }
        
                            System.out.println("Placar esta " + pontosO + " O x X " + pontosX);
                            if (pontosO == 2) {
                                System.out.println("Parabens o (O) ganhou a jogo");
                                break;
                            } else if (pontosX == 2) {
                                System.out.println("Parabens o (X) ganhou a jogo");
                                break;
                            }
                        }
                    }
                    if (numerosDePartidas == 5) {
                        int pontosO = 0;
                        int pontosX = 0;
                        while (true) {
                            String result = jogoDaVelha();
        
                            System.out.println("Parabens " + result + " ganhou a rodada");
                            if (result.equals("O")) {
                                pontosO++;
                            } else if (result.equals("X")) {
                                pontosX++;
                            }
        
                            System.out.println("Placar esta " + pontosO + " O x X " + pontosX);
                            if (pontosO == 2) {
                                System.out.println("Parabens o (O) ganhou a jogo");
                                break;
                            } else if (pontosX == 2) {
                                System.out.println("Parabens o (X) ganhou a jogo");
                                break;
                            }
                        }
                    }
        
                }
        
                // se escolher Batalha Naval
                else if (jogo == 2) {
                    batalhaNaval();
                    System.out.println();
        
                }

                //se quiser encerrar o programa

                else if(jogo ==3){
                    break;
                }
        
                // se não escolher nenhum
                else {
                    System.out.println("Número invalido! Digite 1 ou 2 para os jogar os jogos!");

                    sc.close();
                }
            }

    }

    public static String jogoDaVelha() {
        Scanner sc = new Scanner(System.in);
        String msg = "";

        System.out.println("    |   |    ");
        System.out.println("  0 | 1 | 2  ");
        System.out.println("____|___|____");
        System.out.println("    |   |    ");
        System.out.println("  3 | 4 | 5  ");
        System.out.println("____|___|____");
        System.out.println("    |   |    ");
        System.out.println("  6 | 7 | 8  ");
        System.out.println("    |   |    ");

        String[] coordenada = { " ", " ", " ", " ", " ", " ", " ", " ", " " };

        for (int i = 0; i < 9; i++) {
            System.out.println("Digite a coordenada que for jogar!!");
            int jogada = sc.nextInt();

            if (coordenada[jogada] == "X" || coordenada[jogada] == "O") {
                System.out.println("Essa coordenada já foi usada digite outra.");
                i--;
                continue;
            }
            
            else if(jogada < 0 || jogada > 8){
                System.out.println("Essa coordenada é invalida.");
                i--;
                continue;
            }

            if (i % 2 == 0) {
                coordenada[jogada] = "X";
            } else if (i % 2 == 1) {
                coordenada[jogada] = "O";
            }

            System.out.println("    |   |                    |   |    ");
            System.out.println("  0 | 1 | 2                " + coordenada[0] + " | " + coordenada[1] + " | "
                    + coordenada[2] + "  ");
            System.out.println("____|___|____            ____|___|____");
            System.out.println("    |   |                    |   |    ");
            System.out.println("  3 | 4 | 5                " + coordenada[3] + " | " + coordenada[4] + " | "
                    + coordenada[5] + "  ");
            System.out.println("____|___|____            ____|___|____");
            System.out.println("    |   |                    |   |    ");
            System.out.println("  6 | 7 | 8                " + coordenada[6] + " | " + coordenada[7] + " | "
                    + coordenada[8] + "  ");
            System.out.println("    |   |                    |   |    ");

            if (coordenada[0] == "X" && coordenada[1] == "X" && coordenada[2] == "X") {
                msg = "X";
                break;
            } else if (coordenada[3] == "X" && coordenada[4] == "X" && coordenada[5] == "X") {
                msg = "X";
                break;
            } else if (coordenada[6] == "X" && coordenada[7] == "X" && coordenada[8] == "X") {
                msg = "X";
                break;
            } else if (coordenada[0] == "X" && coordenada[3] == "X" && coordenada[6] == "X") {
                msg = "X";
                break;
            } else if (coordenada[1] == "X" && coordenada[4] == "X" && coordenada[7] == "X") {
                msg = "X";
                break;
            } else if (coordenada[2] == "X" && coordenada[5] == "X" && coordenada[8] == "X") {
                msg = "X";
                break;
            } else if (coordenada[6] == "X" && coordenada[4] == "X" && coordenada[2] == "X") {
                msg = "X";
                break;
            } else if (coordenada[0] == "X" && coordenada[4] == "X" && coordenada[8] == "X") {
                msg = "X";
                break;
            }
            /*----------------------------------------------------------------------------------------------------------- */
            else if (coordenada[0] == "O" && coordenada[1] == "O" && coordenada[2] == "O") {
                msg = "O";
                break;
            } else if (coordenada[3] == "O" && coordenada[4] == "O" && coordenada[5] == "O") {
                msg = "O";
                break;
            } else if (coordenada[6] == "O" && coordenada[7] == "O" && coordenada[8] == "O") {
                msg = "O";
                break;
            } else if (coordenada[0] == "O" && coordenada[3] == "O" && coordenada[6] == "O") {
                msg = "O";
                break;
            } else if (coordenada[1] == "O" && coordenada[4] == "O" && coordenada[7] == "O") {
                msg = "O";
                break;
            } else if (coordenada[2] == "O" && coordenada[5] == "O" && coordenada[8] == "O") {
                msg = "O";
                break;
            } else if (coordenada[6] == "O" && coordenada[4] == "O" && coordenada[2] == "O") {
                msg = "O";
                break;
            } else if (coordenada[0] == "O" && coordenada[4] == "O" && coordenada[8] == "O") {
                msg = "O";
                break;
            }

            if (i == 8) {
                msg = "Deu Velha!";

                sc.close();
            }
        }
        return msg;
    }

    public static void batalhaNaval() {
        String[][] matr = { { "0 ", "1", "2", "3", "4", "5", "6", "7", "8","9","10" },
                { "1 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "2 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "3 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "4 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "5 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "6 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "7 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "8 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "9 ", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" },
                { "10", "?", "?", "?", "?", "?", "?", "?", "?", "?","?" } };
        int linha = 0;
        int coluna = 0;

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("--Quando um navio for acertado, será substituido '?' por 'N', caso for um submarion sera 'S' e porta-avioes po 'P'.--");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("--Existem 4 navios , 2 submarionos e 1 porta aviões.--");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("São 1 navio de 5, 1 navio de 3 de tamanho, 1 navio de 4 de tamanho, 1 navio de 2 de tamanho.\n2 submarinos de 1 de tamanho.\n1 Porta-aviões com 4 de tamanho horizontal e 2 vertical !");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                            ");
        System.out.println("     | N | --> Navio de 5 de tamanho                        ");
        System.out.println("     | N |        | N | --> Navio de 3 de tamanho           ");
        System.out.println("     | N |        | N |                                     ");
        System.out.println("     | N |        | N |                  | N |              ");
        System.out.println("     | N |     Navio de 2 de tamanho --> | N |              ");
        System.out.println("                                                            ");
        System.out.println("                         Submarino -->  | S |               ");
        System.out.println("                                                            ");
        System.out.println("                                                            ");
        System.out.println("            | N |                                           ");
        System.out.println("            | N |    <-- Navio de 4 de tamanho              ");
        System.out.println("            | N |                                           ");
        System.out.println("            | N |                                           ");
        System.out.println("                                                            ");
        System.out.println("                                                            ");
        System.out.println("            | P || P || P || P |                            ");
        System.out.println("                 | P |   <-- Porta-aviões                   ");
        System.out.println("                                                            ");
        System.out.println("                                                            ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Você tem 60 chances para acertas todos os alvos.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Boa sorte!!");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");


        

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(matr[i][j] + " | ");
            }
            System.out.println("");
            System.out.print("-------------------------------------------");
            System.out.println("");
        }
        for (int w = 0; w < 60; w++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("ESCOLHA A LINHA QUE VAI ATACAR:");
            linha = sc.nextInt();

            System.out.println("ESCOLHA A COLUNA QUE VAI ATACAR:");
            coluna = sc.nextInt();

            if (matr[linha][coluna] == "N" || matr[linha][coluna] == "S" || matr[linha][coluna] == " ") {
                System.out.println("Essa coordenada já foi jogada.");
                w--;
                continue;
            }
            else if(linha < 1 || linha > 10 || coluna < 1 || coluna > 10 ){
                System.out.println("Essa coordenada é invalida.");
                w--;
                continue;
            }

            sc.close();

            // ----------------navio 1 (5 de tamnaho)------------
            if (linha == 1 && coluna == 3) {
                matr[linha][coluna] = "N";
            } else if (linha == 1 && coluna == 4) {
                matr[linha][coluna] = "N";
            } else if (linha == 1 && coluna == 5) {
                matr[linha][coluna] = "N";
            } else if (linha == 1 && coluna == 6) {
                matr[linha][coluna] = "N";
            } else if (linha == 1 && coluna == 7) {
                matr[linha][coluna] = "N";
            }

            // --------------navio 2 (2 de tamanho)-------------
            else if (linha == 7 && coluna == 3) {
                matr[linha][coluna] = "N";
            } else if (linha == 8 && coluna == 3) {
                matr[linha][coluna] = "N";
            }

            // --------------navio 3 (3 de tamanho)---------------
            else if (linha == 5 && coluna == 6) {
                matr[linha][coluna] = "N";
            } else if (linha == 5 && coluna == 7) {
                matr[linha][coluna] = "N";
            } else if (linha == 5 && coluna == 8) {
                matr[linha][coluna] = "N";
            }

            // --------------navio 4 (4 de tamanho)---------------
            else if (linha == 2 && coluna == 10) {
                matr[linha][coluna] = "N";
            } else if (linha == 3 && coluna == 10) {
                matr[linha][coluna] = "N";
            } else if (linha == 4 && coluna == 10) {
                matr[linha][coluna] = "N";
            }else if (linha == 5 && coluna == 10) {
                matr[linha][coluna] = "N";
            }
            

            // --------------porta-aviões (4 de tamanho)---------------
            else if (linha == 8 && coluna == 6) {
                matr[linha][coluna] = "P";
            } else if (linha == 8 && coluna == 7) {
                matr[linha][coluna] = "P";
            } else if (linha == 8 && coluna == 8) {
                matr[linha][coluna] = "P";
            }else if (linha == 8 && coluna == 9) {
                matr[linha][coluna] = "P";
            }else if (linha == 9 && coluna == 7) {
                matr[linha][coluna] = "P";
            }
            

            // submariono 1
            else if (linha == 3 && coluna == 8) {
                matr[linha][coluna] = "S";
            }
            // submariono 2
            else if (linha == 10 && coluna == 7) {
                matr[linha][coluna] = "S";
            }

            else
                matr[linha][coluna] = " ";

            

            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    System.out.print(matr[i][j] + " | ");
                }
                System.out.println("");
                System.out.print("-------------------------------------------");
                System.out.println("");
            }

            if (matr[1][3] == "N" && matr[1][4] == "N" && matr[1][5] == "N" && matr[1][6] == "N" && matr[1][7] == "N"
                && matr[7][3] == "N" && matr[8][3] == "N"
                && matr[5][6] == "N" && matr[5][7] == "N" && matr[5][8] == "N"
                && matr[2][10] == "N" && matr[3][10] == "N" && matr[4][10] == "N" && matr[5][10] == "N"
                && matr[8][6] == "P" && matr[8][7] == "P" && matr[8][8] == "P" && matr[8][9] == "P" && matr[9][7] == "P"  
                && matr[3][8] == "S" && matr[10][7] == "S") {
                System.out.println("Parabens você ganhou !!!");
                break;
                
    
            }
        }

    }

}