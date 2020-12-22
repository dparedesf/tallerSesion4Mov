package localReport;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LocalReportConsole {

    public static void generateReport(){

        String path="C:\\Users\\MERY\\Desktop\\JBRepositoriosDic\\TallerFinal\\TallerFinal\\build\\reports\\cucumber\\";
        File reportHTMLFolder=new File(path+"cucumberReporting");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path+"report.json");

        Configuration configuration = new Configuration(reportHTMLFolder,"JB Group Movile Tesing");

        configuration.setBuildNumber("v1.0000");
        configuration.addClassifications("SO","Android");
        configuration.addClassifications("Owner","Grupo1");
        configuration.addClassifications("Version OS","8.0");
        configuration.addClassifications("Branch","master");
        configuration.addClassifications("Report","Local");
        configuration.addClassifications("Language","English");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        reportBuilder.generateReports();

    }
}
