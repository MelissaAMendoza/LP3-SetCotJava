package cotset;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.Scanner;

public class CotSet 
{

    public static void main(String[] args)
    {
        int ano;
        String mes;
        
        System.out.println("SET - COTIZACIONES");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el año [2010 - 2014]:");
        ano = leer.nextInt();
        
        System.out.println("Ingrese el mes:");
        mes = leer.next();
        
        verificacion(mes,ano); 
        
    }

    private static void verificacion(String mes, int ano)
    {
       
     /*------------------------------------------AÑ0 2010------------------------------------------*/
        
        if(ano == 2010)
        {    
            if ("Enero".equals(mes) || "enero".equals(mes) || "ENERO".equals(mes))
            {
                //Le proporcionamos la url de la pagina de la cual queremos scrapear.
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/a-mes-de-enero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    //Imprime un encabezado para mostrar los elementos de la tabla 
                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Enero del 2010\n");                    
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla, y a medida que va recorriendo guarda el elemento en la posicion el la que se encuentra en una
                    //variable,en este caso denominada monto. Y a la par, va imprimiendo en consola.
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                    
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                //Imprimer los encabezados para mostrar los calculos realizados como el promedio, mayor y menor compra/venta.
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("       Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("   Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
            }
            if ("Febrero".equals(mes) || "febrero".equals(mes) || "FEBRERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/b-mes-de-febrero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Febrero del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");               
            }  
            if ("Marzo".equals(mes) || "marzo".equals(mes) || "MARZO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/c-mes-de-marzo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Marzo del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:"); 
            }
            if ("Abril".equals(mes) || "abril".equals(mes) || "ABRIL".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/d-mes-de-abril";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Abril del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Mayo".equals(mes) || "mayo".equals(mes) || "MAYO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/e-mes-de-mayo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Mayo del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");  
            }
            if ("Junio".equals(mes) || "junio".equals(mes) || "JUNIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/f-mes-de-junio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Junio del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
            }
            if ("Julio".equals(mes) || "julio".equals(mes) || "JULIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/g-mes-de-julio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Julio del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }    
            if ("Agosto".equals(mes) || "agosto".equals(mes) || "AGOSTO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/h-mes-de-agosto";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Agosto del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
            } 
            if ("Septiembre".equals(mes) || "septiembre".equals(mes) || "SEPTIEMBRE".equals(mes) || "Setiembre".equals(mes) || "setiembre".equals(mes) || "SETIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/i-mes-de-setiembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Septiembre del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");  
            }
            if ("Octubre".equals(mes) || "octubre".equals(mes) || "OCTUBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/j-mes-de-octubre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Octubre del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Noviembre".equals(mes) || "noviembre".equals(mes) || "NOVIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/k-mes-de-noviembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Noviembre del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Diciembre".equals(mes) || "diciembre".equals(mes) || "DICIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/l-mes-de-diciembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Diciembre del 2010\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
        }
    
     /*------------------------------------------AÑ0 2011------------------------------------------*/
    
