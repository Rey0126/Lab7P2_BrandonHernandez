package lab7p2_brandonhernandez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminUsuarios {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public AdminUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //extra mutador
    public void setUsuario(Usuario u) {
        this.usuarios.add(u);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario u : usuarios) {
                  bw.write("[Nombre:"+u.getName() + ",Usuario:" + u.getUser() + ",Contraseña:" + u.getPass() + ",Saldo:" + u.getSaldo() + "]\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        usuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                String x = "";
                x += sc.nextLine();
                x = x.replace("[Nombre:","");
                x = x.replace("Ususario:","");
                x = x.replace("Contraseña:","");
                x = x.replace("Saldo:","");
                x = x.replace("]","");
                String[] temp = x.split(",");
                while (sc.hasNext()) {
                    usuarios.add(new Usuario(temp[0], temp[1], temp[2], Double.parseDouble(temp[3])));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
