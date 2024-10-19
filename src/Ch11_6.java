abstract class Document {
    abstract void open();

    abstract void save();

    void close() {
        System.out.println("close the document");
    }
}

class Word extends Document {
    @Override
    void open() {
        System.out.println("OPEN Word");
    }

    void save() {
        System.out.println("SAVE Word");
    }
}

class Excel extends Document {
    @Override
    void open() {
        System.out.println("OPEN Excel");
    }

    void save() {
        System.out.println("SAVE Excel");
    }
}

public class Ch11_6 {
    public static void main(String[] args) {

    }
}
