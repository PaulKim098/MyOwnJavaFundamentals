package classes_and_objects_in_java.abstraction;

public class DigitsOnlyFileReader extends AbstractFileReader {
    public DigitsOnlyFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected String parseLine(String line) {
        return line.replaceAll("[^0-9]", "");
    }
}
