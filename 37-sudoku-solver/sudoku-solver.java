class Solution {
    public void solveSudoku(char[][] board) {
        if(board.length<9) return;
        solve(board);
    }
    
	 boolean solve(char[][] board) {
		int n= board.length;
		int row= -1;
		int col = -1;
		boolean emptychecker = true;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]=='.') {
					row=i;
					col=j;
					emptychecker=false;
					break;
				}
			}
			if(!emptychecker) {
				break;
			}
		}
		if(emptychecker) {
			return true;
		}
		
		for(int num=1;num<=9;num++) {
			if(isSafe(board,row,col,num)) {
				board[row][col]=(char) (num+'0');
				if(solve(board)) {
					return true;
				}else {
					board[row][col]='.';
				}
			}
		}
		return false;
	}
	
	 boolean isSafe(char[][] board,int row,int col,int num) {
		for(int i=0;i<board.length;i++) {
			if(board[row][i]==(char)(num+'0')) {
				return false;
			}
		}
		
		for(int i=0;i<board.length;i++) {
			if(board[i][col]==(char)(num+'0')) {
				return false;
			}
		}
		
		int srt = (int)(Math.sqrt(board.length));
		int rowstart = row - row%srt;
		int colstart = col - col%srt;
		
		for(int i=rowstart;i<rowstart+srt;i++) {
			for(int j=colstart;j<colstart+srt;j++) {
				if(board[i][j]==(char)(num+'0')) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	 void display(char[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}