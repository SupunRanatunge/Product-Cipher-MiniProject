package Cipher.Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author supun
 */
public class CipherMethods {
    File file;
    int key;
    int i;
    int j;
    int numb;
    ArrayList<String> content = new ArrayList();
    ArrayList<Character> output;
    
    public CipherMethods(){
        
    }
    public void substitute_txt(File file,int key) throws FileNotFoundException, IOException{
        System.out.println("method is begun");
        FileReader reader = new FileReader(file);
        BufferedReader buf = new BufferedReader(reader);
        String currentLine;
        
        while((currentLine = buf.readLine())!=null){
            
            
            content.add(currentLine);
            
        }
        System.out.println(content);
        for(i=0;i<content.get(0).length();i++){
            j = content.get(0).charAt(i);
            int ascii = (int)j;
            numb = key + ascii;
            if (numb<127){
                char secret = (char)numb;
                output.add(secret);
            }else{
                int stackover;
                stackover = numb-95;
                char secret = (char)stackover;
                output.add(secret);
            }
        
        }
        System.out.println(output);
    }
}
    


