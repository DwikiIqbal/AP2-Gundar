public class array{
    public static void main(String[] args){

        int[] number1d = {1,12,12,3,13,4,4,5,6};
        for (int i = 0; i < number1d.length; i++) {
            for (int j = i+1; j < number1d.length; j++){
            if (number1d[i] == number1d[j]){
                System.out.println("Ini adalah array ganda : " + number1d[i]);
                System.out.println(number1d.length);
            } break;
            }

        }

        int[][] number2d = {{2,1,3,12,5}, {5,7,9,8,1}};
        for (int[] i : number2d) {
            System.out.println(i);
        }


    }
}