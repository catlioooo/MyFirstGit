public class Ch5_1 {
    public static void main(String[] args) {
        double avg;    //存放平均溫度
        double total = 0;  //存放溫度總和

        //double[] degree;           // 宣告**
        //degree = new double[7];    // 配置***

        //double[] degree = new double[7]; //同時執行宣告與配置
        double[] degree = {24, 26, 27, 28, 29, 25, 30};
        //陣列一定從0開,始
//        degree[0] = 24;
//        degree[1] = 26;
//        degree[2] = 27;
//        degree[3] = 28;
//        degree[4] = 29;
//        degree[5] = 25;
//        degree[6] = 30;

        //利用陣列裡面的樓層來佐for迴圈遞增讀取
        for (int i = 0; i < degree.length; i++) {
            total += degree[i]; //total = "total" + degree[0]
                                // "total" 不知道是什麼，所以要初始化0
        }
        avg = total / degree.length;
        System.out.println("average=" + avg);
    }
}
