package chess;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 * game view
 * display chess panel ,ui
 */
public class View {
	//window
	JFrame frame;
	
	//chess controller
	Chess chess = new Chess();
	
	//chess panel 
	ChessPanel chessPanel;
	
	/**
	 * create window
	 * bind event
	 */
	public void create() {
		//init window
		frame = new JFrame("Chess");
		
		//init chess panel
		chessPanel = new ChessPanel();
		frame.add(chessPanel);

		//set tool bar
		JToolBar bar = new JToolBar();
		frame.add(bar, BorderLayout.NORTH);
		bar.setBorderPainted(false);
		
		//set first tool
		Icon icon =null;//Icon
		JButton restartAction = new JButton("Restart", icon);//Action
		restartAction.setToolTipText("Restart");
		restartAction.setOpaque(true);
		restartAction.setBorderPainted(false);
		restartAction.setFocusPainted(false);
		restartAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				restartBoard();//restart
			}
		});
		bar.add(restartAction);//restart Action
		
		//set black first
		Chess.first=Chess.BLACK;
		Chess.currentPlayer=Chess.BLACK;
		Chess.restart=true;
		
		//set panel mouse listener
		chessPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				showChess(chessPanel, e);
			}
		});
		
		//set frame attr
		frame.setSize(476, 532);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	/**
	 * restart event 
	 */
	public void restartBoard(){
		chess.restart();//init chess panel
		chessPanel.clearBoard();//chess pieces	
		//set black first
		Chess.first=Chess.BLACK;
		Chess.currentPlayer=Chess.BLACK;
		Chess.restart=true;
	}
	
	/**
	 * chess panel click event 
	 * @param chessPanel
	 * @param e
	 */
	public void showChess(ChessPanel chessPanel, MouseEvent e) {
		
		if(!Chess.restart) {
			return;
		}
		
		//click mouse coordinate
		int x = e.getX();
		int y = e.getY();
		
		//convert x,y to col,row
		int col = (x - 5) / 30;
		int row = (y - 5) / 30;
		
		if(Chess.currentPlayer==Chess.WHITE) {
			//is enable
			boolean isEnable = chess.play(row, col,Chess.WHITE);
			if (isEnable) {
				// draw chess pieces
				chessPanel.doPlay(row, col, Chess.WHITE);
				
				//white win
				if (chess.isWin(row, col, Chess.WHITE)){
					JOptionPane.showMessageDialog(frame, "White win !", "White win !",JOptionPane.WARNING_MESSAGE);  
					//restartBoard();//
					Chess.restart=false;
					return;
				}
				Chess.currentPlayer=Chess.BLACK;
				return;
			} else {
				System.out.println("coordinate  is invalid!");
			}
		}
		
		if(Chess.currentPlayer==Chess.BLACK) {			
			//is enable
			boolean isEnable = chess.play(row, col,Chess.BLACK);
			if (isEnable) {
				// draw chess pieces
				chessPanel.doPlay(row, col, Chess.BLACK);
				
				//black win
				if (chess.isWin(row, col, Chess.BLACK)){
					JOptionPane.showMessageDialog(frame, "Black win !", "Black win !",JOptionPane.WARNING_MESSAGE);  
					//restartBoard();//
					Chess.restart=false;
					return;
				}
				Chess.currentPlayer=Chess.WHITE;
				return;
			} else {
				System.out.println("coordinate  is invalid!");
			}
		}
		
	}
}
