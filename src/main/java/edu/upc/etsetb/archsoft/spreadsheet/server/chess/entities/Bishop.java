/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.spreadsheet.server.chess.entities;

import java.util.Vector;

/**
 *
 * @author Alex
 */
public class Bishop extends ChessPiece {

    @Override
    public void isPathFree(int ro, int co, int rd, int cd, ChessBoard board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isPieceMovement(int ro, int co, int rd, int cd) {
        // Codigo de test de que se mueve en diagonal 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector getMovements(int ro, int co, ChessBoard board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
