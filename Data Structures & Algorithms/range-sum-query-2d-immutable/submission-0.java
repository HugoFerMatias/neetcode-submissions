class NumMatrix {

    private int[][] matrix;
    private int[][] prefixMatrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        int rows = matrix.length;
        int col = matrix[0].length;
        /*
        Criar matriz de prefixos onde a primeira coluna e linha tem 0's
        */
        this.prefixMatrix = new int[rows + 1][ col + 1];

        int sum = 0;
        // Ciclos percorrem linhas e colunas e vao construindo a matriz de prefixos
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= col; j++) {
                /* Soma acumulativa que contem a soma dos valores naquela linha, desde a
                coluna 0 até à coluna j-1 na matriz original
                */
                sum += matrix[i-1][j-1];
                /*
                Na matriz de prefixo, na primeira iteração, i = 1 e j = 1.
                Aqui this.prefixMatrix[i - 1][j] = 0 e sum é apenas o primeiro valor 
                da matriz original. Assim em this.prefixMatrix[1][1] = 0 + sum, 
                correspondendo exatamente a matrix[0][0].
                Tanto neste caso especial como nos outros o que estamos a fazer é adicionar
                o valor da linha acima da "i", ou seja, "i-1" e coluna "j". Esta celula vai
                conter o somatório da submatriz na matriz original que vai de matriz[0][0]
                até matriz[i-1][j-1]  
                */ 
                this.prefixMatrix[i][j] = this.prefixMatrix[i - 1][j] + sum;
            }
            sum = 0;
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        sum = this.prefixMatrix[row2+1][col2+1] - this.prefixMatrix[row1][col2+1] -
        this.prefixMatrix[row2+1][col1] + this.prefixMatrix[row1][col1];

        return sum;
    }

}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */