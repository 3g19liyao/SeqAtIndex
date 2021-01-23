package LiKou;
import java.util.*;
public class BuildTree {
    public static HashMap<Integer,Integer> map = new HashMap<>();
    int[] port;
    public static void main(String[] args) {

    }
    // 前 中
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length ; i++){
            map.put(inorder[i],i);
        }
        port = preorder;
        TreeNode node = buildTree(0,preorder.length - 1,0,inorder.length - 1);
        return node;
    }
    public TreeNode buildTree(int l1,int r1,int l2,int r2){
        int root = port[l1];
        int r = map.get(root);
        TreeNode node = new TreeNode(root);
        node.left = buildTree(l1+1,l1+r-l2-1,l2,r-1);
        node.right = buildTree(l1+r-l2+1,r1,r+1,r2);
        return node;
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>(); //存放访问顺序
        Stack<TreeNode> stack = new Stack<>();  //存放结点，用于回溯
        while(root != null || !stack.empty()) {     //迭代遍历二叉树
            while(root != null) {   //使root指向当前子二叉树的最左结点
                stack.push(root);
                preOrderList.add(root.val); //将当前子二叉树的根节点入栈，并访问
                root = root.left;
            }
            while(root == null && !stack.empty()) {
                root = stack.pop().right;   //自底向上找到栈中跟结点第一个非空右孩子
            }
        }
        return preOrderList;
    }
}
