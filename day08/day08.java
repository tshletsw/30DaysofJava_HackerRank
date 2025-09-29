//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class day08{
    public static void main(String []argh){
        //create a scanner
        Scanner in = new Scanner(System.in);
        //create a hashMap
        Map<String, Integer> phonebook = new HashMap();
        
        //get amount entries that will be written into hashmap
        int n = in.nextInt();
        
        //iterate through all elements and add them to hashmap
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phonebook.containsKey(s)){
                System.out.println(s + "=" + phonebook.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}