package Exceptioan_And_IOFile.IO_File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ReadPrintObjects {
 public static void main (String[]args){

    printObejctToFile();
    readObjectFromFile();

    //print arraylist to file
    ArrayList<Student>studentList = new ArrayList<>();
    studentList.add(new Student(10,"nazlı", false));
    studentList.add(new Student(15,"elif", true));
    try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("StudentObjects.dat")))){
        objectOutputStream.writeObject(studentList);
    }catch(Exception e){
        System.out.println(e);
    }
 }


private static void readObjectFromFile() {
    try(ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("StudentObjects.dat")))){

    boolean endOfFile = false;
    while(!endOfFile){
        try{
            Student readerObject = (Student) objectInputStream.readObject();
            System.out.println(readerObject);
        }catch(EOFException e){
            endOfFile = true;
        }
    }
   }catch(Exception e){
    System.out.println(e);
}
    
}

private static void printObejctToFile() {
    Student student1 = new Student(50,"elif",true);
    Student student2 = new Student(60,"batu",false);
    Student student3 = new Student(70,"latte",true);

    try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("StudentObjects.dat")))){

        objectOutputStream.writeObject(student1);
        objectOutputStream.writeObject(student2);
        objectOutputStream.writeObject(student3);

    }catch(Exception e){
        System.out.println(e);
    }
}   
}

class Student implements Serializable{
    int id;
    String name;
    boolean active;
    private final long serialVersionUID=1L;

    public Student(int id, String name, boolean active){
        this.id=id;
        this.name=name;
        this.active=active;
    }

    public String toString(){
        return "Student's id : " + id + "name : " + name + "activity : " + active;
    }
}

/*
TaskType1 J1 1 30
Job2 J1 2 29
Job3 J2 5 40
Job4 J2 7 35
Job5 J3 10 30
 */
