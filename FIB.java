package Rozzies;

public class FIB {

    public static void main(String[] args) {
        //put your search here
        int d = 8;

        int fibs[] = new int[10];
        fibs[0] = 1;
        fibs[1] = 1;

        for (int r = 2; r< fibs.length; r++){
            fibs[r] = fibs[r-1] + fibs[r-2];
            System.out.print(fibs[r] + " ");
        }

        System.out.print(fibs[d]);
    }

}
