//multi-thread 多執行緒
//java 預設情況，一個(process) 搭配一個 (thread)(main)
//多執行緒彼此是共享記憶體
//一個執行緒發生異常(exception)，他並不會影響其他的執行緒


//建立執行緒有兩種:
//1. 繼承 Thread 類型
//2. 實作 Runnable 介面

/*
New: 建立執行緒，在start() 方法前的狀態
Runnable:已經start()，但不是運行中
Running: 運行中
Terminate: 執行緒終止
Non-runnable: 執行緒還活著，可能是處在休眠sleep()狀態，所以無法運行
 */

/*
      Thread 類別 :
          void run(): 空方法
          start():啟動執行緒
          sleep():執行緒休息，單位是毫秒(millisecond,ms)
          join():等待執行緒死亡
          suspend():  deprecated
          rusume():  deprecated
          stop():  deprecated
 */
/*
      Runnable 介面:
      run()方法也是 runnable 介面唯一的方法
 */

//class A implements Runnable{
//    public void run() {
//        System.out.println("A is running");
//    }
//}
//
//public class Ch15 {
//    public static void main(String[] args) {
//        A a = new A();   //建立物件
//        Thread t = new Thread(a);
//        t.start();
//    }
//}
