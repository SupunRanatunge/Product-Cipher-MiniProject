package Cipher.Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.List;

/**
 *
 * @author supun
 */
public class CipherMethods {
    File file;
    int key;
    int i;
    int j;
    int k;
    int m;
    int numb;
    int number;
    String test="";
    String out ="";
    ArrayList<String> content = new ArrayList();
    ArrayList<Character> output = new ArrayList();
    ArrayList<Character> decSub = new ArrayList();
    
    
    public CipherMethods(){
        
    }
    public ArrayList substitute_txt(File file,int key) throws FileNotFoundException, IOException{
        
        FileReader reader = new FileReader(file);
        BufferedReader buf = new BufferedReader(reader);
        String currentLine;
        
        while((currentLine = buf.readLine())!=null){
            content.add(currentLine);
            System.out.println("Content in the file : "+ currentLine);
        }
        
        for(i=0;i<content.get(0).length();i++){
            j = content.get(0).charAt(i);
            int ascii = (int)j;
            numb = key + ascii;
            
            if (numb<127){                                      //shifting the characters
                char secret = (char)numb;
                String.valueOf(secret);
                test = test + secret;
                output.add(secret);
            }else{
                int stackover;
                stackover = numb-95;
                char secret = (char)stackover;
                String.valueOf(secret);
                test = test + secret;
                output.add(secret);
            }
        
        }
        System.out.println("Encrypted content:    "+test);
        
        
        PrintWriter writer = new PrintWriter("Encrypted.txt", "UTF-8");
        writer.println(test);
        
        writer.close();
        return output;
    }
    
//    public void permutation_txt(ArrayList output,int key){
//        
//    }
    
    public void dec_substitute_txt(String line,int key){
        
        for(char ch: line.toCharArray()){
            int antiAscii = (int)ch;
            
            number = antiAscii - key;
            
            if (number>32){                                      //shifting back the characters
                char result = (char)number;
                decSub.add(result);
            }else{
                int stacklower;
                stacklower = number+95;
                char result = (char)stacklower;
                decSub.add(result);
            }
        }
        
        for(m=0; m< decSub.size();m++){
            out = out + decSub.get(m);
        }
        System.out.println("Decrypted text:    "+ out);
    }
}


