# Day21-BackTracking-Part1
● 理论基础 

回溯三部曲：

1.回溯函数模板返回值以及参数（一般为backtracking，返回值为void）

2.回述函数终止条件

3.回溯搜索的遍历过程

模版：

    void backtracking(参数) {
        if (终止条件) {
            存放结果;
            return;
        }
    
        for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {
            处理节点;
            backtracking(路径，选择列表); // 递归
            回溯，撤销处理结果
        }
    }

● 77. 组合  

剪枝问题：

至多从 n - (k - path.size()) + 1开始，+1是因为当前节点也要算上。
