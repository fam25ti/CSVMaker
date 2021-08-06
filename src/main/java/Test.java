import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        CSVGenerator generator = new CSVGenerator();
        ArrayList<Object> students = new ArrayList<Object>();
        Student student1 =new Student("Bob","Jackson", 23, 1234567L, (float) 18.7);
        Student student2 =new Student("Jack","Will", 25, 8765432L, (float) 19.5);
        Student student3 =new Student("Sam","Samuel", 35, 1928374L, (float) 16.47);
        Student student4 =new Student("Anne","William", 19,1239875L, (float) 19.92);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        generator.toCSV(students, "./file1.csv");
        ArrayList<Object> stuffs = new ArrayList<Object>();
        Stuff stuff1 = new Stuff("Mobile", "Samsung", "S10", 7,83847L );
        Stuff stuff2 = new Stuff("Shoes", "Nike", "FlyKnit", 2,83747L );
        Stuff stuff3 = new Stuff("Laptop", "Lenovo", "Thinkpad t430s", 1,73741L );
        Stuff stuff4 = new Stuff("Television", "XVision", "49XK580 ", 12,33929L );
        Stuff stuff5 = new Stuff("Headphone", "Apple", "AirPods Pro", 3,13423L );
        stuffs.add(stuff1);
        stuffs.add(stuff2);
        stuffs.add(stuff3);
        stuffs.add(stuff4);
        stuffs.add(stuff5);
        generator.toCSV(stuffs, "./file2.csv");
    }
}
