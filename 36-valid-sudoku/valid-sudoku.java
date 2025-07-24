class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9]; 
        HashSet<Character>[] boxes = new HashSet[9]; 

        for(int i=0;i<9;i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int r=0;r<n;r++){
            for(int c=0;c<board[0].length;c++){
                char ch = board[r][c];

                if(ch == '.'){
                    continue;
                }

                if(rows[r].contains(ch)){
                    return false;
                }

                rows[r].add(ch);
                if(cols[c].contains(ch)){
                    return false;
                }
                cols[c].add(ch);


                int res = (3 * (r/3)) + (c/3);

                if(boxes[res].contains(ch)){
                    return false;
                }

                boxes[res].add(ch);
            }
        }
        return true;

    }
}