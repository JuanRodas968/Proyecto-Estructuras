import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {

    public void exportarArchivo(LinkedList<EstudianteDis> estudianteDisList) throws IOException {
        if (estudianteDisList.isEmpty()) {
            Metodos m = new Metodos();
            estudianteDisList = m.Llenar_ListaDis(estudianteDisList);
        } else {
            try (FileWriter escriba = new FileWriter("EstudianteDisList.txt")) {
                for (EstudianteDis o : estudianteDisList) {

                    escriba.write("Cedula: " + o.getCedula() + "\n");
                    escriba.write("Nombre: " + o.getNombre() + "\n");
                    escriba.write("Apellido: " + o.getApellido() + "\n");
                    escriba.write("Telefono: " + o.getTelefono() + "\n");
                    escriba.write("Modalidad: " + o.getModalidad() + "\n");
                    escriba.write("CantAsignaturas: " + o.getCantAsignaturas() + "\n");
                    escriba.write("Serial: " + o.getSerial() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void exportarArchivo2(LinkedList<EstudianteInge> estudianteIngeList) throws IOException {
        if (estudianteIngeList.isEmpty()) {
            Metodos m = new Metodos();
            estudianteIngeList = m.Llenar_ListaIng(estudianteIngeList);
        } else {
            try (FileWriter escriba = new FileWriter("EstudianteIngeList.txt")) {
                for (EstudianteInge o : estudianteIngeList) {

                    escriba.write("Cedula: " + o.getCedula() + "\n");
                    escriba.write("Nombre: " + o.getNombre() + "\n");
                    escriba.write("Apellido: " + o.getApellido() + "\n");
                    escriba.write("Telefono: " + o.getTelefono() + "\n");
                    escriba.write("Semestre: " + o.getSemestre() + "\n");
                    escriba.write("Promedio: " + o.getPromedio() + "\n");
                    escriba.write("Serial: " + o.getSerial() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void exportarArchivo3(LinkedList<Portatil> PortatilList) throws IOException {
        if (PortatilList.isEmpty()) {
            Metodos m = new Metodos();
            PortatilList = m.Llenar_ListaPor(PortatilList);
        } else {
            try (FileWriter escriba = new FileWriter("PortatilList.txt")) {
                for (Portatil o : PortatilList) {

                    escriba.write("Serial: " + o.getSerial() + "\n");
                    escriba.write("Marca: " + o.getMarca() + "\n");
                    escriba.write("Tamaño: " + o.getTamaño() + "\n");
                    escriba.write("Precio: " + o.getPrecio() + "\n");
                    escriba.write("SisOperativo: " + o.getSisOperativo() + "\n");
                    escriba.write("Procesador: " + o.getProcesador() + "\n");
                    escriba.write("Estado: " + o.getEstado() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void exportarArchivo4(LinkedList<Tableta> TabletaList) throws IOException {
        if (TabletaList.isEmpty()) {
            Metodos m = new Metodos();
            TabletaList = m.Llenar_ListaTab(TabletaList);
        } else {
            try (FileWriter escriba = new FileWriter("TabletaList.txt")) {
                for (Tableta o : TabletaList) {

                    escriba.write("Serial: " + o.getSerial() + "\n");
                    escriba.write("Marca: " + o.getMarca() + "\n");
                    escriba.write("Tamaño: " + o.getTamaño() + "\n");
                    escriba.write("Precio: " + o.getPrecio() + "\n");
                    escriba.write("Almacenamiento: " + o.getAlmacenamiento() + "\n");
                    escriba.write("Peso: " + o.getPeso() + "\n");
                    escriba.write("Estado: " + o.getEstado() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    
}
