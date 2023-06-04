package classes_and_objects_in_java.encapsulation;

public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,
                12, TreeType.OAK);

        Tree myFavoriteMapleTree = new Tree(90,
                30, TreeType.MAPLE);

        System.out.println(myFavoriteOakTree.getHeightFt());
        myFavoriteOakTree.announceTallTree();

        myFavoriteMapleTree.announceTallTree();
        System.out.println(myFavoriteMapleTree.getTreeType());
        System.out.println(myFavoriteMapleTree.getHeightFt());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());

        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();
    }
}
