public class App {
    public static void main(String[] args) throws Exception {
        
        Xadrez xadrez = new Xadrez();
        char[][] resultado = xadrez.metodo();

        for(int i=0; i<resultado.length; i++) {
            for(int j=0; j<resultado[i].length; j++) {
                resultado[1][3] = 'I';
                resultado[5][3] = 'I';
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
