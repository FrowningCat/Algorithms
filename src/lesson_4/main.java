package lesson_4;

public class main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(7);
        tree.add(3);
        tree.add(9);
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        System.out.println(tree.findLast());
        System.out.println(tree.getChildrenCount());
    }
}
