
/*  I've done this program using la4j library. So, It needs to install la4j.jar in the class pacakage to run 
the program sucessfully.  */





import java.util.Scanner;
import org.la4j.matrix.Matrices;
import org.la4j.matrix.Matrix;
import org.la4j.matrix.dense.Basic2DMatrix;



public class CoordinateTransformation {
    public static void main(String[] args){
        
        int row;
        int column;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for Matrix A: ");
        row = scanner.nextInt();
        
        column = row;
        
        Matrix A; 
        A = new Basic2DMatrix(new double[row][column]);
 
        System.out.println("Enter the elements of matrix A rowwise(i.e. first complete a row and then enter next row): "); //coordinates to be transformed
        for(int i=0; i<row; i++){
            for (int j=0; j<column; j++){
               A.set(i, j, scanner.nextDouble());
            }
            
            
        }
        
        System.out.println("The matrix A looks like this: ");
        
        System.out.print(A);
       
        System.out.println("For matrix B: ");
        
        column = 1; //coordintes to be transformed
        
        Matrix B = new Basic2DMatrix(new double[row][column] );
        
        
        System.out.println("Enter the elements of matrix B rowwise(Hint: There must be only one cloumn for this matrix because it contains the coordinates that we are going to transform.) ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++ ){
                B.set(i, j, scanner.nextDouble());
            }
            
        }
        
        System.out.println("Your matrix B looks like this: ");
        
        System.out.print(B);
        
      
        Matrix inverseOfA = A.inverse(Matrices.DEFAULT_INVERTOR);
        
        System.out.println("The inverse of matrix A looks like this: ");
        
        
        System.out.print(inverseOfA);
        
        Matrix X = inverseOfA.multiply(B);
        
        System.out.println("The components of Matrx X (i.e transformation parameters and Transformed Coordinates respectively ) are as follows:");
        
        System.out.print(X);
        
          
        
    }
    
}

/*


OUTPUT: :)

Enter the number of rows for Matrix A: 
4

Enter the elements of matrix A rowwise(i.e. first complete a row and then enter next row): 
121.622
128.066
1
0
-128.066
121.622
0
1
141.228
-187.718
1
0
187.718
141.228
0
1
The matrix A looks like this:  
  121.622  128.066 1.000 0.000
 -128.066  121.622 0.000 1.000
  141.228 -187.718 1.000 0.000
  187.718  141.228 0.000 1.000
For matrix B: 
Enter the elements of matrix B rowwise(Hint: There must be only one cloumn for this matrix because it contains the coordinates that we are going to transform.) 
1049422.40
51085.20
1049413.95
49659.30
Your matrix B looks like this: 
 1049422.400
   51085.200
 1049413.950
   49659.300
The inverse of matrix A looks like this: 
-0.000-0.003 0.000 0.003
 0.003-0.000-0.003 0.000
 0.620 0.409 0.380-0.409
-0.409 0.620 0.409 0.380
The components of Matrx X (i.e transformation parameters and Transformed Coordinates respectively ) are as follows: 
      -4.500
      -0.253
 1050002.019
   50539.659
   
   
   */
