public class B {
    public static void main(String[] args) {
        class Node{
            int data;
            Node left,right;
            Node(int data){
                this.data=data;
                left=right=null;
            }
        }
        class BST{
            Node root;
            BST(){
                root=null;
            }
            void insert(int data){
                root=insertRec(root,data);
            }
            Node insertRec(Node root,int data){
                if(root==null){
                    root=new Node(data);
                    return root;
                }
                if(data<root.data){
                    root.left=insertRec(root.left,data);
                }else if(data>root.data){
                    root.right=insertRec(root.right,data);
                }
                return root;
            }
            void inorder(){
                inorderRec(root);
            }
            void inorderRec(Node root){
                if(root!=null){
                    inorderRec(root.left);
                    System.out.print(root.data+" ");
                    inorderRec(root.right);
                }
            }
            void preorder(){
                preorderRec(root);
            }
            void preorderRec(Node root){
                if(root!=null){
                    System.out.print(root.data+" ");
                    preorderRec(root.left);
                    preorderRec(root.right);
                }
            }
            void postorder(){
                postorderRec(root);
            }
            void postorderRec(Node root){
                if(root!=null){
                    postorderRec(root.left);
                    postorderRec(root.right);
                    System.out.print(root.data+" ");
                }
            }
            boolean search(int data){
                return searchRec(root,data);
            }
            boolean searchRec(Node root,int data){
                if(root==null){
                    return false;
                }
                if(root.data==data){
                    return true;
                }
                return data<root.data?searchRec(root.left,data):searchRec(root.right,data);
            }
            int height(){
                return heightRec(root);
            }
            int heightRec(Node root){
                if(root==null){
                    return 0;
                }
                int leftHeight=heightRec(root.left);
                int rightHeight=heightRec(root.right);
                return Math.max(leftHeight,rightHeight)+1;
            }
            int size(){
                return sizeRec(root);
            }
            int sizeRec(Node root){
                if(root==null){
                    return 0;
                }
                return sizeRec(root.left)+sizeRec(root.right)+1;
            }
            int minValue(){
                return minValueRec(root);
            }
            int minValueRec(Node root){
                if(root.left==null){
                    return root.data;
                }
                return minValueRec(root.left);
            }
            int maxValue(){
                return maxValueRec(root);
            }
            int maxValueRec(Node root){
                if(root.right==null){
                    return root.data;
                }
                return maxValueRec(root.right);
            }
            void delete(int data){
                root=deleteRec(root,data);
            }
            Node deleteRec(Node root,int data){
                if(root==null){
                    return root;
                }
                if(data<root.data){
                    root.left=deleteRec(root.left,data);
                }else if(data>root.data){
                    root.right=deleteRec(root.right,data);
                }else{
                    if(root.left==null){
                        return root.right;
                    }else if(root.right==null){
                        return root.left;
                    }
                    root.data=minValueRec(root.right);
                    root.right=deleteRec(root.right,root.data);
                }
                return root;
            }
        }
    }
}
