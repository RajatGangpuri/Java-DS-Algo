//Binary tree structure
//Diam2 galat de rha h answer
import java.util.LinkedList;
import java.util.*;
public class BinaryTreeStructureFullCode{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static int index=-1;
    public static Node binaryTree(int[] array){
        index++;
        if(array[index]==-1){
            return null;
        }
        Node newNode=new Node(array[index]);
        newNode.left=binaryTree(array);
        newNode.right=binaryTree(array);
        return newNode;
    }
    //Preorder
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static ArrayList<Integer> order(Node root){
        ArrayList<Integer> array=new ArrayList<>();
        if(root==null){
            return array;
        }
        preOrder(root.left);
        array.add(root.data);
        preOrder(root.right);
        return array;
    }


    //Inorder BTS
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //postOrder BTS
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    

    //inlevel Taversal
    public static void inLevel(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node temp=q.remove();
            if(temp==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }

    //Kth ancestor
    public static int kancestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftA=kancestor(root.left,n,k);
        int rightA=kancestor(root.right,n,k);
        if(leftA==-1 && rightA==-1){
            return -1;
        }
        int max=Math.max(leftA,rightA);
        if(max+1==k){
            System.out.print(root.data);
        }
        return max+1;
    }

    //Number of nodes in BTS
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=count(root.left);
        int rightcount=count(root.right);
        return leftcount+rightcount+1;
    }


    // Sum of all BTS 
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;
    }

    //BTS Height
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight= height(root.left);
        int rightHeight= height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }


    //Diameter with 0(n2) time complexity
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);
        return mydiam;
    }



    // Diameter with 0(n) time cocmplexity
    static class TreeInfo{
        int hi;
        int di;
        TreeInfo(int di,int hi){
            this.hi=hi;
            this.di=di;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.hi,right.hi)+1;
    
        int diam1=left.di;
        int diam2=right.di;
        int diam3=left.hi+right.hi+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myInfo=new TreeInfo(myHeight,mydiam);
        return myInfo;
    }


    //Find kth level elements

    public static void levelK(Node root,int k){
        if(root==null || k<1){
            return;
        }
        if(k==1){
            System.out.print(root.data);
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=1;
        while(!q.isEmpty()){
            Node temp=q.remove();
            if(temp==null){
                count++;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(count==k){
                    System.out.print(temp.data+" ");
                }
                if(count>k){
                    break;
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }

    //Kth level elements using recurssion

    public static void kthlevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kthlevel(root.left,level+1,k);
        kthlevel(root.right,level+1,k);
    }

    //Find Lowest common ancestor

    public static void lca(Node root,int n1,int n2){
        if(root==null){
            return;
        }
        ArrayList<Integer> path1=new ArrayList<>();
        ArrayList<Integer> path2=new ArrayList<>();

        get(root,n1,path1);
        get(root,n2,path2);
        int i=0;
        while(i<path1.size() && i<path2.size()){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
            i++;
        }
        System.out.print(path1.get(i-1));
    }

    public static boolean get(Node root,int n,ArrayList<Integer> path){
        if(root==null){
            return false;
        }
        path.add(root.data);
        if(root.data==n){
            return true;
        }
        boolean left=get(root.left,n,path);
        boolean right=get(root.right,n,path);
        if(left || right){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    
    public static void main(String[] args){
        int[] array={10,20,40,-1,-1,60,-1,-1,30,-1,-1};
        Node root=binaryTree(array);
        //preOrder(root);
        //System.out.println();
        inOrder(root);
        System.out.println();
        //postOrder(root);
        System.out.println();
        //inLevel(root);
        System.out.println("Count="+count(root));
        //System.out.println("Sum="+sum(root));
        //System.out.println("Height="+height(root));
        //System.out.println("Diameter="+diameter(root));
        //System.out.println("Diameter2="+diameter2(root).di);
        //System.out.println();
        //levelK(root,3);
        //System.out.println();
        //kthlevel(root,1,3);
        lca(root,60,60);
        System.out.println();
        kancestor(root,60,1);
    }
}