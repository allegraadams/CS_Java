import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MonoAlphabeticCipher {

   String encrypt = "";
   String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
   public MonoAlphabeticCipher(){
      
   }
  
   public void createEncrypter(String encrypter){
       StringBuilder sb = new StringBuilder();
       char ch;
       for(int i=0; i<encrypter.length();i++){
           ch = encrypter.charAt(i);
           if(sb.indexOf(String.valueOf(ch))==-1){
               sb.append(ch);
           }
       }
       int j = 25;
       for(int i=0;i<26;i++){
           ch = alphabet.charAt(j);
           if(sb.indexOf(String.valueOf(ch))==-1){
               sb.append(ch);
           }
           j--;
       }
       encrypt = sb.toString();
       System.out.println("Encrypter "+sb.toString());
   }
  
   public String encrypt(String plainText){
       StringBuilder cipher = new StringBuilder();
       char ch;
       for(int i=0; i<plainText.length();i++){
           ch = plainText.charAt(i);
           if(ch==' '){
               cipher.append(' ');
           }else
               cipher.append(encrypt.charAt(alphabet.indexOf(ch)));
       }
       return cipher.toString();
   }
  
   public String decrypt(String cipherText){
       StringBuilder decryptedText = new StringBuilder();
       char ch;
       for(int i=0; i<cipherText.length();i++){
           ch = cipherText.charAt(i);
           if(ch==' '){
               decryptedText.append(' ');
           }else
               decryptedText.append(alphabet.charAt(encrypt.indexOf(ch)));
       }
       return decryptedText.toString();
   }
  
   public String readFromFile(String fileName){
       try
       {
       Scanner reader = new Scanner(new FileReader(fileName));
       String line = reader.nextLine();
       reader.close();
       return line;
       }
       catch (Exception e)
       {
       System.err.format("Exception occurred trying to read '%s'.", fileName);
       e.printStackTrace();
       return null;
       }
   }
  
   public void writeToFile(String fileName, String line){
       try
       {
       BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
       writer.write(line);
       writer.close();
       }
       catch (Exception e)
       {
       System.err.format("Exception occurred trying to read '%s'.", fileName);
       e.printStackTrace();
       }
   }
  
   public static void main(String[] args) {
       MonoAlphabeticCipher myApp = new MonoAlphabeticCipher();
       myApp.createEncrypter(myApp.readFromFile("keyword.txt"));
       String plainText = myApp.readFromFile("input.txt");
       String encryptedText = myApp.encrypt(plainText);
       String decryptedText = myApp.decrypt(encryptedText);
       myApp.writeToFile("encrypt.txt", encryptedText);
       myApp.writeToFile("output.txt", decryptedText);
       System.out.println("PlainText "+plainText);
       System.out.println("EncryptedText "+encryptedText);
       System.out.println("DecryptedText "+decryptedText);
   }

}