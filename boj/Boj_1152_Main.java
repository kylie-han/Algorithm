import java.io.*;

public class Boj_1152_Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int ans = str.length;
        if(ans>0 && str[0].equals("")) ans--;
        System.out.println(ans);
        br.close();
    }
}
