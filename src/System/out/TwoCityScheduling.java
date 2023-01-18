package System.out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User {

    int costA, costB, difference;

    User ( int difference, int costA, int costB ) {
        this.costA = costA;
        this.costB = costB;
        this.difference = difference;
    }
}

public class TwoCityScheduling {

    public static int minCost ( int[][] array ) {
        int cost = 0;
        int reachA = array.length / 2;
        int reachB = array.length / 2;
        List<User> list = new ArrayList<> ();

        for ( int i = 0; i < array.length; i++ ) {
            list.add ( new User ( Math.abs ( array[ i ][ 0 ] - array[ i ][ 1 ] ), array[ i ][ 0 ], array[ i ][ 1 ] ) );

        }

        Comparator comparator = new Comparator<User> () {
            @Override
            public int compare ( User first, User second ) {
                if ( first.difference < second.difference ) {
                    return 1;
                } else if ( first.difference > second.difference ) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort ( list, comparator );

        for ( int i = 0; i < list.size (); i++ ) {
            User user = list.get ( i );
            System.out.println ( "difference=" + user.difference + ",A=" + user.costA + ",B=" + user.costB );

            if ( reachA != 0 && user.costA < user.costB ) {
                cost += user.costA;
                reachA--;
            } else if ( reachB != 0 && user.costB < user.costA ) {
                cost += user.costB;
                reachB--;
            } else if ( reachA == 0 ) {
                cost += user.costB;
                reachB--;
            } else if ( reachB == 0 ) {
                cost += user.costA;
                reachA--;
            }

        }

        return cost;
    }

    public static void main ( String args[] ) {

        int[][] costs = {
            {10, 20}, {30, 200}, {400, 50}, {30, 20}
        };

        System.out.println ( minCost ( costs ) );
    }
}
