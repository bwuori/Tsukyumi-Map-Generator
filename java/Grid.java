import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.lang.Math;
import java.util.Arrays;

public class Grid extends JPanel {
    /*
    Number of tiles for the game +7(moon)
    2 players 10 + 7
    3 players 21 + 7
    4 players 28 + 7
    5 players 35 + 7
    6 players 42 + 7
    */
    int tiles = 28;
    
   public static void main(String[] a) {
      JFrame f = new JFrame();
      f.setSize(1500, 800);
      f.add(new Grid());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
   }

   
   public void paint(Graphics g) {
       //Creating the moon
       int[] xPoints1 = {700, 725, 775, 800, 775, 725};
       int[] yPoints1 = {400, 357, 357, 400, 443, 443};
       g.setColor(Color.magenta);
       g.fillPolygon(xPoints1, yPoints1, 6);
       g.setColor(Color.black);
       g.drawPolygon(xPoints1, yPoints1, 6);
       
       
       int[] xPoints2 = {625, 650, 700, 725, 700, 650};
       int[] yPoints2 = {357, 314, 314, 357, 400, 400};
       g.setColor(Color.magenta);
       g.fillPolygon(xPoints2, yPoints2, 6);
       g.setColor(Color.black);
       g.drawPolygon(xPoints2, yPoints2, 6);
       
       
       int[] xPoints3 = {700, 725, 775, 800, 775, 725};
       int[] yPoints3 = {314, 271, 271, 314, 357, 357};
       g.setColor(Color.magenta);
       g.fillPolygon(xPoints3, yPoints3, 6);
       g.setColor(Color.black);
       g.drawPolygon(xPoints3, yPoints3, 6);
       
       
       int[] xPoints4 = {775, 800, 850, 875, 850, 800};
       int[] yPoints4 = {357, 314, 314, 357, 400, 400};
       g.setColor(Color.magenta);
       g.fillPolygon(xPoints4, yPoints4, 6);
       g.setColor(Color.black);
       g.drawPolygon(xPoints4, yPoints4, 6);
       
       
       int[] xPoints5 = {775, 800, 850, 875, 850, 800};
       int[] yPoints5 = {443, 400, 400, 443, 486, 486};
       g.setColor(Color.magenta);
       g.fillPolygon(xPoints5, yPoints5, 6);
       g.setColor(Color.black);
       g.drawPolygon(xPoints5, yPoints5, 6);
       
       
       int[] xPoints6 = {700, 725, 775, 800, 775, 725};
       int[] yPoints6 = {486, 443, 443, 486, 529, 529};
       g.setColor(Color.magenta);
       g.fillPolygon(xPoints6, yPoints6, 6);
       g.setColor(Color.black);
       g.drawPolygon(xPoints6, yPoints6, 6);
       
       
       int[] xPoints7 = {625, 650, 700, 725, 700, 650};
       int[] yPoints7 = {443, 400, 400, 443, 486, 486};
       g.setColor(Color.magenta);
       g.fillPolygon(xPoints7, yPoints7, 6);
       g.setColor(Color.black);
       g.drawPolygon(xPoints7, yPoints7, 6);
       
       //Moon Complete
       
       
       //Creating the grid of potential tile placements above x-axis.
       int[][] masterArray1 = new int[200][];
       int[][] masterArray2 = new int[200][];
       int size = 0;

       for(int x = 625; x>0; x = x-150){
           for(int y = 400; y<688; y = y+86){
               int[] arr1 = {x, x+25, x+75, x+100, x+75, x+25};
               masterArray1[size] = arr1;
               int[] arr2 = {y+43, y, y, y+43, y+86, y+86};
               masterArray2[size] = arr2;
               
               size = size+1;
           }
           
           for(int y = 400; y>0; y = y-86){
               int[] arr1 = {x, x+25, x+75, x+100, x+75, x+25};
               masterArray1[size] = arr1;
               int[] arr2 = {y+43, y, y, y+43, y+86, y+86};
               masterArray2[size] = arr2;
               
               size = size+1;
           }
       }
       for(int x = 775; x<1400; x = x+150){
           for(int y = 400; y<688; y = y+86){
               int[] arr1 = {x, x+25, x+75, x+100, x+75, x+25};
               masterArray1[size] = arr1;
               int[] arr2 = {y+43, y, y, y+43, y+86, y+86};
               masterArray2[size] = arr2;
               
               size = size+1;
           }
           
           for(int y = 400; y>0; y = y-86){
               int[] arr1 = {x, x+25, x+75, x+100, x+75, x+25};
               masterArray1[size] = arr1;
               int[] arr2 = {y+43, y, y, y+43, y+86, y+86};
               masterArray2[size] = arr2;
               
               size = size+1;
           }
       }
       
       //Completed the grid for potential tile placements above the x-axis.
       
       
       
       //Creating the grid for potential tile placements below the x-axis.
       for(int x = 625+75; x>0; x = x-150){
           for(int y = 400+43; y<688; y = y+86){
               int[] arr1 = {x, x+25, x+75, x+100, x+75, x+25};
               masterArray1[size] = arr1;
               int[] arr2 = {y+43, y, y, y+43, y+86, y+86};
               masterArray2[size] = arr2;
               
               size = size+1;
           }
           
           for(int y = 400+43; y>0; y = y-86){
               int[] arr1 = {x, x+25, x+75, x+100, x+75, x+25};
               masterArray1[size] = arr1;
               int[] arr2 = {y+43, y, y, y+43, y+86, y+86};
               masterArray2[size] = arr2;
               
               size = size+1;
           }
       }
       for(int x = 775+75; x<1400; x = x+150){
           for(int y = 400+43; y<688; y = y+86){
               int[] arr1 = {x, x+25, x+75, x+100, x+75, x+25};
               masterArray1[size] = arr1;
               int[] arr2 = {y+43, y, y, y+43, y+86, y+86};
               masterArray2[size] = arr2;
               
               size = size+1;
           }
           
           for(int y = 400+43; y>0; y = y-86){
               int[] arr1 = {x, x+25, x+75, x+100, x+75, x+25};
               masterArray1[size] = arr1;
               int[] arr2 = {y+43, y, y, y+43, y+86, y+86};
               masterArray2[size] = arr2;
               
               size = size+1;
           }
       }
       
       //Completed the grid for potential tile placements below the x-axis.
       
       
       
       //Placing tiles in the grid
       int[][] placedTilesX = new int[49][];
       placedTilesX[0] = xPoints1;
       placedTilesX[1] = xPoints2;
       placedTilesX[2] = xPoints3;
       placedTilesX[3] = xPoints4;
       placedTilesX[4] = xPoints5;
       placedTilesX[5] = xPoints6;
       placedTilesX[6] = xPoints7;
       
       int[][] placedTilesY = new int[49][];
       placedTilesY[0] = yPoints1;
       placedTilesY[1] = yPoints2;
       placedTilesY[2] = yPoints3;
       placedTilesY[3] = yPoints4;
       placedTilesY[4] = yPoints5;
       placedTilesY[5] = yPoints6;
       placedTilesY[6] = yPoints7;
       
       int tilesPlaced=7;
       //Setting Starting Number of each Tile
        int quantityMountain = 5;
        int quantityOceanFloor = 37;
        int quantityFertileGround = 5;
        int quantityRiverland = 4;
        
        //Loop to Create the Board
        while(tilesPlaced<tiles){
           int a = (int)(Math.random()*160);
           outerloop:
           for(int c=0; c<6; c++){
               for(int d=0; d<tilesPlaced; d++){
                   innerloop:
                   for(int e=0; e<6; e++){
                       if(masterArray1[a][c] == placedTilesX[d][e] && masterArray2[a][c] == placedTilesY[d][e]){
                           
                           for(int f=0; f<tilesPlaced; f++){
                               if(Arrays.equals(masterArray1[a], placedTilesX[f]) && Arrays.equals(masterArray2[a], placedTilesY[f])){
                                   break innerloop;
                               }
                           }
                           
                           
                           int color = (int)(Math.random()*((59 - tilesPlaced)-1)+1);
                           if(color <= quantityFertileGround){
                                g.setColor(Color.GREEN);
                                System.out.println(color + ": Fertile Ground");
                                quantityFertileGround--;
                           }
                           else if(color <= quantityFertileGround + quantityRiverland){
                               g.setColor(Color.CYAN);
                               System.out.println(color + ": Riverland");
                               quantityRiverland--;
                           }
                           else if(color <= quantityFertileGround + quantityRiverland + quantityMountain){
                               g.setColor(Color.DARK_GRAY);
                               System.out.println(color + ": Mountain");
                               quantityMountain--;
                           }
                           else if(color >= quantityFertileGround + quantityRiverland + quantityMountain + 1){
                               g.setColor(Color.WHITE);
                                System.out.println(color + ": Ocean Floor");                               
                               quantityOceanFloor--;
                           }
                            g.fillPolygon(masterArray1[a], masterArray2[a], 6);
                            
                            int quantityUnstable = 4;
                            int quantityRadioactive = 3;
                            int quantityTsukuyumi = 2;
                            int quantityToxic = 3;
                            if (color >= (quantityFertileGround + quantityRiverland + quantityMountain + 25)){
                                int modifier = (int)(Math.random()* (quantityUnstable+quantityRadioactive+quantityTsukuyumi+quantityToxic-1)+1);
                                if(modifier <= quantityUnstable){
                                    g.setColor(Color.RED);
                                    quantityUnstable--;
                                }
                                else if(modifier <= quantityUnstable+quantityRadioactive){
                                    g.setColor(Color.YELLOW);
                                    quantityRadioactive--;
                                }
                                else if(modifier <= quantityUnstable+quantityRadioactive+quantityTsukuyumi){
                                    g.setColor(Color.MAGENTA);
                                    quantityTsukuyumi--;
                                }
                                else if(modifier >= quantityUnstable+quantityRadioactive+quantityTsukuyumi+quantityToxic){
                                    g.setColor(Color.GREEN);
                                    quantityToxic--;
                                }
                                int[] temp1 = {masterArray1[a][0]+35, masterArray1[a][1]+17, masterArray1[a][2]-17, masterArray1[a][3]-35
                                        , masterArray1[a][4]-17, masterArray1[a][5]+17};
                                
                                int[] temp2 = {masterArray2[a][0], masterArray2[a][1]+30, masterArray2[a][2]+30, masterArray2[a][3]
                                        , masterArray2[a][4]-30, masterArray2[a][5]-30};
                                g.fillPolygon(temp1, temp2, 6);
                            }
                            g.setColor(Color.black);
                            g.drawPolygon(masterArray1[a], masterArray2[a], 6);
                            placedTilesX[tilesPlaced] = masterArray1[a];
                            placedTilesY[tilesPlaced] = masterArray2[a];
                            tilesPlaced++;
                            break outerloop;
                       }
                   }
               }
           }
       }
        
        //All tiles placed
        
   }
}