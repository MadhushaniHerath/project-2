package project;

import java.awt.Color;
import java.awt.Paint;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;


public class Overall_equipment_efficiency extends javax.swing.JFrame {


    Connection con = Database.getConnection();
    String start;
    String end;
    public Overall_equipment_efficiency(Date start, Date end) {
        this.start = start.toString();
        this.end = end.toString();
        init();
    }
    
    private void init() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Overall Equipment Chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private CategoryDataset createDataset() {

        DefaultCategoryDataset my_bar_chart_dataset = new DefaultCategoryDataset();
                 
        try {
            Statement stmt = con.createStatement();
            ResultSet query_set = stmt.executeQuery("select machine_id,"
                    + "((sum(run_time)/60)*(round(sum(stitches)/"
                    + "(sum(stitches/((EXTRACT(MINUTE FROM TIMEDIFF(stop_time,start_time)))"
                    + "+ EXTRACT(HOUR FROM TIMEDIFF(stop_time,start_time))*60))),4))*(good_product/total_product))"
                    + " as effi from (machine join line_assign using(machine_id)) left join quality using(machine_id)"
                    + " where line_assign.deleted = 0 and date_entered between '"+start+"'and '"+end+"'"
                    + " group by machine_id;");
            while (query_set.next()) {
                String category = query_set.getString("machine_id");
                float val = query_set.getInt("effi");
                System.out.print(val + "\n");
                my_bar_chart_dataset.addValue(val,"Value",category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Overall_equipment_efficiency.class.getName()).log(Level.SEVERE, null, ex);
        }
        return my_bar_chart_dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
            "Overall Equipment Efficiency "+start+" - "+end+" ",       // chart title
            "machine",               // domain axis label
            "OEE(per hour)",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // the plot orientation
            false,                    // include legend
            true,
            false
        );
        
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setNoDataMessage("NO DATA!");

        CategoryItemRenderer renderer = new CustomRenderer(
            new Paint[] {Color.red, Color.blue, Color.green,
                Color.yellow,Color.magenta, Color.orange,Color.cyan,Color.blue
                  }
        );

        renderer.setItemLabelsVisible(true);
        final ItemLabelPosition p = new ItemLabelPosition(
            ItemLabelAnchor.CENTER, TextAnchor.CENTER, TextAnchor.CENTER, 45.0
        );
        renderer.setPositiveItemLabelPosition(p);
        plot.setRenderer(renderer);

        // change the margin at the top of the range axis...
        final ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        //.createIntegerTickUnits()
        rangeAxis.setLowerMargin(0.15);
        rangeAxis.setUpperMargin(0.15);
        return barChart;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
