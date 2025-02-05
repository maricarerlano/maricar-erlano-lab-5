public class ArgyleRug {
    public static void main (String [] args){
	    String [] [] emoji = new String [11] [11];
	    for(int i = 0; i < emoji.length; i++){
            for(int j = 0; j < emoji[i].length; j++){
                if(i == j || i + j == 10 || i + j == 5 || i + j == 15 || j - i == 5 || i - j == 5){
                    emoji [i] [j] = "🌷";
                } else {
                    emoji [i] [j] = "🌱";
                }
            }
        }

        print2DArray(emoji);

    }



    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
