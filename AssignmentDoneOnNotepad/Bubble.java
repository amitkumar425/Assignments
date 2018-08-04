class Bubble{
	
	static int[] arr=new int[]{ 15 , 13 , 14 , 12 , 9 , 10 , 11 , 8 , 7 , 5 , 6 , 4 , 2 , 3 , 1 };
	static void swap(int a,int b){
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void main(String args[]){
		for(int i=0;i<15;i++){
			for(int j=i+1;j<15;j++){
				if(arr[i]>arr[j]){
					swap(i,j);
				}
			}
		}
		for(int i=0;i<15;i++){
			System.out.print(arr[i]+" ");
		}
	}
}