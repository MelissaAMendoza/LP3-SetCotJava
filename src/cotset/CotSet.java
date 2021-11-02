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
        
        System.out.println("Ingrese el año");
        ano = leer.nextInt();
        
        System.out.println("Ingrese el mes");
        mes = leer.next();
       
        //System.out.println("mes"+mes);
        //System.out.println("ano"+ano);
        
        verificacion(mes,ano); 
        
    }

    private static void verificacion(String mes, int ano)
    {
       
     /*------------------------------------------AÑ0 2010------------------------------------------*/
        
        if(ano == 2010)
        {    
            if ("Enero".equals(mes) || "enero".equals(mes) || "ENERO".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/a-mes-de-enero";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Enero del 2010");
                    
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
                
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Febrero del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Marzo del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Abril del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Mayo del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Junio del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Julio del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Agosto del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Septiembre del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Octubre del 2010");
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

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Noviembre del 2010");
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
                
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
                
            }

            if ("Diciembre".equals(mes) || "diciembre".equals(mes) || "DICIEMBRE".equals(mes))
            {
                final String url;
                url = "https://www.set.gov.py/portal/PARAGUAY-SET/detail?folder-id=repository:collaboration:/sites/PARAGUAY-SET/categories/SET/Informes%20Periodicos/cotizaciones-historicos/2010&content-id=/repository/collaboration/sites/PARAGUAY-SET/documents/informes-periodicos/cotizaciones/2010/k-mes-de-noviembre";

                try
                {
                    //Hace la conexion con la pagina web
                    final Document document = Jsoup.connect(url).get();

                    //Imprime el codigo Html
                    //System.out.println(document.outerHtml());

                    /*for (Element row: document.select("table tr"))
                    {
                        final String titulos = row.select(".titulos1").text();
                        System.out.println(titulos);
                    }

                    for (Element row: document.select("table tr"))
                    {
                        final String compraventa = row.select(".tr").text();
                        System.out.println(compraventa);
                    }*/

                    System.out.println("\n\n\nCotizaciones de Monedas del mes de Diciembre del 2010");
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
                
                System.out.println("                  Dolar             Real              P.Arg            Yen            Euro            Libra");
                System.out.println("              Compra  Venta     Compra  Venta     Compra  Venta   Compra  Venta   Compra  Venta   Compra  Venta\n");
                System.out.println("Promedio:");
                System.out.println("Maxima:");
                System.out.println("Minima:");
                
            }
        }
    }
}
    

    

