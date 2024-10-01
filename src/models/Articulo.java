package models;

public class Articulo {

    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioventa;
    private int stock;

    public Articulo(){
        this.codigo = "";
        this.descripcion = "";
        this.precioCompra = 0.0;
        this.precioventa = 0.0;
        this.stock = 0;
    }

    public Articulo(String codigo, String descripcion, double precioCompra, double precioventa, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioventa = precioventa;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioventa=" + precioventa +
                ", stock=" + stock +
                '}';
    }
}
