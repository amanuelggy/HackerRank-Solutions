public class BinaryTree {

    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice Pres");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales Manager");
        theTree.addNode(85, "Salesman 1");
        theTree.addNode(200, "Engineer");
        
    }
}

class Node {
    int key;
    String name;
    Node left;
    Node right;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return name + "has a key " + key;
    }
}