import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        LinkedList<EstudianteInge> Lista_Ing = new LinkedList<>();
        LinkedList<EstudianteDis> Lista_Dis = new LinkedList<>();
        LinkedList<Portatil> Lista_Por = new LinkedList<>();
        LinkedList<Tableta> Lista_Tab = new LinkedList<>();
        Importar i = new Importar();
        Exportar e = new Exportar();
        Metodos m = new Metodos();

        int opt;

        do {

            String menu = "Bienvenido al Sistema de Prestacion de Equipos de la Universidad de " +
                    "San Juan de Dios\n" +
                    "Por favor digite\n" +
                    "1. Estudiante de Ingenieria\n" +
                    "2. Estudiante de Diseño Gráfico\n" +
                    "3. Importar Registros \n" +
                    "4. Salir del Sistema \n" +
                    "Ingrese la opcion deseada: ";
            System.out.println(menu);
            opt = Integer.parseInt(cp.readLine());

            switch (opt) {
                case 1:

                    int optIng;

                    do {

                        String MenuIng = "Bienvenido al Menu para Estudiantes de Ingenieria en Sistemas\n" +
                                "1. Registrar Prestamo de Equipo.\n" +
                                "2. Modificar Prestamo de Equipo.\n" +
                                "3. Devolucion de Equipo.\n" +
                                "4. Buscar Equipo.\n" +
                                "5. Volver al menu principal.";
                        System.out.println(MenuIng);
                        optIng = Integer.parseInt(cp.readLine());

                        switch (optIng) {

                            case 1:
                                if (Lista_Por.isEmpty()) {

                                    System.out.println(
                                            "Por favor Importe los registros en la opcion 3" +
                                                    " de el menu principal para poder continuar...\n");
                                    break;
                                }

                                m.Mostrar_ListaPorDisponibles(Lista_Por);

                                System.out.println("Ingrese la cedula el estudiante para el prestamo: ");
                                String aux = cp.readLine();

                                System.out.println("Ingrese el serial del dispositivo disponible que " +
                                        "desea prestar");
                                String aux2 = cp.readLine();

                                m.actualizar_serialIng(Lista_Ing, aux, aux2, Lista_Por);
                                e.exportarArchivo2(Lista_Ing);
                                e.exportarArchivo3(Lista_Por);

                                break;

                            case 2:

                                if (Lista_Por.isEmpty()) {

                                    System.out.println(
                                            "Por favor Importe los registros en la opcion 3" +
                                                    " de el menu principal para poder continuar...\n");
                                    break;

                                }

                                System.out.println("Ingrese la cedula del estudiante que desea modificar registros: ");
                                String CedMod = cp.readLine();

                                m.Modificar_Registro(Lista_Ing, CedMod);
                                e.exportarArchivo2(Lista_Ing);

                                break;

                            case 3:

                                if (Lista_Por.isEmpty()) {

                                    System.out.println(
                                            "Por favor Importe los registros en la opcion 3" +
                                                    " de el menu principal para poder continuar...\n");
                                    break;
                                }

                                System.out.println("Ingrese la cedula del estudiante para la devolucion: ");
                                String CedDevo = cp.readLine();
                                System.out.println("Ingrese el serial asociado al dispositivo que se le presto: ");
                                String devolucion = cp.readLine();
                                m.Devolucion(Lista_Ing, CedDevo, devolucion, Lista_Por);
                                e.exportarArchivo2(Lista_Ing);
                                e.exportarArchivo3(Lista_Por);

                                break;

                            case 4:

                                if (Lista_Por.isEmpty()) {

                                    System.out.println(
                                            "Por favor Importe los registros en la opcion 3" +
                                                    " de el menu principal para poder continuar...\n");
                                    break;
                                }

                                System.out.println("Ingrese el serial del dispositivo que desea buscar: ");
                                String busquedad = cp.readLine();

                                m.Buscar_equipoPor(Lista_Por, busquedad);

                                break;

                            case 5:
                                break;

                            default:

                                break;
                        }

                    } while (optIng != 5);

                    break;

                case 2:

                    int optDis;

                    do {
                        String MenuDis = "Bienvenido al Menu para Estudiantes de Diseño Gráfico\n" +
                                "1. Registrar Prestamo de Equipo.\n" +
                                "2. Modificar Prestamo de Equipo.\n" +
                                "3. Devolucion de Equipo.\n" +
                                "4. Buscar Equipo.\n" +
                                "5. Volver al menu principal.";
                        System.out.println(MenuDis);
                        optDis = Integer.parseInt(cp.readLine());

                        switch (optDis) {
                            case 1:

                                if (Lista_Tab.isEmpty()) {

                                    System.out.println(
                                            "Por favor Importe los registros en la opcion 3" +
                                                    " de el menu principal para poder continuar...\n");
                                    break;
                                }

                                m.Mostrar_ListaTabDisponibles(Lista_Tab);

                                System.out.println("Ingrese la cedula el estudiante para el prestamo: ");
                                String aux = cp.readLine();

                                System.out.println("Ingrese el serial del dispositivo disponible que " +
                                        "desea prestar");
                                String aux2 = cp.readLine();

                                m.actualizar_serialDis(Lista_Dis, aux, aux2, Lista_Tab);
                                e.exportarArchivo(Lista_Dis);
                                e.exportarArchivo4(Lista_Tab);

                                break;

                            case 2:

                                if (Lista_Tab.isEmpty()) {

                                    System.out.println(
                                            "Por favor Importe los registros en la opcion 3" +
                                                    " de el menu principal para poder continuar...\n");
                                    break;

                                }

                                System.out.println("Ingrese la cedula del estudiante que desea modificar registros: ");
                                String CedMod = cp.readLine();

                                m.Modificar_Registro2(Lista_Dis, CedMod);
                                e.exportarArchivo(Lista_Dis);

                                break;

                            case 3:

                                if (Lista_Tab.isEmpty()) {

                                    System.out.println(
                                            "Por favor Importe los registros en la opcion 3" +
                                                    " de el menu principal para poder continuar...\n");
                                    break;
                                }

                                System.out.println("Ingrese la cedula del estudiante para la devolucion: ");
                                String CedDevo = cp.readLine();
                                System.out.println("Ingrese el serial asociado al dispositivo que se le presto: ");
                                String devolucion = cp.readLine();
                                m.Devolucion2(Lista_Dis, CedDevo, devolucion, Lista_Tab);
                                e.exportarArchivo(Lista_Dis);
                                e.exportarArchivo4(Lista_Tab);

                                break;

                            case 4:

                                if (Lista_Tab.isEmpty()) {

                                    System.out.println(
                                            "Por favor Importe los registros en la opcion 3" +
                                                    " de el menu principal para poder continuar...\n");
                                    break;
                                }

                                System.out.println("Ingrese el serial del dispositivo que desea buscar: ");
                                String busquedad = cp.readLine();

                                m.Buscar_equipoTab(Lista_Tab, busquedad);

                                break;

                            case 5:
                                break;

                            default:

                                System.out.println("Por favor ingrese una opcion correcta... ");

                                break;
                        }

                    } while (optDis != 5);

                    break;

                case 3:

                Lista_Dis = i.leerArchivo("EstudianteDisList");
                Lista_Ing = i.leerArchivo2("EstudianteIngeList");
                Lista_Por = i.leerArchivo3("PortatilList");
                Lista_Tab = i.leerArchivo4("TabletaList");

                    break;

                case 4:
                    break;

                default:

                    System.out.println("Por favor Ingrese una opcion adecuada:");
                    break;
            }

        } while (opt != 4);

    }

}