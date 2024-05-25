// An image is represented by an m x n integer grid image where image[i][j]
// represents the pixel value of the image.
//
// You are also given three integers sr, sc, and color.
// You should perform a flood fill on the image starting from the pixel image[sr][sc].
//
// To perform a flood fill, consider the starting pixel,
// plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
// plus any pixels connected 4-directionally to those pixels (also with the same color),
// and so on. Replace the color of all of the aforementioned pixels with color.
//
// Return the modified image after performing the flood fill.
//

// Example 1:
// Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
//  Output: [[2,2,2],[2,2,0],[2,0,1]]
//  Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel),
//  all pixels connected by a path of the same color as the starting pixel
//  (i.e., the blue pixels) are colored with the new color.
//  Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.

// https://leetcode.com/problems/flood-fill/description/

import java.util.Arrays;

public class FloodFill {

    public static int[][] steps = {
            {-1, 0},  // up
            {0, -1},  // left
            {0,  1},  // right
            {1,  0}   // down
    };

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prevColor = image[sr][sc];
        if (color == prevColor) return image;
        return fill(image, sr, sc, color, prevColor);
    }

    private static int[][] fill(int[][] image, int sr, int sc, int color, int prevColor) {

        if (sr < 0 || sc < 0 ||
            sr > image.length - 1 ||
            sc > image[0].length - 1 ||
            image[sr][sc] != prevColor) return image;

        image[sr][sc] = color;

        for (int[] step : steps) {
            image = fill(image, sr+step[0], sc+step[1], color, prevColor);
        }
        return image;
    }


}
