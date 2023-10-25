package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TicTacToeTest {
    /** ボードサイズを確認するテスト。
     */
    @Test
    void BoardSizeTest(){
        int defaultSize = 3;
        TicTacToe game = new TicTacToe();
        
        // test 1: ボードサイズ
        char[][] board = game.getBoard();
        assertEquals(defaultSize, board.length); //ボードの行数が3と等しいこと。
        for(char[] line : board){
            assertEquals(defaultSize, line.length); //全ての行に3列分の要素があること。
        }
    }

    /** 初期ボードの状態確認テスト
     * BoardSizeTest() を参考に、TicTacToe.initalize()を実行した
     * 直後のボード内の要素が全て 'e' であることを確認するテスト。
     */
}
