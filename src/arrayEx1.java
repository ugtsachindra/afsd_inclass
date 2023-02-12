public class arrayEx1 {
    public static void main(String[] args) {
        int [][] intArray = new int[5][];

        intArray[0]= new int[3];
        intArray[1]= new int[5];
        intArray[2]= new int[2];

        System.out.print("|"+intArray[0].length);
        System.out.print("|"+intArray[1].length);
        System.out.print("|"+intArray[2].length+"|");

    }
}
