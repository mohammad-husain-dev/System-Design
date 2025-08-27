
public class QuickSortStrategy implements SortStrategy{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Running Quicksort");
		int n=arr.length;
		int low=0;
		int high=n-1;
		quickSort(arr, low, high);
	}
	
	private void quickSort(int[] arr, int low, int high)
	{
		if(low<high) {
			int pi=partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	private int partition(int[] arr, int low, int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		int temp=arr[i]; arr[i]=arr[high]; arr[high]=temp;
		return i;
	}
}









