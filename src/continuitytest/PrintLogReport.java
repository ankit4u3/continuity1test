/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuitytest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author Chaurasia
 */
public class PrintLogReport {

    Main mRef;

    
    
    public PrintLogReport(Main m) {
        this.mRef = m;

    }

    public void generateReport() {
        Iterator<Map.Entry<String, Object>> iterator = mRef.ParkingMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            System.out.print(entry.getKey() +"\t"+
                    entry.getValue());
            appendLog(entry.getKey() + "\t"+
                    entry.getValue());
           // iterator.remove(); // right way to remove entries from Map, 
            // avoids ConcurrentModificationException
        }

      
    }

    public void appendLog(String msg) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("PrintLog.txt", true)));
            out.println(msg);
            out.close();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}
