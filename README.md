# Optimal-Strategy-Making-Agent-For-RISK-Boardgame

This program simulates an optimal strategy making agent for RISK boardgame which devises
an optimal strategy to help the concerned player to attempt to control an entire continent
in his or her turn. The agent tries it's best to acquire all the territories within the turn
if it is feasible, else will decide on a strategy such that the player can control
the said continent in the next turn.

The agent is built using MDP(Markov Decision Process) model and Bayesian Network. It implements
the Value Iteration Algorithm on the constructed MDP chain and precomputes the optimal policy
before the start of the player's turn. It takes in the initial state of the game, the continent
to be controlled and the player for which to devise the optimal strategy as the input.

To demonstrate the working of the agent, the initial state of the game has been entered based on
the image that has been uploaded as sample_initial_state.jpg. As an example, the objective chosen
was to Control Europe and the player for which the agent computes the strategy is the Blue player.
For the gamma value of 0.1, the results have been uploaded as sample_result.txt.
To run the program, run the file Main.java. The program will output the first optimal move. If the move
was a success, type 'yes' else, type 'no'. Depending on your feedback, the agent will
output the next optimal move accordingly.

**Issues:**
For some cases, the Markov Chain can grow exceedingly large and JVM could run out of memory. Even after pruning
the state space, the number of nodes in the Markov Chain can reach in the range of hundreds of millions. For this reason,
it is recommended that this program is run on a server with enough memory and try to set at least 12g of memory via the -Xmx option.

**License:**
See the LICENSE file for license rights and limitations (MIT).
