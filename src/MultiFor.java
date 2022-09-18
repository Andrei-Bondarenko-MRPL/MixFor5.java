public class MultiFor {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {           //   j j
                                                //i  0 4
            for (int j = 4; j > 2; j--) {       //i  0 3
                System.out.println(i + " " + j);//i  1 4
            }                                   //i  1 3
            if (i == 1) {                       //i  3 4
                i++;                            //i  3 3
            }
        }
    }
}
