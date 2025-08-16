class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        boolean result = false;
        // int left = 0;
        // int right;
        // int mid;
        //int row = -1;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;

        while(top <= bottom)
        {
            int row = (top + bottom) / 2;

            if(target > matrix[row][cols - 1])
            {
                top = row + 1;
            }
            else if(target < matrix[row][0])
            {
                bottom = row - 1;
            }
            else
            {
                break;
            }
        }

        if(!(top <= bottom) )
        {
            return result;
        }

        //Find the row to begin the search:
        // for(int i = 0; i < matrix.length; i ++)
        // {
        //     if(matrix[i][matrix.length - 1] > target)
        //     {
        //         row = i;
        //         //break;
        //     }
        // }

        //right = matrix[row].length - 1;
        int row = (top + bottom) / 2;
        int left = 0;
        int right = cols - 1;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(matrix[row][mid] < target)
            {
                left = mid + 1;
            }
            else if(matrix[row][mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                result = true;
                return result;
                //return result;
            }
        }

        return result;
    }
}
