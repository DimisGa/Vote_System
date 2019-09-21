/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import static org.apache.poi.hemf.hemfplus.record.HemfPlusRecordType.object;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author root
 */
public class Chart_Results_PIta extends Greek_Vote_System_Main{

    public PieDataset createDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        dataset.setValue("Cows", new Double(21));
        dataset.setValue("Dogs", new Double(10));
        dataset.setValue("Donkeys", new Double(34));
        dataset.setValue("Shrek", new Double(20));

        return dataset;

    }

    public JFreeChart createchart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart("Results", dataset);

        return chart;
    }

    public JPanel createChartPanel() {

        return new ChartPanel(createchart(createDataSet()));
    }
    
    
    /// METHOD THAT IMPORTS DATA FROM EXCEL //
    public String setData(Object data)
    {
        
        //data = Double.parseDouble(Data);
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        dataset.setValue("Cows", data);
        dataset.setValue("Dogs", data);
        dataset.setValue("Donkeys", data);
        dataset.setValue("Shrek", data);

        return "";
    }
}
