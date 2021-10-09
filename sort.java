import java.util.Arrays;
import java.util.Random;

public class sort {
	
	
	//code for insertion code
	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i-1;
			while ( (j >= 0) && ( array [j] > key ) ) {
				array [j+1] = array [j];
				j--;}
			array[j+1] = key;}
		}
	
	//code for mergesort
	public static void merge(int arr[], int beg, int mid, int end){
		int l = mid - beg + 1;
		int r = end - mid;
		int LeftArray[] = new int [l];
		int RightArray[] = new int [r];
	  //copy the first l elements into LeftArray
		for (int i=0; i<l; ++i) {
			LeftArray[i] = arr[beg + i];}
	  //copy the next r elements into RightArray
		for (int j=0; j<r; ++j) {
			RightArray[j] = arr[mid + 1+ j];}
	  
		int i = 0, j = 0;
		int k = beg;
		while (i<l&&j<r){
			if (LeftArray[i] <= RightArray[j]){
				arr[k] = LeftArray[i];
				i++;}
			else{
				arr[k] = RightArray[j];
				j++;}
			k++;}
		while (i<l){
			arr[k] = LeftArray[i];
			i++;
			k++;}
		while (j<r){
			arr[k] = RightArray[j];
			j++;
			k++;}
	}
	  
	public static void mergesort(int arr[], int beg, int end){
	if (beg<end){
		int mid = (beg+end)/2;
		mergesort(arr, beg, mid);
		mergesort(arr , mid+1, end);
		merge(arr, beg, mid, end);
	}
	}
	
	
	//heapsort codes, implementing max heap
	public static void heapify(int arr[], int n, int i){
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
        	largest = l;}
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;}
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
	public static void heapsort(int arr[]){
        int n = arr.length;//size of the array
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
	
	//codes for quicksort
	public static void swap(int[] arr, int i, int j){
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	public static int partition(int[] arr, int low, int high){
	      
	    // pivot
	    int pivot = arr[high]; 
	      
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++){
	        // If current element is smaller 
	        // than the pivot
	        if (arr[j] < pivot) {
	              
	            // Increment index of 
	            // smaller element
	            i++; 
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	static void quicksort(int[] arr, int low, int high){
	    if (low < high) {
	        // pi is partitioning index, arr[p]
	        // is now at right place 
	        int pi = partition(arr, low, high);
	  
	        // Separately sort elements before
	        // partition and after partition
	        quicksort(arr, low, pi - 1);
	        quicksort(arr, pi + 1, high);
	    }
	}
	
	
	//quicksort random
	public static int randompartition(int arr[],int low,int high) {
		Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;
         
        int temp1=arr[pivot]; 
        arr[pivot]=arr[high];
        arr[high]=temp1;
        return partition(arr,low,high);
    }
	public static void quicksortR(int arr[],int low,int high) {
		if(low<high) {
			int pi=randompartition(arr,low,high);
			quicksortR(arr,low,pi-1);
			quicksortR(arr,pi+1,high);
		}
	}
	//radix sort code
	public static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
	public static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
	public static void radixsort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

	
	public static void size(int n){
		  
		Random rand = new Random();
		System.out.println("For size "+n);
		// Generate random integers in range 0 to 999
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=rand.nextInt(1000);
		}
		
		//compile time for insertion sort
		long start = System.nanoTime();
		insertionSort(array);
		long end = System.nanoTime();
		System.out.println("insertion sort "+(end-start)+" NanoSeconds");
		
		for(int i=0;i<n;i++){
			array[i]=rand.nextInt(1000);
			}
		//compile time for mergesort	  
		start = System.nanoTime();
		mergesort(array,0,n-1);
		end = System.nanoTime();
		System.out.println("merge sort "+(end-start)+" NanoSeconds");
		
		
		for(int i=0;i<n;i++){
			array[i]=rand.nextInt(1000);
			}
		
		//compile time for heapsort
		start = System.nanoTime();
		heapsort(array);
		end = System.nanoTime();
		System.out.println("heapsort "+(end-start)+" NanoSeconds");
		
		for(int i=0;i<n;i++){
			array[i]=rand.nextInt(1000);
			}
		//compile time for quicksort	  
		start = System.nanoTime();
		quicksort(array,0,n-1);
		end = System.nanoTime();
		System.out.println("quicksort "+(end-start)+" NanoSeconds");
		
		for(int i=0;i<n;i++){
			array[i]=rand.nextInt(1000);}
		
		//compile time for quicksort random
			start = System.nanoTime();
			quicksortR(array,0,n-1);
			end = System.nanoTime();
			System.out.println("quicksort random "+(end-start)+" NanoSeconds");
			
		for(int i=0;i<n;i++){
			array[i]=rand.nextInt(1000);
			}
		
		//compile time for radix sort
		start = System.nanoTime();
		quicksort(array,0,n-1);
		end = System.nanoTime();
		System.out.println("radixsort "+(end-start)+" NanoSeconds\n");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size(10);
		size(100);
		size(1000);
		size(10000);
		size(100000);
		size(1000000);
		
	}

}
