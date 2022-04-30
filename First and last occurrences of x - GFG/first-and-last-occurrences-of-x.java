// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> a1 = new ArrayList<Long>();
        int a = firstOccurrence(arr,n,x);
		int b  = lastOccurence(arr,n,x);
        a1.add((long)a);
        a1.add((long)b);
        return a1;
	}
	public static int  firstOccurrence(long arr[] , int n , int k) {
		int start = 0;
		int end = n-1;
		int ans = -1;
		int mid = start+(end-start)/2;
		while(start<=end) {
			if(arr[mid]==k) {
				ans = mid;
				end=mid-1;
			}else if(arr[mid]>k) {
				end=mid-1;
			}else {
				start = mid+1;
			}
			mid = start+(end-start)/2;
		}
		return ans;
	}
	public static int lastOccurence(long arr[] , int n , int k) {
		int start = 0;
		int end= n-1;
		int ans = -1;// This  Question Solved by Harsh Sinha
		int mid = start+(end-start)/2;
		while(start<=end) {
			if(arr[mid]==k) {
				ans = mid;
				start = mid+1;
			}else if(arr[mid]>k) {
				end=mid-1;
			}else {
				start = mid+1;
			}
			mid = start+(end-start)/2;
		}
		return ans;
    }
}



// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
  // } Driver Code Ends