        if(ano == 2011)
        {    
            if ("Enero".equals(mes) || "enero".equals(mes) || "ENERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/a-mes-de-enero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Enero del 2011\n");                    
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                    
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("       Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("   Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
            }
            if ("Febrero".equals(mes) || "febrero".equals(mes) || "FEBRERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/b-mes-de-febrero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Febrero del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");               
            }  
            if ("Marzo".equals(mes) || "marzo".equals(mes) || "MARZO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/c-mes-de-marzo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Marzo del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:"); 
            }
            if ("Abril".equals(mes) || "abril".equals(mes) || "ABRIL".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/d-mes-de-abril";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Abril del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Mayo".equals(mes) || "mayo".equals(mes) || "MAYO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/e-mes-de-mayo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Mayo del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Junio".equals(mes) || "junio".equals(mes) || "JUNIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/f-mes-de-junio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Junio del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Julio".equals(mes) || "julio".equals(mes) || "JULIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/g-mes-de-julio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Julio del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }    
            if ("Agosto".equals(mes) || "agosto".equals(mes) || "AGOSTO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/h-mes-de-agosto";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Agosto del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
            } 
            if ("Septiembre".equals(mes) || "septiembre".equals(mes) || "SEPTIEMBRE".equals(mes) || "Setiembre".equals(mes) || "setiembre".equals(mes) || "SETIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/i-mes-de-setiembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Septiembre del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");  
            }
            if ("Octubre".equals(mes) || "octubre".equals(mes) || "OCTUBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/j-mes-de-octubre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Octubre del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Noviembre".equals(mes) || "noviembre".equals(mes) || "NOVIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/k-mes-de-noviembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Noviembre del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Diciembre".equals(mes) || "diciembre".equals(mes) || "DICIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2011&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2011/l-mes-de-diciembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Diciembre del 2011\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select(".chico").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");  
            }
        }
        
     /*------------------------------------------AÑ0 2012------------------------------------------*/
     
        if(ano == 2012)
        {    
            if ("Enero".equals(mes) || "enero".equals(mes) || "ENERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/a-mes-de-enero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Enero del 2012\n");                    
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                    
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("       Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("   Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");           
            }
            if ("Febrero".equals(mes) || "febrero".equals(mes) || "FEBRERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/b-mes-de-febrero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Febrero del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");               
            }  
            if ("Marzo".equals(mes) || "marzo".equals(mes) || "MARZO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/c-mes-de-marzo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Marzo del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:"); 
            }
            if ("Abril".equals(mes) || "abril".equals(mes) || "ABRIL".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/d-mes-de-abril";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Abril del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Mayo".equals(mes) || "mayo".equals(mes) || "MAYO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/e-mes-de-mayo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Mayo del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Junio".equals(mes) || "junio".equals(mes) || "JUNIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/f-mes-de-junio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Junio del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Julio".equals(mes) || "julio".equals(mes) || "JULIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/g-mes-de-julio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Julio del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Agosto".equals(mes) || "agosto".equals(mes) || "AGOSTO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/h-mes-de-agosto";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Agosto del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Septiembre".equals(mes) || "septiembre".equals(mes) || "SEPTIEMBRE".equals(mes) || "Setiembre".equals(mes) || "setiembre".equals(mes) || "SETIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/i-mes-de-setiembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Septiembre del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:"); 
            }
            if ("Octubre".equals(mes) || "octubre".equals(mes) || "OCTUBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/j-mes-de-octubre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Octubre del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Noviembre".equals(mes) || "noviembre".equals(mes) || "NOVIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/k-mes-de-noviembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Noviembre del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Diciembre".equals(mes) || "diciembre".equals(mes) || "DICIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2012&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2012/l-mes-de-diciembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Diciembre del 2012\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
        }
    
     /*------------------------------------------AÑ0 2013------------------------------------------*/
        
        if(ano == 2013)
        {  
            if ("Enero".equals(mes) || "enero".equals(mes) || "ENERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/a-mes-de-enero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Enero del 2013\n");                    
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                    
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("       Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("   Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
            }
            if ("Febrero".equals(mes) || "febrero".equals(mes) || "FEBRERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/b-mes-de-febrero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Febrero del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");               
            }  
            if ("Marzo".equals(mes) || "marzo".equals(mes) || "MARZO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/c-mes-de-marzo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Marzo del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:"); 
            }
            if ("Abril".equals(mes) || "abril".equals(mes) || "ABRIL".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/d-mes-de-abril";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Abril del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Mayo".equals(mes) || "mayo".equals(mes) || "MAYO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/e-mes-de-mayo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Mayo del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Junio".equals(mes) || "junio".equals(mes) || "JUNIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/f-mes-de-junio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Junio del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Julio".equals(mes) || "julio".equals(mes) || "JULIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/g-mes-de-julio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Julio del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Agosto".equals(mes) || "agosto".equals(mes) || "AGOSTO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/h-mes-de-agosto";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Agosto del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Septiembre".equals(mes) || "septiembre".equals(mes) || "SEPTIEMBRE".equals(mes) || "Setiembre".equals(mes) || "setiembre".equals(mes) || "SETIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/i-mes-de-setiembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Septiembre del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Octubre".equals(mes) || "octubre".equals(mes) || "OCTUBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/j-mes-de-octubre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Octubre del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Noviembre".equals(mes) || "noviembre".equals(mes) || "NOVIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/k-mes-de-noviembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Noviembre del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Diciembre".equals(mes) || "diciembre".equals(mes) || "DICIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2013&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2013/l-mes-de-diciembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Diciembre del 2013\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
        }
        
     /*------------------------------------------AÑ0 2014------------------------------------------*/
        
        if(ano == 2014)
        {    
            if ("Enero".equals(mes) || "enero".equals(mes) || "ENERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/a-mes-de-enero&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/a-mes-de-enero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Enero del 2014\n");                    
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                    
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("       Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("   Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
            }
            if ("Febrero".equals(mes) || "febrero".equals(mes) || "FEBRERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/b-mes-de-febrero&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/b-mes-de-febrero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Febrero del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");               
            }  
            if ("Marzo".equals(mes) || "marzo".equals(mes) || "MARZO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/c-mes-de-marzo&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/c-mes-de-marzo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Marzo del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:"); 
            }
            if ("Abril".equals(mes) || "abril".equals(mes) || "ABRIL".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/d-mes-de-abril&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/d-mes-de-abril";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Abril del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Mayo".equals(mes) || "mayo".equals(mes) || "MAYO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/e-mes-de-mayo&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/e-mes-de-mayo";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Mayo del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Junio".equals(mes) || "junio".equals(mes) || "JUNIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/f-mes-de-junio&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/f-mes-de-junio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Junio del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Julio".equals(mes) || "julio".equals(mes) || "JULIO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/g-mes-de-julio&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/g-mes-de-julio";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Julio del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");  
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Agosto".equals(mes) || "agosto".equals(mes) || "AGOSTO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/h-mes-de-agosto&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/h-mes-de-agosto";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Agosto del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Septiembre".equals(mes) || "septiembre".equals(mes) || "SEPTIEMBRE".equals(mes) || "Setiembre".equals(mes) || "setiembre".equals(mes) || "SETIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/i-mes-de-setiembre&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/I_-_Mes_de_Setiembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Septiembre del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Octubre".equals(mes) || "octubre".equals(mes) || "OCTUBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/j-mes-de-octubre&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/J_-_Mes_de_Octubre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Octubre del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }

                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Noviembre".equals(mes) || "noviembre".equals(mes) || "NOVIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/InformesPeriodicos?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/k-mes-de-noviembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Noviembre del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");   
            }
            if ("Diciembre".equals(mes) || "diciembre".equals(mes) || "DICIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2014/l-mes-de-diciembre&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2014/L_-_Mes_de_Diciembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Diciembre del 2014\n");
                    
                    System.out.println("        Dolar             Real              P.Arg            Yen            Euro            Libra");
                    System.out.println("     Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                    
                    //Ciclo que recorre la tabla 
                    for (Element row: document.select("table tr"))
                    { 
                        //En este for empezamos a extraer los datos que queremos escrapear y lo mostramos por consola

                        final String monto  = row.select("tr").text();

                        System.out.println( monto); 
                    } 
                }catch(Exception ex )
                {
                    //Imprime el error por el cual no se pudo realizar el bloque anterior 
                    ex.printStackTrace();
                }
                
                System.out.println("/*--------------------------------------------------------------------------------------------------------*/");
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
                
            }
        }
    }
}
    

    

