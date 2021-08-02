package LatihanUKL;
public class Latihan5 {
  public static void main(String[] args) {
    //Inisialisasi variabel matrix A
    int matrixA[][] = new int[2][2];
        matrixA[0][0] = -5;
        matrixA[0][1] = 3;
        matrixA[1][0] = 7;
        matrixA[1][1] = 2;

    //Inisialisasi variabel matrix B
    int matrixB[][] = new int[2][2];
        matrixB[0][0] = 3;
        matrixB[0][1] = 1;
        matrixB[1][0] = 5;
        matrixB[1][1] = -2;
        
        //Menampilkan matrix A
        System.out.println("matrix A :");
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA.length; j++){
                System.out.print(matrixA[i][j]+" ");
            }       
            System.out.println();
        }    
        
        //Menampilkan matrix B
        System.out.println("matrix B :");
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA.length; j++){
                System.out.print(matrixB[i][j]+" ");
            }       
            System.out.println();
        }    
        
        //Menampilkan hasil pengurangan matrix A dengan matrix B
        System.out.println("Penguran matrix A dengan matrix B :");
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA.length; j++){
                //Pengurangan matrix A dengan matrix B
                int hasil = matrixA[i][j] - matrixB[i][j]; 
                System.out.print(hasil+" ");
            }       
            System.out.println();
        }    
    }
}
