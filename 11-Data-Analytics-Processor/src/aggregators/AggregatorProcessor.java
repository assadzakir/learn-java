package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<A extends Aggregator> {

	A agr;
	String filePath;

	public AggregatorProcessor(A agr, String filePath) {
		this.agr = agr;
		this.filePath = filePath;
	}

	public double runAggregator(int noOfCol) throws IOException {

		StockFileReader fr = new StockFileReader(filePath);
		List<String> lines = fr.readFileData();

		int numOfLines = lines.size();

		for (int i = 0; i < numOfLines; i++) {
			String line = lines.get(i);
			String[] arrayOflineValues = line.split(",");
			agr.add(Double.parseDouble(arrayOflineValues[noOfCol]));
		}

		double result = agr.calculate();

		return result;
	}

}
