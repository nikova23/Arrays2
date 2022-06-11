public class Main {

    public static void printSamenumbers () {
        int[] numbers  = {2,16,7,8,16,17,5,2,7} ;
        System.out.println(numbers[0] );
        System.out.println(numbers[1]);
        for (int i = 0; i < numbers.length-1 ; i++) {
            System.out.println(i);

            int[] numbers1  = {2,16,7,8,16,17,5,2} ;
           for (int j = 0; j < numbers1.length -1;j++) {
                System.out.println(i==j);

            }
        }
    }

    public static void main(String[] args) {
        printSamenumbers();

    }
}