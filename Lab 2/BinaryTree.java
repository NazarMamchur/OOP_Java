import java.util.Scanner;

public class BinaryTree {

    public static NodeForTree root;

    public BinaryTree(){
        this.root = null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a root value");
        double rootValue = in.nextDouble();
        tree.insert(rootValue);

        while(true){
            System.out.println("Enter 'e' for exit or any other key to continue");
            String i = in.next();
            if (i == "c"){
                System.out.println("Thank you");
                return;
            }
            else{

            }
        }
    }

    private void insert(double val){

        NodeForTree node = new NodeForTree(val);
        if(root == null){
            root = node;
            return;
        }
        NodeForTree value = root;
        NodeForTree parent = null;
        while(true){
            parent = value;
            if(val < value.num){
                value = value.left;
                if(value == null){
                    parent.left = node;
                    return;
                }
            }
            else{
                value = value.right;
                if(value == null){
                    parent.right = node;
                    return;
                }
            }
        }
    }

    public boolean find(double val){

        NodeForTree value = root;
        while(value != null){
            if(value.num == val){
                return true;
            }
            else if(value.num > val){
                value = value.left;
            }
            else{
                value = value.right;
            }
        }
        return false;
    }
}
