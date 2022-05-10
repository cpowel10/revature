package day5;

import java.io.File;
import java.io.IOException;

public class IOExercise {
    public static void main(String[] args) throws IOException {
        File folder1 = new File("C:\\Users\\chris\\IdeaProjects\\FirstProject\\src\\main\\java\\day5\\Batch");
        File file1 = new File("C:\\Users\\chris\\IdeaProjects\\FirstProject\\src\\main\\java\\day5\\Batch\\BatchMates.txt");
        if(!folder1.exists()){
            folder1.mkdir();
        }
        if(!file1.exists()){
            file1.createNewFile();
        }

        String[] allFileContents = folder1.list();

        for(String temp : allFileContents){
            if(allFileContents.length == 0){
                System.out.println("Nothing in folder or folder does not exist");
                break;
            }
            if(temp.contains(".")){
                System.out.println(temp+" is a file");
            }
            else
                System.out.println(temp+" is a folder");
        }
    }
}
