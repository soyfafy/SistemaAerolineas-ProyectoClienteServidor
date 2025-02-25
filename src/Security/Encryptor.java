package Security;

import java.io.BufferedReader;
import java.io.FileReader;

public class Encryptor {
    private char[] charList;
    private char[] seed;
    
    public Encryptor (){
        setCharList();
        setSeed();
    }
    
    private void setCharList(){
        try{
            BufferedReader dataReader = new BufferedReader(new FileReader("src\\Security\\regularCharList.txt"));
            charList = dataReader.readLine().toCharArray();
            dataReader.close();
        }
        catch(Exception e){}
    }
    
    private void setSeed(){
        try{
            BufferedReader dataReader = new BufferedReader(new FileReader("src\\Security\\seed.txt"));
            seed = dataReader.readLine().toCharArray();
            dataReader.close();
        }
        catch(Exception e){}
    }
    
    public String encrypt(String input){
        char[] inputArray = input.toCharArray();
        String encryptedOutput = "";
        
        for(char i : inputArray){
            for(int j = 0; j < charList.length; j++){
                if(i == charList[j]){
                    encryptedOutput += seed[j];
                }
            }
        }
        
        return encryptedOutput;
    }
    
    public String decrypt(String input){
        char[] inputArray = input.toCharArray();
        String decryptedOutput = "";
        
        for(char i : inputArray){
            for(int j = 0; j < seed.length; j++){
                if(i == charList[j]){
                    decryptedOutput += charList[j];
                }
            }
        }
        
        return decryptedOutput;
    }
}