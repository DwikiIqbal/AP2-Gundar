public class array{
    public static void main(String[] args){
        System.out.println("==== Program Mencari Array Ganda ====");
        System.out.println("");
        System.out.println("Output 1D:");
        int[] number1d = {1,12,12,3,13,4,4,5,6};
        int counter1D = 1;
        for (int i = 0; i < number1d.length; i++) {
            for (int j = i+1; j < number1d.length; j++){
                if (number1d[i] == number1d[j]){
                    // Menampilkan angka ganda pada iterasi i
                    System.out.println("Eleman ganda " + counter1D + ": " + number1d[i]);
                    // Menampilkan indeks atau lokasi angka yang ganda
                    System.out.println("Lokasi : [" + i + "] dan [" + j +"]");
                    counter1D++;
            } break;
            }

        }

        int[][] array2D = {
            {5, 6, 10, 12},
            {8, 10, 12, 7},
            {2, 4, 9, 3}
        };  // Contoh data
        System.out.println("");
        System.out.println("Output 2D:");
        int counter2D = 1;
        int rows = array2D.length;
        int cols = array2D[0].length;

        // Cek duplikat di array 2D
        for (int i1 = 0; i1 < rows; i1++) {
            for (int j1 = 0; j1 < cols; j1++) {
                for (int i2 = i1; i2 < rows; i2++) {
                    for (int j2 = (i2 == i1 ? j1 + 1 : 0); j2 < cols; j2++) {
                        if (array2D[i1][j1] == array2D[i2][j2]) {
                            System.out.println("Elemen ganda " + counter2D + ": " + array2D[i1][j1]);
                            System.out.println("Lokasi : [" + i1 + "][" + j1 + "] dan [" + i2 + "][" + j2 + "]");
                            counter2D++;
                            break; // Setelah ketemu, lanjut ke elemen berikutnya
                        }
                    }
                    if (counter2D > 1 && i2 == rows) {
                        break;
                    }
                }
            }
        }

    }
}