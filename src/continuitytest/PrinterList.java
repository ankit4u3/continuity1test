/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuitytest;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

/**
 *
 * @author Chaurasia
 */
public class PrinterList {

    public PrintService[] services;
    Main mRef;

    PrinterList(Main m) {
        mRef = m;

    }

    public void getPrinterServiceList() {

        services = PrintServiceLookup.lookupPrintServices(null, null);

        System.out.println("Printer Services found:");
        printService(services);

    }

    private void printService(PrintService[] services) {
        if (services != null && services.length > 0) {
            for (int i = 0; i < services.length; i++) {
                System.out.println("t" + services[i]);
                if (services[i].getName() != null) {
                    System.out.println(services[i].getName());
                }
            }
        }
    }

}
