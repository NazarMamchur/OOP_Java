public class MatrixPrint {

    public static void main(String args[]){
        for(int i = 1; i <= 25; i++){
            switch(i){
                case 1: case 21:
                    System.out.print(" * ");
                    break;
                case 7:case 9:case 13:case 17:case 19:
                    System.out.print(" * ");
                    break;
                case 5: case 25:
                    System.out.println(" * ");
                    break;
                case 10: case 15: case 20:
                    System.out.println(i + " ");
                    break;
                case 2:case 3:case 4:case 6: case 8:
                    System.out.print(" " + i + " ");
                    break;
                default:
                    System.out.print(i + " ");
                    break;
            }
        }
    }
}
