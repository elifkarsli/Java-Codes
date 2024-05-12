package Exceptioan_And_IOFile.IO_File;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class InputOutputStream {
    public static void main (String[]args){
        readFile();
        writeFile();
        
    }

    
    private static void writeFile() {
       

        Student student1 = new Student(1,"elif" , false);
        Student student2 = new Student(2,"batu" , true);
      
        try(DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("student.dat")));){
        
        dataOutputStream.writeInt(student1.id);
        dataOutputStream.writeUTF(student1.name);
        dataOutputStream.writeBoolean(student1.active);

        dataOutputStream.writeInt(student2.id);
        dataOutputStream.writeUTF(student2.name);
        dataOutputStream.writeBoolean(student2.active);
      
      }catch(IOException e){
        e.printStackTrace();
      }
        // We can write it like this, when we write this like this we do not have to think about to close the data output stream
    }


    private static void readFile() {
     DataInputStream dataInputStream = null;
     boolean endOfFile = false;
     try{
        dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("student.dat")));
        Student readerStudent;

        while(!endOfFile){
            try{
                int id = dataInputStream.readInt();
                String name = dataInputStream.readUTF();
                boolean active = dataInputStream.readBoolean();
                readerStudent = new Student(id, name, active);
                System.out.println("Student : " + readerStudent);
            }catch(EOFException e){
                System.out.println("It's the end of the file");
                endOfFile=true;
            }
        }
     } catch(FileNotFoundException e){
        e.printStackTrace();
     }catch(IOException e){
        e.printStackTrace();
     }finally{
        if(dataInputStream != null){
            try{
                dataInputStream.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
     }
    }

}

class Student{
    int id;
    String name;
    boolean active;

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
Student : Student's id : 1name : elifactivity : false
Student : Student's id : 2name : batuactivity : true
It's the end of the file 
*/