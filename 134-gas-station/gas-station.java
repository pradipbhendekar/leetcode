class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int totalgas=0;
    int totalcost=0;
    for(int i=0;i<gas.length;i++){
        totalgas += gas[i];
        totalcost += cost[i];
    }
    if(totalgas < totalcost){
        return -1;
    }

    // here i am check vehical pass all station or not
    int tank=0;
    int start=0;
    for(int i=0;i<gas.length;i++){
        tank=(tank+gas[i]) - cost[i];

        if(tank < 0){
            tank=0;
            start=i+1;
        }
    }

        return start;
    }
}