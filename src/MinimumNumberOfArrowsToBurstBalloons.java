import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {

    static int find(int[][] points)
    {
        int count=1;

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[]  value1, int[] value2) {
                if(value1[1]>value2[1])
                {
                    return 1;
                }

                return -1;
            }
        });

        int current = points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(current<points[i][0])
            {
                count++;
                current = points[i][1];
            }

        }

        return count;
    }


    public static void main(String args[])
    {
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        System.out.println(find(points));
    }
}
