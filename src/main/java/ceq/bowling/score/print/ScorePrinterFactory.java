package ceq.bowling.score.print;

import ceq.bowling.score.print.impl.ClassicScorePrinter;

public class ScorePrinterFactory {

	public ScorePrinter getPrinter() {
		return new ClassicScorePrinter();
	}

}
