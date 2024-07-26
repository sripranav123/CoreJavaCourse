import java.io.File;

public class DirectoryExample {
    public static void main(String[] args){
        File directory = new File("mydir");
        if (directory.mkdir()){
            System.out.println("Directory created " + directory.getName());
        }
        else{
            System.out.println("File Already Exists");
        }
        File javaDir = new File("C:\\Users\\sripr\\IdeaProjects\\CoreJavaCourse\\src");
        if(javaDir.exists() && javaDir.isDirectory()){
            String[] fileslist = javaDir.list();
            System.out.println("Files in the Directory are "+javaDir.getName());
            if(fileslist!=null){
                for( String filename : fileslist){
                    System.out.println(filename);
                }
            }
        }

    }
}