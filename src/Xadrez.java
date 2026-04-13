public class Xadrez {

    char [][]matriz = new char[8][];
    int numPecas = 0;

    public char[][] metodo() {
        for(int i=0; i<matriz.length; i++){
            matriz[i] = new char[8];
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j]='.';
            }
        }
        return matriz;
    }

    public int contarPecas(int x, int y) {
        for(int i=0; i<matriz[x].length; i++) {
            if(matriz[x][i] == 'I') {
                numPecas++;
            }
        }
        for(int i=0; i<matriz[y].length; i++) {
            if(matriz[i][y] == 'I') {
                numPecas++;
            }
        }
        return numPecas;
    }
    
}