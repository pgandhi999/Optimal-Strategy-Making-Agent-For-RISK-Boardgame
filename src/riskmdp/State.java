package riskmdp;

import java.util.ArrayList;

/*
 * Represents the state vertex object in the state space graph.
 * id: state id
 * actions: The attack move to a particular territory from a particular territory that led to this state
 * reward: The reward associated with this state
 * adjStates: List of all child states derived from this state
 * probability: The probability of reaching this state from it's parent state
 * utility: The utility of this state
 * parentState: The id of the parent state of this state
 */
public class State
{
	private long id = 0;
	private short actions = 0;
	private int reward = 0;
	private ArrayList< Long > adjStates = null;
	private double probability = 0d;
	private double utility = 0d;
	private int parentState = 0;

	public long getId()
	{
		return id;
	}

	public void setId( long id )
	{
		this.id = id;
	}

	public short getActions()
	{
		return actions;
	}

	public void setActions( short actions )
	{
		this.actions = actions;
	}

	public int getReward()
	{
		return reward;
	}

	public void setReward( int reward )
	{
		this.reward = reward;
	}

	public ArrayList< Long > getAdjStates()
	{
		return adjStates;
	}

	public void setAdjStates( ArrayList< Long > adjStates )
	{
		this.adjStates = adjStates;
	}

	public double getProbability()
	{
		return probability;
	}

	public void setProbability( double probability )
	{
		this.probability = probability;
	}

	public double getUtility()
	{
		return utility;
	}

	public void setUtility( double utility )
	{
		this.utility = utility;
	}

	public int getParentState()
	{
		return parentState;
	}

	public void setParentState( int parentState )
	{
		this.parentState = parentState;
	}
}