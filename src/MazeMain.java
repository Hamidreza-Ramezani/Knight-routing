
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hamid
 */
public class MazeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Solve Maze with UCS
        System.out.println("map[8][8] :");
        int[][] map = {{0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0},
        {0, -1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, -1, 0, 0}, {0, 0, 0, -1, 0, 0, 0, 0},
        {0, 0, 0, 0, -1, 0, 0, 0}, {2, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 2, 0, 0, 0}};

        for (int[] a : map) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                map[i][j] = scanner.nextInt();
//            }
//        }


        Maze mp = new Maze(map);

        ArrayList<Action> actions6 = UCS.search(mp);
        if (actions6 != null) {
            for (Action a : actions6) {
                System.out.print(a.actionCode + " ");
            }
        }
        System.out.println("");

//        //Solve Maze with A*
//        ArrayList<Action> actions7 = AStar.search(mp);
//        if (actions7 != null) {
//            for (Action a : actions7) {
//                System.out.print(a.actionCode + " ");
//            }
//        }
//        System.out.println("");
    }

}
