package org.opt4j.tutorial.operator;
import org.opt4j.operator.crossover.CrossoverModule;

public class MyOperatorModule extends CrossoverModule {

	@Override
	protected void config() {
		addOperator(MyOperator.class);
	}
}
