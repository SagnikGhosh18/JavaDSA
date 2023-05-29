class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n = nums2.length;
        int l = m+n;
        int mid=0;
        int[] arr = new int[l];
        int k=0;
        int f=1;
        int low = (-1)*(int)(Math.pow(10,6));
        int high = (int)(Math.pow(10,6));
        if(m<0||m>1000||n<0||n>1000||l<1||l>2000)
            f=0;
        for(int i=0;i<l;i++)
        {
            if(i<m)
            {
                if(nums1[i]<low || nums1[i]>high)
                {
                    f=0;
                    break;
                }
            }
                
            else
            {
                if(nums2[i-m]<low || nums2[i-m]>high)
                {
                    f=0;
                    break;
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            if(i<m)
                arr[k] = nums1[i];
            else
                arr[k] = nums2[i-m];
            k++;
        }
        Solution obj = new Solution();
        if(f==1)
        {
            obj.sort(arr,0,l-1);
            return(printArray(arr));
        }
        else
            return 0.0;
    }
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
 
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
    static double printArray(int arr[])
    {
        int n = arr.length;
        int l=n;
        double median=0;
        if(l%2==0)
        {
            median = (arr[l/2-1]+arr[(l/2)])/2.0;
            return(median);
        }
        else
            return(arr[l/2]);
    }
}