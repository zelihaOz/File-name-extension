se/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.name.extension;

/**
 *
 * @author zozer
 */
import java.util.Scanner;
public class FileNameExtension {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter full document name:  ");
        String str=scan.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.lastIndexOf('.')==i){
            
                System.out.println("document name: "+str.substring(0,i));
                System.out.println("document extension: "+str.substring(i+1));
        
        }
        }
            
        
    }
    
}
