package homework8;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;
import javax.swing.JOptionPane;

public class ToFile {

    private Formatter file;

    public void openFile() {
        try {
            file = new Formatter("homework8.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл для записи информации о товарах на складе создать не получилось");
        }
    }

    public void addRecord(List<Product> sumInvoices) {
        file.format("%s\t%s\t%s\t%s\n", "N", "Id", "Price", "Type");
        for (int i = 0; i < sumInvoices.size(); i++) {
            file.format("%s\t%s\t%s\t%s\n", (i + 1), sumInvoices.get(i).idProduct, sumInvoices.get(i).priceProduct, sumInvoices.get(i).typeProduct);
        }
        JOptionPane.showMessageDialog(null, "Информацию о товарах во всех чеках Вы можете посмотреть в файле: homework8.txt в папке Homework8");
    }

    public void closeFile() {
        file.close();
    }
}
