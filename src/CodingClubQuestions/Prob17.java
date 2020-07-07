package CodingClubQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * 0=Dead, never alive
 * 1=Alive
 * 2=Dead, once alive, able to reproduce on
 */

public class Prob17 {
    public static void main(String[] args) throws FileNotFoundException {
        final int GRIDSIZE = 10;
        Scanner scan = new Scanner(new File("src/CodingClubQuestions/Prob17.txt"));
        int tests = Integer.parseInt(scan.nextLine());
        for (int x = 0; x < tests; x++) {
            int generations = Integer.parseInt(scan.nextLine());
            int[][] grid = new int[GRIDSIZE][GRIDSIZE];
            for (int i = 0; i < GRIDSIZE; i++) {
                String line = scan.nextLine();
                for (int j = 0; j < GRIDSIZE; j++) {
                    grid[i][j] = Integer.parseInt(line.substring(j, j + 1));
                }
            }
            for (int i = 0; i < generations; i++) {
                for (int j = 0; j < GRIDSIZE; j++) {
                    for (int k = 0; k < GRIDSIZE; k++) {

                            int neighbors = 0;
                            //Left
                            if(k>0){
                                if(checkLeft(grid, j, k))
                                    neighbors++;
                            }
                            //Right
                            if(k<GRIDSIZE-1){
                                if(checkRight(grid, j, k))
                                    neighbors++;
                            }
                            //Up
                            if(j>0){
                                if(checkUp(grid, j, k))
                                    neighbors++;
                            }
                            //Down
                            if(j<GRIDSIZE-1){
                                if(checkDown(grid, j, k))
                                    neighbors++;
                            }
                            if(grid[j][k]==1){
                                if(neighbors<=1){
                                    grid[j][k]=2;
                                }
                                if(neighbors>=4){
                                    grid[j][k]=2;
                                }
                            }
                            if(grid[j][k]==2){
                                if(neighbors==3){
                                    grid[j][k]=1;
                                }
                            }


                    }
                }
            }
            /**********
             * PRINTER*
             **********/
            for (int i = 0; i < GRIDSIZE; i++) {
                for (int j = 0; j < GRIDSIZE; j++) {
                    if(grid[i][j]==2){
                        grid[i][j]=1;
                    }
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }
    }
    public static boolean checkLeft(int[][] grid, int x, int y){
        boolean isOne = false;
        if(grid[x][y-1]==1) isOne=true;
        return isOne;
    }
    public static boolean checkRight(int[][] grid, int x, int y){
        boolean isOne = false;
        if(grid[x][y+1]==1) isOne=true;
        return isOne;
    }
    public static boolean checkUp(int[][] grid, int x, int y){
        boolean isOne = false;
        if(grid[x-1][y]==1) isOne=true;
        return isOne;
    }
    public static boolean checkDown(int[][] grid, int x, int y){
        boolean isOne = false;
        if(grid[x+1][y]==1) isOne=true;
        return isOne;
    }
}
