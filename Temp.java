package Algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;



class TreeNode1 {
    int val;
    TreeNode1 left, right;

    TreeNode1(int val) {
        this.val = val;
        left = right = null;
    }
}

    public class Temp {

    private int cameraCount = 0;

    public int minCameraCover(TreeNode1 root) {
        if (dfs(root) == 0) {
            cameraCount++;
        }
        return cameraCount;
    }



    private int dfs(TreeNode1 root) {
        if(root==null){
            return 1;
        }
        int left=dfs(root.left);
        int right=dfs(root.right);

        if(left==0 || right==0){
            cameraCount++;
            return 2;

        }
        if(left==2 || right==2){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
//        2
//        0 1 -1 2 3 -1 -1 -1 -1
//        0 1 -1 2 -1 3 -1 -1 4 -1 -1
//        TreeNode1 root=new TreeNode1(0);
//        root.left = new TreeNode1(0);
//        root.left.left = new TreeNode1(0);
//        root.left.right = new TreeNode1(0);
        Temp t = new Temp();
//        int ans = t.minCameraCover(root);
//        System.out.println(ans);


        TreeNode1 root1=new TreeNode1(0);
        root1.left = new TreeNode1(0);
        root1.left.left = new TreeNode1(0);
        root1.left.left.left = new TreeNode1(0);
        root1.left.left.left.right = new TreeNode1(0);
        int ans2 = t.minCameraCover(root1);
        System.out.println(ans2);



    }

}
