import java.io.*;
import java.util.*;

public class day07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        bufferedReader.close();
        
        Collections.reverse(arr);
        for (int i = 0; i < arr.size(); i++ ){
             System.out.print(arr.get(i) + " ");
         }
       
    }
}
