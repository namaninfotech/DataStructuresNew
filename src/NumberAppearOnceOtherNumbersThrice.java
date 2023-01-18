public class NumberAppearOnceOtherNumbersThrice {

    static int find(int arr[]) {
        int threeN = Integer.MAX_VALUE;
        int threeNP1 = 0;
        int threeNP2 = 0;

        for (int i : arr) {

            int c1 = i & threeN;
            int c2 = i & threeNP1;
            int c3 = i & threeNP2;

            threeN = threeN & (~c1);
            threeNP1 = threeNP1 | c1;

            threeNP1 = threeNP1 & (~c2);
            threeNP2 = threeNP2 | c2;

            threeNP2 = threeNP2 & (~c3);
            threeN = threeN | c3;
        }
        return threeNP1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 10, 1, 1,3,4,3,4,3,4};
        System.out.println(find(arr));
    }
/*

25
2512 -91024 -24541 76954 -93205 2512 -24541 54236 -63032 15254 50364 -63032 15254 15254 76954 50364 -63032 -91024 54236 50364 -24541 54236 76954 2512 -91024
*/
}
