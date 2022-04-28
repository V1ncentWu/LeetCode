class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length;
        int n = image[0].length;
        int color = image[sr][sc];

        if(color==newColor){
            return image;
        }

        dfs(image,sr,sc,newColor,color,m,n);

        return image;
    }

    public void dfs(int[][] image, int r, int c, int newColor, int color, int m, int n){
        if(image[r][c]==color){
            image[r][c] = newColor;
            if(r>=1){
                dfs(image,r-1,c,newColor,color,m,n);
            }
            if(r<m-1){
                dfs(image,r+1,c,newColor,color,m,n);
            }
            if(c>=1){
                dfs(image,r,c-1,newColor,color,m,n);
            }
            if(c<n-1){
                dfs(image,r,c+1,newColor,color,m,n);
            }
        }
    }
}