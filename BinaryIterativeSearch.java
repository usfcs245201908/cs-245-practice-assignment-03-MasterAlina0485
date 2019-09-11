

public class BinaryIterativeSearch implements Practice03Search
{

    public BinaryIterativeSearch(){}
    public String searchName(){return "Binary Recursive Search";}
    
    public int search(int [] arr, int target)
    {
        int low, high, mid;
        low = 0;
        high = arr.length-1;
        mid = high/2;
        
        while (true)
        {
            if ((mid == high || mid == low) && (arr[mid] != target)){return -1;} //not found
            if (arr[mid] == target){return mid;} // return mid if found
            else if (arr[mid] < target) // continues the search if not found
            {
                low = mid;
                mid = ((high-low)/2)+low;
            }
            else 
            {
                high = mid;
                mid = ((high-low)/2)+low;
            }
        }
    }
}

    

