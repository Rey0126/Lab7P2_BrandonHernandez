package lab7p2_brandonhernandez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminRest {
    private ArrayList<Rest> restaurantes = new ArrayList();
    private File archivo = null;

    public AdminRest(String path) {
        archivo = new File(path);
    }

    public ArrayList<Rest> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Rest> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setRest(Rest r) {
        this.restaurantes.add(r);
    }

    //metodos de administracion
   public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Rest r : restaurantes) {
                  bw.write("[Nombre:"+r.getName() + ",Ubicacion:" + r.getUbi()+ "]\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        restaurantes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                String x = "";
                x += sc.next();
                x = x.replace("[Nombre:","");
                x = x.replace("Ubicacion:","");
                x = x.replace("]","");
                String[] temp = x.split(",");
                while (sc.hasNext()) {
                    restaurantes.add(new Rest(temp[0], temp[1]));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
