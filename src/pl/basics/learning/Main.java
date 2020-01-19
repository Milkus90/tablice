package pl.basics.learning;

public class Main {

    public static void main(String[] args) {
        int[][] tab = new int[9][9];
        RandomInt r = new RandomInt();

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
            tab[i][j] = r.getRandomNumberInRange (1,1000);
            }
        }

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                System.out.print(tab[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("Najwyzsza liczba w tablicy to: " + findBiggest(tab));
    }


    public static int findBiggest(int[][] tab){
        int biggest = 0;
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if (tab[i][j]>biggest){
                    biggest = tab[i][j];
                };
            }
        }
        return biggest;
    }
}
