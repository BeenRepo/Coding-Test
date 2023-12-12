import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int start_index = 0;
        int end_index = N-1;
        int count = 0;
        while(start_index < end_index){
            if(A[start_index]+A[end_index] < M){
                start_index++;
            }
            else if(A[start_index]+A[end_index] > M){
                end_index--;
            }
            else{
                count++;
                end_index--;
                start_index++;
            }
        }
        System.out.println(count);
        bf.close();
    }
}