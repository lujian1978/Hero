
public class ArrayCopy {
	public static void main(String[] args) {
		
		int[] a = new int[(int)(Math.random()*5+5)];
		int[] b = new int[(int)(Math.random()*5+5)];
		int[] c = new int[a.length+b.length];
		int i,j;
		for(i=0;i<a.length;i++){
			
			a[i]=(int)(Math.random()*100);
		};

		for(i=0;i<b.length;i++){
			
			b[i]=(int)(Math.random()*100);
		};
		
		for(j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
		System.out.println("-------");
		
		for(j=0;j<b.length;j++){
			System.out.println(b[j]);
		}

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);

		System.out.println("-------");
		
		for(j=0;j<c.length;j++){
			System.out.println(c[j]);
		}
	}

}
