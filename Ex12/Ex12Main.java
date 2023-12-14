package Ex12;

import Ex12.Domain.Component;
import Ex12.Domain.File;
import Ex12.Domain.Folder;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex12Main {
    public static void main(String[] args){
        File file1 = new File("file1");
        ArrayList<Component> innerSpace1 = new ArrayList<>(Arrays.asList(file1));
        Folder folder1 = new Folder("folder1", innerSpace1);

        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");
        ArrayList<Component> innerSpace2 = new ArrayList<>(Arrays.asList(file2, file3, file4));
        Folder folder2 = new Folder("folder2", innerSpace2);

        File file5 = new File("file5");

        ArrayList<Component> innerSpace3 = new ArrayList<>(Arrays.asList(folder1, folder2, file5));
        Folder root = new Folder("root", innerSpace3);

        System.out.println(root.count() + " файлов всего в корневой папке");
    }
}
