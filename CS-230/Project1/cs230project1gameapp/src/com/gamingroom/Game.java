package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity
{
	long id;
	String name;
	
	static List<Team> teams = new ArrayList<Team>();
	
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() 
	{
		
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) 
	{
		this();
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
		
		return "Game [id=" + id + ", name=" + name + "]";
	}
	
	
	
	public Team addTeam(String name) 
	{

		// a local game instance
		Team team = null;

		
		// if found, simply return the existing instance
		for (Team SelectedTeam : teams)
		{
			if(SelectedTeam.getName().equals(name))
			{
				return SelectedTeam;
			}
		}
		// if not found, make a new game instance and add to list of games
		if (team == null)
		{
			team = new Team(GameService.nextTeamId++, name);
			teams.add(team);
		}

		// return the new/existing game instance to the caller
		return team;
	}

}
