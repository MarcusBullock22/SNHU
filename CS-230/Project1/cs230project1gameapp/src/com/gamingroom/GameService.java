package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	static long nextPlayerId = 1;
	static long nextTeamId = 1;

	// create local instance because constructor is private
	private static GameService instance = new GameService();
	


	//this is needed so outside classes can access the object.
	public static GameService getInstance()
	{
		return instance;
	}


	
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) 
	{

		// a local game instance
		Game game = null;

		
		// if found, simply return the existing instance
		for (Game SelectedGame : games)
		{
			if(SelectedGame.getName().equals(name))
			{
				return SelectedGame;
			}
		}
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) 
	{
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) 
	{

		// a local game instance
		Game game = null;

		// another for loop to grab id of the select game.
		for(Game SelectedGame : games)
		{
			if(SelectedGame.getId() == id)
			{
				game = SelectedGame;
			}
			return game;
		}
		// if found, simply assign that instance to the local variable

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) 
	{

		// a local game instance
		Game game = null;

		for (Game SelectedGame : games)
		{
			if (SelectedGame.getName().equals(name))
			{
				game = SelectedGame;
			}
		}
		// if found, simply assign that instance to the local variable

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() 
	{
		return games.size();
	}
	
	
	public Team getNextTeamId(long id)
	{
		// a local game instance
		Team team = null;

		// another for loop to grab id of the select game.
		for(Team SelectedTeam : Game.teams)
				{
					if(SelectedTeam.getId() == id)
					{
						team = SelectedTeam;
					}
					return team;
				}
				// if found, simply assign that instance to the local variable

				return team;
	}
	
	
	public Player getNextPlayerId(long id)
	{
		// a local game instance
		Player player = null;

				// another for loop to grab id of the select game.
				for(Player SelectedPlayer : Team.players)
				{
					if(SelectedPlayer.getId() == id)
					{
						player = SelectedPlayer;
					}
					return player;
				}
				// if found, simply assign that instance to the local variable

				return player ;
	}
	

	
	
}
