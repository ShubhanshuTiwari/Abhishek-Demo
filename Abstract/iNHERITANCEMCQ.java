package abhishekClass;

public class iNHERITANCEMCQ {
public static void main(String[] args) {
	
}
}
class A {void m1(String s1) {}}
class B extends A {
  void m1(String s1) {}  // 1
  void m1(boolean b) {}  // 2
  void m1(byte b) throws Exception {}  // 3
  String m1(short s) {return new String();} //4
  private void m1(char c) {} // 5
  protected void m1(int i) {} // 6
}
