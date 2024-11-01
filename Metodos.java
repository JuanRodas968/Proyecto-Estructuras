import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Metodos {

    public Exportar e = new Exportar();

    public static BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

    public LinkedList<EstudianteInge> Llenar_ListaIng(LinkedList<EstudianteInge> lista) throws IOException {

        boolean continuar = true;
        int opcion;

        while (continuar) {

            EstudianteInge Est = new EstudianteInge();

            System.out.println("Ingrese el numero de cedula del estudiante: ");
            Est.setCedula(cp.readLine());
            System.out.println("Ingrese el nombre del estudiante: ");
            Est.setNombre(cp.readLine());
            System.out.println("Ingrese el apellido del estudiante: ");
            Est.setApellido(cp.readLine());
            System.out.println("Ingrese el número de telefono del estudiante: ");
            Est.setTelefono(cp.readLine());
            System.out.println("Ingrese el número de semestre que se encuentra cursando: ");
            Est.setSemestre(Integer.parseInt(cp.readLine()));
            System.out.println("Ingrese el promedio del estudiante: ");
            Est.setPromedio(Double.parseDouble(cp.readLine()));
            lista.add(Est);

            do {
                System.out.println("Desea continuar? 1:SI , 2:NO: ");
                opcion = Integer.parseInt(cp.readLine());

                switch (opcion) {
                    case 1:

                        continuar = true;

                        break;

                    case 2:

                        continuar = false;
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida...");
                        break;
                }

            } while (opcion < 1 || opcion > 2);

        }

        e.exportarArchivo2(lista);

        return lista;

    }

    public LinkedList<EstudianteDis> Llenar_ListaDis(LinkedList<EstudianteDis> lista) throws IOException {

        boolean continuar = true;
        int opcion;

        while (continuar) {

            EstudianteDis Est = new EstudianteDis();

            System.out.println("Ingrese el numero de cedula del estudiante: ");
            Est.setCedula(cp.readLine());
            System.out.println("Ingrese el nombre del estudiante: ");
            Est.setNombre(cp.readLine());
            System.out.println("Ingrese el apellido del estudiante: ");
            Est.setApellido(cp.readLine());
            System.out.println("Ingrese el número de telefono del estudiante: ");
            Est.setTelefono(cp.readLine());
            System.out.println("Ingrese la modalidad de estudio del estudiante:  ");
            Est.setModalidad(cp.readLine());
            System.out.println("Ingrese la cantidad de asignaturas que se encuentra cursando el estudiante: ");
            Est.setCantAsignaturas(Integer.parseInt(cp.readLine()));
            lista.add(Est);

            do {
                System.out.println("Desea continuar? 1:SI , 2:NO: ");
                opcion = Integer.parseInt(cp.readLine());

                switch (opcion) {
                    case 1:

                        continuar = true;

                        break;

                    case 2:

                        continuar = false;
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida...");
                        break;
                }

            } while (opcion < 1 || opcion > 2);

        }

        e.exportarArchivo(lista);

        return lista;

    }

    public LinkedList<Portatil> Llenar_ListaPor(LinkedList<Portatil> lista) throws IOException {

        boolean continuar = true;
        int opcion;

        while (continuar) {

            Portatil p = new Portatil();

            System.out.println("Ingrese el serial del portatil: ");
            p.setSerial(cp.readLine());
            System.out.println("Ingrese la marca del portatil: ");
            p.setMarca(cp.readLine());
            System.out.println("Ingrese el Tamaño del portatil (en pulgadas): ");
            p.setTamaño(Double.parseDouble(cp.readLine()));
            System.out.println("Ingrese el precio del portatil: ");
            p.setPrecio(Double.parseDouble(cp.readLine()));

            int eleccion;

            do {

                System.out.println("Para el sistema operativo por favor ingrese:\n " +
                        "1. Windows 7\n" +
                        "2. Windows 10\n" +
                        "3. Windows 11\n");
                eleccion = Integer.parseInt(cp.readLine());
                switch (eleccion) {

                    case 1:

                        p.setSisOperativo("Windows 7");

                        break;

                    case 2:

                        p.setSisOperativo("Windows 10");

                        break;

                    case 3:

                        p.setSisOperativo("Windows 11");

                        break;

                    default:

                        System.out.println("Por favor ingrese una opcion válida");
                        break;

                }
            } while (eleccion < 1 || eleccion > 3);

            int eleccion2;

            do {

                System.out.println("Para el procesador por favor ingrese:\n " +
                        "1. AMD Ryzen\n" +
                        "2. Intel Core i5\n");
                eleccion2 = Integer.parseInt(cp.readLine());

                switch (eleccion2) {

                    case 1:

                        p.setProcesador("AMD Ryzen");

                        break;

                    case 2:

                        p.setProcesador("Intel Core i5");

                        break;

                    default:

                        System.out.println("Por favor ingrese una opcion válida");
                        break;

                }
            } while (eleccion2 < 1 || eleccion2 > 2);

            do {

                System.out.println("Por favor ingrese:\n " +
                        "1. Prestado\n" +
                        "2. Disponible\n");
                eleccion = Integer.parseInt(cp.readLine());
                switch (eleccion) {

                    case 1:

                        p.setEstado(1);

                        break;

                    case 2:

                        p.setEstado(2);

                        break;

                    default:

                        System.out.println("Por favor ingrese una opcion válida");
                        break;

                }
            } while (eleccion < 1 || eleccion > 2);

            lista.add(p);

            do {
                System.out.println("Desea continuar? 1:SI , 2:NO: ");
                opcion = Integer.parseInt(cp.readLine());

                switch (opcion) {
                    case 1:

                        continuar = true;

                        break;

                    case 2:

                        continuar = false;
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida...");
                        break;
                }

            } while (opcion < 1 || opcion > 2);

        }

        e.exportarArchivo3(lista);

        return lista;

    }

    public LinkedList<Tableta> Llenar_ListaTab(LinkedList<Tableta> lista) throws IOException {

        boolean continuar = true;
        int opcion;

        while (continuar) {

            Tableta t = new Tableta();

            System.out.println("Ingrese el serial de la tableta: ");
            t.setSerial(cp.readLine());
            System.out.println("Ingrese la marca de la tableta: ");
            t.setMarca(cp.readLine());
            System.out.println("Ingrese el Tamaño de la tableta (en pulgadas): ");
            t.setTamaño(Double.parseDouble(cp.readLine()));
            System.out.println("Ingrese el precio de la tableta: ");
            t.setPrecio(Double.parseDouble(cp.readLine()));

            int eleccion;

            do {

                System.out.println("Para el almacenamiento por favor ingrese:\n " +
                        "1. 256 GB\n" +
                        "2. 512 GB\n" +
                        "3. 1 TB\n");
                eleccion = Integer.parseInt(cp.readLine());
                switch (eleccion) {

                    case 1:

                        t.setAlmacenamiento("256 GB");

                        break;

                    case 2:

                        t.setAlmacenamiento("512 GB");

                        break;

                    case 3:

                        t.setAlmacenamiento("1 TB");

                        break;

                    default:

                        System.out.println("Por favor ingrese una opcion válida");
                        break;

                }
            } while (eleccion < 1 || eleccion > 3);

            System.out.println("Ingrese el peso de la tableta (en Kilogramos): ");
            t.setPeso(Double.parseDouble(cp.readLine()));

            do {

                System.out.println("Por favor ingrese:\n " +
                        "1. Prestado\n" +
                        "2. Disponible\n");
                eleccion = Integer.parseInt(cp.readLine());
                switch (eleccion) {

                    case 1:

                        t.setEstado(1);

                        break;

                    case 2:

                        t.setEstado(2);

                        break;

                    default:

                        System.out.println("Por favor ingrese una opcion válida");
                        break;

                }
            } while (eleccion < 1 || eleccion > 2);
            lista.add(t);

            do {
                System.out.println("Desea continuar? 1:SI , 2:NO: ");
                opcion = Integer.parseInt(cp.readLine());

                switch (opcion) {
                    case 1:

                        continuar = true;

                        break;

                    case 2:

                        continuar = false;
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida...");
                        break;
                }

            } while (opcion < 1 || opcion > 2);

        }

        e.exportarArchivo4(lista);

        return lista;

    }

    public void Mostrar_lista(LinkedList<EstudianteInge> lista) {

        for (EstudianteInge estudianteInge : lista) {

            System.out.println("Cedula: " + estudianteInge.getCedula());
            System.out.println("Nombre: " + estudianteInge.getNombre());
            System.out.println("Apellido: " + estudianteInge.getApellido());
            System.out.println("Telefono: " + estudianteInge.getTelefono());
            System.out.println("Semestre: " + estudianteInge.getSemestre());
            System.out.println("Promedio: " + estudianteInge.getPromedio());
            System.out.println("Serial: " + estudianteInge.getSerial());
            System.out.println("---------------------------------------\n");

        }

    }

    public void Mostrar_lista2(LinkedList<EstudianteDis> lista) {

        for (EstudianteDis estudianteDis : lista) {

            System.out.println("Cedula: " + estudianteDis.getCedula());
            System.out.println("Nombre: " + estudianteDis.getNombre());
            System.out.println("Apellido: " + estudianteDis.getApellido());
            System.out.println("Telefono: " + estudianteDis.getTelefono());
            System.out.println("Modalidad: " + estudianteDis.getModalidad());
            System.out.println("Cantidad de asignaturas: " + estudianteDis.getCantAsignaturas());
            System.out.println("Serial: " + estudianteDis.getSerial());
            System.out.println("---------------------------------------\n");

        }

    }

    public void Mostrar_lista3(LinkedList<Portatil> lista) {

        for (Portatil p : lista) {

            System.out.println("Serial: " + p.getSerial());
            System.out.println("Marca: " + p.getMarca());
            System.out.println("Tamaño: " + p.getTamaño());
            System.out.println("Precio: " + p.getPrecio());
            System.out.println("Sistema Operativo: " + p.getSisOperativo());
            System.out.println("Procesador: " + p.getProcesador());
            System.out.println("Estado: " + p.getEstado());
            System.out.println("---------------------------------------\n");

        }

    }

    public void Mostrar_lista4(LinkedList<Tableta> lista) {

        for (Tableta t : lista) {

            System.out.println("Serial: " + t.getSerial());
            System.out.println("Marca: " + t.getMarca());
            System.out.println("Tamaño: " + t.getTamaño());
            System.out.println("Precio: " + t.getPrecio());
            System.out.println("Almacenamiento: " + t.getAlmacenamiento());
            System.out.println("Peso: " + t.getPeso());
            System.out.println("Estado: " + t.getEstado());
            System.out.println("---------------------------------------\n");

        }

    }

    public void Mostrar_ListaPorDisponibles(LinkedList<Portatil> lista) throws IOException {

        System.out.println("--- LOS SIGUIENTES DISPOSITIVOS SE ENCUENTRAN DISPONIBLES ---\n");

        for (Portatil p : lista) {

            if (p.getEstado() == 2) {

                int i = 1;
                System.out.println("Dispositivo:\n ");

                System.out.println("Serial: " + p.getSerial());
                System.out.println("Marca: " + p.getMarca());
                System.out.println("Tamaño: " + p.getTamaño() + " Pulgadas");
                System.out.println("Precio: " + p.getPrecio());
                System.out.println("Sistema Operativo: " + p.getSisOperativo());
                System.out.println("Procesador: " + p.getProcesador());
                System.out.println("--------------------------------\n");

            }

        }

        int opt;

        do {
            System.out.println("Desea agregar mas dispositivos?: 1. SI, 2. NO");
            opt = Integer.parseInt(cp.readLine());
            switch (opt) {

                case 1:
                    Llenar_ListaPor(lista);
                    break;

                case 2:
                    break;

                default:

                    System.out.println("Por favor ingrese una opcion válida...");
                    break;

            }

        } while (opt < 1 || opt > 2);
    }

    public void Mostrar_ListaTabDisponibles(LinkedList<Tableta> lista) throws IOException {

        System.out.println("--- LOS SIGUIENTES DISPOSITIVOS SE ENCUENTRAN DISPONIBLES ---\n");

        for (Tableta p : lista) {

            if (p.getEstado() == 2) {

                int i = 1;
                System.out.println("Dispositivo:\n ");

                System.out.println("Serial: " + p.getSerial());
                System.out.println("Marca: " + p.getMarca());
                System.out.println("Tamaño: " + p.getTamaño() + " Pulgadas");
                System.out.println("Precio: " + p.getPrecio());
                System.out.println("Almacenamiento: " + p.getAlmacenamiento());
                System.out.println("Peso: " + p.getPeso());
                System.out.println("--------------------------------\n");

            }

        }

        int opt;

        do {
            System.out.println("Desea agregar mas dispositivos?: 1. SI, 2. NO");
            opt = Integer.parseInt(cp.readLine());
            switch (opt) {

                case 1:
                    Llenar_ListaTab(lista);
                    break;

                case 2:
                    break;

                default:

                    System.out.println("Por favor ingrese una opcion válida...");
                    break;

            }

        } while (opt < 1 || opt > 2);
    }

    public LinkedList<EstudianteInge> actualizar_serialIng(LinkedList<EstudianteInge> lista, String cedula,
            String serialp, LinkedList<Portatil> lista2) throws IOException {

        boolean exist = true;
        boolean exist2 = true;

        for (Portatil portatil : lista2) {

            if (portatil.getSerial().equalsIgnoreCase(serialp) && portatil.getEstado() == 2) {

                exist2 = true;
                break;

            } else {

                exist2 = false;
            }

        }

        for (EstudianteInge estudianteInge : lista) {

            if (estudianteInge.getCedula().equalsIgnoreCase(cedula)) {

                exist = true;

                if (estudianteInge.getSerial().equalsIgnoreCase("null")) {

                    if (exist2 == true) {

                        estudianteInge.setSerial(serialp);
                        actualizar_estadoPor(lista2, serialp);
                        break;

                    } else {

                        System.out.println("Porfavor ingrese un serial asociado a un dispositivo disponible...\n");
                        break;
                    }

                } else {

                    System.out.println("El estudiante ya tiene un prestamo registrado...");

                    break;
                }

            } else {

                exist = false;
            }
        }

        if (exist == false) {

            int opt;

            do {

                System.out.println("No se encontro un estudiante con cedula: " + cedula);
                System.out.println("Desea hacer el registro?: 1.SI, 2.NO");
                opt = Integer.parseInt(cp.readLine());

                switch (opt) {
                    case 1:

                        Llenar_ListaIng(lista);

                        break;

                    case 2:
                        break;

                    default:

                        System.out.println("Ingrese una opcion valida...");
                        break;
                }

            } while (opt < 1 || opt > 2);
        }

        return lista;
    }

    public LinkedList<Portatil> actualizar_estadoPor(LinkedList<Portatil> lista, String serial) {

        boolean exist = true;
        for (Portatil portatil : lista) {

            if (portatil.getSerial().equals(serial)) {

                if (portatil.getEstado() == 2) {

                    portatil.setEstado(1);
                    System.out.println("Equipo prestado con exito...");
                    exist = true;

                    break;

                }

            } else {

                exist = false;
            }

        }

        if (exist = false) {

            System.out.println("Porfavor ingrese un serial asociado a un dispositivo disponible...");
        }

        return lista;
    }

    public LinkedList<EstudianteDis> actualizar_serialDis(LinkedList<EstudianteDis> lista, String cedula,
            String serialp, LinkedList<Tableta> lista2) throws IOException {

        boolean exist = true;
        boolean exist2 = true;

        for (Tableta t : lista2) {

            if (t.getSerial().equalsIgnoreCase(serialp) && t.getEstado() == 2) {

                exist2 = true;
                break;

            } else {

                exist2 = false;
            }

        }

        for (EstudianteDis estu : lista) {

            if (estu.getCedula().equalsIgnoreCase(cedula)) {

                exist = true;

                if (estu.getSerial().equalsIgnoreCase("null")) {

                    if (exist2 == true) {

                        estu.setSerial(serialp);
                        actualizar_estadoTab(lista2, serialp);
                        break;

                    } else {

                        System.out.println("Porfavor ingrese un serial asociado a un dispositivo disponible...\n");
                        break;
                    }

                } else {

                    System.out.println("El estudiante ya tiene un prestamo registrado...");

                    break;
                }

            } else {

                exist = false;
            }
        }

        if (exist == false) {

            int opt;

            do {

                System.out.println("No se encontro un estudiante con cedula: " + cedula);
                System.out.println("Desea hacer el registro?: 1.SI, 2.NO");
                opt = Integer.parseInt(cp.readLine());

                switch (opt) {
                    case 1:

                        Llenar_ListaDis(lista);

                        break;

                    case 2:
                        break;

                    default:

                        System.out.println("Ingrese una opcion valida...");
                        break;
                }

            } while (opt < 1 || opt > 2);
        }

        return lista;
    }

    public LinkedList<Tableta> actualizar_estadoTab(LinkedList<Tableta> lista, String serial) {

        boolean exist = true;
        for (Tableta t : lista) {

            if (t.getSerial().equals(serial)) {

                if (t.getEstado() == 2) {

                    t.setEstado(1);
                    System.out.println("Equipo prestado con exito...");
                    exist = true;

                    break;

                }

            } else {

                exist = false;
            }

        }

        if (exist = false) {

            System.out.println("Porfavor ingrese un serial asociado a un dispositivo disponible...");
        }

        return lista;
    }

    public void Buscar_equipoPor(LinkedList<Portatil> lista, String serial) throws IOException {

        boolean encontrado = true;

        for (Portatil portatil : lista) {

            if (portatil.getSerial().equalsIgnoreCase(serial)) {

                System.out.println("---DATOS DEL DISPOSITIVO---\n");
                System.out.println("Serial: " + portatil.getSerial());
                System.out.println("Marca: " + portatil.getMarca());
                System.out.println("Tamaño: " + portatil.getTamaño() + " Pulgadas");
                System.out.println("Precio: " + portatil.getPrecio());
                System.out.println("Sistema Operativo: " + portatil.getSisOperativo());
                System.out.println("Procesador: " + portatil.getProcesador());
                System.out.println("Estado: " + portatil.getEstado() + " (1. Prestado, 2. Disponible)");
                System.out.println("------------------------------\n");
                encontrado = true;
                break;

            } else {

                encontrado = false;
            }

        }

        if (encontrado == false) {

            int desicion;

            do {

                System.out.println("Dispositivo no encontrado...");
                System.out.println("Desea agregar un dispositivo al inventario?: 1. SI, 2. NO ");
                desicion = Integer.parseInt(cp.readLine());

                switch (desicion) {
                    case 1:

                        Llenar_ListaPor(lista);

                        break;

                    case 2:

                        break;

                    default:
                        System.out.println("Por favor ingrese una opcion valida...");
                        break;
                }

            } while (desicion < 1 || desicion > 2);

        }

    }

    public void Buscar_equipoTab(LinkedList<Tableta> lista, String serial) throws IOException {

        boolean encontrado = true;

        for (Tableta t : lista) {

            if (t.getSerial().equalsIgnoreCase(serial)) {

                System.out.println("---DATOS DEL DISPOSITIVO---\n");
                System.out.println("Serial: " + t.getSerial());
                System.out.println("Marca: " + t.getMarca());
                System.out.println("Tamaño: " + t.getTamaño() + " Pulgadas");
                System.out.println("Precio: " + t.getPrecio());
                System.out.println("Almacenamiento: " + t.getAlmacenamiento());
                System.out.println("Peso: " + t.getPeso());
                System.out.println("Estado: " + t.getEstado() + " (1. Prestado, 2. Disponible)");
                System.out.println("------------------------------\n");
                encontrado = true;
                break;

            } else {

                encontrado = false;
            }

        }

        if (encontrado == false) {

            int desicion;

            do {

                System.out.println("Dispositivo no encontrado...");
                System.out.println("Desea agregar un dispositivo al inventario?: 1. SI, 2. NO ");
                desicion = Integer.parseInt(cp.readLine());

                switch (desicion) {
                    case 1:

                        Llenar_ListaTab(lista);

                        break;

                    case 2:

                        break;

                    default:
                        System.out.println("Por favor ingrese una opcion valida...");
                        break;
                }

            } while (desicion < 1 || desicion > 2);

        }

    }

    public LinkedList<EstudianteInge> Devolucion(LinkedList<EstudianteInge> lista, String Cedula,
            String serial, LinkedList<Portatil> Lista2) {

        int exist = 0;
        int exist2 = 0;

        for (Portatil portatil : Lista2) {

            if (portatil.getSerial().equals(serial) && portatil.getEstado() == 1) {

                exist2 = 1;
                break;

            } else {

                exist2 = 0;
            }

        }

        for (EstudianteInge estudianteInge : lista) {

            if (estudianteInge.getCedula().equalsIgnoreCase(Cedula)) {

                exist = 1;

                if (exist2 == 1) {

                    estudianteInge.setSerial("null");
                    DevolucionP(Lista2, serial);
                    break;

                } else {

                    System.out.println("No se encontro un prestamo registrado del dispositivo con serial " + serial);
                    break;
                }

            } else {

                exist = 0;

            }

        }

        if (exist == 0) {

            System.out.println("El estudiante con cedula: " + Cedula + " no se encuentra registrado");

        }

        return lista;
    }

    public LinkedList<Portatil> DevolucionP(LinkedList<Portatil> lista, String Serial) {

        boolean exist = true;

        for (Portatil portatil : lista) {

            if (portatil.getSerial().equalsIgnoreCase(Serial)) {

                exist = true;

                if (portatil.getEstado() == 1) {

                    portatil.setEstado(2);
                    System.out.println("Devolucion existosa");
                    break;

                } else {

                    System.out.println("Por favor ingrese correctamente el serial asociado al dispositivo que" +
                            "se le presto...");
                    break;
                }

            } else {

                exist = false;
            }

        }

        if (exist == false) {

            System.out.println("No se encontro con dispositivo con serial: " + Serial);
        }

        return lista;
    }

    public LinkedList<EstudianteDis> Devolucion2(LinkedList<EstudianteDis> lista, String Cedula,
            String serial, LinkedList<Tableta> Lista2) {

        int exist = 0;
        int exist2 = 0;

        for (Tableta t : Lista2) {

            if (t.getSerial().equals(serial) && t.getEstado() == 1) {

                exist2 = 1;
                break;

            } else {

                exist2 = 0;
            }

        }

        for (EstudianteDis estudianteDis : lista) {

            if (estudianteDis.getCedula().equalsIgnoreCase(Cedula)) {

                exist = 1;

                if (exist2 == 1) {

                    estudianteDis.setSerial("null");
                    DevolucionT(Lista2, serial);
                    break;

                } else {

                    System.out.println("No se encontro un prestamo registrado del dispositivo con serial " + serial);
                    break;
                }

            } else {

                exist = 0;

            }

        }

        if (exist == 0) {

            System.out.println("El estudiante con cedula: " + Cedula + " no se encuentra registrado");

        }

        return lista;
    }

    public LinkedList<Tableta> DevolucionT(LinkedList<Tableta> lista, String Serial) {

        boolean exist = true;

        for (Tableta t : lista) {

            if (t.getSerial().equalsIgnoreCase(Serial)) {

                exist = true;

                if (t.getEstado() == 1) {

                    t.setEstado(2);
                    System.out.println("Devolucion existosa");
                    break;

                } else {

                    System.out.println("Por favor ingrese correctamente el serial asociado al dispositivo que" +
                            "se le presto...");
                    break;
                }

            } else {

                exist = false;
            }

        }

        if (exist == false) {

            System.out.println("No se encontro con dispositivo con serial: " + Serial);
        }

        return lista;
    }

    public LinkedList<EstudianteInge> Modificar_Registro(LinkedList<EstudianteInge> lista, String Cedula)
            throws IOException {

        boolean exist = true;
        int Modificacion;

        do {

            System.out.println("Por favor ingrese el numero correspondiente al registro que desea " +
                    "Modificar:\n " +

                    "1. Nombre\n " + "2. Apellido\n " + "3. Telefono\n " + "4. Semestre\n " + "5. Promedio\n " +
                    "6. Volver al menu de Estudiante de Ingenieria\n ");
            Modificacion = Integer.parseInt(cp.readLine());

            switch (Modificacion) {

                case 1:

                    System.out.println("Ingrese el Nombre: ");
                    String nombre = cp.readLine();

                    for (EstudianteInge estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setNombre(nombre);
                            System.out.println("Nombre modificado con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 2:

                    System.out.println("Ingrese el Apellido: ");
                    String Apellido = cp.readLine();

                    for (EstudianteInge estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setApellido(Apellido);
                            System.out.println("Apellido modificado con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 3:

                    System.out.println("Ingrese el Telefono: ");
                    String Telefono = cp.readLine();

                    for (EstudianteInge estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setTelefono(Telefono);
                            System.out.println("Telefono modificado con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 4:

                    System.out.println("Ingrese el semestre: ");
                    int Semestre = Integer.parseInt(cp.readLine());

                    for (EstudianteInge estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setSemestre(Semestre);
                            System.out.println("Semestre modificado con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 5:

                    System.out.println("Ingrese el promedio: ");
                    double Promedio = Double.parseDouble(cp.readLine());

                    for (EstudianteInge estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setPromedio(Promedio);
                            System.out.println("Promedio modificado con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 6:
                    break;

                default:

                    System.out.println("Por favor Ingrese una opcion adecuada... ");
                    break;
            }

        } while (Modificacion != 6);

        return lista;
    }

    public LinkedList<EstudianteDis> Modificar_Registro2(LinkedList<EstudianteDis> lista, String Cedula)
            throws IOException {

        boolean exist = true;
        int Modificacion;

        do {

            System.out.println("Por favor ingrese el numero correspondiente al registro que desea " +
                    "Modificar:\n " +

                    "1. Nombre\n " + "2. Apellido\n " + "3. Telefono\n " + "4. Modalidad\n " + "5. Cantidad de Asignaturas\n " +
                    "6. Volver al menu de Estudiante de Ingenieria\n ");
            Modificacion = Integer.parseInt(cp.readLine());

            switch (Modificacion) {

                case 1:

                    System.out.println("Ingrese el Nombre: ");
                    String nombre = cp.readLine();

                    for (EstudianteDis estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setNombre(nombre);
                            System.out.println("Nombre modificado con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 2:

                    System.out.println("Ingrese el Apellido: ");
                    String Apellido = cp.readLine();

                    for (EstudianteDis estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setApellido(Apellido);
                            System.out.println("Apellido modificado con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 3:

                    System.out.println("Ingrese el Telefono: ");
                    String Telefono = cp.readLine();

                    for (EstudianteDis estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setTelefono(Telefono);
                            System.out.println("Telefono modificado con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 4:

                    System.out.println("Ingrese la modalidad: ");
                    String Modalidad =(cp.readLine());

                    for (EstudianteDis estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setModalidad(Modalidad);
                            System.out.println("Modalidad modificada con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 5:

                    System.out.println("Ingrese la cantidad de asignatuaras: ");
                    int cantAsignaturas = Integer.parseInt(cp.readLine());

                    for (EstudianteDis estu : lista) {

                        if (estu.getCedula().equalsIgnoreCase(Cedula)) {

                            exist = true;
                            estu.setCantAsignaturas(cantAsignaturas);
                            System.out.println("Cantidad de asignaturas modificadas con exito!...");
                            break;

                        } else {

                            exist = false;

                        }

                    }

                    if (exist == false) {

                        System.out.println("No se encontró un estudiante con cedula: " + Cedula);
                    }

                    break;

                case 6:
                    break;

                default:

                    System.out.println("Por favor Ingrese una opcion adecuada... ");
                    break;
            }

        } while (Modificacion != 6);

        return lista;
    }

}
