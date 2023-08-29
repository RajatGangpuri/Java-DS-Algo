//Binary Search tree
import java.util.*;
public class BinarySearchTreeFullCode{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //Insert or create Node
    public static Node insert(Node root,int value){
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(root.data>value){
            root.left=insert(root.left,value);
        }
        else{
            root.right=insert(root.right,value);
        }
        return root;
    }

    //Inorder Traversal
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" "); 
        inOrder(root.right);  
        
    }


    //Search node
    public static boolean search(Node root,int value){
        if(root==null){
            return false;
        }
        if(root.data>value){
            return search(root.left,value);
        }
        else if(root.data<value){
            return search(root.right,value);
        }
        else{
            return true;
        }
    }

    //Delete Node
    public static Node delete(Node root,int value){
        if(root==null){
            return null;
        }
        if(root.data>value){
            root.left=delete(root.left,value);
        }
        else if(root.data<value){
            root.right=delete(root.right,value);
        }
        else{
            if(root.right==null && root.left==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node myis=findis(root.right);
                root.data=myis.data;
                root.right=delete(root.right,myis.data);
            }
        }
        return root;
    }
    public static Node findis(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    //Nodes between two numbers
    public static void findRange(Node root,int x,int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            findRange(root.left,x,y);
            System.out.print(root.data+" ");
            findRange(root.right,x,y);
        }
        else if(x>root.data){
            findRange(root.right,x,y);
        }
        else{
            findRange(root.left,x,y);
        }
    }

    //Find root to leaf Node
    public static void leaf(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.data);
        if(root.left==null && root.right==null){
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+"->");
            }
            System.out.println();
        }
        else{
            leaf(root.left,arr);
            leaf(root.right,arr);
        }
        arr.remove(arr.size()-1);
    }

    //Calculate Diameter
    static class TreeInfo{
        int hi;
        int di;
        TreeInfo(int di,int hi){
            this.hi=hi;
            this.di=di;
        }
    }
    public static TreeInfo diameter(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter(root.left);
        TreeInfo right=diameter(root.right);
        int myheight=Math.max(left.hi,right.hi)+1;
        int diam1=left.di;
        int diam2=right.di;
        int diam3=left.hi+right.hi+1;
        int mydiam=Math.max(diam1,Math.max(diam2,diam3));
        TreeInfo myinfo=new TreeInfo(mydiam,myheight);
        return myinfo;
    }

    //Create Balanced BST by using inOrder Traversal
    public static Node create(int[] arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=create(arr,start,mid-1);
        root.right=create(arr,mid+1,end);
        return root;
    }


    // To create Mirror image
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftS=mirror(root.left);
        Node rightS=mirror(root.right);
        root.right=leftS;
        root.left=rightS;
        return root;
    }

    //isValid BST
    public static boolean isValid(Node root,Node max,Node min){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        
        return isValid(root.left,root,min) && isValid(root.right,max,root);
    }

    //Maximum size of BST in BT
    static class myInfo{
        boolean BST;
        int size;
        int max;
        int min;
        myInfo(boolean BST,int size,int max,int min){
            this.BST=BST;
            this.size=size;
            this.max=max;
            this.min=min;
        }
    }

    static int m=0;
    public static myInfo findSize(Node root){
        if(root==null){
            return new myInfo(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        myInfo left=findSize(root.left);
        myInfo right=findSize(root.right);
        int size=left.size+right.size+1;
        int max=Math.max(root.data,Math.max(left.max,right.max));
        int min=Math.min(root.data,Math.min(left.min,right.min));

        if(root.data>=right.min || root.data<=left.max){
            return new myInfo(false,size,max,min);
        }
        if(right.BST && left.BST){
            m=Math.max(m,size);
            return new myInfo(true,size,max,min);
        }
        return new myInfo(false,size,max,min);
    }

    public static void main(String[] args){
        int[] array={46,23,14,93,29,36,13,89,45,12};
        Node root=null;
        for(int i=0;i<array.length;i++){
            root=insert(root,array[i]);
        }
        inOrder(root);
        System.out.println();
        //System.out.print(search(root,67));
        //delete(root,67);
        //System.out.println();
        //inOrder(root);
        //System.out.println();
        //findRange(root,2,22);
        //System.out.println();
        leaf(root,new ArrayList<Integer>());
        //System.out.println();
        //System.out.print("diameter="+diameter(root).di);
        //System.out.println();
        //System.out.print("height="+diameter(root).hi);
        //myInfo alpha=findSize(root);
        //System.out.print(alpha.size);
        delete(root,23);
        System.out.println();
        inOrder(root);
    }
}