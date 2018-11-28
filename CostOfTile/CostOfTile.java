import java.util.Scanner;

public class CostOfTile{
    private final static Scanner input = new Scanner(System.in);
    
    
    public static void main(String [] args){
        double costPerTile;
        int roomWidth;
        int roomHeight;
        int tileWidth;
        int tileHeight;
        int roomArea;
        int tileArea;
        
        System.out.print("Please enter the width of the room: ");
        roomWidth = input.nextInt();
        System.out.print("Please enter the height of the room: ");
        roomHeight = input.nextInt();
        System.out.print("Please enter the width of a tile: ");
        tileWidth = input.nextInt();
        System.out.print("Please enter the height of a tile: ");
        tileHeight = input.nextInt();
        System.out.print("Please enter the cost of 1 tile: ");
        costPerTile = input.nextDouble();
        
        roomArea = findArea(roomHeight, roomWidth);
        tileArea = findArea(tileHeight, tileWidth);
        int numberOfTilesNeeded = roomArea / tileArea;
        double cost = numberOfTilesNeeded * costPerTile;
        System.out.printf("Total Cost: %.2f", cost);
    }
    
    public static int findArea(int height, int width){
        return height * width;
    }

}