

public class LinearSearch implements Practice03Search
{
    public LinearSearch(){}
    public String searchName(){return "Linear Search";}

    public int search(int [] arr, int target)
    {
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] == target){return i;} // return index if found
        }
        return -1; //return -1 if not found
    }
}
