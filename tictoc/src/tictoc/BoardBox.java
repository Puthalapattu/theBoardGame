package tictoc;

public class BoardBox {
    String symbol;
    String symColor;
    boolean isVisited = false;

    public BoardBox(String symbol, String symColor) {
        this.symbol = symbol;
        this.symColor = symColor;
    }
}