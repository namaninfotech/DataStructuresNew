package graph;

import java.util.Arrays;

public class FindClosestNodeToGivenTwoNodes {


    static int find(int array[], int node1, int node2) {
        int ans = -1;
        int mini = Integer.MAX_VALUE;

        int arr1[] = new int[array.length];
        int arr2[] = new int[array.length];

        Arrays.fill(arr1, -1);
        Arrays.fill(arr2, -1);

        arr1[node1] = 0;
        arr2[node2] = 0;

        int distance = 0;
        int i = node1;

        while (true) {
            arr1[i] = distance++;
            i = array[i];

            if (i == -1 || arr1[i] != -1) {
                break;
            }
        }

        i = node2;
        distance = 0;

        while (true) {
            arr2[i] = distance++;
            i = array[i];

            if (i == -1 || arr2[i] != -1) {
                break;
            }
        }


        for(int j=0;j<array.length;j++)
        {
            if(arr1[j]==-1 || arr2[j]==-1)
                continue;
            else{
                if(mini > Math.max(arr1[j],arr2[j]))
                {
                    mini = Math.max(arr1[j],arr2[j]);
                    ans = j;
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int array[] = {2, 2, 3, -1};
        int node1 = 0;
        int node2 = 1;

        System.out.println(find(array, node1, node2));
    }
}
