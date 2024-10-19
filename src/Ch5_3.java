public class Ch5_3 {
    public static void main(String[] args) {
        //for each 迴圈遍歷陣列, for(:)
        int[] numList = {5, 10, 15};
        for (int num : numList)
            System.out.println("numList:" + num);

        //下面寫法，我們特別不喜歡
        for (int i = 0; i < numList.length; i++) {
            System.out.println("numList:" + numList[i]);
        }
    }
}
