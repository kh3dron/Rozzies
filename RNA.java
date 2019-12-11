package Rozzies;

public class RNA {

    public static void main(String[] args){

        String DNA = "GATGGAACTTGACTACGTAAATT";
        String RNA = "";

        System.out.println("YORT");

        int length = DNA.length();

        for (int r = 0; r < length; r++) {
            char selected = (char) DNA.indexOf(r);
            System.out.println(selected);
        }

        System.out.println(RNA);

    }





}
