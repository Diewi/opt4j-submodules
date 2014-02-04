/**
 * Opt4J is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * Opt4J is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Opt4J. If not, see http://www.gnu.org/licenses/.
 */

package org.opt4j.core.optimizer;

/**
 * <p>
 * This {@link IterativeOptimizer} interface has to be implemented by all
 * population-based iterative optimizers.
 * </p>
 * <p>
 * To bind an {@link IterativeOptimizer}, use
 * {@link OptimizerModule#bindIterativeOptimizer}.
 * </p>
 * 
 * @author reimann, glass, lukasiewycz
 * 
 */
public interface IterativeOptimizer {

	/**
	 * This method is called a single time before the optimization process is
	 * started. It can be used to initialize used data structures, etc.
	 * 
	 * @throws TerminationException
	 *             if the optimization is terminated
	 */
	public void initialize() throws TerminationException;

	/**
	 * Performs the next iteration in the optimization process.
	 * 
	 * @throws TerminationException
	 *             if the optimization is terminated
	 */
	public void next() throws TerminationException;
}
