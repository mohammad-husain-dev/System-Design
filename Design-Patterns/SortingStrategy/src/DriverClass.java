
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7, 2, 1, 6, 8, 5, 3, 4};
		SortingContext sortingContext=new SortingContext();
		sortingContext.setSortStrategy(new BubbleSortStrategy());
		sortingContext.setSortStrategy(new QuickSortStrategy());
		sortingContext.executeSort(arr);
		sortingContext.printArr(arr);
	}
}

class SortingContext
{
	SortStrategy sortStrategy;
	
	public void setSortStrategy(SortStrategy sortStrategy)
	{
		this.sortStrategy=sortStrategy;
	}
	
	public void executeSort(int[] arr) {
		sortStrategy.sort(arr);
	}
	
	public void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
