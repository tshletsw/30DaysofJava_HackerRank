import java.util.*;

public class day06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //number of test cases
        int t = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < t; i++){
            String s = input.nextLine();
            
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            
            for (int j = 0; j < s.length(); j++){
                if (j % 2 == 0){
                    even.append(s.charAt(j));
                }else {
                    odd.append(s.charAt(j));
                }
            }
            
            System.out.println(even.toString() + " " + odd.toString());
        }
        
        input.close();
        
    }
}
