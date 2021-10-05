package learn.streamapi.concept;

public class demo {

	public static void main(String[] args) {

		int a[]=new int[] {1,2,3,4,5};
		int n=a.length;
		int tmp= a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
            
        }
        a[0]=tmp;
        
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]);
        }
	}
}
