
public class DyadicArray {
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int i,j;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				a[i][j]=(int)(Math.random()*100);
				
			}
		}
		
		

	    String str="" ;		
		for(i=0;i<5;i++){
			str="" ;
			for(j=0;j<5;j++){
				str=str+String.valueOf(a[i][j])+",";
			
			}
			System.out.println(str);
		}
		
		int max=0;
		for(i=0;i<5;i++){
			str="" ;
			for(j=0;j<5;j++){
				if(max<a[i][j]){
					max=a[i][j];
				}
			
			}
		}
		System.out.println(max);
		
		

	
		
	}

}
