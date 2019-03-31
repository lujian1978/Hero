import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		
		int[][] a = new int[5][8];
		int[] b = new int[8];
		int i,j;
		for(i=0;i<5;i++){
			for(j=0;j<8;j++){
				a[i][j]=(int)(Math.random()*100);
			}
		}
		
		String str ;
		
		for(i=0;i<5;i++){
			System.arraycopy(a[i],0, b, 0, 8);
			Arrays.sort(b);
			System.arraycopy(b,0, a[i], 0, 8);
			str= Arrays.toString(b);
			
			System.out.println(str);
			
		}
		
		System.out.println("-------");
		for(i=0;i<5;i++){
			str=str= Arrays.toString(a[i]);
			System.out.println(str);
		}
		
		
		


		
		
		
	}

}
