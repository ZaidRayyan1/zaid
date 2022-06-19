package University;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public abstract class DataPrinter {
	protected abstract String start();
	protected abstract String printHeader(Student student);
	protected abstract String printContent(Student student);
	protected abstract String printFooter(Student student);
	protected abstract String end();
	
	public final void printData(Student student,String fileName) throws IOException {
		Writer fw = new FileWriter(fileName);
		fw.write(start());
		fw.write(printHeader(student));
		fw.write(printContent(student));
		fw.write(printFooter(student));
		fw.write(end());
		fw.close();
	}
}
