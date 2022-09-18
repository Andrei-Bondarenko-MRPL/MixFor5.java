package another_X;

public class MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int i = 0; i < 3; i++) { //        io         i1              i2
            for (int j = 4; j > 1; j--) {//  j4 j3 j2    j4 j3 j2       j4 j3 j2
                x = x + 6;//                  6 -----    12 21 30       39 48 57
                y= y -2;  //                 28 -----    24 22 20       16 14  12
                if(x == 6){
                    break;
                }
                x = x + 3;//                 ---------   15 24 33       42 51 60
            }
            y = y -2 ;//                         26         18              10
        }
        System.out.println(x + " " + y); //60  10
    }
}