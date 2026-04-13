public class App {
    public static void main(String[] args) throws Exception {
        
        Xadrez xadrez = new Xadrez();
        char[][] resultado = xadrez.metodo();

        // Criei esse for aqui para printar a matriz, coloquei de forma "ignorante as torres, bloqueios e inimigos, fica em aberto uma otimização futura"

        // Criei uma condição para começar a contagem quando for T o valor

        for(int i=0; i<resultado.length; i++) {
            for(int j=0; j<resultado[i].length; j++) {
                resultado[1][3] = 'I';
                resultado[4][3] = 'B';
                resultado[5][3] = 'I';
                resultado[2][6] = 'B';
                resultado[2][7] = 'I';
                resultado[2][3] = 'T';
                System.out.print(resultado[i][j] + " ");
                if(resultado[i][j] == 'T'){
                    xadrez.contarPecas(i, j);
                }
            }
            System.out.println();
        }

        System.out.println("Número de peças que a torre poderia capturar na jogada: " + xadrez.numPecas);

    }
}
