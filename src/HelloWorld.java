import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		int[] a ;
		a = new int[5];
				int i,j,k;
		for(i=0;i<5;i++){
			a[i]=(int)(Math.random()*100);
			System.out.println(a[i]);
		}
		for(j=1;j<a.length;j++){
		for(i=j;i<a.length;i++){
			if(a[i]<a[j-1]){
				int temp = a[j-1];
				a[j-1]= a[i];
				a[i]=temp;
	          }
	
		}

		}

	    System.out.println("------");
		for(k=0;k<5;k++){

			System.out.println(a[k]);
		}	
		
		for(j=0;j<a.length-1;j++)
		{
			for(i=0;i<a.length-1-j;i++){
				if(a[i]<a[i+1]){
					int temp = a[i+1];
					a[i+1]= a[i];
					a[i]=temp;
				}
				
			}
			
		    System.out.println("------");
			for(k=0;k<5;k++){

				System.out.println(a[k]);
			}	
		}
		
		int max=0;

		for(int each : a){
			if(each>max) {
				max=each;
			}
		}
	    System.out.println("------");
		System.out.println(max);

		
		

     		
	 
	    
	}

	
	

}
