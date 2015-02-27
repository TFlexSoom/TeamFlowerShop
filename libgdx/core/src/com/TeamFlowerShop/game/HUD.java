package com.TeamFlowerShop.game;

import java.util.ArrayList;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.*;

public class HUD {
	
	SpriteBatch batch;
	Texture healthBar;
	float rotation = 0;
	float barX, barY;
	double universalXPos, universalYPos;
	int attackedFor = 0;
	float drawnHealthRemaining;
	int healthRemaining = 256;
	int healthLeached = 0;
	
	Rectangle BarRect;
	
	boolean X, Y;
	public HUD(int gold, ArrayList<Enemy> enemies)
	// Will potentially hold all of the Heads up display information including: Gold, Items, Player health,
	// and any other necessities.
	{
		batch = new SpriteBatch();
			
		healthBar = new Texture("Health Bar.png");
		
		drawnHealthRemaining = healthBar.getWidth();
	}
	
	public void Update(int gold, ArrayList<Enemy> Enemies, boolean attacked)
	{
		while (attacked)
		{
			if (attackedFor >= 120)
			{
				attackedFor = 0;
				healthLeached = healthLeached +4;
				healthRemaining = 256 - healthLeached;
			//	healthRemaining
			// 
			}
			else
			{
			attackedFor = attackedFor + 1;	
			}
		}
		if (attacked = false)
		{
			attackedFor = 0;
		}
	}
	
	public void Draw(float ux, float uy)
	{	
		batch.begin();
		batch.draw(healthBar, (float) ux, (float) uy, healthRemaining, healthBar.getHeight());
		batch.end();
	}
}