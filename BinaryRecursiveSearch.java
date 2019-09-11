

public class BinaryRecursiveSearch implements Practice03Search
{
   
    public BinaryRecursiveSearch () {}
    public String searchName(){return "Binary Recursive Search";}

    public int search(int [] arr, int target)// Main search function
    {
        return searchIn (arr, target, 0, arr.length);
    }
    
    private int searchIn(int [] a, int target, int low, int high) //Recursive portion
    {
        int mid = ((high-low)/2)+low;
        if ((mid == high || mid == low) && (a[mid] != target)){return -1;} // Not found; subarray length 1
        
        if (a[mid] == target){return mid;} // Found
        else if (target < a[mid]){return searchIn (a,target,low,mid);} 
        else {return searchIn (a,target,mid,high);}
    }
}
