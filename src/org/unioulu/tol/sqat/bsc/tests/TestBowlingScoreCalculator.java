package org.unioulu.tol.sqat.bsc.tests;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	public List<Frame> game1(){
		BowlingGame bg = new BowlingGame();
		Frame frame1=new Frame(1,5);
		Frame frame2=new Frame(3,6);
		Frame frame3=new Frame(7,2);
		Frame frame4=new Frame(3,6);
		Frame frame5=new Frame(4,4);
		Frame frame6=new Frame(5,3);
		Frame frame7=new Frame(3,3);
		Frame frame8=new Frame(4,5);
		Frame frame9=new Frame(8,1);
		Frame frame10=new Frame(2,6);
		bg.addFrame(frame1);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		bg.addFrame(frame10);
		return bg.getFrames();
	}
	public List<Frame> game2Strike(){
		BowlingGame bg = new BowlingGame();
		Frame frame1=new Frame(10,0);
		Frame frame2=new Frame(3,6);
		Frame frame3=new Frame(7,2);
		Frame frame4=new Frame(3,6);
		Frame frame5=new Frame(4,4);
		Frame frame6=new Frame(5,3);
		Frame frame7=new Frame(3,3);
		Frame frame8=new Frame(4,5);
		Frame frame9=new Frame(8,1);
		Frame frame10=new Frame(2,6);
		bg.addFrame(frame1);
		bg.addFrame(frame2);
		bg.addFrame(frame3);
		bg.addFrame(frame4);
		bg.addFrame(frame5);
		bg.addFrame(frame6);
		bg.addFrame(frame7);
		bg.addFrame(frame8);
		bg.addFrame(frame9);
		bg.addFrame(frame10);
		return bg.getFrames();
	}
	@Test
	public void testFrame() {
		BowlingGame bg = new BowlingGame();
		Frame frame= new Frame(3,5);
		int result=frame.score();
		assertTrue(result>0 && result<11);
		//fail("Not yet implemented");
	}
	@Test
	public void testFrameWithSeperateValue() {
		BowlingGame bg = new BowlingGame();
		Frame frame= new Frame(3,5);
		frame.setFirstThrow(5);
		frame.setSecondThrow(0);
		int result=frame.score();
		assertTrue(result>0 && result<11);
		//fail("Not yet implemented");
	}
	@Test
	public void computeScore() {
		BowlingGame bg = new BowlingGame();
		Frame frame= new Frame(3,5);
		int result=frame.score();
		assertTrue(result==8);
		//fail("Not yet implemented");
	}
	@Test
	public void computeScoreGame() {
		
		BowlingGame game=new BowlingGame();
		game.setFrames(game1());
		int result=game.computeScore();
		System.out.println("non strike"+result);
		assertTrue(result==81);
		//fail("Not yet implemented");
	}
	@Test
	public void checkStrike(){
		BowlingGame game=new BowlingGame();
		game.setFrames(game2Strike());
		int result=game.computeScore();
		System.out.println("strike"+result);
		assertTrue(result==94);
		//fail("Not yet implemented");
	}
	
	
}
