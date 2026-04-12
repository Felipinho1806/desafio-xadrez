public class Xadrez {

    char [][]matriz = new char[8][];
 
    public char[][] metodo() {
        for(int i=0; i<matriz.length; i++){
            matriz[i] = new char[8];
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j]='.';
            }
        }
        return matriz;
    }
    
}