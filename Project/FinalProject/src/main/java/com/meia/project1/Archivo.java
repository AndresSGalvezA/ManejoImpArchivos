/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meia.project1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author mau_l
 */
public class Archivo {
    
    Integer BloqueActual = 1;
    String Administrador = "";
    Integer MaxReorganizar = 3;

    private String HayEspacio(String PathArchivo, boolean Retornar, String Usuario) throws IOException {
        if (Retornar == true) {
            return PathArchivo;
        } else {
            File Archivo = new File(PathArchivo);
            if (Archivo.exists()) {
                String[] Linea = ObtenerLinea(4, PathArchivo).split(":");
                String[] Linea2 = ObtenerLinea(7, PathArchivo).split(":");
                Integer TotalRegistros = 0, MaxRegistros = 0;

                TotalRegistros = Integer.parseInt(Linea[1]);
                MaxRegistros = Integer.parseInt(Linea2[1]);
                if (TotalRegistros < MaxRegistros) {
                    return HayEspacio(PathArchivo, true, Usuario);
                } else {
                    BloqueActual++;
                    return HayEspacio(("C:\\MEIA\\Desc_Donaciones_" + BloqueActual + ".txt"), Retornar, Usuario);
                }
            } else {
                LocalDateTime FechaSinFormato = LocalDateTime.now();
                DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String Fecha = FechaSinFormato.format(FormatoFecha);

                String pathDescDonaciones = "C:\\MEIA\\Desc_Donaciones_" + BloqueActual + ".txt";
                File descDonaciones = new File(pathDescDonaciones);
                BufferedWriter writer5;
                if (descDonaciones.exists()) {
                } else {
                    writer5 = new BufferedWriter(new FileWriter(descDonaciones));
                    writer5.write("Nombre del archivo:Donaciones_" + BloqueActual);
                    writer5.write("\nUsuario Creador:" + Usuario);
                    writer5.write("\nFecha de Creación:" + Fecha);
                    writer5.write("\nTotal Registros:0");
                    writer5.write("\nRegistros Activos:0");
                    writer5.write("\nRegistros Inactivos:0");
                    String NuevoMax = ObtenerLinea(7, ("C:\\MEIA\\Desc_Donaciones_" + (BloqueActual - 1) + ".txt"));
                    String[] NuevoMax2 = NuevoMax.split(":");
                    writer5.write("\nMax para Reorganizar:" + NuevoMax2[1]);
                    writer5.close();
                }
                String pathDonaciones = "C:\\MEIA\\Donaciones_" + BloqueActual + ".txt";
                File Donaciones = new File(pathDonaciones);
                BufferedWriter writer6;
                if (Donaciones.exists()) {
                } else {
                    writer6 = new BufferedWriter(new FileWriter(Donaciones));
                    writer6.close();
                }

                return HayEspacio(("C:\\MEIA\\Desc_Donaciones_" + BloqueActual + ".txt"), Retornar, Usuario);
            }
        }
    }

