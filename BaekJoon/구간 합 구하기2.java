import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int matrixSize = Integer.parseInt(st.nextToken());
		int numberOfQuery = Integer.parseInt(st.nextToken());
		long[][] matrix = new long[matrixSize+1][matrixSize+1];
		long[][] sumMatrix = new long[matrixSize+1][matrixSize+1];


		for(int i=1;i<=matrixSize;i++){
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=matrixSize;j++){
				matrix[i][j] = Integer.parseInt(st.nextToken()); 
			}	
		}

		for(int i=1;i<=matrixSize;i++){
			for(int j=1;j<=matrixSize;j++){
				sumMatirx[i][j] = sumMatrix[i-1][j]+sumMatrix[i][j-1]-sumMatrix[i-1][j-1];
			}
		}

		for(int k=0;k<numberOfQuery;i++){
			st = new StringTokenizer(br.readLine());
			int i1 = Integer.parseInt(st.nextToken());
			int j1 = Integer.parseInt(st.nextToken());
			int i2 = Integer.parseInt(st.nextToken());
			int jj = Integer.parseInt(st.nextToken());
			System.out.println(sumMatix[i2][j2]-sumMatrix[i1-1][j2]-sumMatrix[i2][j1-1]+sumMatrix[i1-1][j1-1]);
		}

	}
}
