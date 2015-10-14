package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	
	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	public Frame getBonus() {
		return bonus;
	}

	public void setBonus(Frame bonus) {
		this.bonus = bonus;
	}
	public int computeScore(){
		int result=0;
		Boolean test=false;
		for(Frame g:frames){
			
			if(g.isStrike()){
				g.setScore(g.score());
				result=result+g.getScore();
				test=true;
			}else if(test){
				g.setScore(g.score());
				result=result+g.getScore();
				result=result+g.getScore();
				test=false;
			}else{
				g.setScore(g.score());
				result=result+g.getScore();
				test=false;
			}
		}
		return result;
	}
	public Boolean checkStrike(){
		
		return true;
	}

	public void addFrame(Frame frame){
		//to be implemented
	    frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
