package Com.PavanSk;

public class ReverseArraySwapping {
	public static void main(String[] args) {
		int[] x= {10,41,52,74,64,76,92,27,35,48,90,85,55};
		int[] y = new int[13];
		int i,j;
		
		for(i=0;i<x.length;i++) {
			j=0;
			//j=x[i];
			y[i]=x[x.length-i-1];
			//x[x.length-i-1]=j;
			
		}
		for(int value:x) {
			System.out.print(value+" ");
		}
		System.out.println();
		for(int value:y) {
			System.out.print(value+" ");
		}
	}	
}
