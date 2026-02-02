package edu.ucsd.spendingtracker.view.charts;

import edu.ucsd.spendingtracker.model.Category;
import javafx.scene.chart.PieChart;
import javafx.scene.Node;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PieChartProvider implements IChartProvider{
    @Override
    public Node createChart(Map<Category, Double> data) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
        data.forEach((cat,sum) -> {
            pieChartData.add(new PieChart.Data(cat.name(), sum));
        });

        PieChart chart = new PieChart(pieChartData);
        
        chart.setLegendVisible(false);
        return chart;
    }

    @Override
    public String getDisplayName() {
        return "Pie Chart";
    }
}
