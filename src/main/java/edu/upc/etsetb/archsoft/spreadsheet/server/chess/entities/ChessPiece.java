/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.spreadsheet.server.chess.entities;

import edu.upc.etsetb.archsoft.spreadsheet.server.entities.Piece;
import java.util.Vector;


/**
 *
 * @author Alex
 */
public abstract class ChessPiece implements Piece  {
    int ro;
    int co;
    int color; // Black=0 White=1 more colors? We'll see
    int p;
    boolean dead; // Status dead or alive   
    
    public abstract void isPathFree(int ro, int co, int rd, int cd, ChessBoard board) /*throws NoPathFreeException*/;
    public abstract void isPieceMovement(int ro, int co, int rd, int cd) /* throws NoPieceMovementException */; 
    abstract public Vector getMovements(int ro, int co, ChessBoard board);
    public int getColor(){ 
        return co;
    };
    
    
}
