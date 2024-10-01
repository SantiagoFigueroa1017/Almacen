package services;

import models.Articulo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticuloService {

    private Scanner sc;
    private Articulo articulo;
    private ArrayList<Articulo> listaArticulos;

    public ArticuloService(){
        sc = new Scanner(System.in);
        articulo = new Articulo();
        listaArticulos = new ArrayList<>();
    }

    public void menu(){
        int opcion;
        do {
            System.out.println("::MENU::");
            System.out.println("1- Listado");
            System.out.println("2- Alta(Ingresar un artículo");
            System.out.println("3- Baja(Eliminar un artículo");
            System.out.println("4- Modificar Artículo");
            System.out.println("5 - Entrada de Mercancía");
            System.out.println("6 - salida de Mercancía");
            System.out.println("0 - Salir");
            System.out.println("Ingrese una opción");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    listado();
                    break;
                case 2:
                    ingresarArticulo();
                    break;
                case 3:
                    eliminarArticulo();
                    break;
                case 4:
                    modificarArticulo();
                    break;
                case 5:
                    entradaMercancia();
                    break;
//                case 6:
//                    salidaMercancia();
//                    break;
                default:
                    opcion = 0;
                    System.out.println("Gracias por utilizar este menú");
            }
        }while (opcion != 0);

    }

    private void listado(){
        System.out.println("::LISTADO DE ARTÍCULOS");
        for(Articulo articulo : listaArticulos){
            System.out.println(articulo);
        }
    }

    private void ingresarArticulo(){
        System.out.println("::INGRESAR UN ARTÍCULO");

        System.out.println("Ingrese el codigo del articulo");
        String codigo = sc.next();

        System.out.println("Ingrese la descripción del articulo");
        String descripcion = sc.next();

        System.out.println("Ingrese el precio de compra del articulo");
        double precioCompra = sc.nextDouble();

        System.out.println("Ingrese el precio de venta del articulo");
        double precioVenta = sc.nextDouble();

        int stock = entradaMercancia();

        listaArticulos.add(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));

    }

    private int buscarArticulo(){
        System.out.println("::BUSCAR ARTICULO::");
        System.out.println("Ingrese el codigo del artículo");
        String codigo = sc.next();
        articulo = null;
        for(Articulo articuloEncontrado : listaArticulos){
            if(articuloEncontrado.getCodigo().equals(codigo)){
                articulo = articuloEncontrado;
                System.out.println(articulo);
            }
        }
        return listaArticulos.indexOf(articulo);
    }
    private void eliminarArticulo(){
        System.out.println("Buscar Artículo a eliminar");
        int posicion = buscarArticulo();
        if(posicion >= 0){
            listaArticulos.remove(posicion);
            System.out.println("El artículo ha sido eliminado");
        }

    }

    private void modificarArticulo(){
        int posicion = buscarArticulo();
        if (posicion >= 0){
            articulo = listaArticulos.get(posicion);
            System.out.println("::MODIFICAR ARTÍCULO");

            System.out.println("Ingrese el codigo del articulo");
            String codigo = sc.next();
            articulo.setCodigo(codigo);

            System.out.println("Ingrese la descripción del articulo");
            String descripcion = sc.next();
            articulo.setDescripcion(descripcion);

            System.out.println("Ingrese el precio de compra del articulo");
            double precioCompra = sc.nextDouble();
            articulo.setPrecioCompra(precioCompra);

            System.out.println("Ingrese el precio de venta del articulo");
            double precioVenta = sc.nextDouble();
            articulo.setPrecioventa(precioVenta);

            System.out.println("Ingrese el stock del articulo");
            int stock = sc.nextInt();
            articulo.setStock(stock);

            listaArticulos.set(posicion, articulo);

        }
    }

    private int entradaMercancia(){
        int mercancia = 0;
        System.out.println("Ingrese el stock del articulo");
        int stock = sc.nextInt();
        mercancia += stock;

        return mercancia;
    }

}
