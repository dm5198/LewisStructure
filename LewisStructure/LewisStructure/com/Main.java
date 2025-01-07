package LewisStructure.com;

public class Main {
    public static void main(String[] args) {
        LinkedList directionalList = new LinkedList();
        
        directionalList.createStartNode('N');
        directionalList.appendNode('A', "East");
        directionalList.appendNode('C', "South");
        directionalList.shiftCurrentNode("North");
        directionalList.shiftCurrentNode("West");
        directionalList.appendNode('M', "South");
        directionalList.appendNode('K', "West");
        
        
        directionalList.displayLinkedList();
    }
}