    private void ActualizarLinea(String ParaActualizar, String Cambio, String PathArchivo) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(PathArchivo));
        String line;
        String input = "";

        while ((line = file.readLine()) != null)
            input += line + "\n";
        input = input.replace(ParaActualizar, Cambio);

        FileOutputStream os = new FileOutputStream(PathArchivo);
        os.write(input.getBytes());
        file.close();
        os.close();
    }
    private String ObtenerLinea(Integer n, String PathArchivo)  {
        
        try{
            
            FileReader fr = new FileReader(PathArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            
            for (int i = 0; i < n; i++) {
                linea = br.readLine();
            }
            return linea;

        }catch (Exception ex) { System.out.println(ex.getMessage());} 
        
        
        return null;
    }

    private Integer ObtenerNumeroLinea(String Linea2, String archivoMaestro) throws IOException {
        Integer Contador = 1;
        Integer LineaCorrecta = 1;
        FileReader fr = new FileReader(archivoMaestro);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            if (Linea2.equals(linea)) {
                LineaCorrecta = Contador;
            }
            Contador++;
        }
        br.close();
        fr.close();
        return LineaCorrecta;
    }

    private Integer ObtenerCantidadLineas(String archivoMaestro) throws IOException {
        Integer Contador = 1;
        FileReader fr = new FileReader(archivoMaestro);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            Contador++;
        }
        br.close();
        fr.close();
        return Contador;
    }

    private void OrdenarIndice(String archivo) throws IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        List<String> Lista = new ArrayList<String>();
        while ((linea = br.readLine()) != null) {
            Lista.add(linea);
        }
        br.close();
        fr.close();

        List<Donacion> Donaciones = new ArrayList<Donacion>();
        for (String item : Lista) {
            String[] Campos = item.split("\\|");
            if (Campos[6].equals("0")) {
            } else {
                Donacion H = new Donacion(Integer.parseInt(Campos[0]), Campos[1], Integer.parseInt(Campos[5]),
                        Campos[4], Campos[2], Campos[3], Integer.parseInt(Campos[6]));
                Donaciones.add(H);
            }
        }

        Comparator<Donacion> Comparador = new Comparator<Donacion>() {
            public int compare(Donacion a, Donacion b) {
                int resultado = a.Usuario.compareTo(b.Usuario);
                if (resultado != 0) {
                    return resultado;
                }
                resultado = a.Nombre_Material.compareTo(b.Nombre_Material);
                if (resultado != 0) {
                    return resultado;
                }
                DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                try {
                    resultado = LocalDateTime.parse(b.Fecha, sdf).compareTo(LocalDateTime.parse(a.Fecha, sdf));
                } catch (DateTimeException ex) {}
                return resultado;
            }
        };

        Collections.sort(Donaciones, Comparador);
        Donacion[] DonacionesArray = new Donacion[Donaciones.size()];
        DonacionesArray = Donaciones.toArray(DonacionesArray);
        String LineaInicio = DonacionesArray[0].Registro + "|" + DonacionesArray[0].Posicion + "|"
                + DonacionesArray[0].Usuario + "|" + DonacionesArray[0].Nombre_Material + "|" + DonacionesArray[0].Fecha
                + "|" + DonacionesArray[0].Siguiente + "|" + DonacionesArray[0].Estatus;
        Integer NInicio = ObtenerNumeroLinea(LineaInicio, archivo);
        String InicioDesc = ObtenerLinea(7, "C:\\MEIA\\Desc_Indice.txt");
        String[] InicioDescArray = InicioDesc.split(":");
        ActualizarLinea(InicioDesc, (InicioDescArray[0] + ":" + NInicio), "C:\\MEIA\\Desc_Indice.txt");
        for (int i = 0; i < (Donaciones.size() - 1); i++) {
            String LineaSiguiente = DonacionesArray[i + 1].Registro + "|" + DonacionesArray[i + 1].Posicion + "|"
                    + DonacionesArray[i + 1].Usuario + "|" + DonacionesArray[i + 1].Nombre_Material + "|"
                    + DonacionesArray[i + 1].Fecha + "|" + DonacionesArray[i + 1].Siguiente + "|"
                    + DonacionesArray[i + 1].Estatus;
            Integer NSiguiente = ObtenerNumeroLinea(LineaSiguiente, archivo);
            String LineaActual = DonacionesArray[i].Registro + "|" + DonacionesArray[i].Posicion + "|"
                    + DonacionesArray[i].Usuario + "|" + DonacionesArray[i].Nombre_Material + "|"
                    + DonacionesArray[i].Fecha + "|" + DonacionesArray[i].Siguiente + "|" + DonacionesArray[i].Estatus;
            String LineaActualActualizada = DonacionesArray[i].Registro + "|" + DonacionesArray[i].Posicion + "|"
                    + DonacionesArray[i].Usuario + "|" + DonacionesArray[i].Nombre_Material + "|"
                    + DonacionesArray[i].Fecha + "|" + NSiguiente + "|" + DonacionesArray[i].Estatus;
            ActualizarLinea(LineaActual, LineaActualActualizada, archivo);
            if (i == Donaciones.size() - 2) {
                String LineaSiguiente2 = DonacionesArray[i + 1].Registro + "|" + DonacionesArray[i + 1].Posicion + "|"
                        + DonacionesArray[i + 1].Usuario + "|" + DonacionesArray[i + 1].Nombre_Material + "|"
                        + DonacionesArray[i + 1].Fecha + "|" + DonacionesArray[i + 1].Siguiente + "|"
                        + DonacionesArray[i + 1].Estatus;
                String LineasActualizada = DonacionesArray[i + 1].Registro + "|" + DonacionesArray[i + 1].Posicion + "|"
                        + DonacionesArray[i + 1].Usuario + "|" + DonacionesArray[i + 1].Nombre_Material + "|"
                        + DonacionesArray[i + 1].Fecha + "|" + 0 + "|" + DonacionesArray[i + 1].Estatus;
                ActualizarLinea(LineaSiguiente2, LineasActualizada, archivo);
            }
        }
    }

    public void Inicializar(String Administrador) throws IOException {
        this.Administrador = Administrador;
        LocalDateTime FechaSinFormato = LocalDateTime.now();
        DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String Fecha = FechaSinFormato.format(FormatoFecha);

        String pathDescIndice = "C:\\MEIA\\Desc_Indice.txt";
        File descIndice = new File(pathDescIndice);
        BufferedWriter writer1;
        if (descIndice.exists()) {
        } else {
            writer1 = new BufferedWriter(new FileWriter(descIndice));
            writer1.write("Nombre del archivo:Indice_Donaciones");
            writer1.write("\nUsuario Creador:" + Administrador);
            writer1.write("\nFecha de Creación:" + Fecha);
            writer1.write("\nTotal Registros:0");
            writer1.write("\nRegistros Activos:0");
            writer1.write("\nRegistros Inactivos:0");
            writer1.write("\nInicio:0");
            writer1.close();
        }

        String pathIndice = "C:\\MEIA\\Indice.txt";
        File Indice = new File(pathIndice);
        BufferedWriter writer2;
        if (Indice.exists()) {
        } else {
            writer2 = new BufferedWriter(new FileWriter(Indice));
            writer2.close();
        }

        String pathDescDonaciones = "C:\\MEIA\\Desc_Donaciones_1.txt";
        File descDonaciones = new File(pathDescDonaciones);
        BufferedWriter writer3;
        if (descDonaciones.exists()) {
        } else {
            writer3 = new BufferedWriter(new FileWriter(descDonaciones));
            writer3.write("Nombre del archivo:Donaciones_1");
            writer3.write("\nUsuario Creador:" + Administrador);
            writer3.write("\nFecha de Creación:" + Fecha);
            writer3.write("\nTotal Registros:0");
            writer3.write("\nRegistros Activos:0");
            writer3.write("\nRegistros Inactivos:0");
            writer3.write("\nMax para Reorganizar:" + MaxReorganizar);
            writer3.close();
        }

        String pathDonaciones = "C:\\MEIA\\Donaciones_1.txt";
        File Donaciones = new File(pathDonaciones);
        BufferedWriter writer4;
        if (Donaciones.exists()) {
        } else {
            writer4 = new BufferedWriter(new FileWriter(Donaciones));
            writer4.close();
        }
    }

    public void Insertar(String Usuario, String Fecha, String Nombre_Material, Integer Peso, String Descripcion,
        String Evento, String Usuario_transaccion) throws IOException {
        System.out.println("Entre");
        
        String ArchivoDisponible = HayEspacio(("C:\\MEIA\\Desc_Donaciones_" + BloqueActual + ".txt"), false, Usuario_transaccion);
        File ArchivoMaestro = new File("C:\\MEIA\\Donaciones_" + BloqueActual + ".txt");
        Writer writer7 = new FileWriter(ArchivoMaestro, true);
        LocalDateTime FechaSinFormato = LocalDateTime.now();
        DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String FechaCreacion = FechaSinFormato.format(FormatoFecha);
        
        String LineaInsertar = Usuario + "|" + Nombre_Material + "|" + Fecha + "|" + Peso + "|" + Descripcion + "|"
                + Evento + "|" + Usuario_transaccion + "|" + FechaCreacion + "|" + 1 + "\n";
        writer7.write(LineaInsertar);
        
        String LineaBuscar = Usuario + "|" + Nombre_Material + "|" + Fecha + "|" + Peso + "|" + Descripcion + "|"
                + Evento + "|" + Usuario_transaccion + "|" + FechaCreacion + "|" + 1;
        writer7.close();
        Integer N = ObtenerNumeroLinea(LineaBuscar, ("C:\\MEIA\\Donaciones_" + BloqueActual + ".txt"));

        String LineaParaCambio1 = ObtenerLinea(4, ArchivoDisponible);
        String[] LineasSplit = LineaParaCambio1.split(":");
        Integer NumeroLinea = Integer.parseInt(LineasSplit[1]) + 1;
        ActualizarLinea(LineaParaCambio1, (LineasSplit[0] + ":" + NumeroLinea), ArchivoDisponible);
        String LineaParaCambio2 = ObtenerLinea(5, ArchivoDisponible);
        String[] LineasSplit2 = LineaParaCambio2.split(":");
        Integer NumeroLinea2 = Integer.parseInt(LineasSplit[1]) + 1;
        ActualizarLinea(LineaParaCambio2, (LineasSplit2[0] + ":" + NumeroLinea2), ArchivoDisponible);

        String LineaParaCambio3 = ObtenerLinea(4, "C:\\MEIA\\Desc_Indice.txt");
        String LineaParaCambio4 = ObtenerLinea(5, "C:\\MEIA\\Desc_Indice.txt");
        String[] LineasSplit3 = LineaParaCambio3.split(":");
        Integer NumeroLinea3 = Integer.parseInt(LineasSplit3[1]) + 1;
        ActualizarLinea(LineaParaCambio3, (LineasSplit3[0] + ":" + NumeroLinea3), "C:\\MEIA\\Desc_Indice.txt");
        String[] LineasSplit4 = LineaParaCambio4.split(":");
        Integer NumeroLinea4 = Integer.parseInt(LineasSplit4[1]) + 1;
        ActualizarLinea(LineaParaCambio4, (LineasSplit4[0] + ":" + NumeroLinea4), "C:\\MEIA\\Desc_Indice.txt");

        File Indice = new File("C:\\MEIA\\Indice.txt");
        Writer writer8 = new FileWriter(Indice, true);
        String Poscicion = BloqueActual + "." + N;
        Integer Registro = ObtenerCantidadLineas("C:\\MEIA\\Indice.txt");
        writer8.write(Registro + "|" + Poscicion + "|" + Usuario + "|" + Nombre_Material + "|" + Fecha + "|0|1\n");
        writer8.close();
        OrdenarIndice("C:\\MEIA\\Indice.txt");
    }

    public List<String> Buscar(String Usuario) throws IOException {
        List<String> Respuesta = new ArrayList<>();
        String LineaInicio = ObtenerLinea(7, "C:\\MEIA\\Desc_Indice.txt");
        String Indice = "C:\\MEIA\\Indice.txt";
        String[] Inicio = LineaInicio.split(":");
        boolean Encontrado = false;

        Integer Actual = Integer.parseInt(Inicio[1]);
        while (!Encontrado) {
            if (Actual == 0) {
                Respuesta.add("404");
                break;
            }
            String Linea = ObtenerLinea(Actual, Indice);
            String[] Campos = Linea.split("\\|");
            Actual = Integer.parseInt(Campos[5]);
            if (Campos[2].equals(Usuario) & Campos[6].equals("1")) {
                String[] Posicion = new String[2];
                Posicion[0] = Campos[1].substring(0, 1);
                Posicion[1] = Campos[1].substring(2, 3);
                String LineaMaestro = ObtenerLinea(Integer.parseInt(Posicion[1]),
                        ("C:\\MEIA\\Donaciones_" + Posicion[0] + ".txt"));
                Respuesta.add(LineaMaestro);
                try {
                    String LineaSiguiente = ObtenerLinea(Integer.parseInt(Campos[5]), Indice);
                    String[] CamposSiguiente = LineaSiguiente.split("\\|");
                    if (CamposSiguiente[2].equals(Usuario) & CamposSiguiente[6].equals("1")) {
                        Actual = Integer.parseInt(Campos[5]);
                    } else {
                        Encontrado = true;
                    }
                } catch (Exception ex) {
                    Encontrado = true;
                }
            }
        }
        return Respuesta;
    }

    public List<String> Buscar(String Usuario, String NombreMaterial) throws IOException {
        List<String> Respuesta = new ArrayList<>();
        String LineaInicio = ObtenerLinea(7, "C:\\MEIA\\Desc_Indice.txt");
        String Indice = "C:\\MEIA\\Indice.txt";
        String[] Inicio = LineaInicio.split(":");
        boolean Encontrado = false;

        Integer Actual = Integer.parseInt(Inicio[1]);
        while (!Encontrado) {
            if (Actual == 0) {
                Respuesta.add("404");
                break;
            }
            String Linea = ObtenerLinea(Actual, Indice);
            String[] Campos = Linea.split("\\|");
            Actual = Integer.parseInt(Campos[5]);
            if (Campos[2].equals(Usuario) & Campos[3].equals(NombreMaterial) & Campos[6].equals("1")) {
                String[] Posicion = new String[2];
                Posicion[0] = Campos[1].substring(0, 1);
                Posicion[1] = Campos[1].substring(2, 3);
                String LineaMaestro = ObtenerLinea(Integer.parseInt(Posicion[1]),
                        ("C:\\MEIA\\Donaciones_" + Posicion[0] + ".txt"));
                Respuesta.add(LineaMaestro);
                try {
                    String LineaSiguiente = ObtenerLinea(Integer.parseInt(Campos[5]), Indice);
                    String[] CamposSiguiente = LineaSiguiente.split("\\|");
                    if (CamposSiguiente[2].equals(Usuario) & CamposSiguiente[3].equals(NombreMaterial)
                            & CamposSiguiente[6].equals("1")) {
                        Actual = Integer.parseInt(Campos[5]);
                    } else {
                        Encontrado = true;
                    }
                } catch (Exception ex) {
                    Encontrado = true;
                }
            }
        }
        return Respuesta;
    }

    public List<String> Buscar(String Usuario, String NombreMaterial, String Fecha) throws IOException {
        List<String> Respuesta = new ArrayList<>();
        String LineaInicio = ObtenerLinea(7, "C:\\MEIA\\Desc_Indice.txt");
        String Indice = "C:\\MEIA\\Indice.txt";
        String[] Inicio = LineaInicio.split(":");
        boolean Encontrado = false;

        Integer Actual = Integer.parseInt(Inicio[1]);
        while (!Encontrado) {
            if (Actual == 0) {
                Respuesta.add("404");
                break;
            }
            String Linea = ObtenerLinea(Actual, Indice);
            String[] Campos = Linea.split("\\|");
            Actual = Integer.parseInt(Campos[5]);
            if (Campos[2].equals(Usuario) & Campos[3].equals(NombreMaterial) & Campos[4].equals(Fecha)
                    & Campos[6].equals("1")) {
                String[] Posicion = new String[2];
                Posicion[0] = Campos[1].substring(0, 1);
                Posicion[1] = Campos[1].substring(2, 3);
                String LineaMaestro = ObtenerLinea(Integer.parseInt(Posicion[1]),
                        ("C:\\MEIA\\Donaciones_" + Posicion[0] + ".txt"));
                Respuesta.add(LineaMaestro);
                try {
                    String LineaSiguiente = ObtenerLinea(Integer.parseInt(Campos[5]), Indice);
                    String[] CamposSiguiente = LineaSiguiente.split("\\|");
                    if (CamposSiguiente[2].equals(Usuario) & CamposSiguiente[3].equals(NombreMaterial)
                            & Campos[4].equals(Fecha) & Campos[6].equals("1")) {
                        Actual = Integer.parseInt(Campos[5]);
                    } else {
                        Encontrado = true;
                    }
                } catch (Exception ex) {
                    Encontrado = true;
                }
            }
        }
        return Respuesta;
    }

    private List<String> BuscarIndice(String Usuario, String NombreMaterial, String Fecha) throws IOException {
        List<String> Respuesta = new ArrayList<>();
        String LineaInicio = ObtenerLinea(7, "C:\\MEIA\\Desc_Indice.txt");
        String Indice = "C:\\MEIA\\Indice.txt";
        String[] Inicio = LineaInicio.split(":");
        boolean Encontrado = false;

        Integer Actual = Integer.parseInt(Inicio[1]);
        while (!Encontrado) {
            if (Actual == 0) {
                Respuesta.add("404");
                break;
            }
            String Linea = ObtenerLinea(Actual, Indice);
            String[] Campos = Linea.split("\\|");
            Actual = Integer.parseInt(Campos[5]);
            if (Campos[2].equals(Usuario) & Campos[3].equals(NombreMaterial) & Campos[4].equals(Fecha)
                    & Campos[6].equals("1")) {
                Respuesta.add(Linea);
                try {
                    String LineaSiguiente = ObtenerLinea(Integer.parseInt(Campos[5]), Indice);
                    String[] CamposSiguiente = LineaSiguiente.split("\\|");
                    if (CamposSiguiente[2].equals(Usuario) & CamposSiguiente[3].equals(NombreMaterial)
                            & Campos[4].equals(Fecha) & Campos[6].equals("1")) {
                        Actual = Integer.parseInt(Campos[5]);
                    } else {
                        Encontrado = true;
                    }
                } catch (Exception ex) {
                    Encontrado = true;
                }
            }
        }
        return Respuesta;
    }

    public List<String> BuscarSecuencial(String Campo) throws IOException
    {
        List<String> Respuesta = new ArrayList<>();
        Integer NBloque = 1;
        boolean Leidos = false;
        while(!Leidos)
        {
            try{
                FileReader fr = new FileReader("C:\\MEIA\\Donaciones_" + NBloque + ".txt");
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] Campos = linea.split("\\|");
                    if(Campos[8] == "0"){}
                    else{
                        for (String C : Campos) {
                            if(C.equals(Campo)){
                                Respuesta.add(linea);
                                break;
                            }
                        }
                    }
                }
                NBloque++;
                br.close();
                fr.close();
            }catch(IOException ex){ Leidos = true;}
        }
        if(Respuesta.size() == 0){
            Respuesta.add("404");
        }
        return Respuesta;
    }
    
    public Boolean Eliminar(String Usuario, String NombreMaterial, String Fecha) throws IOException
    {
        List<String> ListaLineaEliminar = BuscarIndice(Usuario, NombreMaterial, Fecha);
        if(ListaLineaEliminar.get(0) != "404")
        {
            String LineaEliminar = ListaLineaEliminar.get(0);
            String[] Campos = LineaEliminar.split("\\|");
            String NMaestro = Campos[1].substring(0,1);
            Integer NMaestroLinea = Integer.parseInt(Campos[1].substring(2,3));
        
            String L = Campos[0] + "|" + Campos[1] + "|" + Campos[2] + "|" + Campos[3] + "|" + Campos[4] + "|" + Campos[5] + "|0";
            ActualizarLinea(LineaEliminar, L, "C:\\MEIA\\Indice.txt");
        
            String L2 = ObtenerLinea(5, "C:\\MEIA\\Desc_Indice.txt");
            String L3 = ObtenerLinea(6, "C:\\MEIA\\Desc_Indice.txt");
            String[] L2Split = L2.split(":");
            String[] L3Split = L3.split(":");
            Integer Activos = Integer.parseInt(L2Split[1]);
            Integer Inactivos = Integer.parseInt(L3Split[1]);
            ActualizarLinea(L2, ("Registros Activos:" + (Activos - 1)), "C:\\MEIA\\Desc_Indice.txt");
            ActualizarLinea(L3, ("Registros Inactivos:" + (Inactivos + 1)), "C:\\MEIA\\Desc_Indice.txt");

            String L4 = ObtenerLinea(5, "C:\\MEIA\\Desc_Donaciones_" + NMaestro + ".txt");
            String L5 = ObtenerLinea(6, "C:\\MEIA\\Desc_Donaciones_" + NMaestro + ".txt");
            String[] L4Split = L4.split(":");
            String[] L5Split = L5.split(":");
            Integer ActivosDM = Integer.parseInt(L4Split[1]);
            Integer InactivosDM = Integer.parseInt(L5Split[1]);
            ActualizarLinea(L2, ("Registros Activos:" + (ActivosDM - 1)), "C:\\MEIA\\Desc_Donaciones_" + NMaestro + ".txt");
            ActualizarLinea(L3, ("Registros Inactivos:" + (InactivosDM + 1)), "C:\\MEIA\\Desc_Donaciones_" + NMaestro + ".txt");

            String L6 = ObtenerLinea(NMaestroLinea, "C:\\MEIA\\Donaciones_" + NMaestro + ".txt");
            String[] CamposMaestro = L6.split("\\|"); //8
            String L7 = CamposMaestro[0] + "|" + CamposMaestro[1] + "|" + CamposMaestro[2] + "|" + CamposMaestro[3] + "|" + CamposMaestro[4] + "|" + CamposMaestro[5] + "|" + CamposMaestro[6] + "|" + CamposMaestro[7] + "|0";
            ActualizarLinea(L6, L7, "C:\\MEIA\\Donaciones_" + NMaestro + ".txt");

            OrdenarIndice("C:\\MEIA\\Indice.txt");
            return true;
        }
        else{ return false; }
    }

    // 0 = Usuario || 1 = NombreMaterial || 2 = Fecha || 3 = Peso || 4 = Descripcion || 5 = Evento || 6 = UsuarioTransaccion
    // El estatus no lo modifico porque para eso esta eliminar
    public boolean Actualizar(String Usuario, String NombreMaterial, String Fecha, Integer NCampo, String NuevoCampo) throws IOException
    {
        System.out.println("Ëntro");
        List<String> ListaLineaEliminar = BuscarIndice(Usuario, NombreMaterial, Fecha);
        if(ListaLineaEliminar.get(0) == "404"){ return false; }
        else{
            String LineaEliminar = ListaLineaEliminar.get(0);
            System.out.println(LineaEliminar);
            String[] Campos = LineaEliminar.split("\\|");
            String NMaestro = Campos[1].substring(0,1);
            Integer NMaestroLinea = Integer.parseInt(Campos[1].substring(2,3));
            String L = ObtenerLinea(NMaestroLinea, "C:\\MEIA\\Donaciones_" + NMaestro + ".txt");
            String[] CamposL = L.split("\\|");
            Boolean Existe = Eliminar(Usuario, NombreMaterial, Fecha);
            System.out.println(Usuario);
            System.out.println(NombreMaterial);
            System.out.println(Fecha);
            if(NCampo == 0){
                Insertar(NuevoCampo, CamposL[2], CamposL[1], Integer.parseInt(CamposL[3]), CamposL[4], CamposL[5], CamposL[6]);
                return true;
            }
            else if(NCampo == 1){
                Insertar(CamposL[0], CamposL[2], NuevoCampo, Integer.parseInt(CamposL[3]), CamposL[4], CamposL[5], CamposL[6]);
                return true;
            }
            else if(NCampo == 2){
                Insertar(CamposL[0], NuevoCampo, CamposL[1], Integer.parseInt(CamposL[3]), CamposL[4], CamposL[5], CamposL[6]);
                return true;
            }
            else if(NCampo == 3){
                Insertar(CamposL[0], CamposL[2], CamposL[1], Integer.parseInt(NuevoCampo), CamposL[4], CamposL[5], CamposL[6]);
                return true;
            }
            else if(NCampo == 4){
                Insertar(CamposL[0], CamposL[2], CamposL[1], Integer.parseInt(CamposL[3]), NuevoCampo, CamposL[5], CamposL[6]);
                return true;
            }
            else if(NCampo == 5){
                Insertar(CamposL[0], CamposL[2], CamposL[1], Integer.parseInt(CamposL[3]), CamposL[4], NuevoCampo, CamposL[6]);
                return true;
            }
            else if(NCampo == 6){
                Insertar(CamposL[0], CamposL[2], CamposL[1], Integer.parseInt(CamposL[3]), CamposL[4], CamposL[5], NuevoCampo);
                return true;
            }
            else{ return false; }
        }
    }

    
    public List<String> Reporte() throws IOException
    {
        List<String>Respuesta = Reporte("01/01/1900", "31/12/2019");
        return Respuesta;
    }
    
    public List<String> Reporte(String FechaInicio, String FechaFin) throws IOException
    {
        System.out.println("Entre");
        List<String> RespuestaConFormato = new ArrayList();
        List<String> RespuestaIndice = FiltroPorFecha(FechaInicio, FechaFin);
        List<String> RespuestaMaestro = new ArrayList();

        for (String R : RespuestaIndice) {
            String[] CamposBusqueda = R.split("\\|");
            List<String> Aux = Buscar(CamposBusqueda[2], CamposBusqueda[3], CamposBusqueda[4]);
            for (String R2 : Aux) {
                if(R2.equals("404")){}
                else
                {
                    RespuestaMaestro.add(R2);
                }
            }
        }

        if(RespuestaMaestro.size() == 0)
        {
            RespuestaMaestro.add("No se encontraron registros");
            return RespuestaMaestro;
        }
        else
        {
            String Formatofecha = "dd/MM/yyyy";
            Date Fecha = new Date();
            SimpleDateFormat FechaFormateada = new SimpleDateFormat(Formatofecha);
         
            RespuestaConFormato.add("REPORTE DE DONACIONES" + "\nGENERADO EL " + FechaFormateada.format(Fecha) + "\n");
            for(String R : RespuestaMaestro)
            {
                String activo = "";
                String[] Campos = R.split("\\|");
                if(Campos[8].equals("0")){ activo = "inactivo"; }
                else{ activo = "activo"; }
                String Reporte = "*" + Campos[0] + " dono " + Campos[3] + "lbs de " + Campos[1] + " en el evento " + Campos[5] + " en la fecha de " + Campos[2] 
                + " con una descripcion de: " + Campos[4] + "\nLa donacion se registro en el sistema el: " + Campos[7] + " por el usuario " + Campos[6] + ", El registro se encuentra " + activo + "\n";
                RespuestaConFormato.add(Reporte);
            }
            return RespuestaConFormato;
        }
    }
    
    private List<String> FiltroPorFecha(String Fecha1, String Fecha2) throws IOException
    {
        List<String> Respuesta = new ArrayList<>();
        SimpleDateFormat Formato = new SimpleDateFormat("dd/MM/yyyy");
        Date FechaInicio = null;
        Date FechaFinal = null;
        try{
            FechaInicio = Formato.parse(Fecha1);
            FechaFinal = Formato.parse(Fecha2);
        }catch(ParseException ex){}

        FileReader fr = new FileReader("C:\\MEIA\\Indice.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] Campos = linea.split("\\|");
            Date FechaActual = null;
            System.out.println(Campos[4]);
            try{ 
                FechaActual = Formato.parse(Campos[4]);
                System.out.println(FechaActual);
                
            }catch(ParseException ex){}
            int ResultadoFechaInicio = FechaActual.compareTo(FechaInicio);
            int ResultadoFechaFinal = FechaActual.compareTo(FechaFinal);
            if(ResultadoFechaInicio > 0 && ResultadoFechaFinal < 0){
                Respuesta.add(linea);
            }
            if(ResultadoFechaFinal == 0 || ResultadoFechaInicio == 0){
                Respuesta.add(linea);
            }
        }
        br.close();
        fr.close();

        if(Respuesta.size() == 0){ Respuesta.add("404"); }
        return Respuesta;
    }

    public class Donacion{
        public String Usuario;
        String Nombre_Material;
        String Fecha;
        Integer Peso;
        String Descripcion;
        String Evento;
        String UsuarioTransaccion;
        String FechaCreasion;
        Integer Estatus;

        Integer Registro;
        String Posicion;
        Integer Siguiente;

        Donacion(Integer registro, String posicion, Integer siguiente, String fecha, String usuario, String nombre_material, Integer estatus)
        {
            Registro = registro;
            Posicion = posicion;
            Siguiente = siguiente;
            Fecha = fecha;
            Usuario = usuario;
            Nombre_Material = nombre_material;
            Estatus = estatus;
        }
    }
}
