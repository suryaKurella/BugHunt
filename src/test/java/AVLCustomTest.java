import org.junit.Test;

import static org.junit.Assert.fail;

public class AVLCustomTest {


    @Test
    public void test_avl() {
        AVLTree tree = new AVLTree();

        int[] intArray = new int[]{40, 20, 10, 25, 30, 22, 50};

        for (int i : intArray) {
            tree.insert(i);
        }

        try {
//
            tree.delete(25);
            tree.delete(10);
            tree.delete(30);
            tree.delete(40);

            tree.insert(80);
            tree.delete(20);
            tree.delete(50);
            tree.delete(22);
            tree.insert(20);
            // deleting the following node key will give us the Null pointer error, it is because as per the code the control
            // goes to line 69 of the code which is Node mostLeftChild = mostLeftChild(node.right);
            // But here we do not have a right node at all, hence it's taking in the null value as node.right and moving to
            //mostLeftChild method
            // Following is the code for mostLeftChild:
            // private Node mostLeftChild(Node node) {
            //        Node current = node;
            //        /* loop down to find the leftmost leaf */
            //        while (current.left != null) {
            //            current = current.left;
            //        }
            //        return current;
            //    }
            // As we can observe here that current here is nothing but null, the code will try to access left node of null which
            //doesn't make sense or exist. Hence the program is expected to throw java.lang.NullPointerException

            // To avoid this cover the case for node.right == null as well in line 66.

            tree.delete(80);


        } catch (Exception e) {
            fail("caused by java.lang.NullPointerException ");
        }


    }
}
