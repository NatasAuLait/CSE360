package cse360assign1;
public class OGOrderedIntList {
	private int[] a;  
	private int c; 
	OGOrderedIntList ()
	{
		a = new int[10];
	}
	public void insert (int v) {
		if(c==a.length) grow();
		if(c==0)
			{a[0]= v;
		c++;}
		else {
		int j = 0;
		for (int i= 0; i<c;i++,j++)
		if(v<a[i]) break;
		for (int i = c; i>j; i--) a[i] = a[i-1];
		a[j]= v; 
		c++;}
	}
	private void grow(){
		int []t = new int[c*2];
		for (int i = 0; i<c; i++ )
			t[i]=a[i];
		a=t;
	}
	public void print () {
		for (int i = 0; i<c; ) {
		if (i%5==0) System.out.println();
		System.out.print(a[i++]+"\t");	}
		System.out.println();;
	}
}