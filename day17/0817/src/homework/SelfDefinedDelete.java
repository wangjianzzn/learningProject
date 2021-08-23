package homework;

import java.io.File;

public class SelfDefinedDelete {
    public boolean myDelete(File file){
        String[] list = file.list();
        for (int i=0;i< list.length;i++) {
            if(file.isDirectory()){
                String sonPath = file.getAbsolutePath()+list[i];
                myDelete(new File(sonPath));
            }
        }
        return true;
    }

}