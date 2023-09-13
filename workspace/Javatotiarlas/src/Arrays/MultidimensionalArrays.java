package Arrays;

public class MultidimensionalArrays {

	public void MultidimlArrays() {
		int[][] arr = {{1,2},{3,4}};
		
		for (int i=0;i<1;i++)
		for (int k=0;k<1;k++)
		System.out.println("arr[" + i + "][" + k + "] = "
                + arr[i][k]);

				
	}
	public static void main(String[] args){
		MultidimensionalArrays obj = new MultidimensionalArrays();
		obj.MultidimlArrays();
		
		
	}
}	
		
	