class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int n=players.length;
        int m=trainers.length;
        int cnt=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(trainers[j]>=players[i]){
                cnt++;
                i++;
            }
            j++;
        }
        return cnt;
    }
}