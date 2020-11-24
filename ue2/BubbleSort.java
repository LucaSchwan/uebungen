
public class BubbleSort {
	public static void sort(int[] a) {
		//int [] a gegeben von Sort.java
		int i,j,z;
		int n = a.length;
		
		for(i = 0; i < n-1; i++) {
			
			for (j = i+1; j < n; j++) {
				
				if (a[i] > a[j]) {
					z = a[i];
					a[i] = a[j];
					a[j] = z;
				}
			}
		}	
			
	}
			
			
	}


