public class MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int i = 0; i < 3; i++) {//       i0           i1         i2
            for (int j = 4; j >1 ; j--) {//j4,j3, j2    j4 j3 j2   j4 j3 j2
                x = x + 3;//                3  9  15    21 27 33   39 45 51
                y = y - 2;//               28  26 24    20 18 16   12 10 8
                if(x == 6){
                    break;
                }
                x = x + 3;//                6 12  18    24 30 36   42 48 54
            }
            y = y - 2;    //                  22           14         6
        }
        System.out.println(x + " " + y);  // 54  6
    }
}
