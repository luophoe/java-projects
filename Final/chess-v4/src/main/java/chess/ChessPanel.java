package chess;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 * chess panel
 * show ,play,interact
 */
 

public class ChessPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
        public int i;
        
	//chess 
	public List<Location> list = new ArrayList<Location>();
	
	//font
	private Font font=new Font("¿¬Ìå",Font.PLAIN,13);
	
	//chess cell length
	int row = 30;
	
	//margin left
	int margin=20;
	
	//row 
	int rowper=15;
	
	//chess pieces  radius
	int chessRadius=13;
	
	//chess palnel color
	Color bgColor=new Color(246,214,159);
	
	//chess line color
	Color lineColor=new Color(164,135,81);
	
	//star color
	Color pointColor=new Color(116,88,49);
	
	@Override
	public void paint(Graphics g1) {
		super.paint(g1);
		Graphics2D g=(Graphics2D) g1;
		g.setFont(font);
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING ,RenderingHints.VALUE_ANTIALIAS_ON);
		drawBoard(g);//
		drawChessman(g);//
	}
	
	/**
	 * draw Board
	 * @param g
	 */
	public void drawBoard(Graphics2D g){
		//set background 
		g.setColor(bgColor);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		//set line color
		g.setColor(lineColor);
		
		//draw line
		for (int i = 0; i < rowper; i++) {
			g.drawLine(margin, margin + row * i, this.getWidth() - margin, margin + row * i);
			g.drawLine(margin + row * i, margin, margin + row * i, this.getHeight() - margin);
		}
		
		//
		//set star
		g.setColor(pointColor);
		g.fillOval(margin-5 + 3 * row, margin-5 + 3 * row, 10, 10);
		g.fillOval(margin-5 + 7 * row, margin-5 + 7 * row, 10, 10);
		g.fillOval(margin-5 + 3 * row, margin-5 + 11 * row, 10, 10);
		g.fillOval(margin-5 + 11 * row, margin-5 + 3 * row, 10, 10);
		g.fillOval(margin-5 + 11 * row, margin-5 + 11 * row, 10, 10);
	}
	
	/**
	 * draw chessman
	 * @param g
	 */
	public void drawChessman(Graphics2D g){
		i=1;
		
		FontMetrics metrics=g.getFontMetrics();
		int ascent = metrics.getAscent();
		int descent = metrics.getDescent();
		
		for (Location location : list) {
			if (location.getPlayer() == Chess.first)
				g.setColor(Color.black);//set first color
			else
				g.setColor(Color.white);//
			
			g.fillOval(margin-13 + location.getY() * row, margin-chessRadius + location.getX() * row, chessRadius*2, chessRadius*2);
			
			if(location.getPlayer()==Chess.first) g.setColor(Color.white);
			else g.setColor(Color.black);
			String string=i+"";
			g.drawString(string,margin + location.getY() * row-metrics.stringWidth(string)/2,margin + location.getX() * row-(ascent+descent)/2+ascent);
			i++;
		}
	}
	
	/**
	 */
	public void clearBoard() {
		list.clear();
		repaint();
	}

	/**
	 * @param row
	 * @param col
	 * @param player 
	 */
	public void doPlay(int row, int col, int player) {
		list.add(new Location(row, col, player));
		repaint();
	}
}

