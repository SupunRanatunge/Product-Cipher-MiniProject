package Cipher.Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    int x;
    int c;
    int r;
    int numb;
    int number;
    String test="";
    String out ="";
    String result="";
    String result2="";
    ArrayList<String> content = new ArrayList();
    ArrayList<Character> output = new ArrayList();
    ArrayList<Character> decSub = new ArrayList();
    char letters[][];
    String resultArray[][];
    
    
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
        System.out.println("Substituted content:    "+test);
        System.out.println("Substituted content:    "+output);
        
        
        
        return output;
    }
    
    public void permutation_txt(ArrayList output,int key) throws FileNotFoundException{
        int rest = (key-(output.size()%key));
        if (output.size()%key != 0) {
            for (x=0;x<rest;x++){
                output.add('x');
            }
        }
            
            int hg = -1;
            letters = new char[output.size()/key][key];
            for (int v=0; v<(output.size()/key); v++) {
                
                for (int z=0; z<key; z++) {

                    hg = hg+1;
                    letters[v][z] =  (char) output.get(hg);
                    

                }
            }
            System.out.println(Arrays.deepToString(letters));
            for (int z=0; z<key; z++) {
                for (int v=0; v<(output.size()/key); v++) {
                    
                    char lk = (letters[v][z]);
                    String.valueOf(lk);
                    result = result + lk ;
                }
            
            }
            System.out.println("Encrypted Content :"+result);
            PrintWriter writer = null;
            try {
                writer = new PrintWriter("Encrypted.txt", "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(CipherMethods.class.getName()).log(Level.SEVERE, null, ex);
            }
            writer.println(result);
        
            writer.close();
        
    }
    
    
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
    
    
public String de_permutation_txt(String line, int key) {
    resultArray = new String[line.length()/key][key];
    int fg = -1;
    System.out.println(line+" "+ key);
    for (int z=0; z<key; z++) {
        for (int v=0; v<(line.length()/key); v++) {
                
        
            fg = fg+1;
            
            resultArray[v][z] =  Character.toString(line.charAt(fg));
        }
    }
    System.out.println(Arrays.deepToString(resultArray));
    for (int v=0; v<(line.length()/key); v++) {
        for (int z=0; z<key; z++) {
             String tr = (resultArray[v][z]);
             
             result2 = result2 + tr ;
            
        }
    }
    System.out.println(result2);
    
    return result2;
}
}



