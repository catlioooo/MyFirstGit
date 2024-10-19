class Employee {
    String name;
    int id;
    int age;

    Employee(String name, int id, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    void printInfo(){
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("id=" + id);
    }
}