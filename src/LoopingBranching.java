/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class LoopingBranching {
    public static void main(String[] args) {
        // While & Do-While
        int i = 1;
        while (i <= 10) { System.out.println(i); i++; }

        int j = 1;
        do { System.out.println(j); j++; } while (j <= 10);

        // For Statements
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }

        int[] nums = {1,2,3,4,5};
        for (int n : nums) {
            System.out.println(n);
        }

        // Branching Break
        int[] a = {32, 87, 3, 589, 12};
        int target = 12; int idx = -1;
        for (int idxI = 0; idxI < a.length; idxI++){
            if(a[idxI] == target){ idx = idxI; break; }
        }
        System.out.println(idx);

        int[][] m = {{1,2},{3,4}};
        boolean found = false;
        search:
        for (int row = 0; row < m.length; row++){
            for (int col = 0; col < m[row].length; col++){
                if(m[row][col] == target) { found = true; break search; }
            }
        }

        // Branching Continue
        int count = 0; String s = "peter piper picked...";
        for (int strI = 0; strI < s.length(); strI++){
            if (s.charAt(strI) != 'p') continue;
            count++;
        }
        System.out.println(count);
    }

    public int testReturn(int x, int count) {
        if (x < 0) return 0;
        return ++count;
    }
}