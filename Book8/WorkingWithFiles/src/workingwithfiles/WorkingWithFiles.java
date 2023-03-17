/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingwithfiles;


import static com.sun.javadoc.Doclet.start;
import java.io.*;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

public class WorkingWithFiles {

    private static Path start;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\ISMAIL\\Documents\\Code College\\Java Advanced\\Dummies Exercises\\Book6\\WorkingWithFiles\\src\\workingwithfiles.txt";

      File f = new File(path);


try {
           if (!f.exists())
System.out.println
("The input file does not exist!");;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static class MyFileVisitor extends SimpleFileVisitor<Path> {

        public FileVisitResult visitFile(Path file,
                BasicFileAttributes attr) {
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult visitFileFailed(Path file,
                BasicFileAttributes attr) {
            System.out.println(file.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
        public FileVisitResult preVisitDirectoryFailed 
(Path dir, IOException e

        
            )
{
System.out.println(dir.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
    }
}