/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorjava;

/**
 *
 * @author lizbeth
 */
public interface Visitor {
    public double visit(ProductoNormal normal);
    public double visit(ProductoDescuento reducido);
}
