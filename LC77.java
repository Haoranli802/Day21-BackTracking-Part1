class Solution {
    List<List<Integer>> result;
    List<Integer> path;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        path = new ArrayList<>();
        backTracking(n, k, 1);
        return result;
    }
    private void backTracking(int n, int k, int start){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i <= n - (k - path.size()) + 1; i++){
            path.add(i);
            backTracking(n, k, i + 1);
            path.removeLast();
        }
    }
}
//时间复杂度: O(n * 2^n)
//空间复杂度: O(n)
