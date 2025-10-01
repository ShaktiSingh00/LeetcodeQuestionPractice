class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int sum = numBottles;
        // int res = numBottles;
        // while(res>=numExchange){

        //     int rem = numBottles / numExchange;
        //     sum += rem;
        //     res = (numBottles % numExchange) + rem;

        // }

        // return sum;
        int totalDrank = numBottles;
        int empties = numBottles;

        while (empties >= numExchange) {
            int newBottles = empties / numExchange;  // how many new full bottles
            totalDrank += newBottles;               // drink them
            empties = (empties % numExchange) + newBottles; // leftover empties + new empties
        }

        return totalDrank;
    }
}