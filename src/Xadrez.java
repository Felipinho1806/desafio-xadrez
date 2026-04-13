public class Xadrez {

    char [][]matriz = new char[8][];
    int numPecas = 0;

    // Nesse método eu crio a matriz só com '.', pontos esses que são substituídos na Main

    public char[][] metodo() {
        for(int i=0; i<matriz.length; i++){
            matriz[i] = new char[8];
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j]='.';
            }
        }
        return matriz;
    }

    // Método de contar as peças, eu não curti esse monte de for amontoado e aqui tá aberto uma nova possibilidade de otimização futura

    public int contarPecas(int x, int y) {
        for (int j=y+1; j<matriz[x].length; j++) {
            if (matriz[x][j]=='B') {
                break;
            }
            if (matriz[x][j]=='I') {
                numPecas++;
                break;
            }
        }
        for (int j=y-1; j>=0; j--) {
            if (matriz[x][j]=='B') {
                break;
            }
            if (matriz[x][j]=='I') {
                numPecas++;
                break;
            }
        }
        for (int i=x+1; i<matriz.length; i++) {
            if (matriz[i][y]=='B') {
                break;
            }
            if (matriz[i][y]=='I') {
                numPecas++;
                break;
            }
        }
        for (int i=x-1; i>=0; i--) {
            if (matriz[i][y]=='B') {
                break;
            }
            if (matriz[i][y]=='I') {
                numPecas++;
                break;
            }
        }
        return numPecas;
    }
    
}