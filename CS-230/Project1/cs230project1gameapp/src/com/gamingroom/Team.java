package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity
{
	long id;
	String name;
	
	static List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) 
	{
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	@Override
	public String toString() 
	{
		return "Team [id=" + id + ", name=" + name + "]";
	}
	
	
	public Player addPlayer(String name) 
	{

		// a local game instance
		Player player = null;

		
		// if found, simply return the existing instance
		for (Player SelectedPlayer : players)
		{
			if(SelectedPlayer.getName().equals(name))
			{
				return SelectedPlayer;
			}
		}
		// if not found, make a new game instance and add to list of games
		if (player == null)
		{
			player = new Player(GameService.nextPlayerId++, name);
			players.add(player);
		}

		// return the new/existing game instance to the caller
		return player;
	}
}
