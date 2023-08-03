import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
class Pair{
    Node node;
    int num;
    Pair(Node node,int data){
        this.node=node;
        this.num=data;
    }
}
class Tree {
    List<List<Integer>> postOrder(Node node) {
        ArrayList<Integer> preorder = new ArrayList<Integer>();
        ArrayList<Integer> postorder = new ArrayList<Integer>();
        ArrayList<Integer> inorder= new ArrayList<Integer>();
        List<List<Integer>> arr = new ArrayList<>();
        Stack<Pair> st = new Stack<Pair>();
        if(node==null){
            return arr;
        }
        st.push(new Pair(node,1));
        while(!st.isEmpty()){
            Pair p=st.pop();
            if(p.num==1){
                preorder.add(p.node.data);
                p.num++;
                st.push(p);
            }
            else if(p.num==2){
                inorder.add(p.node.data);
                p.num++;
            st.push(p);           
         }
        else{
            postorder.add(p.node.data);
        }
    }
    arr.add(preorder);
    arr.add(inorder);
    arr.add(postorder);
    return arr;
}
}

        