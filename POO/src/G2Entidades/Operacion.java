/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G2Entidades;

/**
 *
 * @author alejo
 */
public class Operacion {
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void creaOperacion(double num1, double num2){
        setNum1(num1);
        setNum2(num2);
    }
    public double sumar(){
        double n1=getNum1();
        double n2=getNum2();
        double r=n1+n2;
        return r;
    }
    public double restar(){
        double n1=getNum1();
        double n2=getNum2();
        double r=n1-n2;
        return r;
    }
    public double multiplicar(){
        double n1=getNum1();
        double n2=getNum2();
        if(n1==0 || n2==0){
            System.out.println("La multiplicacion es igual a 0 debido a que un n umero es igual a 0");
            return 0;
        }
        else{
            double s=n1*n2;
            return s;
        }
    }
    public double dividir(){
        double n1=getNum1();
        double n2=getNum2();
        if(n1==0 ||n2==0){
            System.out.println("La multiplicacion es igual a 0 debido a que un n umero es igual a 0");
            return 0;
        }
        else{
            double s=n1/n2;
            return s;
        }
    }
}
