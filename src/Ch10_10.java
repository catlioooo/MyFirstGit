//實作觀念:因為繼承有分為多層繼承與分層繼承，那這樣整體城市馬會變得很冗長(ex. Ch10-7 / Ch10-8)，所以實作上會分成多個程式碼檔案

public class Ch10_10 {
    public static void main(String[] args) {
        Employee employee = new Employee("Alisa", 1020199 , 26);
        employee.printInfo();
    }
}
