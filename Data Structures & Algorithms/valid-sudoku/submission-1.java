/*
Em todo o Sudoku so pode haver no maximo 9 de cada digito
Não pode haver caracteres que nao sejam numeros

HashMap com chave posicao e valor numero.
Sempre que eencontramos um valor, verificamos se ele tem um igual na coluna, linha e 
caixa onde está.

bucket = pos(i,j) até pos(i+2,j+2)
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++) {

            Set<Character> rowsBuckets = new HashSet<>();
            Set<Character> colsBuckets = new HashSet<>();

            for(int j = 0; j < 9; j++) {

                if(board[i][j] != '.') {
                    if(rowsBuckets.contains(board[i][j])) {
                        {
                            return false;
                        }
                    }
                    rowsBuckets.add(board[i][j]);
                }

                if(board[j][i] != '.') {
                    if(colsBuckets.contains(board[j][i])) {
                        {
                            return false;
                        }
                    }
                    colsBuckets.add(board[j][i]);
                } 
            }
        }

        for(int k = 0; k < 9; k+=3) {
                for(int s = 0; s < 9; s+=3) {
                    if(!checkBucket(board, k, s)) {
                        return false;
                    } 
                }
            }
            
        return true;
    }

    public boolean checkBucket(char[][] board, int startRow, int startCol) {
    Set<Character> bucket = new HashSet<>();

    for (int i = startRow; i < startRow + 3; i++) {
        for (int j = startCol; j < startCol + 3; j++) {
            char c = board[i][j];

            if (c == '.') {
                continue;
            }

            if (bucket.contains(c)) {
                return false;
            }

            bucket.add(c);
        }
    }

        return true;
    }
}
