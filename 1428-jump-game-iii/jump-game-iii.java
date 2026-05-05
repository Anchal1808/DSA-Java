class Solution {
    public boolean canReach(int[] arr, int start) {
         boolean[] visited = new boolean[arr.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int i = q.poll();

            if (arr[i] == 0) return true;

            int forward = i + arr[i];
            int backward = i - arr[i];

            if (forward < arr.length && !visited[forward]) {
                q.add(forward);
                visited[forward] = true;
            }

            if (backward >= 0 && !visited[backward]) {
                q.add(backward);
                visited[backward] = true;
            }
        }

        return false;
    }
}