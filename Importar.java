import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Importar {

    public LinkedList<EstudianteDis> leerArchivo(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<EstudianteDis> estudianteDisList = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            EstudianteDis estudianteDis = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Cedula: ")) {
                    if (estudianteDis != null) {
                        estudianteDisList.add(estudianteDis);
                    }
                    estudianteDis = new EstudianteDis();
                    estudianteDis.setCedula(line.substring(8));
                } else if (line.startsWith("Nombre: ")) {
                    if (estudianteDis != null) {
                        estudianteDis.setNombre(line.substring(8));
                    }
                } else if (line.startsWith("Apellido: ")) {
                    if (estudianteDis != null) {
                        estudianteDis.setApellido(line.substring(10));
                    }

                } else if (line.startsWith("Telefono: ")) {
                    if (estudianteDis != null) {
                        estudianteDis.setTelefono(line.substring(10));
                    }

                } else if (line.startsWith("Modalidad: ")) {
                    if (estudianteDis != null) {
                        estudianteDis.setModalidad(line.substring(11));
                    }

                } else if (line.startsWith("CantAsignaturas: ")) {
                    if (estudianteDis != null) {
                        estudianteDis.setCantAsignaturas(Integer.parseInt(line.substring(17)));
                    }

                } else if (line.startsWith("Serial")) {
                    if (estudianteDis != null) {
                        estudianteDis.setSerial(line.substring(8));
                        estudianteDisList.add(estudianteDis);
                        estudianteDis = null; // reiniciar para el siguiente producto
                    }
                }
            }

            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return estudianteDisList;
    }

    public LinkedList<EstudianteInge> leerArchivo2(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<EstudianteInge> estudianteIngeList = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            EstudianteInge estudianteInge = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Cedula: ")) {
                    if (estudianteInge != null) {
                        estudianteIngeList.add(estudianteInge);
                    }
                    estudianteInge = new EstudianteInge();
                    estudianteInge.setCedula(line.substring(8));
                } else if (line.startsWith("Nombre: ")) {
                    if (estudianteInge != null) {
                        estudianteInge.setNombre(line.substring(8));
                    }
                } else if (line.startsWith("Apellido: ")) {
                    if (estudianteInge != null) {
                        estudianteInge.setApellido(line.substring(10));
                    }

                } else if (line.startsWith("Telefono: ")) {
                    if (estudianteInge != null) {
                        estudianteInge.setTelefono(line.substring(10));
                    }

                } else if (line.startsWith("Semestre: ")) {
                    if (estudianteInge != null) {
                        estudianteInge.setSemestre(Integer.parseInt(line.substring(10)));
                    }

                } else if (line.startsWith("Promedio: ")) {
                    if (estudianteInge != null) {
                        estudianteInge.setPromedio(Double.parseDouble(line.substring(10)));
                    }

                } else if (line.startsWith("Serial: ")) {
                    if (estudianteInge != null) {
                        estudianteInge.setSerial(line.substring(8));
                        estudianteIngeList.add(estudianteInge);
                        estudianteInge = null; // reiniciar para el siguiente producto
                    }
                }
            }

            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return estudianteIngeList;
    }

    public LinkedList<Portatil> leerArchivo3(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<Portatil> PortatilList = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            Portatil port = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Serial: ")) {
                    if (port != null) {
                        PortatilList.add(port);
                    }
                    port = new Portatil();
                    port.setSerial(line.substring(8));
                } else if (line.startsWith("Marca: ")) {
                    if (port != null) {
                        port.setMarca(line.substring(7));
                    }
                } else if (line.startsWith("Tamaño: ")) {
                    if (port != null) {
                        port.setTamaño(Double.parseDouble(line.substring(8)));
                    }

                } else if (line.startsWith("Precio: ")) {
                    if (port != null) {
                        port.setPrecio(Double.parseDouble(line.substring(8)));
                    }

                } else if (line.startsWith("SisOperativo: ")) {
                    if (port != null) {
                        port.setSisOperativo((line.substring(14)));
                    }

                } else if (line.startsWith("Procesador: ")) {
                    if (port != null) {
                        port.setProcesador((line.substring(12)));
                    }

                } else if (line.startsWith("Estado: ")) {
                    if (port != null) {
                        port.setEstado(Integer.parseInt(line.substring(8)));
                        PortatilList.add(port);
                        port = null; // reiniciar para el siguiente producto
                    }
                }
            }

            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return PortatilList;
    }

    public LinkedList<Tableta> leerArchivo4(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<Tableta> TabletaList = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            Tableta tab = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Serial: ")) {
                    if (tab != null) {
                        TabletaList.add(tab);
                    }
                    tab = new Tableta();
                    tab.setSerial(line.substring(8));
                } else if (line.startsWith("Marca: ")) {
                    if (tab != null) {
                        tab.setMarca(line.substring(7));
                    }
                } else if (line.startsWith("Tamaño: ")) {
                    if (tab != null) {
                        tab.setTamaño(Double.parseDouble(line.substring(8)));
                    }

                } else if (line.startsWith("Precio: ")) {
                    if (tab != null) {
                        tab.setPrecio(Double.parseDouble(line.substring(8)));
                    }

                } else if (line.startsWith("Almacenamiento: ")) {
                    if (tab != null) {
                        tab.setAlmacenamiento((line.substring(16)));
                    }

                } else if (line.startsWith("Peso: ")) {
                    if (tab != null) {
                        tab.setPeso(Double.parseDouble(line.substring(6)));
                    }

                } else if (line.startsWith("Estado: ")) {
                    if (tab != null) {
                        tab.setEstado(Integer.parseInt(line.substring(8)));
                        TabletaList.add(tab);
                        tab = null; // reiniciar para el siguiente producto
                    }
                }
            }

            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return TabletaList;
    }
    
}
