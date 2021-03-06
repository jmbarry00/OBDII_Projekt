package com.example.obd2_datenanalyse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AnyChartView anyChartView;
    String[] months = {"Jan", "Feb", "Mar"};
    int[] earnings = {500, 800, 2000};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anyChartView.findViewById(R.id.any_chart_view);
        setupPieChart();
    }

    public void setupPieChart() {
        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>();

        for (int i = 0; i < months.length; i++) {
            dataEntries.add(new ValueDataEntry(months[i],earnings[i]));
        }

        pie.data(dataEntries);
        anyChartView.setChart(pie);
    }
}
