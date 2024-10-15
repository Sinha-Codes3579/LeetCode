package com.convert_1D_array_to_2D_array;

public class solution {
    public static int[][] construct2DArray(int[] original, int m, int n){
        int[][] newarr = new int[m][n];
        int k = 0;
        if(m * n != original.length){ //true means we can't properly fit the elements of the original array into a m x n 2D array
            return new int[0][0];//creates an empty 2D array, meaning it has 0 rows and 0 columns
            // a placeholder representing that the conversion cannot be made
            //need to allocate memory for it using new
            //new int[0][0] creates the array in memory, even though it has no elements (0 rows and 0 columns)
        }
        //instead of returning null which leads to NullPointerException
        //we return a valid but empty 2D array.
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                newarr[i][j] = original[k++];
            }
        }
        return newarr;//5ms
    }

    /*
    if(original.length != m + n){
        return new int[0][0];     //4ms
        }
     */


    /*
    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = original[index];
                index++;
            }
        }    //3ms
     */

    /*
    int[][] arr = new int[m][];

        if(original.length!=m*n){
            return new int[0][0];
        }
        for(int i=0; i<m; i++){
            arr[i]=Arrays.copyOfRange(original,i*n,i*n+n);
        }  //2ms
     */
}
