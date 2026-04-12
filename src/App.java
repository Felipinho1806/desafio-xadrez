public class App {
    public static void main(String[] args) throws Exception {
        
        Xadrez xadrez = new Xadrez();
        char[][] resultado = xadrez.metodo();

        for(int i=0; i<resultado.length; i++) {
            for(int j=0; j<resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

    }
}
