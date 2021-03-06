/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 17 02:27:30 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.delete(1);
      aVLTree0.insert((-1562));
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.delete(57);
      aVLTree0.find((-78));
      aVLTree0.delete(0);
      aVLTree0.insert((-1));
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree0.delete(0);
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node2.left = aVLTree_Node1;
      aVLTree_Node2.left = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.find(57);
      aVLTree0.delete(0);
      int int0 = 1;
      // Undeclared exception!
      try { 
        aVLTree0.delete(int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.height();
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-1));
      aVLTree0.height();
      aVLTree0.delete((-1));
      aVLTree0.find(3180);
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
      
      aVLTree0.getRoot();
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.delete((-1));
      aVLTree0.delete(2824);
      aVLTree0.find((-1));
      aVLTree0.delete((-549));
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-3742));
      aVLTree0.insert((-3742));
      int int0 = (-1);
      aVLTree0.insert(0);
      aVLTree0.insert((-1));
      int int1 = 0;
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree_Node0.height = (-1);
      AVLTree.Node aVLTree_Node1 = aVLTree0.find((-1));
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node1.key = 0;
      // Undeclared exception!
      aVLTree0.find(3088);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.find(0);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-3647));
      aVLTree0.delete((-752));
      aVLTree0.insert(3486);
      aVLTree0.delete(3486);
      aVLTree0.insert((-752));
      aVLTree0.insert(721);
      aVLTree0.delete((-2293));
      aVLTree0.delete((-4296));
      aVLTree0.getRoot();
      aVLTree0.insert(0);
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(137);
      aVLTree0.insert((-2190));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-2190));
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = 137;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.delete((-1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      aVLTree0.insert(747);
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 1;
      aVLTree0.delete(1);
      aVLTree0.insert(0);
      int int1 = 2672;
      aVLTree0.find(2672);
      aVLTree0.insert((-542));
      int int2 = 0;
      // Undeclared exception!
      try { 
        aVLTree0.delete(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = (-189);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-189));
      aVLTree0.insert(0);
      aVLTree0.insert(3388);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.height = (-189);
      aVLTree_Node1.key = 1;
      aVLTree_Node1.right = aVLTree_Node0;
      // Undeclared exception!
      try { 
        aVLTree0.insert(3388);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.insert(543);
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.delete(1);
      aVLTree0.delete(1);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.delete(1);
      aVLTree0.delete(1);
      aVLTree0.getRoot();
      aVLTree0.height();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.delete(30);
      aVLTree0.insert((-1));
      aVLTree0.insert((-2839));
      aVLTree0.insert(1);
      AVLTree.Node aVLTree_Node2 = aVLTree_Node0.left;
      aVLTree_Node2.height = (-2839);
      aVLTree_Node2.left = aVLTree_Node1;
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.find(1436);
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.insert(0);
      aVLTree0.insert(2206);
      aVLTree0.delete(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(0);
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.height = 2257;
      aVLTree_Node0.left.key = 2257;
      aVLTree_Node1.key = (-317);
      aVLTree_Node0.key = 1;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert((-2258));
      aVLTree0.delete(1);
      aVLTree0.delete(0);
      aVLTree0.height();
      aVLTree0.delete(2206);
      aVLTree0.find(1);
      aVLTree0.height();
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = (-803);
      aVLTree0.insert((-803));
      aVLTree0.delete(40);
      int int1 = 0;
      aVLTree0.delete(0);
      aVLTree0.delete(40);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.right = aVLTree_Node1;
      int int2 = 0;
      aVLTree0.insert(int1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(3602);
      aVLTree0.insert(311);
      aVLTree0.height();
      aVLTree0.insert(1);
      // Undeclared exception!
      try { 
        aVLTree0.insert(3602);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2292));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-1014));
      aVLTree0.insert((-1668));
      aVLTree0.insert((-1014));
      aVLTree0.find((-2292));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert(1826);
      aVLTree0.insert(1);
      aVLTree0.insert(635);
      aVLTree0.delete(1);
      aVLTree0.find(1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(0);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2702);
      aVLTree0.delete(4328);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2292));
      aVLTree0.getRoot();
      aVLTree0.insert((-1668));
      aVLTree0.insert((-1014));
      aVLTree0.find((-2292));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert(1826);
      aVLTree0.insert(1);
      aVLTree0.insert(621);
      aVLTree0.delete(1);
      aVLTree0.find(1);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete((-3554));
      aVLTree0.insert((-3554));
      aVLTree0.insert((-1682));
      aVLTree0.height();
      int int0 = aVLTree0.height();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(3602);
      aVLTree0.insert(336);
      aVLTree0.height();
      aVLTree0.insert(1);
      // Undeclared exception!
      try { 
        aVLTree0.insert(3602);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }
}
