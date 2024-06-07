import java.util.ArrayList;
import java.util.List;
 
public class dataProcessingExample {
    public static void main(String[] args) {
        List<String> items = getData(); // Assuming you have a list of items to process
 
        int dataSize = 3; // Define the size of each data
        int totalItems = items.size();
        int totaldataes = (int) Math.ceil((double) totalItems / dataSize);
 
        for (int dataIndex = 0; dataIndex < totaldataes; dataIndex++) {
            int startIndex = dataIndex * dataSize;
            int endIndex = Math.min(startIndex + dataSize, totalItems);
 
            List<String> data = items.subList(startIndex, endIndex);
            processdata(data);
 
            // You can perform any other operations on the processed data here if needed
        }
    }
 
    public static void processdata(List<String> data) {
        // Perform the required processing on the data
        for (String item : data) {
            // Process each item in the data
            System.out.println("Processing item: " + item);
            // ... Perform processing logic here ...
        }
    }
 
    public static List<String> getData() {
        // Simulating getting data from a source (e.g., database, file)
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");
        items.add("Item 5");
        items.add("Item 6");
        items.add("Item 7");
        items.add("Item 8");
        items.add("Item 9");
        items.add("Item 10");
        return items;
    }
}

has context menu
