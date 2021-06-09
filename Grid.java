package TwoDimension;
public class Grid {
    static boolean find(char[][] grid, String s, int x, int y, int row, int col, int step) {
        int l = s.length();
        if(step==l)
            return true;
        if(x<0||y<0||x>=row||y>=col)
            return false;
        if(grid[x][y]==s.charAt(step))
        {
            char temp=grid[x][y];
            grid[x][y]='$';
            /* four directions up,down,left,right
            boolean result=find(grid,s,x-1,y,row,col,step+1) |
                           find(grid,s,x+1,y,row,col,step+1) |
                           find(grid,s,x,y-1,row,col,step+1) |
                            find(grid,s,x,y+1,row,col,step+1);

             */
            //down,right
            boolean result=find(grid,s,x+1,y,row,col,step+1) || find(grid,s,x,y+1,row,col,step+1) ;

            grid[x][y]=temp;
            return result;

        }
        else
            return false;

    }


    static boolean search(char[][] grid, String s, int row, int col) {

        int l = s.length();
        if (l > row * col)
            return false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == s.charAt(0))
                    if (find(grid, s, i, j, row, col, 0))
                        return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int row=4,col=4;
        char[][] grid={{'a','z','o','l'},{'n','x','h','o'},{'v','y','i','v'},{'o','r','s','e'}};
        String[] dic={"van","zoho","love","are","is"};

        for(int i=0;i< dic.length;i++)
        {
           if(search(grid,dic[i],row,col))
              System.out.println(dic[i]);
        }
    }
}
